from django.urls import path, include
from authentication.views import login, register, logout

app_name = 'authentication'

urlpatterns = [
    path('register/', register, name='register'),
    path('login/', login, name='login'),
    path('logout/', logout, name='logout'),
]