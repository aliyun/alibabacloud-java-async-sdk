// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link GetProductListResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductListResponseBody</p>
 */
public class GetProductListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DisplayInfo")
    private DisplayInfo displayInfo;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private GetProductListResponseBody(Builder builder) {
        this.code = builder.code;
        this.displayInfo = builder.displayInfo;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductListResponseBody create() {
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
     * @return displayInfo
     */
    public DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private DisplayInfo displayInfo; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetProductListResponseBody model) {
            this.code = model.code;
            this.displayInfo = model.displayInfo;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DisplayInfo.
         */
        public Builder displayInfo(DisplayInfo displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetProductListResponseBody build() {
            return new GetProductListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductListResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductListResponseBody</p>
     */
    public static class SkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppleSkuCode")
        private String appleSkuCode;

        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("PurchaseMode")
        private String purchaseMode;

        @com.aliyun.core.annotation.NameInMap("SkuCode")
        private String skuCode;

        @com.aliyun.core.annotation.NameInMap("SkuDesc")
        private String skuDesc;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private SkuList(Builder builder) {
            this.appleSkuCode = builder.appleSkuCode;
            this.attribute = builder.attribute;
            this.purchaseMode = builder.purchaseMode;
            this.skuCode = builder.skuCode;
            this.skuDesc = builder.skuDesc;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return appleSkuCode
         */
        public String getAppleSkuCode() {
            return this.appleSkuCode;
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return purchaseMode
         */
        public String getPurchaseMode() {
            return this.purchaseMode;
        }

        /**
         * @return skuCode
         */
        public String getSkuCode() {
            return this.skuCode;
        }

        /**
         * @return skuDesc
         */
        public String getSkuDesc() {
            return this.skuDesc;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private String appleSkuCode; 
            private String attribute; 
            private String purchaseMode; 
            private String skuCode; 
            private String skuDesc; 
            private String skuName; 

            private Builder() {
            } 

            private Builder(SkuList model) {
                this.appleSkuCode = model.appleSkuCode;
                this.attribute = model.attribute;
                this.purchaseMode = model.purchaseMode;
                this.skuCode = model.skuCode;
                this.skuDesc = model.skuDesc;
                this.skuName = model.skuName;
            } 

            /**
             * AppleSkuCode.
             */
            public Builder appleSkuCode(String appleSkuCode) {
                this.appleSkuCode = appleSkuCode;
                return this;
            }

            /**
             * Attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * PurchaseMode.
             */
            public Builder purchaseMode(String purchaseMode) {
                this.purchaseMode = purchaseMode;
                return this;
            }

            /**
             * SkuCode.
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * SkuDesc.
             */
            public Builder skuDesc(String skuDesc) {
                this.skuDesc = skuDesc;
                return this;
            }

            /**
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProductListResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductListResponseBody</p>
     */
    public static class ProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayAttribute")
        private String displayAttribute;

        @com.aliyun.core.annotation.NameInMap("DisplayConfig")
        private String displayConfig;

        @com.aliyun.core.annotation.NameInMap("DynamicAttribute")
        private String dynamicAttribute;

        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Boolean isEnable;

        @com.aliyun.core.annotation.NameInMap("ModificationLevel")
        private Integer modificationLevel;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductDesc")
        private String productDesc;

        @com.aliyun.core.annotation.NameInMap("ProductGroup")
        private String productGroup;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("SkuList")
        private java.util.List<SkuList> skuList;

        private ProductList(Builder builder) {
            this.displayAttribute = builder.displayAttribute;
            this.displayConfig = builder.displayConfig;
            this.dynamicAttribute = builder.dynamicAttribute;
            this.isEnable = builder.isEnable;
            this.modificationLevel = builder.modificationLevel;
            this.productCode = builder.productCode;
            this.productDesc = builder.productDesc;
            this.productGroup = builder.productGroup;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.skuList = builder.skuList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return displayAttribute
         */
        public String getDisplayAttribute() {
            return this.displayAttribute;
        }

        /**
         * @return displayConfig
         */
        public String getDisplayConfig() {
            return this.displayConfig;
        }

        /**
         * @return dynamicAttribute
         */
        public String getDynamicAttribute() {
            return this.dynamicAttribute;
        }

        /**
         * @return isEnable
         */
        public Boolean getIsEnable() {
            return this.isEnable;
        }

        /**
         * @return modificationLevel
         */
        public Integer getModificationLevel() {
            return this.modificationLevel;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productDesc
         */
        public String getProductDesc() {
            return this.productDesc;
        }

        /**
         * @return productGroup
         */
        public String getProductGroup() {
            return this.productGroup;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return skuList
         */
        public java.util.List<SkuList> getSkuList() {
            return this.skuList;
        }

        public static final class Builder {
            private String displayAttribute; 
            private String displayConfig; 
            private String dynamicAttribute; 
            private Boolean isEnable; 
            private Integer modificationLevel; 
            private String productCode; 
            private String productDesc; 
            private String productGroup; 
            private String productName; 
            private String productType; 
            private java.util.List<SkuList> skuList; 

            private Builder() {
            } 

            private Builder(ProductList model) {
                this.displayAttribute = model.displayAttribute;
                this.displayConfig = model.displayConfig;
                this.dynamicAttribute = model.dynamicAttribute;
                this.isEnable = model.isEnable;
                this.modificationLevel = model.modificationLevel;
                this.productCode = model.productCode;
                this.productDesc = model.productDesc;
                this.productGroup = model.productGroup;
                this.productName = model.productName;
                this.productType = model.productType;
                this.skuList = model.skuList;
            } 

            /**
             * DisplayAttribute.
             */
            public Builder displayAttribute(String displayAttribute) {
                this.displayAttribute = displayAttribute;
                return this;
            }

            /**
             * DisplayConfig.
             */
            public Builder displayConfig(String displayConfig) {
                this.displayConfig = displayConfig;
                return this;
            }

            /**
             * DynamicAttribute.
             */
            public Builder dynamicAttribute(String dynamicAttribute) {
                this.dynamicAttribute = dynamicAttribute;
                return this;
            }

            /**
             * IsEnable.
             */
            public Builder isEnable(Boolean isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * ModificationLevel.
             */
            public Builder modificationLevel(Integer modificationLevel) {
                this.modificationLevel = modificationLevel;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductDesc.
             */
            public Builder productDesc(String productDesc) {
                this.productDesc = productDesc;
                return this;
            }

            /**
             * ProductGroup.
             */
            public Builder productGroup(String productGroup) {
                this.productGroup = productGroup;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * SkuList.
             */
            public Builder skuList(java.util.List<SkuList> skuList) {
                this.skuList = skuList;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProductListResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductListResponseBody</p>
     */
    public static class DisplayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductList")
        private java.util.List<ProductList> productList;

        private DisplayInfo(Builder builder) {
            this.productList = builder.productList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayInfo create() {
            return builder().build();
        }

        /**
         * @return productList
         */
        public java.util.List<ProductList> getProductList() {
            return this.productList;
        }

        public static final class Builder {
            private java.util.List<ProductList> productList; 

            private Builder() {
            } 

            private Builder(DisplayInfo model) {
                this.productList = model.productList;
            } 

            /**
             * ProductList.
             */
            public Builder productList(java.util.List<ProductList> productList) {
                this.productList = productList;
                return this;
            }

            public DisplayInfo build() {
                return new DisplayInfo(this);
            } 

        } 

    }
}
