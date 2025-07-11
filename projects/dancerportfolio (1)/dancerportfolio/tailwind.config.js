module.exports = {
  content: ["./pages/*.{html,js}", "./index.html"],
  theme: {
    extend: {
      colors: {
        primary: "#1a1a1a", // deep-charcoal
        secondary: "#4a4a4a", // mid-gray
        accent: "#c9a96e", // warm-gold
        background: "#fafafa", // soft-off-white
        surface: "#ffffff", // pure-white
        "text-primary": "#2d2d2d", // rich-dark-gray
        "text-secondary": "#6b6b6b", // balanced-gray
        success: "#22c55e", // fresh-green
        warning: "#f59e0b", // amber
        error: "#ef4444", // clear-red
        border: "#e5e5e5", // light-gray
      },
      fontFamily: {
        sans: ['Inter', 'sans-serif'],
        serif: ['Playfair Display', 'serif'],
        caption: ['Source Sans Pro', 'sans-serif'],
        mono: ['JetBrains Mono', 'monospace'],
      },
      fontSize: {
        'fluid-xs': 'clamp(0.75rem, 0.7rem + 0.25vw, 0.875rem)',
        'fluid-sm': 'clamp(0.875rem, 0.8rem + 0.375vw, 1rem)',
        'fluid-base': 'clamp(1rem, 0.9rem + 0.5vw, 1.125rem)',
        'fluid-lg': 'clamp(1.125rem, 1rem + 0.625vw, 1.25rem)',
        'fluid-xl': 'clamp(1.25rem, 1.1rem + 0.75vw, 1.5rem)',
        'fluid-2xl': 'clamp(1.5rem, 1.3rem + 1vw, 2rem)',
        'fluid-3xl': 'clamp(1.875rem, 1.6rem + 1.375vw, 2.5rem)',
        'fluid-4xl': 'clamp(2.25rem, 1.9rem + 1.75vw, 3rem)',
      },
      boxShadow: {
        'card': '0 1px 3px rgba(0,0,0,0.1), 0 1px 2px rgba(0,0,0,0.06)',
        'modal': '0 4px 6px rgba(0,0,0,0.05)',
      },
      borderRadius: {
        'md': '6px',
      },
      scale: {
        '98': '0.98',
      },
      transitionTimingFunction: {
        'custom': 'cubic-bezier(0.4, 0, 0.2, 1)',
      },
      transitionDuration: {
        '200': '200ms',
        '400': '400ms',
      },
      gridAutoRows: {
        'masonry': 'masonry',
      },
    },
  },
  plugins: [],
}