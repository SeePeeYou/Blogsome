insert into public.users (followers, username)values (120, 'Monkey D. Luffy');
insert into public.users (followers, username)values (12, 'Sanji');
insert into public.users (followers, username)values (10, 'Roronoa Zoro');
insert into public.users (followers, username)values (1220, 'Nico Robin');
insert into public.users (followers, username)values (122, 'Chopper');
insert into public.users (followers, username)values (156, 'Shanks');
insert into public.users (followers, username)values (1526, 'Nami');
insert into public.blog (blog_user_id, post)values (1, 'Farmers markets are a fantastic way to support local agriculture and enjoy fresh, seasonal produce. These markets offer a variety of fruits, vegetables, homemade goods, and crafts. Shopping at farmers markets helps reduce your carbon footprint and fosters a sense of community. You can often find unique items not available in supermarkets and have the opportunity to talk directly with the growers. It’s a wonderful way to discover new foods, support local farmers, and enjoy a pleasant, community-oriented shopping experience.');
insert into public.blog_dao_tags (blog_dao_id, tags)values (1, 'farmer');
insert into public.blog_dao_tags (blog_dao_id, tags)values (1, 'local');
insert into public.blog (blog_user_id, post)values (1,'Starting your day with exercise can boost your mood, energy levels, and overall health. Morning workouts increase endorphins, leading to a more positive outlook and improved focus throughout the day. They also help regulate your sleep-wake cycle, ensuring better sleep at night. Whether it’s a brisk walk, yoga, or a full gym session, morning exercise sets a healthy tone for the day. Plus, it’s a great way to enjoy the tranquility of the early hours before the day’s hustle begins.');
insert into public.blog_dao_tags (blog_dao_id, tags)values (2, 'health');
insert into public.blog_dao_tags (blog_dao_id, tags)values (2, 'exercise');
insert into public.blog (blog_user_id, post)values (2,'Gardening is a fulfilling hobby that connects you with nature. Whether you have a spacious backyard or a small balcony, growing plants can bring joy and tranquility. Start with easy-to-grow herbs like basil and mint, or try colorful flowers like marigolds. Gardening not only beautifies your space but also provides fresh produce and herbs for your kitchen. It’s a great way to relieve stress, get some exercise, and enjoy the outdoors. Plus, watching your plants thrive under your care is incredibly rewarding.');
insert into public.blog_dao_tags (blog_dao_id, tags)values (3, 'garden');
insert into public.blog_dao_tags (blog_dao_id, tags)values (3, 'nature');
insert into public.blog (blog_user_id,likes, post)values (3,80,'Decluttering your living space can have a profound impact on your mental well-being. A tidy, organized home reduces stress and increases productivity. Start by sorting items into categories: keep, donate, and discard. Focus on one area at a time to avoid feeling overwhelmed. Embrace minimalism by keeping only items that bring you joy or serve a purpose. Regularly decluttering prevents the buildup of unnecessary items. The result is a more serene, functional space that allows you to focus on what truly matters.');
insert into public.blog (blog_user_id,likes, post)values (4,60,'Reading daily stimulates your brain, reduces stress, and enhances knowledge. It improves concentration and focus, providing a mental workout that keeps your mind sharp. Whether it’s fiction or non-fiction, reading expands your vocabulary and comprehension skills. It’s a great way to relax and escape from daily pressures. Set aside time each day to read, even if it’s just for a few minutes. This habit can transform your mind and provide countless hours of enjoyment and learning.');
insert into public.blog (blog_user_id,likes, post)values (4,20,'Staying hydrated is essential for maintaining health. Water supports digestion, nutrient absorption, and temperature regulation. It keeps your skin healthy and helps flush out toxins. Aim to drink at least eight glasses of water a day. Carry a reusable water bottle to remind yourself to drink regularly. Incorporate water-rich foods like fruits and vegetables into your diet. Proper hydration boosts energy levels, aids cognitive function, and supports overall well-being. Make hydration a priority for a healthier life.');
insert into public.blog (blog_user_id,likes, post)values (5,32,'Trying new hobbies can enrich your life and reduce stress. Hobbies like painting, knitting, or hiking offer creative and physical outlets that balance your routine. They provide opportunities to learn new skills and meet like-minded people. Engaging in hobbies can improve mental health by providing a sense of accomplishment and purpose. Take the time to explore different activities and find what brings you joy. Investing in hobbies can lead to a more fulfilling and balanced lifestyle.');

insert into public.comments (blog_id, comment,likes)values (1, 'woohoo farmers',6);
insert into public.comments (blog_id, comment, likes)values (1, 'support local businesses',2);
insert into public.blog_comments (blog_dao_id, comments_id)values (1, 1);
insert into public.blog_comments (blog_dao_id, comments_id)values (1, 2);

insert into public.reply (comment_id, reply_comment, likes)values (1, 'yay farmers',6);
insert into public.reply (comment_id, reply_comment, likes)values (1, 'whoop whoop',5);
insert into public.reply (comment_id, reply_comment, likes)values (2, 'Im a small business',6);
insert into public.reply (comment_id, reply_comment, likes)values (2, 'I love supporting local business',95);
insert into public.comments_replies (comment_dao_id, replies_id)values (1, 1);

insert into public.users_blogs (blogs_id, user_dao_id)values (1, 1);