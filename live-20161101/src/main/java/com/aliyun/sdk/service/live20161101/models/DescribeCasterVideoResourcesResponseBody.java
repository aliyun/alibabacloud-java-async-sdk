// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterVideoResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterVideoResourcesResponseBody</p>
 */
public class DescribeCasterVideoResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("VideoResources")
    private VideoResources videoResources;

    private DescribeCasterVideoResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.videoResources = builder.videoResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterVideoResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return videoResources
     */
    public VideoResources getVideoResources() {
        return this.videoResources;
    }

    public static final class Builder {
        private String requestId; 
        private Integer total; 
        private VideoResources videoResources; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * VideoResources.
         */
        public Builder videoResources(VideoResources videoResources) {
            this.videoResources = videoResources;
            return this;
        }

        public DescribeCasterVideoResourcesResponseBody build() {
            return new DescribeCasterVideoResourcesResponseBody(this);
        } 

    } 

    public static class VideoResource extends TeaModel {
        @NameInMap("BeginOffset")
        private Integer beginOffset;

        @NameInMap("EndOffset")
        private Integer endOffset;

        @NameInMap("FlvUrl")
        private String flvUrl;

        @NameInMap("LiveStreamUrl")
        private String liveStreamUrl;

        @NameInMap("LocationId")
        private String locationId;

        @NameInMap("MaterialId")
        private String materialId;

        @NameInMap("PtsCallbackInterval")
        private Integer ptsCallbackInterval;

        @NameInMap("RepeatNum")
        private Integer repeatNum;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("VodUrl")
        private String vodUrl;

        private VideoResource(Builder builder) {
            this.beginOffset = builder.beginOffset;
            this.endOffset = builder.endOffset;
            this.flvUrl = builder.flvUrl;
            this.liveStreamUrl = builder.liveStreamUrl;
            this.locationId = builder.locationId;
            this.materialId = builder.materialId;
            this.ptsCallbackInterval = builder.ptsCallbackInterval;
            this.repeatNum = builder.repeatNum;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoResource create() {
            return builder().build();
        }

        /**
         * @return beginOffset
         */
        public Integer getBeginOffset() {
            return this.beginOffset;
        }

        /**
         * @return endOffset
         */
        public Integer getEndOffset() {
            return this.endOffset;
        }

        /**
         * @return flvUrl
         */
        public String getFlvUrl() {
            return this.flvUrl;
        }

        /**
         * @return liveStreamUrl
         */
        public String getLiveStreamUrl() {
            return this.liveStreamUrl;
        }

        /**
         * @return locationId
         */
        public String getLocationId() {
            return this.locationId;
        }

        /**
         * @return materialId
         */
        public String getMaterialId() {
            return this.materialId;
        }

        /**
         * @return ptsCallbackInterval
         */
        public Integer getPtsCallbackInterval() {
            return this.ptsCallbackInterval;
        }

        /**
         * @return repeatNum
         */
        public Integer getRepeatNum() {
            return this.repeatNum;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private Integer beginOffset; 
            private Integer endOffset; 
            private String flvUrl; 
            private String liveStreamUrl; 
            private String locationId; 
            private String materialId; 
            private Integer ptsCallbackInterval; 
            private Integer repeatNum; 
            private String resourceId; 
            private String resourceName; 
            private String vodUrl; 

            /**
             * BeginOffset.
             */
            public Builder beginOffset(Integer beginOffset) {
                this.beginOffset = beginOffset;
                return this;
            }

            /**
             * EndOffset.
             */
            public Builder endOffset(Integer endOffset) {
                this.endOffset = endOffset;
                return this;
            }

            /**
             * FlvUrl.
             */
            public Builder flvUrl(String flvUrl) {
                this.flvUrl = flvUrl;
                return this;
            }

            /**
             * LiveStreamUrl.
             */
            public Builder liveStreamUrl(String liveStreamUrl) {
                this.liveStreamUrl = liveStreamUrl;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * MaterialId.
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            /**
             * PtsCallbackInterval.
             */
            public Builder ptsCallbackInterval(Integer ptsCallbackInterval) {
                this.ptsCallbackInterval = ptsCallbackInterval;
                return this;
            }

            /**
             * RepeatNum.
             */
            public Builder repeatNum(Integer repeatNum) {
                this.repeatNum = repeatNum;
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
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * VodUrl.
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public VideoResource build() {
                return new VideoResource(this);
            } 

        } 

    }
    public static class VideoResources extends TeaModel {
        @NameInMap("VideoResource")
        private java.util.List < VideoResource> videoResource;

        private VideoResources(Builder builder) {
            this.videoResource = builder.videoResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoResources create() {
            return builder().build();
        }

        /**
         * @return videoResource
         */
        public java.util.List < VideoResource> getVideoResource() {
            return this.videoResource;
        }

        public static final class Builder {
            private java.util.List < VideoResource> videoResource; 

            /**
             * VideoResource.
             */
            public Builder videoResource(java.util.List < VideoResource> videoResource) {
                this.videoResource = videoResource;
                return this;
            }

            public VideoResources build() {
                return new VideoResources(this);
            } 

        } 

    }
}
