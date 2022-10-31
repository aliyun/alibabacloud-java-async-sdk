// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShowListResponseBody</p>
 */
public class DescribeShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowList")
    private String showList;

    @NameInMap("ShowListInfo")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowList.
         */
        public Builder showList(String showList) {
            this.showList = showList;
            return this;
        }

        /**
         * ShowListInfo.
         */
        public Builder showListInfo(ShowListInfo showListInfo) {
            this.showListInfo = showListInfo;
            return this;
        }

        public DescribeShowListResponseBody build() {
            return new DescribeShowListResponseBody(this);
        } 

    } 

    public static class ResourceInfo extends TeaModel {
        @NameInMap("LiveInputType")
        private Integer liveInputType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceUrl")
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

            /**
             * LiveInputType.
             */
            public Builder liveInputType(Integer liveInputType) {
                this.liveInputType = liveInputType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceUrl.
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
    public static class Show extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("RepeatTimes")
        private Integer repeatTimes;

        @NameInMap("ResourceInfo")
        private ResourceInfo resourceInfo;

        @NameInMap("ShowId")
        private String showId;

        @NameInMap("ShowName")
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

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * RepeatTimes.
             */
            public Builder repeatTimes(Integer repeatTimes) {
                this.repeatTimes = repeatTimes;
                return this;
            }

            /**
             * ResourceInfo.
             */
            public Builder resourceInfo(ResourceInfo resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * ShowId.
             */
            public Builder showId(String showId) {
                this.showId = showId;
                return this;
            }

            /**
             * ShowName.
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
    public static class ShowList extends TeaModel {
        @NameInMap("Show")
        private java.util.List < Show> show;

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
        public java.util.List < Show> getShow() {
            return this.show;
        }

        public static final class Builder {
            private java.util.List < Show> show; 

            /**
             * Show.
             */
            public Builder show(java.util.List < Show> show) {
                this.show = show;
                return this;
            }

            public ShowList build() {
                return new ShowList(this);
            } 

        } 

    }
    public static class ShowListInfo extends TeaModel {
        @NameInMap("CurrentShowId")
        private String currentShowId;

        @NameInMap("HighPriorityShowId")
        private String highPriorityShowId;

        @NameInMap("HighPriorityShowStartTime")
        private String highPriorityShowStartTime;

        @NameInMap("ShowList")
        private ShowList showList;

        @NameInMap("ShowListRepeatTimes")
        private Integer showListRepeatTimes;

        @NameInMap("TotalShowListRepeatTimes")
        private Integer totalShowListRepeatTimes;

        private ShowListInfo(Builder builder) {
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
            private String currentShowId; 
            private String highPriorityShowId; 
            private String highPriorityShowStartTime; 
            private ShowList showList; 
            private Integer showListRepeatTimes; 
            private Integer totalShowListRepeatTimes; 

            /**
             * CurrentShowId.
             */
            public Builder currentShowId(String currentShowId) {
                this.currentShowId = currentShowId;
                return this;
            }

            /**
             * HighPriorityShowId.
             */
            public Builder highPriorityShowId(String highPriorityShowId) {
                this.highPriorityShowId = highPriorityShowId;
                return this;
            }

            /**
             * HighPriorityShowStartTime.
             */
            public Builder highPriorityShowStartTime(String highPriorityShowStartTime) {
                this.highPriorityShowStartTime = highPriorityShowStartTime;
                return this;
            }

            /**
             * ShowList.
             */
            public Builder showList(ShowList showList) {
                this.showList = showList;
                return this;
            }

            /**
             * ShowListRepeatTimes.
             */
            public Builder showListRepeatTimes(Integer showListRepeatTimes) {
                this.showListRepeatTimes = showListRepeatTimes;
                return this;
            }

            /**
             * TotalShowListRepeatTimes.
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
