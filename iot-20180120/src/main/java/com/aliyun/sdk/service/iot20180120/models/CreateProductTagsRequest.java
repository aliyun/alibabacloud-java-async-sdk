// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateProductTagsRequest</p>
 */
public class CreateProductTagsRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ProductTag")
    @Validation(required = true)
    private java.util.List < ProductTag> productTag;

    private CreateProductTagsRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.productTag = builder.productTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return productTag
     */
    public java.util.List < ProductTag> getProductTag() {
        return this.productTag;
    }

    public static final class Builder extends Request.Builder<CreateProductTagsRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List < ProductTag> productTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductTagsRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.productTag = response.productTag;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ProductTag.
         */
        public Builder productTag(java.util.List < ProductTag> productTag) {
            this.putQueryParameter("ProductTag", productTag);
            this.productTag = productTag;
            return this;
        }

        @Override
        public CreateProductTagsRequest build() {
            return new CreateProductTagsRequest(this);
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
}
