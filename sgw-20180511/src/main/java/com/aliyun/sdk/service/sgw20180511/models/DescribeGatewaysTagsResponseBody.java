// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaysTagsResponseBody</p>
 */
public class DescribeGatewaysTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GatewayTags")
    private GatewayTags gatewayTags;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewaysTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.gatewayTags = builder.gatewayTags;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaysTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatewayTags
     */
    public GatewayTags getGatewayTags() {
        return this.gatewayTags;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private GatewayTags gatewayTags; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GatewayTags.
         */
        public Builder gatewayTags(GatewayTags gatewayTags) {
            this.gatewayTags = gatewayTags;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewaysTagsResponseBody build() {
            return new DescribeGatewaysTagsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class GatewayTag extends TeaModel {
        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("Tags")
        private Tags tags;

        private GatewayTag(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayTag create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String gatewayId; 
            private Tags tags; 

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public GatewayTag build() {
                return new GatewayTag(this);
            } 

        } 

    }
    public static class GatewayTags extends TeaModel {
        @NameInMap("GatewayTag")
        private java.util.List < GatewayTag> gatewayTag;

        private GatewayTags(Builder builder) {
            this.gatewayTag = builder.gatewayTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayTags create() {
            return builder().build();
        }

        /**
         * @return gatewayTag
         */
        public java.util.List < GatewayTag> getGatewayTag() {
            return this.gatewayTag;
        }

        public static final class Builder {
            private java.util.List < GatewayTag> gatewayTag; 

            /**
             * GatewayTag.
             */
            public Builder gatewayTag(java.util.List < GatewayTag> gatewayTag) {
                this.gatewayTag = gatewayTag;
                return this;
            }

            public GatewayTags build() {
                return new GatewayTags(this);
            } 

        } 

    }
}
