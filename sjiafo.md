# Revenue Route — 5-Minute Pitch Script (Simple English)

> **Ghi chú:** Câu đơn giản, dễ nhớ. Mỗi phần có gợi ý **hành động** (chỉ tay, bấm demo...).  
> Tập nói theo timer. Không cần nhớ chính xác — hiểu ý rồi nói tự nhiên.

---

## ⏱️ 0:00 – 0:15 — HOOK (15 giây)

*(👆 Bước lên tự tin. Nhìn judges. Pause 2 giây. Rồi hỏi:)*

> **We’ve all used Google Maps to get around.**

*(Pause — để judges gật đầu hoặc giơ tay)*

> Google Maps answers ONE question: **"What is the fastest way from A to B?"**
>
> But what if you have **12 stops today**? Google Maps **cannot** tell you what order to visit them.

*(👆 Nhấn mạnh "12 stops" và "cannot". Đây là lúc judge bắt đầu tò mò.)*

---

## ⏱️ 0:15 – 0:35 — WHO WE ARE + WHAT WE BUILT (20 giây)

> Hi everyone. We are team **[Tên team]**.
>
> We built **Revenue Route** — an AI-powered app that plans your **entire work day** in 30 seconds.
>
> You enter all your stops, press **one button**, and AI gives you the **best order** to visit them — considering traffic, appointments, client priority, and customer groups.
>
> **Google Maps gives directions. Revenue Route makes your daily plan.**

*(👆 Câu cuối nói chậm, rõ ràng — đây là tagline, rất quan trọng)*

---

## ⏱️ 0:35 – 1:00 — THE PROBLEM - STORY (25 giây)

> Let me tell you about **Minh**. He is a sales rep in Ho Chi Minh City. He visits **8 hospitals every day** by motorbike.
>
> He plans by **feeling**. He goes to District 7 first, then back to District 5, then up to Thu Duc, then back to District 1. Zigzag. All day.
>
> He gets stuck in traffic on Nguyen Van Linh at 8 AM — **45 minutes wasted**. He is late to his first meeting. He **loses the deal**.
>
> He gets home at **7 PM. Exhausted.**
>
> This happens to **hundreds of thousands** of sales reps, brokers, and field workers in Vietnam every day.

*(👆 Nói chậm ở "7 PM. Exhausted." — để judge cảm nhận. Rồi pause trước khi chuyển sang solution.)*

---

## ⏱️ 1:00 – 1:20 — THE SOLUTION (20 giây)

> With Revenue Route, Minh does this:
>
> **Step 1:** He types his schedule in natural Vietnamese — *"Morning meet Mr. Tuan, 3 apartments District 7, afternoon sign contract District 1."*
>
> **Step 2:** He presses **one button**.
>
> **Step 3:** In **30 seconds**, AI returns the best plan for the whole day.
>
> Minh finishes at **3 PM**. He picks up his kid from school.
>
> **Let me show you.**

*(👆 Giơ 3 ngón tay khi nói 3 steps. Câu cuối "Let me show you" = chuyển sang demo.)*

---

## ⏱️ 1:20 – 3:40 — LIVE DEMO (2 phút 20 giây)

### Demo 1: Landing Page (15 giây)

> Let me show you.

*(Mở browser → landing page)*

> This is our landing page. You can see the **before and after** — 10 hours becomes 6 hours 45 minutes.

*(Scroll nhanh qua hero, before/after, comparison table)*

### Demo 2: Text Input (30 giây)

> Now, let's plan a day.

*(Vào /plan → click Quick Input)*

> I type in Vietnamese: *"Morning meet Tuan, 3 apartments District 7, each 20 minutes. 10 AM notary in District 5, very important. Afternoon meet Ms. Mai, 2 apartments in Thu Duc. 2 PM sign contract at office ABC District 1."*

*(Paste/gõ text → bấm Analyze)*

> AI reads this text and creates **8 stops**. It groups them: Tuan has 3 stops together, Mai has 2 stops together. It understands priority — the notary is marked **high**.

*(Chỉ vào stop list bên trái)*

### Demo 3: Optimize (45 giây)

> Now I press **Optimize**.

*(Bấm nút Tối ưu)*

> AI is working... It checks distances, traffic, appointment times, priorities, and client groups.

*(Chờ kết quả ~10-30 giây)*

> Done! Look at the result:
> - **Map** — you can see the route on the map. Green is light traffic, yellow is moderate, red is heavy.
> - **Timeline** — on the right side. It shows: arrive at 8:25, stay 45 minutes, leave at 9:10, travel 15 minutes...
> - **Summary** — total 8 stops, total distance, total travel time, finish at what time.
> - **AI explanation** — the AI explains **why** it chose this order. In Vietnamese.

*(Chỉ vào từng phần: map, timeline, summary, explanation)*

### Demo 4: Chat (30 giây)

> But plans change. What if a client cancels?

*(Mở chat panel)*

> I type: *"Remove the least important stop."*

*(Gõ → gửi)*

> AI removes it and **re-optimizes**. I don't need to start over.

### Demo 5: Dashboard + Extras (15 giây)

*(Bấm vào Dashboard)*

> We also have analytics: time breakdown, traffic analysis, client groups.

*(Toggle dark mode, switch language Việt → English)*

> And the app supports **Vietnamese and English**, light and dark mode.

---

## ⏱️ 3:40 – 4:20 — TECHNOLOGY (40 giây)

> Let me talk about the technology.
>
> **Frontend:** Next.js, TypeScript, Tailwind CSS.  
> **Backend:** FastAPI with Python.
>
> The core is a **LangGraph pipeline** — a 3-step AI workflow:
> 1. **Gather data** — get coordinates and travel times using LLM
> 2. **Optimize** — find the best order using LLM + Nearest Neighbor algorithm
> 3. **Explain** — AI writes an explanation in Vietnamese
>
> We use **GPT-4o** as the main LLM. If it fails, we **fall back to Gemini**. If both fail, we use a **heuristic algorithm**. So the app **always works**.
>
> We also use LLM to **replace Google Maps API** — it estimates coordinates and travel times. This saves cost.

*(👆 Nói nhanh phần này. Judge quan tâm keyword: LangGraph, multi-LLM fallback, always works)*

---

## ⏱️ 4:20 – 5:00 — IMPACT & CLOSE (40 giây)

> **Who needs this?**
>
> **Sales reps** — visiting 5 to 15 companies per day.  
> **Real estate brokers** — showing apartments to 3 client groups per day.  
> **Field teams** — surveying 15 to 20 locations per day.
>
> In Vietnam, **hundreds of thousands** of people drive to work every day.
>
> Each person saves **1 to 3 hours**. That means more client meetings. More deals closed. **More revenue.**
>
> That is why we call it **Revenue Route**.
>
> *"Go in the right order. Get home early."*
>
> **Thank you.**

*(👆 Nói chậm câu cuối. Nhìn judge. Mỉm cười.)*

---

## 📝 Từ khó có thể cần luyện phát âm

| Từ | Phát âm gần đúng | Nghĩa |
|---|---|---|
| optimize | ÓP-tì-mai | tối ưu |
| algorithm | AL-gờ-rít-đờm | thuật toán |
| pipeline | PAIP-lain | đường ống (quy trình) |
| heuristic | hiu-RÍS-tik | phương pháp kinh nghiệm |
| coordinates | cô-OR-đì-nịts | tọa độ |
| fallback | FOL-bẹk | phương án dự phòng |
| exhausted | ig-ZOS-tịd | kiệt sức |
| scalability | SKÂY-lờ-BÍ-lờ-ti | khả năng mở rộng |
| revenue | RE-vờ-niu | doanh thu |
| estimate | ÉS-tì-mịt | ước tính |

---

## 💡 Tips nói tiếng Anh khi trình bày

1. **Nói CHẬM** — chậm hơn bạn nghĩ. Judge prefer chậm mà rõ hơn nhanh mà khó nghe.
2. **Pause** — sau mỗi ý quan trọng, dừng 1 giây. Để judge kịp hiểu.
3. **Nhấn mạnh số** — "ONE to THREE hours", "30 seconds", "8 stops". Số dễ nhớ hơn câu dài.
4. **Đừng dịch word-by-word** — nói ý, không dịch từ. Nếu quên từ → nói cách khác.
5. **Demo nói ít** — khi đang demo, chỉ cần nói "Look at this", "Here you can see". Để sản phẩm nói thay bạn.
6. **Tập 3 lần** — lần 1 đọc script, lần 2 nhìn keywords, lần 3 nói tự do.
