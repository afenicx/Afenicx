function mostrarVideo() {
  const popup = document.getElementById('video-popup');
  const video = document.getElementById('promo-video');
  popup.style.display = 'flex'; // Usamos flex para centrar
  if (video && typeof video.play === 'function') {
    video.play();
  }
}

function cerrarVideo() {
  const popup = document.getElementById('video-popup');
  const video = document.getElementById('promo-video');
  popup.style.display = 'none';
  if (video && typeof video.pause === 'function') {
    video.pause();
  }
}

// Mostrar el video cada 1 minuto (60000 ms)
setInterval(mostrarVideo, 60000);