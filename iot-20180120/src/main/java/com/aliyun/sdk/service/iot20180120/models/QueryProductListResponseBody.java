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
 * {@link QueryProductListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductListResponseBody</p>
 */
public class QueryProductListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryProductListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductListResponseBody create() {
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

        private Builder() {
        } 

        private Builder(QueryProductListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * <p>The product information returned if the call is successful. For more information, see the following parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4B4ECF2C-6222-42EC-A4B5-C12202E71CEA</p>
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

        public QueryProductListResponseBody build() {
            return new QueryProductListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductListResponseBody</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("DataFormat")
        private Integer dataFormat;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceCount")
        private Integer deviceCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private ProductInfo(Builder builder) {
            this.authType = builder.authType;
            this.dataFormat = builder.dataFormat;
            this.description = builder.description;
            this.deviceCount = builder.deviceCount;
            this.gmtCreate = builder.gmtCreate;
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
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
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
            private String authType; 
            private Integer dataFormat; 
            private String description; 
            private Integer deviceCount; 
            private Long gmtCreate; 
            private Integer nodeType; 
            private String productKey; 
            private String productName; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.authType = model.authType;
                this.dataFormat = model.dataFormat;
                this.description = model.description;
                this.deviceCount = model.deviceCount;
                this.gmtCreate = model.gmtCreate;
                this.nodeType = model.nodeType;
                this.productKey = model.productKey;
                this.productName = model.productName;
            } 

            /**
             * <p>The authentication method that was used to connect the devices of the product to IoT Platform. Valid values:</p>
             * <ul>
             * <li><strong>secret</strong>: DeviceSecrets were used to authenticate the devices.</li>
             * <li><strong>id2</strong>: IoT Internet Device ID was used to authenticate the devices.</li>
             * <li><strong>x509</strong>: X.509 certificates were used to authenticate the devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>secret</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The data format that was used by a communication protocol to transmit data between the devices and IoT Platform. This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: custom. A custom serial data format was used. In this case, the device can submit raw data, such as binary data streams. IoT Platform converts the raw data into standard Alink JSON data by using a specified data parsing script.</li>
             * <li><strong>1</strong>: Alink JSON. Alink JSON data is transmitted between the devices and IoT Platform. Alink is a data exchange protocol that is pre-defined by IoT Platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataFormat(Integer dataFormat) {
                this.dataFormat = dataFormat;
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
             * <p>The number of devices in the product.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * <p>The time when the product was created. The value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1581595942000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The node type of the product. This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway.</li>
             * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
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
             * <p>The ProductKey of the product. When you create a product, a ProductKey is a globally unique identifier (GUID) that is issued by IoT Platform to the product.</p>
             * 
             * <strong>example:</strong>
             * <p>a1T27vz****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the service.</p>
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
     * {@link QueryProductListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductInfo")
        private java.util.List<ProductInfo> productInfo;

        private List(Builder builder) {
            this.productInfo = builder.productInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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

            private Builder(List model) {
                this.productInfo = model.productInfo;
            } 

            /**
             * ProductInfo.
             */
            public Builder productInfo(java.util.List<ProductInfo> productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProductListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private List list; 
            private Integer pageCount; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.list = model.list;
                this.pageCount = model.pageCount;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The details of the products.</p>
             * <blockquote>
             * <p> The returned product information is sorted in reverse-chronological order based on the time when the products were created.</p>
             * </blockquote>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>92</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of products.</p>
             * 
             * <strong>example:</strong>
             * <p>184</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
