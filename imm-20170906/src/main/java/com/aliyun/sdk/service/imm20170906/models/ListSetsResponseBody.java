// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSetsResponseBody</p>
 */
public class ListSetsResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sets")
    private java.util.List < Sets> sets;

    private ListSetsResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.sets = builder.sets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sets
     */
    public java.util.List < Sets> getSets() {
        return this.sets;
    }

    public static final class Builder {
        private String nextMarker; 
        private String requestId; 
        private java.util.List < Sets> sets; 

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sets.
         */
        public Builder sets(java.util.List < Sets> sets) {
            this.sets = sets;
            return this;
        }

        public ListSetsResponseBody build() {
            return new ListSetsResponseBody(this);
        } 

    } 

    public static class Sets extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FaceCount")
        private Integer faceCount;

        @NameInMap("ImageCount")
        private Integer imageCount;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("SetId")
        private String setId;

        @NameInMap("SetName")
        private String setName;

        @NameInMap("VideoCount")
        private Integer videoCount;

        @NameInMap("VideoLength")
        private Integer videoLength;

        private Sets(Builder builder) {
            this.createTime = builder.createTime;
            this.faceCount = builder.faceCount;
            this.imageCount = builder.imageCount;
            this.modifyTime = builder.modifyTime;
            this.setId = builder.setId;
            this.setName = builder.setName;
            this.videoCount = builder.videoCount;
            this.videoLength = builder.videoLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sets create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return faceCount
         */
        public Integer getFaceCount() {
            return this.faceCount;
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return setId
         */
        public String getSetId() {
            return this.setId;
        }

        /**
         * @return setName
         */
        public String getSetName() {
            return this.setName;
        }

        /**
         * @return videoCount
         */
        public Integer getVideoCount() {
            return this.videoCount;
        }

        /**
         * @return videoLength
         */
        public Integer getVideoLength() {
            return this.videoLength;
        }

        public static final class Builder {
            private String createTime; 
            private Integer faceCount; 
            private Integer imageCount; 
            private String modifyTime; 
            private String setId; 
            private String setName; 
            private Integer videoCount; 
            private Integer videoLength; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FaceCount.
             */
            public Builder faceCount(Integer faceCount) {
                this.faceCount = faceCount;
                return this;
            }

            /**
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * SetId.
             */
            public Builder setId(String setId) {
                this.setId = setId;
                return this;
            }

            /**
             * SetName.
             */
            public Builder setName(String setName) {
                this.setName = setName;
                return this;
            }

            /**
             * VideoCount.
             */
            public Builder videoCount(Integer videoCount) {
                this.videoCount = videoCount;
                return this;
            }

            /**
             * VideoLength.
             */
            public Builder videoLength(Integer videoLength) {
                this.videoLength = videoLength;
                return this;
            }

            public Sets build() {
                return new Sets(this);
            } 

        } 

    }
}
