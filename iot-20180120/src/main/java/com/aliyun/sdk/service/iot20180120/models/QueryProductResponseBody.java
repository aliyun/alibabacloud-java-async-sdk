// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductResponseBody</p>
 */
public class QueryProductResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryProductResponseBody build() {
            return new QueryProductResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AliyunCommodityCode")
        private String aliyunCommodityCode;

        @NameInMap("AuthType")
        private String authType;

        @NameInMap("CategoryKey")
        private String categoryKey;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("DataFormat")
        private Integer dataFormat;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceCount")
        private Integer deviceCount;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id2")
        private Boolean id2;

        @NameInMap("NetType")
        private Integer netType;

        @NameInMap("NodeType")
        private Integer nodeType;

        @NameInMap("Owner")
        private Boolean owner;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductSecret")
        private String productSecret;

        @NameInMap("ProductStatus")
        private String productStatus;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("ValidateType")
        private Integer validateType;

        private Data(Builder builder) {
            this.aliyunCommodityCode = builder.aliyunCommodityCode;
            this.authType = builder.authType;
            this.categoryKey = builder.categoryKey;
            this.categoryName = builder.categoryName;
            this.dataFormat = builder.dataFormat;
            this.description = builder.description;
            this.deviceCount = builder.deviceCount;
            this.gmtCreate = builder.gmtCreate;
            this.id2 = builder.id2;
            this.netType = builder.netType;
            this.nodeType = builder.nodeType;
            this.owner = builder.owner;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.productSecret = builder.productSecret;
            this.productStatus = builder.productStatus;
            this.protocolType = builder.protocolType;
            this.validateType = builder.validateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunCommodityCode
         */
        public String getAliyunCommodityCode() {
            return this.aliyunCommodityCode;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return categoryKey
         */
        public String getCategoryKey() {
            return this.categoryKey;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return dataFormat
         */
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceCount
         */
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id2
         */
        public Boolean getId2() {
            return this.id2;
        }

        /**
         * @return netType
         */
        public Integer getNetType() {
            return this.netType;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return owner
         */
        public Boolean getOwner() {
            return this.owner;
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

        /**
         * @return productSecret
         */
        public String getProductSecret() {
            return this.productSecret;
        }

        /**
         * @return productStatus
         */
        public String getProductStatus() {
            return this.productStatus;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return validateType
         */
        public Integer getValidateType() {
            return this.validateType;
        }

        public static final class Builder {
            private String aliyunCommodityCode; 
            private String authType; 
            private String categoryKey; 
            private String categoryName; 
            private Integer dataFormat; 
            private String description; 
            private Integer deviceCount; 
            private Long gmtCreate; 
            private Boolean id2; 
            private Integer netType; 
            private Integer nodeType; 
            private Boolean owner; 
            private String productKey; 
            private String productName; 
            private String productSecret; 
            private String productStatus; 
            private String protocolType; 
            private Integer validateType; 

            /**
             * AliyunCommodityCode.
             */
            public Builder aliyunCommodityCode(String aliyunCommodityCode) {
                this.aliyunCommodityCode = aliyunCommodityCode;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * CategoryKey.
             */
            public Builder categoryKey(String categoryKey) {
                this.categoryKey = categoryKey;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * DataFormat.
             */
            public Builder dataFormat(Integer dataFormat) {
                this.dataFormat = dataFormat;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceCount.
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id2.
             */
            public Builder id2(Boolean id2) {
                this.id2 = id2;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(Integer netType) {
                this.netType = netType;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(Boolean owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
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
             * ProductSecret.
             */
            public Builder productSecret(String productSecret) {
                this.productSecret = productSecret;
                return this;
            }

            /**
             * ProductStatus.
             */
            public Builder productStatus(String productStatus) {
                this.productStatus = productStatus;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ValidateType.
             */
            public Builder validateType(Integer validateType) {
                this.validateType = validateType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
