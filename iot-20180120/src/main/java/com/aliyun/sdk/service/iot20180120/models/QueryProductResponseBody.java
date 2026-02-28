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
 * {@link QueryProductResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductResponseBody</p>
 */
public class QueryProductResponseBody extends TeaModel {
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

        private Builder(QueryProductResponseBody model) {
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
         * <p>The product information returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4F94B97-1D64-4080-BFD2-67461667AA43</p>
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

        public QueryProductResponseBody build() {
            return new QueryProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunCommodityCode")
        private String aliyunCommodityCode;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("CategoryKey")
        private String categoryKey;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DataFormat")
        private Integer dataFormat;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceCount")
        private Integer deviceCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id2")
        private Boolean id2;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private Integer netType;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Boolean owner;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductSecret")
        private String productSecret;

        @com.aliyun.core.annotation.NameInMap("ProductStatus")
        private String productStatus;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ValidateType")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunCommodityCode = model.aliyunCommodityCode;
                this.authType = model.authType;
                this.categoryKey = model.categoryKey;
                this.categoryName = model.categoryName;
                this.dataFormat = model.dataFormat;
                this.description = model.description;
                this.deviceCount = model.deviceCount;
                this.gmtCreate = model.gmtCreate;
                this.id2 = model.id2;
                this.netType = model.netType;
                this.nodeType = model.nodeType;
                this.owner = model.owner;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.productSecret = model.productSecret;
                this.productStatus = model.productStatus;
                this.protocolType = model.protocolType;
                this.validateType = model.validateType;
            } 

            /**
             * <p>The type of the product. This parameter indicates whether a Thing Specification Language (TSL) model was used.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>iothub_senior</strong>: A TSL model was used.</li>
             * <li><strong>iothub</strong>: No TSL model was used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>iothub_senior</p>
             */
            public Builder aliyunCommodityCode(String aliyunCommodityCode) {
                this.aliyunCommodityCode = aliyunCommodityCode;
                return this;
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
             * <p>The identifier of the category to which the product belongs.</p>
             * <p>This parameter is returned if the product uses the TSL model of a standard category that is pre-defined by IoT Platform.</p>
             * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             * 
             * <strong>example:</strong>
             * <p>Lighting</p>
             */
            public Builder categoryKey(String categoryKey) {
                this.categoryKey = categoryKey;
                return this;
            }

            /**
             * <p>The name of the product category.</p>
             * <p>This parameter is returned if the product uses the TSL model of a standard category that is pre-defined by IoT Platform.</p>
             * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The data format that was used by a communication protocol to transmit data between the devices and IoT Platform. This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
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
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of devices under the product.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Indicates whether IoT Internet Device ID was enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: IoT Internet Device ID was enabled.</li>
             * <li><strong>false</strong>: IoT Internet Device ID was disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder id2(Boolean id2) {
                this.id2 = id2;
                return this;
            }

            /**
             * <p>The network connection method. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: Wi-Fi.</li>
             * <li><strong>6</strong>: cellular network (2G/3G/4G/5G).</li>
             * <li><strong>7</strong>: Ethernet.</li>
             * <li><strong>8</strong>: others.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder netType(Integer netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The node type of the product. This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior. Valid values:</p>
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
             * <p>Indicates whether the operation was called by the owner of the product.</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder owner(Boolean owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ProductKey of the product. When you create a product, a ProductKey is the globally unique identifier (GUID) that is issued by IoT Platform to the product.</p>
             * 
             * <strong>example:</strong>
             * <p>a1T27vz****</p>
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

            /**
             * <p>The ProductSecret of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>U5tW7i44uilc****</p>
             */
            public Builder productSecret(String productSecret) {
                this.productSecret = productSecret;
                return this;
            }

            /**
             * <p>The status of the product.</p>
             * <ul>
             * <li><strong>DEVELOPMENT_STATUS</strong>: The product is being developed.</li>
             * <li><strong>RELEASE_STATUS</strong>: The product was published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEVELOPMENT_STATUS</p>
             */
            public Builder productStatus(String productStatus) {
                this.productStatus = productStatus;
                return this;
            }

            /**
             * <p>The type of the protocol that was used by the sub-devices to connect with a gateway.</p>
             * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior and the NodeType parameter is set to 1. Valid values:</p>
             * <ul>
             * <li><strong>modbus</strong>: Modbus.</li>
             * <li><strong>opc-ua</strong>: OPC UA.</li>
             * <li><strong>customize</strong>: custom protocol.</li>
             * <li><strong>ble</strong>: BLE.</li>
             * <li><strong>zigbee</strong>: ZigBee.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>modbus</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The level of the data verification. Valid values:</p>
             * <ul>
             * <li><p><strong>2</strong>: no verification. IoT Platform does not verify the data. All data is forwarded.</p>
             * <p>In the IoT Platform console, the data is not displayed on the TSL Data tab of the Device Details page.</p>
             * </li>
             * <li><p><strong>1</strong>: low-level verification. IoT Platform verifies only the identifier and dataType fields of the data. All data is forwarded.</p>
             * </li>
             * <li><p><strong>0</strong>: high-level verification. IoT Platform verifies all fields of the data. Only the data that passes the verification is forwarded.</p>
             * <p>The products that were created before October 14, 2020 support only high-level verification.</p>
             * </li>
             * </ul>
             * <p>The products that were created on October 14, 2020 or later support low-level verification or no verification.</p>
             * <p>After verification, you can view the data that passes or fails the verification.</p>
             * <ul>
             * <li>In the IoT Platform console, the data is displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page. The data that fails the verification is not displayed.</li>
             * <li>You can view the data that fails the verification in the <strong>checkFailedData</strong> parameter of the forwarded data. For more information, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
