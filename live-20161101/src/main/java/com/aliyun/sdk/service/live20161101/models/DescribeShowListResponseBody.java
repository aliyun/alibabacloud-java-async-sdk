// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeShowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShowListResponseBody</p>
 */
public class DescribeShowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowList")
    private String showList;

    @com.aliyun.core.annotation.NameInMap("ShowListInfo")
    private ShowListInfo showListInfo;

    private DescribeShowListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.showList = builder.showList;
        this.showListInfo = builder.showListInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShowListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showList
     */
    public String getShowList() {
        return this.showList;
    }

    /**
     * @return showListInfo
     */
    public ShowListInfo getShowListInfo() {
        return this.showListInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String showList; 
        private ShowListInfo showListInfo; 

        private Builder() {
        } 

        private Builder(DescribeShowListResponseBody model) {
            this.requestId = model.requestId;
            this.showList = model.showList;
            this.showListInfo = model.showListInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>****Details of the episode list.</p>
         * <p>Show indicates the information about a specific episode. For more information, see the <strong>Show</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ShowList[Show1, Show2, Show3...]</p>
         */
        public Builder showList(String showList) {
            this.showList = showList;
            return this;
        }

        /**
         * <p>The information about the episode list.</p>
         */
        public Builder showListInfo(ShowListInfo showListInfo) {
            this.showListInfo = showListInfo;
            return this;
        }

        public DescribeShowListResponseBody build() {
            return new DescribeShowListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeShowListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowListResponseBody</p>
     */
    public static class ResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveInputType")
        private Integer liveInputType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceUrl")
        private String resourceUrl;

        private ResourceInfo(Builder builder) {
            this.liveInputType = builder.liveInputType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.resourceUrl = builder.resourceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfo create() {
            return builder().build();
        }

        /**
         * @return liveInputType
         */
        public Integer getLiveInputType() {
            return this.liveInputType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceUrl
         */
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        public static final class Builder {
            private Integer liveInputType; 
            private String resourceId; 
            private String resourceType; 
            private String resourceUrl; 

            private Builder() {
            } 

            private Builder(ResourceInfo model) {
                this.liveInputType = model.liveInputType;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.resourceUrl = model.resourceUrl;
            } 

            /**
             * <p>The custom type label.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder liveInputType(Integer liveInputType) {
                this.liveInputType = liveInputType;
                return this;
            }

            /**
             * <p>The ID of the video-on-demand (VOD) file.</p>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vod</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The URL of the resource.</p>
             */
            public Builder resourceUrl(String resourceUrl) {
                this.resourceUrl = resourceUrl;
                return this;
            }

            public ResourceInfo build() {
                return new ResourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShowListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowListResponseBody</p>
     */
    public static class Show extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("RepeatTimes")
        private Integer repeatTimes;

        @com.aliyun.core.annotation.NameInMap("ResourceInfo")
        private ResourceInfo resourceInfo;

        @com.aliyun.core.annotation.NameInMap("ShowId")
        private String showId;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        private Show(Builder builder) {
            this.duration = builder.duration;
            this.repeatTimes = builder.repeatTimes;
            this.resourceInfo = builder.resourceInfo;
            this.showId = builder.showId;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Show create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return repeatTimes
         */
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        /**
         * @return resourceInfo
         */
        public ResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        /**
         * @return showId
         */
        public String getShowId() {
            return this.showId;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private Long duration; 
            private Integer repeatTimes; 
            private ResourceInfo resourceInfo; 
            private String showId; 
            private String showName; 

            private Builder() {
            } 

            private Builder(Show model) {
                this.duration = model.duration;
                this.repeatTimes = model.repeatTimes;
                this.resourceInfo = model.resourceInfo;
                this.showId = model.showId;
                this.showName = model.showName;
            } 

            /**
             * <p>The duration of the episode. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The number of times the episode repeats after the first playback is complete.</p>
             * <p>For example, if you set the value to 0, the episode is to be played once. If you set the value to 1, the episode is to be played twice.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder repeatTimes(Integer repeatTimes) {
                this.repeatTimes = repeatTimes;
                return this;
            }

            /**
             * <p>The resource information.</p>
             */
            public Builder resourceInfo(ResourceInfo resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * <p>The ID of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder showId(String showId) {
                this.showId = showId;
                return this;
            }

            /**
             * <p>The name of the episode.</p>
             * 
             * <strong>example:</strong>
             * <p>liveShow****</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Show build() {
                return new Show(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShowListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowListResponseBody</p>
     */
    public static class ShowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Show")
        private java.util.List<Show> show;

        private ShowList(Builder builder) {
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowList create() {
            return builder().build();
        }

        /**
         * @return show
         */
        public java.util.List<Show> getShow() {
            return this.show;
        }

        public static final class Builder {
            private java.util.List<Show> show; 

            private Builder() {
            } 

            private Builder(ShowList model) {
                this.show = model.show;
            } 

            /**
             * Show.
             */
            public Builder show(java.util.List<Show> show) {
                this.show = show;
                return this;
            }

            public ShowList build() {
                return new ShowList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShowListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShowListResponseBody</p>
     */
    public static class ShowListInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Background")
        private String background;

        @com.aliyun.core.annotation.NameInMap("CurrentShowId")
        private String currentShowId;

        @com.aliyun.core.annotation.NameInMap("HighPriorityShowId")
        private String highPriorityShowId;

        @com.aliyun.core.annotation.NameInMap("HighPriorityShowStartTime")
        private String highPriorityShowStartTime;

        @com.aliyun.core.annotation.NameInMap("ShowList")
        private ShowList showList;

        @com.aliyun.core.annotation.NameInMap("ShowListRepeatTimes")
        private Integer showListRepeatTimes;

        @com.aliyun.core.annotation.NameInMap("TotalShowListRepeatTimes")
        private Integer totalShowListRepeatTimes;

        private ShowListInfo(Builder builder) {
            this.background = builder.background;
            this.currentShowId = builder.currentShowId;
            this.highPriorityShowId = builder.highPriorityShowId;
            this.highPriorityShowStartTime = builder.highPriorityShowStartTime;
            this.showList = builder.showList;
            this.showListRepeatTimes = builder.showListRepeatTimes;
            this.totalShowListRepeatTimes = builder.totalShowListRepeatTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowListInfo create() {
            return builder().build();
        }

        /**
         * @return background
         */
        public String getBackground() {
            return this.background;
        }

        /**
         * @return currentShowId
         */
        public String getCurrentShowId() {
            return this.currentShowId;
        }

        /**
         * @return highPriorityShowId
         */
        public String getHighPriorityShowId() {
            return this.highPriorityShowId;
        }

        /**
         * @return highPriorityShowStartTime
         */
        public String getHighPriorityShowStartTime() {
            return this.highPriorityShowStartTime;
        }

        /**
         * @return showList
         */
        public ShowList getShowList() {
            return this.showList;
        }

        /**
         * @return showListRepeatTimes
         */
        public Integer getShowListRepeatTimes() {
            return this.showListRepeatTimes;
        }

        /**
         * @return totalShowListRepeatTimes
         */
        public Integer getTotalShowListRepeatTimes() {
            return this.totalShowListRepeatTimes;
        }

        public static final class Builder {
            private String background; 
            private String currentShowId; 
            private String highPriorityShowId; 
            private String highPriorityShowStartTime; 
            private ShowList showList; 
            private Integer showListRepeatTimes; 
            private Integer totalShowListRepeatTimes; 

            private Builder() {
            } 

            private Builder(ShowListInfo model) {
                this.background = model.background;
                this.currentShowId = model.currentShowId;
                this.highPriorityShowId = model.highPriorityShowId;
                this.highPriorityShowStartTime = model.highPriorityShowStartTime;
                this.showList = model.showList;
                this.showListRepeatTimes = model.showListRepeatTimes;
                this.totalShowListRepeatTimes = model.totalShowListRepeatTimes;
            } 

            /**
             * <p>The background of the episode list.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MaterialId&quot;:&quot;a2b8e671-2fe5-4642-a2ec-bf93880e****&quot;,&quot;resourceType&quot;:&quot;VOD&quot;}</p>
             */
            public Builder background(String background) {
                this.background = background;
                return this;
            }

            /**
             * <p>The ID of the episode that is playing.</p>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder currentShowId(String currentShowId) {
                this.currentShowId = currentShowId;
                return this;
            }

            /**
             * <p>The episode of the highest priority.</p>
             * <blockquote>
             * <p>You can configure this parameter only before the episode list starts playing.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
             */
            public Builder highPriorityShowId(String highPriorityShowId) {
                this.highPriorityShowId = highPriorityShowId;
                return this;
            }

            /**
             * <p>The time at which the episode of the highest priority is played. Format: yyyy-MM-dd&quot;T&quot;HH:mm:ss.</p>
             * <blockquote>
             * <p>You can configure this parameter only before the episode list starts playing. After you configure this parameter, when the specified point in time is reached, any episode that is playing stops and the episode of the highest priority in the episode list starts to play.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-11-23T12:30:00</p>
             */
            public Builder highPriorityShowStartTime(String highPriorityShowStartTime) {
                this.highPriorityShowStartTime = highPriorityShowStartTime;
                return this;
            }

            /**
             * <p>The episodes in the episode list.</p>
             */
            public Builder showList(ShowList showList) {
                this.showList = showList;
                return this;
            }

            /**
             * <p>The number of additional times the episode list is played by default. The value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder showListRepeatTimes(Integer showListRepeatTimes) {
                this.showListRepeatTimes = showListRepeatTimes;
                return this;
            }

            /**
             * <p>The number of additional times the episode list is played.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalShowListRepeatTimes(Integer totalShowListRepeatTimes) {
                this.totalShowListRepeatTimes = totalShowListRepeatTimes;
                return this;
            }

            public ShowListInfo build() {
                return new ShowListInfo(this);
            } 

        } 

    }
}
