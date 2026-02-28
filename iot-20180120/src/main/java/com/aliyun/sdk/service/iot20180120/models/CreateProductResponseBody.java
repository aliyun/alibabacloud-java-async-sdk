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
 * {@link CreateProductResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductResponseBody</p>
 */
public class CreateProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductResponseBody create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
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
        private String productKey; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.productKey = model.productKey;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
         * 
         * <strong>example:</strong>
         * <p>a1FlqIQ****</p>
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
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
         * <p>Indicates whether the call was successful. Valid values:</p>
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

        public CreateProductResponseBody build() {
            return new CreateProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunCommodityCode")
        private String aliyunCommodityCode;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("DataFormat")
        private Integer dataFormat;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id2")
        private Boolean id2;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductSecret")
        private String productSecret;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        private Data(Builder builder) {
            this.aliyunCommodityCode = builder.aliyunCommodityCode;
            this.authType = builder.authType;
            this.dataFormat = builder.dataFormat;
            this.description = builder.description;
            this.id2 = builder.id2;
            this.nodeType = builder.nodeType;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.productSecret = builder.productSecret;
            this.protocolType = builder.protocolType;
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
         * @return id2
         */
        public Boolean getId2() {
            return this.id2;
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

        /**
         * @return productSecret
         */
        public String getProductSecret() {
            return this.productSecret;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        public static final class Builder {
            private String aliyunCommodityCode; 
            private String authType; 
            private Integer dataFormat; 
            private String description; 
            private Boolean id2; 
            private Integer nodeType; 
            private String productKey; 
            private String productName; 
            private String productSecret; 
            private String protocolType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunCommodityCode = model.aliyunCommodityCode;
                this.authType = model.authType;
                this.dataFormat = model.dataFormat;
                this.description = model.description;
                this.id2 = model.id2;
                this.nodeType = model.nodeType;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.productSecret = model.productSecret;
                this.protocolType = model.protocolType;
            } 

            /**
             * <p>The type of the product.</p>
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
             * <p>The authentication method that is used to connect the devices of the product to IoT Platform. Valid values:</p>
             * <ul>
             * <li><strong>secret</strong>: uses DeviceSecrets to verify the devices.</li>
             * <li><strong>id2</strong>: uses IoT Internet Device ID to verify the devices.</li>
             * <li><strong>x509</strong>: uses X.509 certificates to verify the devices.</li>
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
             * <p>The data format.</p>
             * <ul>
             * <li><strong>0</strong>: custom data format.</li>
             * <li><strong>1</strong>: Alink JSON format.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             * </blockquote>
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
             * <p>Product test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether IoT Internet Device ID was enabled.</p>
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
             * <p>The node type of the product. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway.</li>
             * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             * </blockquote>
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
             * <blockquote>
             * <p> Secure the <strong>ProductKey</strong> of the product. The ProductKey is required when you perform specific operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a1FlqIQ****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
             * <p>The protocol used by the devices of the product to connect to the gateway.</p>
             * <blockquote>
             * <p> This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>modbus</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
