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
 * {@link ListProductByTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductByTagsResponseBody</p>
 */
public class ListProductByTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProductInfos")
    private ProductInfos productInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListProductByTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.productInfos = builder.productInfos;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductByTagsResponseBody create() {
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
     * @return productInfos
     */
    public ProductInfos getProductInfos() {
        return this.productInfos;
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
        private ProductInfos productInfos; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListProductByTagsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.productInfos = model.productInfos;
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
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the products returned if the call is successful. The details are included in the <strong>ProductInfo</strong> parameter.</p>
         * <blockquote>
         * <p> The returned product information is sorted in reverse-chronological order based on the time when the products were created.</p>
         * </blockquote>
         */
        public Builder productInfos(ProductInfos productInfos) {
            this.productInfos = productInfos;
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
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProductByTagsResponseBody build() {
            return new ListProductByTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductByTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductByTagsResponseBody</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private ProductInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.nodeType = builder.nodeType;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private Integer nodeType; 
            private String productKey; 
            private String productName; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.nodeType = model.nodeType;
                this.productKey = model.productKey;
                this.productName = model.productName;
            } 

            /**
             * <p>The time when the product was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1545355537000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test product.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The node type of the product. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can connect to IoT Platform directly or as a sub-device of a gateway.</li>
             * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The ProductKey of the product. A ProductKey is a globally unique identifier (GUID) issued by IoT Platform to a new product.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductByTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductByTagsResponseBody</p>
     */
    public static class ProductInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductInfo")
        private java.util.List<ProductInfo> productInfo;

        private ProductInfos(Builder builder) {
            this.productInfo = builder.productInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfos create() {
            return builder().build();
        }

        /**
         * @return productInfo
         */
        public java.util.List<ProductInfo> getProductInfo() {
            return this.productInfo;
        }

        public static final class Builder {
            private java.util.List<ProductInfo> productInfo; 

            private Builder() {
            } 

            private Builder(ProductInfos model) {
                this.productInfo = model.productInfo;
            } 

            /**
             * ProductInfo.
             */
            public Builder productInfo(java.util.List<ProductInfo> productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            public ProductInfos build() {
                return new ProductInfos(this);
            } 

        } 

    }
}
