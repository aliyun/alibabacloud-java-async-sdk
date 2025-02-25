// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListSmartSysAvatarModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartSysAvatarModelsResponseBody</p>
 */
public class ListSmartSysAvatarModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartSysAvatarModelList")
    private java.util.List<SmartSysAvatarModelList> smartSysAvatarModelList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSmartSysAvatarModelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.smartSysAvatarModelList = builder.smartSysAvatarModelList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartSysAvatarModelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartSysAvatarModelList
     */
    public java.util.List<SmartSysAvatarModelList> getSmartSysAvatarModelList() {
        return this.smartSysAvatarModelList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SmartSysAvatarModelList> smartSysAvatarModelList; 
        private Integer totalCount; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried digital humans.</p>
         */
        public Builder smartSysAvatarModelList(java.util.List<SmartSysAvatarModelList> smartSysAvatarModelList) {
            this.smartSysAvatarModelList = smartSysAvatarModelList;
            return this;
        }

        /**
         * <p>The total number of system digital human images returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSmartSysAvatarModelsResponseBody build() {
            return new ListSmartSysAvatarModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmartSysAvatarModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartSysAvatarModelsResponseBody</p>
     */
    public static class SmartSysAvatarModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("AvatarName")
        private String avatarName;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("OutputMask")
        private Boolean outputMask;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private SmartSysAvatarModelList(Builder builder) {
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.bitrate = builder.bitrate;
            this.coverUrl = builder.coverUrl;
            this.height = builder.height;
            this.outputMask = builder.outputMask;
            this.videoUrl = builder.videoUrl;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartSysAvatarModelList create() {
            return builder().build();
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return avatarName
         */
        public String getAvatarName() {
            return this.avatarName;
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return outputMask
         */
        public Boolean getOutputMask() {
            return this.outputMask;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avatarId; 
            private String avatarName; 
            private Integer bitrate; 
            private String coverUrl; 
            private Integer height; 
            private Boolean outputMask; 
            private String videoUrl; 
            private Integer width; 

            /**
             * <p>The ID of the digital human. The ID is required to submit a separate digital human rendering job or use the digital human image in an intelligent timeline.</p>
             * 
             * <strong>example:</strong>
             * <p>yunqiao</p>
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * <p>The name of the digital human.</p>
             */
            public Builder avatarName(String avatarName) {
                this.avatarName = avatarName;
                return this;
            }

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The sample thumbnail URL of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ice-pub-media.myalicdn.com/smart/avatarModel/coverDemo/yunqiao.mp4">http://ice-pub-media.myalicdn.com/smart/avatarModel/coverDemo/yunqiao.mp4</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The video height.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Indicates whether portrait mask rendering is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outputMask(Boolean outputMask) {
                this.outputMask = outputMask;
                return this;
            }

            /**
             * <p>The sample video URL of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ice-pub-media.myalicdn.com/smart/avatarModel/videoDemo/yunqiao.mp4">http://ice-pub-media.myalicdn.com/smart/avatarModel/videoDemo/yunqiao.mp4</a></p>
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * <p>The video width.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SmartSysAvatarModelList build() {
                return new SmartSysAvatarModelList(this);
            } 

        } 

    }
}
