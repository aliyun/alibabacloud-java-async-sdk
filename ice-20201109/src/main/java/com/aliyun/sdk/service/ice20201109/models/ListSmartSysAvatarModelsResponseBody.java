// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartSysAvatarModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartSysAvatarModelsResponseBody</p>
 */
public class ListSmartSysAvatarModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmartSysAvatarModelList")
    private java.util.List < SmartSysAvatarModelList> smartSysAvatarModelList;

    @NameInMap("TotalCount")
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
    public java.util.List < SmartSysAvatarModelList> getSmartSysAvatarModelList() {
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
        private java.util.List < SmartSysAvatarModelList> smartSysAvatarModelList; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmartSysAvatarModelList.
         */
        public Builder smartSysAvatarModelList(java.util.List < SmartSysAvatarModelList> smartSysAvatarModelList) {
            this.smartSysAvatarModelList = smartSysAvatarModelList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSmartSysAvatarModelsResponseBody build() {
            return new ListSmartSysAvatarModelsResponseBody(this);
        } 

    } 

    public static class SmartSysAvatarModelList extends TeaModel {
        @NameInMap("AvatarId")
        private String avatarId;

        @NameInMap("AvatarName")
        private String avatarName;

        @NameInMap("Bitrate")
        private Integer bitrate;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("OutputMask")
        private Boolean outputMask;

        @NameInMap("VideoUrl")
        private String videoUrl;

        @NameInMap("Width")
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
             * AvatarId.
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * AvatarName.
             */
            public Builder avatarName(String avatarName) {
                this.avatarName = avatarName;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * OutputMask.
             */
            public Builder outputMask(Boolean outputMask) {
                this.outputMask = outputMask;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * Width.
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
