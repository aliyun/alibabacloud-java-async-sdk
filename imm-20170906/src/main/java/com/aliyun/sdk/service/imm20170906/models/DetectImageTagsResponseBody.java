// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageTagsResponseBody</p>
 */
public class DetectImageTagsResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    private String imageUri;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private DetectImageTagsResponseBody(Builder builder) {
        this.imageUri = builder.imageUri;
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String imageUri; 
        private String requestId; 
        private java.util.List < Tags> tags; 

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
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
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public DetectImageTagsResponseBody build() {
            return new DetectImageTagsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("CentricScore")
        private Float centricScore;

        @NameInMap("ParentTagEnName")
        private String parentTagEnName;

        @NameInMap("ParentTagName")
        private String parentTagName;

        @NameInMap("TagConfidence")
        private Float tagConfidence;

        @NameInMap("TagEnName")
        private String tagEnName;

        @NameInMap("TagLevel")
        private Integer tagLevel;

        @NameInMap("TagName")
        private String tagName;

        private Tags(Builder builder) {
            this.centricScore = builder.centricScore;
            this.parentTagEnName = builder.parentTagEnName;
            this.parentTagName = builder.parentTagName;
            this.tagConfidence = builder.tagConfidence;
            this.tagEnName = builder.tagEnName;
            this.tagLevel = builder.tagLevel;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return centricScore
         */
        public Float getCentricScore() {
            return this.centricScore;
        }

        /**
         * @return parentTagEnName
         */
        public String getParentTagEnName() {
            return this.parentTagEnName;
        }

        /**
         * @return parentTagName
         */
        public String getParentTagName() {
            return this.parentTagName;
        }

        /**
         * @return tagConfidence
         */
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        /**
         * @return tagEnName
         */
        public String getTagEnName() {
            return this.tagEnName;
        }

        /**
         * @return tagLevel
         */
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Float centricScore; 
            private String parentTagEnName; 
            private String parentTagName; 
            private Float tagConfidence; 
            private String tagEnName; 
            private Integer tagLevel; 
            private String tagName; 

            /**
             * CentricScore.
             */
            public Builder centricScore(Float centricScore) {
                this.centricScore = centricScore;
                return this;
            }

            /**
             * ParentTagEnName.
             */
            public Builder parentTagEnName(String parentTagEnName) {
                this.parentTagEnName = parentTagEnName;
                return this;
            }

            /**
             * ParentTagName.
             */
            public Builder parentTagName(String parentTagName) {
                this.parentTagName = parentTagName;
                return this;
            }

            /**
             * TagConfidence.
             */
            public Builder tagConfidence(Float tagConfidence) {
                this.tagConfidence = tagConfidence;
                return this;
            }

            /**
             * TagEnName.
             */
            public Builder tagEnName(String tagEnName) {
                this.tagEnName = tagEnName;
                return this;
            }

            /**
             * TagLevel.
             */
            public Builder tagLevel(Integer tagLevel) {
                this.tagLevel = tagLevel;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
