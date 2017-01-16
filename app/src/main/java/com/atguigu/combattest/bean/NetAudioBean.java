package com.atguigu.combattest.bean;

import java.util.List;

/**
 * Created by 刘闯 on 2017/1/16.
 */

public class NetAudioBean {
    /**
     * count : 4092
     * np : 1.469486402E9
     */

    private InfoBean info;
    /**
     * status : 4
     * comment : 36
     * tags : [{"id":1,"name":"搞笑"},{"id":61,"name":"恶搞"},{"id":62,"name":"内涵"},{"id":18910,"name":"hx"}]
     * bookmark : 37
     * text : 你说的黑不是黑，你说的白是什么白
     * gif : {"images":["http://ww3.sinaimg.cn/large/c28796abjw1f664gihaq1g204x08cx6p.gif","http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a.gif","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a.gif"],"width":177,"gif_thumbnail":["http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg"],"download_url":["http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_d.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_d.jpg","http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg"],"height":300}
     * up : 270
     * share_url : http://www.budejie.com/share/19515626.html?wx.qq.com
     * down : 38
     * forward : 53
     * u : {"header":["http://wimg.spriteapp.cn/profile/large/2015/12/21/5678107d4cbbe_mini.jpg","http://dimg.spriteapp.cn/profile/large/2015/12/21/5678107d4cbbe_mini.jpg"],"is_v":true,"uid":"16900209","is_vip":false,"name":"内涵图达人"}
     * passtime : 2016-07-26 09:58:01
     * type : gif
     * id : 19515626
     */

    private List<ListBean> list;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class InfoBean {
        private int count;
        private double np;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getNp() {
            return np;
        }

        public void setNp(double np) {
            this.np = np;
        }
    }

    public static class ListBean {
        private int status;
        private String comment;
        private String bookmark;
        private String text;

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        /**
         * images : ["http://ww3.sinaimg.cn/large/c28796abjw1f664gihaq1g204x08cx6p.gif","http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a.gif","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a.gif"]
         * width : 177
         * gif_thumbnail : ["http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg"]
         * download_url : ["http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_d.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_d.jpg","http://wimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg","http://dimg.spriteapp.cn/ugc/2016/07/25/57950170e264a_a_1.jpg"]
         * height : 300
         */
        private ImageBean image;
        private VideoBean video;
        private GifBean gif;
        private String up;
        private String share_url;
        private int down;
        private int forward;
        /**
         * header : ["http://wimg.spriteapp.cn/profile/large/2015/12/21/5678107d4cbbe_mini.jpg","http://dimg.spriteapp.cn/profile/large/2015/12/21/5678107d4cbbe_mini.jpg"]
         * is_v : true
         * uid : 16900209
         * is_vip : false
         * name : 内涵图达人
         */

        private UBean u;
        private String passtime;
        private String type;
        private String id;
        /**
         * id : 1
         * name : 搞笑
         */

        private List<TagsBean> tags;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public GifBean getGif() {
            return gif;
        }

        public void setGif(GifBean gif) {
            this.gif = gif;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public int getForward() {
            return forward;
        }

        public void setForward(int forward) {
            this.forward = forward;
        }

        public UBean getU() {
            return u;
        }

        public void setU(UBean u) {
            this.u = u;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class GifBean {
            private int width;
            private int height;
            private List<String> images;
            private List<String> gif_thumbnail;
            private List<String> download_url;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public List<String> getGif_thumbnail() {
                return gif_thumbnail;
            }

            public void setGif_thumbnail(List<String> gif_thumbnail) {
                this.gif_thumbnail = gif_thumbnail;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }
        }

        public static class ImageBean {
            private int height;
            private int width;
            private List<String> big;
            private List<String> download_url;
            private List<String> medium;
            private List<String> small;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getBig() {
                return big;
            }

            public void setBig(List<String> big) {
                this.big = big;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }

            public List<String> getMedium() {
                return medium;
            }

            public void setMedium(List<String> medium) {
                this.medium = medium;
            }

            public List<String> getSmall() {
                return small;
            }

            public void setSmall(List<String> small) {
                this.small = small;
            }
        }
        public static class VideoBean {
            private int duration;
            private int height;
            private int playcount;
            private int playfcount;
            private int width;
            private List<String> download;
            private List<String> thumbnail;
            private List<String> video;

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public int getPlayfcount() {
                return playfcount;
            }

            public void setPlayfcount(int playfcount) {
                this.playfcount = playfcount;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getDownload() {
                return download;
            }

            public void setDownload(List<String> download) {
                this.download = download;
            }

            public List<String> getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(List<String> thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<String> getVideo() {
                return video;
            }

            public void setVideo(List<String> video) {
                this.video = video;
            }
        }
        public static class UBean {
            private boolean is_v;
            private String uid;
            private boolean is_vip;
            private String name;
            private List<String> header;

            public boolean isIs_v() {
                return is_v;
            }

            public void setIs_v(boolean is_v) {
                this.is_v = is_v;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public boolean isIs_vip() {
                return is_vip;
            }

            public void setIs_vip(boolean is_vip) {
                this.is_vip = is_vip;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getHeader() {
                return header;
            }

            public void setHeader(List<String> header) {
                this.header = header;
            }
        }

        public static class TagsBean {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
