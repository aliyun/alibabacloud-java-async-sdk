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
 * {@link DescribeCasterVideoResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterVideoResourcesResponseBody</p>
 */
public class DescribeCasterVideoResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("VideoResources")
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

        private Builder() {
        } 

        private Builder(DescribeCasterVideoResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.total = model.total;
            this.videoResources = model.videoResources;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The input sources.</p>
         */
        public Builder videoResources(VideoResources videoResources) {
            this.videoResources = videoResources;
            return this;
        }

        public DescribeCasterVideoResourcesResponseBody build() {
            return new DescribeCasterVideoResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterVideoResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterVideoResourcesResponseBody</p>
     */
    public static class VideoResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginOffset")
        private Integer beginOffset;

        @com.aliyun.core.annotation.NameInMap("EndOffset")
        private Integer endOffset;

        @com.aliyun.core.annotation.NameInMap("FlvUrl")
        private String flvUrl;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("LiveStreamUrl")
        private String liveStreamUrl;

        @com.aliyun.core.annotation.NameInMap("LocationId")
        private String locationId;

        @com.aliyun.core.annotation.NameInMap("MaterialId")
        private String materialId;

        @com.aliyun.core.annotation.NameInMap("PtsCallbackInterval")
        private Integer ptsCallbackInterval;

        @com.aliyun.core.annotation.NameInMap("RepeatNum")
        private Integer repeatNum;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("VodUrl")
        private String vodUrl;

        private VideoResource(Builder builder) {
            this.beginOffset = builder.beginOffset;
            this.endOffset = builder.endOffset;
            this.flvUrl = builder.flvUrl;
            this.imageId = builder.imageId;
            this.imageUrl = builder.imageUrl;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
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
            private String imageId; 
            private String imageUrl; 
            private String liveStreamUrl; 
            private String locationId; 
            private String materialId; 
            private Integer ptsCallbackInterval; 
            private Integer repeatNum; 
            private String resourceId; 
            private String resourceName; 
            private String vodUrl; 

            private Builder() {
            } 

            private Builder(VideoResource model) {
                this.beginOffset = model.beginOffset;
                this.endOffset = model.endOffset;
                this.flvUrl = model.flvUrl;
                this.imageId = model.imageId;
                this.imageUrl = model.imageUrl;
                this.liveStreamUrl = model.liveStreamUrl;
                this.locationId = model.locationId;
                this.materialId = model.materialId;
                this.ptsCallbackInterval = model.ptsCallbackInterval;
                this.repeatNum = model.repeatNum;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.vodUrl = model.vodUrl;
            } 

            /**
             * <p>The offset of the position where the system starts to read the video resource. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
             * <p>A value <strong>greater than 0</strong> indicates an offset from the first frame.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder beginOffset(Integer beginOffset) {
                this.beginOffset = beginOffset;
                return this;
            }

            /**
             * <p>The offset of the position where the system stops reading the video file. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
             * <ul>
             * <li>A value greater than <strong>0</strong> indicates an offset from the first frame.</li>
             * <li>A value smaller than <strong>0</strong> indicates an offset from the last frame.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder endOffset(Integer endOffset) {
                this.endOffset = endOffset;
                return this;
            }

            /**
             * <p>The source URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://guide.aliyundoc.com/example.org">http://guide.aliyundoc.com/example.org</a></p>
             */
            public Builder flvUrl(String flvUrl) {
                this.flvUrl = flvUrl;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a089175eb5f4427684fc0715159a****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://abcLive/appName/b5447c21fcfe444c9e9b6f7ba208****</p>
             */
            public Builder liveStreamUrl(String liveStreamUrl) {
                this.liveStreamUrl = liveStreamUrl;
                return this;
            }

            /**
             * <p>The position of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * <p>The material ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d2c429cd907742ee8f6e76465ad3****</p>
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            /**
             * <p>The interval between presentation timestamp (PTS) callbacks. If you set the value to 0, the PTS callback is disabled. This parameter is returned only when the video resource is a video-on-demand (VOD) file.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ptsCallbackInterval(Integer ptsCallbackInterval) {
                this.ptsCallbackInterval = ptsCallbackInterval;
                return this;
            }

            /**
             * <p>The number of playback times after the first playback is complete. This parameter takes effect only when the input source is a video file. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): The video file is played only once.</li>
             * <li><strong>-1</strong>: The video file is played in loop mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeatNum(Integer repeatNum) {
                this.repeatNum = repeatNum;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>resource-Name1</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The URL of the VOD file.</p>
             * <p>This parameter is returned only when the video resource is an MP4, FLV, or TS file that is not from the media library.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://developer.aliyundoc.com/caster1.flv">http://developer.aliyundoc.com/caster1.flv</a></p>
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
    /**
     * 
     * {@link DescribeCasterVideoResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterVideoResourcesResponseBody</p>
     */
    public static class VideoResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoResource")
        private java.util.List<VideoResource> videoResource;

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
        public java.util.List<VideoResource> getVideoResource() {
            return this.videoResource;
        }

        public static final class Builder {
            private java.util.List<VideoResource> videoResource; 

            private Builder() {
            } 

            private Builder(VideoResources model) {
                this.videoResource = model.videoResource;
            } 

            /**
             * VideoResource.
             */
            public Builder videoResource(java.util.List<VideoResource> videoResource) {
                this.videoResource = videoResource;
                return this;
            }

            public VideoResources build() {
                return new VideoResources(this);
            } 

        } 

    }
}
