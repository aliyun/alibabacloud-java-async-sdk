// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateProductTagsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductTagsResponseBody</p>
 */
public class CreateProductTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("InvalidProductTags")
    private InvalidProductTags invalidProductTags;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateProductTagsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.invalidProductTags = model.invalidProductTags;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The invalid product tags returned if the call fails.</p>
         */
        public Builder invalidProductTags(InvalidProductTags invalidProductTags) {
            this.invalidProductTags = invalidProductTags;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful. The tags were attached to the product.</li>
         * <li><strong>false</strong>: The call failed. This value indicates that the tags failed to be attached to the product.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateProductTagsResponseBody build() {
            return new CreateProductTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductTagsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProductTagsResponseBody</p>
     */
    public static class ProductTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(ProductTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>room</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>123$</p>
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
    /**
     * 
     * {@link CreateProductTagsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProductTagsResponseBody</p>
     */
    public static class InvalidProductTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductTag")
        private java.util.List<ProductTag> productTag;

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
        public java.util.List<ProductTag> getProductTag() {
            return this.productTag;
        }

        public static final class Builder {
            private java.util.List<ProductTag> productTag; 

            private Builder() {
            } 

            private Builder(InvalidProductTags model) {
                this.productTag = model.productTag;
            } 

            /**
             * ProductTag.
             */
            public Builder productTag(java.util.List<ProductTag> productTag) {
                this.productTag = productTag;
                return this;
            }

            public InvalidProductTags build() {
                return new InvalidProductTags(this);
            } 

        } 

    }
}
