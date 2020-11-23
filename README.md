# RecyclerViewAnimation
 https://levelup.gitconnected.com/android-recyclerview-animations-in-kotlin-1e323ffd39be

- Set Animation

```java
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyHolder> {

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.bindData(list.get(position));

        int anim = R.anim.anim_simple_fourth;

        holder.itemView.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), anim));
    }
}
```

#
- [**anim_one.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_one.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example1.gif" width="200"/>
</p>

#
- [**anim_two.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_two.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example2.gif" width="200"/>
</p>

#
- [**anim_three.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_three.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example3.gif" width="200"/>
</p>

#
- [**anim_simple_one.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_simple_one.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example4.gif" width="200"/>
</p>

#
- [**anim_simple_two.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_simple_two.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example5.gif" width="200"/>
</p>

#
- [**anim_simple_three.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_simple_three.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example6.gif" width="200"/>
</p>

#
- [**anim_simple_fourth.xml**](https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/app/src/main/res/anim/anim_simple_fourth.xml)

<p align="center">
  <img src="https://github.com/gzeinnumer/RecyclerViewAnimation/blob/master/preview/example7.gif" width="200"/>
</p>

---

```
Copyright 2020 M. Fadli Zein
```
