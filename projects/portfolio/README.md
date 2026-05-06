# 🌐 Personal Portfolio Website

## Overview
A modern, responsive personal portfolio website built with Next.js and React. Showcases projects, skills, and experience with smooth animations and excellent performance.

## ✨ Features
- **Responsive Design**: Mobile-first approach, works on all devices
- **Dark Mode**: Toggle between light and dark themes
- **Project Showcase**: Display projects with descriptions and links
- **Skills Section**: Interactive skills visualization
- **Blog Integration**: Share articles and insights
- **Contact Form**: Get in touch functionality
- **SEO Optimized**: Fully optimized for search engines
- **Fast Performance**: Optimized images and lazy loading
- **Smooth Animations**: Engaging transitions and effects

## 🛠️ Tech Stack
- **Framework**: Next.js 13+ (React)
- **Styling**: Tailwind CSS
- **Animations**: Framer Motion
- **Icons**: React Icons
- **Hosting**: Vercel
- **Email**: Nodemailer / SendGrid
- **Analytics**: Google Analytics

## 📋 Project Structure
```
portfolio/
├── public/
│   ├── images/
│   └── icons/
├── src/
│   ├── pages/
│   │   ├── index.jsx
│   │   ├── projects.jsx
│   │   ├── about.jsx
│   │   ├── blog/
│   │   └── contact.jsx
│   ├── components/
│   │   ├── Header.jsx
│   │   ├── Hero.jsx
│   │   ├── Projects.jsx
│   │   ├── Skills.jsx
│   │   └── Footer.jsx
│   ├── styles/
│   │   └── globals.css
│   └── lib/
├── next.config.js
├── tailwind.config.js
├── package.json
└── README.md
```

## 🚀 Getting Started

### Prerequisites
- Node.js 16+
- npm or yarn

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/sagaar051/portfolio.git
   cd portfolio
   ```

2. **Install dependencies**
   ```bash
   npm install
   # or
   yarn install
   ```

3. **Create environment variables**
   ```bash
   cp .env.example .env.local
   ```
   
   Update with your values:
   ```env
   NEXT_PUBLIC_SITE_URL=http://localhost:3000
   SENDGRID_API_KEY=your_sendgrid_key
   GOOGLE_ANALYTICS_ID=your_ga_id
   ```

4. **Run development server**
   ```bash
   npm run dev
   ```
   
   Open [http://localhost:3000](http://localhost:3000)

## 📄 Pages

### Home Page
- Hero section with introduction
- Featured projects preview
- Skills showcase
- Call-to-action buttons

### Projects Page
- Complete project portfolio
- Filter by technology
- Search functionality
- Project details and links

### About Page
- Personal story
- Education and experience
- Timeline of achievements
- Download resume button

### Blog Page
- Article listing
- Search and filter
- Reading time indicator
- Share options

### Contact Page
- Contact form
- Social media links
- Location information
- Email subscription

## 🎨 Customization

### Update Personal Info
Edit `src/data/personal.js`:
```javascript
export const personal = {
  name: "Sagar Gouda",
  title: "Full Stack Developer",
  email: "your-email@gmail.com",
  // ...
};
```

### Add Projects
Edit `src/data/projects.js`:
```javascript
export const projects = [
  {
    id: 1,
    title: "Project Name",
    description: "Description",
    tags: ["React", "Node.js"],
    link: "https://github.com/...",
    image: "/images/project.png"
  },
  // ...
];
```

## 🚀 Deployment

### Deploy on Vercel
```bash
npm install -g vercel
vercel
```

### Deploy on Netlify
```bash
npm run build
# Push to GitHub and connect with Netlify
```

## 📊 Performance
- Lighthouse Score: 95+
- Page Load Time: < 1s
- Core Web Vitals: Optimized

## 🔍 SEO
- Meta tags configured
- Open Graph support
- Sitemap generation
- Schema markup included

## 📝 License
MIT License - See LICENSE file for details

## 👨‍💻 Author
**Sagar Gouda** - [GitHub](https://github.com/sagaar051) | [LinkedIn](https://www.linkedin.com/in/sagar051/)

## 🔗 Related Projects
- [PhishCatcher - ML Detection System](../phish-catcher)
- [Student Management System](../student-system)

## 🌐 Live Website
[Visit Portfolio](https://sagar-gouda-portfoliosagar-gouda-po.vercel.app/)
