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
 * {@link CreateProductTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateProductTagsRequest</p>
 */
public class CreateProductTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ProductTag> productTag;

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
    public java.util.List<ProductTag> getProductTag() {
        return this.productTag;
    }

    public static final class Builder extends Request.Builder<CreateProductTagsRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List<ProductTag> productTag; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductTagsRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.productTag = request.productTag;
        } 

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <p><strong>Important</strong></p>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product. A <strong>ProductKey</strong> is a GUID that is issued by IoT Platform to a product.</p>
         * <p>You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productTag(java.util.List<ProductTag> productTag) {
            this.putQueryParameter("ProductTag", productTag);
            this.productTag = productTag;
            return this;
        }

        @Override
        public CreateProductTagsRequest build() {
            return new CreateProductTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductTagsRequest} extends {@link TeaModel}
     *
     * <p>CreateProductTagsRequest</p>
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
             * <p>The keys of product tags. Each key must be 1 to 30 characters in length, and can contain letters, digits, and periods (.).</p>
             * <p><strong>Important</strong> <code>abc</code> is a <strong>key</strong> that is reserved by IoT Platform. You cannot set a <strong>key</strong> to <code>abc</code>. If you set a <code>key</code> to abc, the key is automatically filtered when you query tags.</p>
             * 
             * <strong>example:</strong>
             * <p>room</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The values of the product tags. Each tag value must be 1 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
