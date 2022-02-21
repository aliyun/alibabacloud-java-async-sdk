// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductTagsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductTagsResponseBody</p>
 */
public class CreateProductTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("InvalidProductTags")
    private InvalidProductTags invalidProductTags;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateProductTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.invalidProductTags = builder.invalidProductTags;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return invalidProductTags
     */
    public InvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
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
        private String errorMessage; 
        private InvalidProductTags invalidProductTags; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * InvalidProductTags.
         */
        public Builder invalidProductTags(InvalidProductTags invalidProductTags) {
            this.invalidProductTags = invalidProductTags;
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

        public CreateProductTagsResponseBody build() {
            return new CreateProductTagsResponseBody(this);
        } 

    } 

    public static class ProductTag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private ProductTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductTag create() {
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

            public ProductTag build() {
                return new ProductTag(this);
            } 

        } 

    }
    public static class InvalidProductTags extends TeaModel {
        @NameInMap("ProductTag")
        private java.util.List < ProductTag> productTag;

        private InvalidProductTags(Builder builder) {
            this.productTag = builder.productTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidProductTags create() {
            return builder().build();
        }

        /**
         * @return productTag
         */
        public java.util.List < ProductTag> getProductTag() {
            return this.productTag;
        }

        public static final class Builder {
            private java.util.List < ProductTag> productTag; 

            /**
             * ProductTag.
             */
            public Builder productTag(java.util.List < ProductTag> productTag) {
                this.productTag = productTag;
                return this;
            }

            public InvalidProductTags build() {
                return new InvalidProductTags(this);
            } 

        } 

    }
}
