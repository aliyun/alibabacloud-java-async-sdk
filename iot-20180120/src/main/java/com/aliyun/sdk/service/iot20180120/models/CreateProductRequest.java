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
 * {@link CreateProductRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRequest</p>
 */
public class CreateProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunCommodityCode")
    private String aliyunCommodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryKey")
    private String categoryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFormat")
    private Integer dataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id2")
    private Boolean id2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinPermissionId")
    private String joinPermissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishAuto")
    private Boolean publishAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidateType")
    private Integer validateType;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.aliyunCommodityCode = builder.aliyunCommodityCode;
        this.authType = builder.authType;
        this.categoryKey = builder.categoryKey;
        this.dataFormat = builder.dataFormat;
        this.description = builder.description;
        this.id2 = builder.id2;
        this.iotInstanceId = builder.iotInstanceId;
        this.joinPermissionId = builder.joinPermissionId;
        this.netType = builder.netType;
        this.nodeType = builder.nodeType;
        this.productName = builder.productName;
        this.protocolType = builder.protocolType;
        this.publishAuto = builder.publishAuto;
        this.resourceGroupId = builder.resourceGroupId;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return joinPermissionId
     */
    public String getJoinPermissionId() {
        return this.joinPermissionId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return nodeType
     */
    public Integer getNodeType() {
        return this.nodeType;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return publishAuto
     */
    public Boolean getPublishAuto() {
        return this.publishAuto;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return validateType
     */
    public Integer getValidateType() {
        return this.validateType;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String aliyunCommodityCode; 
        private String authType; 
        private String categoryKey; 
        private Integer dataFormat; 
        private String description; 
        private Boolean id2; 
        private String iotInstanceId; 
        private String joinPermissionId; 
        private String netType; 
        private Integer nodeType; 
        private String productName; 
        private String protocolType; 
        private Boolean publishAuto; 
        private String resourceGroupId; 
        private Integer validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest request) {
            super(request);
            this.aliyunCommodityCode = request.aliyunCommodityCode;
            this.authType = request.authType;
            this.categoryKey = request.categoryKey;
            this.dataFormat = request.dataFormat;
            this.description = request.description;
            this.id2 = request.id2;
            this.iotInstanceId = request.iotInstanceId;
            this.joinPermissionId = request.joinPermissionId;
            this.netType = request.netType;
            this.nodeType = request.nodeType;
            this.productName = request.productName;
            this.protocolType = request.protocolType;
            this.publishAuto = request.publishAuto;
            this.resourceGroupId = request.resourceGroupId;
            this.validateType = request.validateType;
        } 

        /**
         * <p>The edition of the product.</p>
         * <ul>
         * <li>If you do not configure this parameter, a product of the Basic Edition is automatically created. You cannot use a TSL model to define the product.</li>
         * <li>If you want to configure this parameter, set the value to <strong>iothub_senior</strong>. A product that supports TSL models is created. You must also configure the <strong>DataFormat</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iothub_senior</p>
         */
        public Builder aliyunCommodityCode(String aliyunCommodityCode) {
            this.putQueryParameter("AliyunCommodityCode", aliyunCommodityCode);
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }

        /**
         * <p>The verification method that is used to connect the devices of the product to IoT Platform.</p>
         * <p>You do not need to configure this parameter. <strong>secret</strong>: uses DeviceSecrets to verify the devices. Default value: secret. For more information, see <a href="https://help.aliyun.com/document_detail/73742.html">MQTT connections over TCP</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>secret</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The identifier of the product category. If you configure this parameter, a TSL model of the product category is used. Otherwise, no TSL model is used.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150316.html">ListThingTemplates</a> operation to query the details of product categories that are predefined by IoT Platform and obtain category keys.</p>
         * 
         * <strong>example:</strong>
         * <p>Lighting</p>
         */
        public Builder categoryKey(String categoryKey) {
            this.putQueryParameter("CategoryKey", categoryKey);
            this.categoryKey = categoryKey;
            return this;
        }

        /**
         * <p>The data format.</p>
         * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong>, you must configure this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: custom data format.</li>
         * <li><strong>1</strong>: Alink JSON format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataFormat(Integer dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * <p>The description of the product. The description can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Product test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder id2(Boolean id2) {
            this.putQueryParameter("Id2", id2);
            this.id2 = id2;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <p><strong>Important</strong></p>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-<em><strong>-v64</strong></em></p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8***</p>
         */
        public Builder joinPermissionId(String joinPermissionId) {
            this.putQueryParameter("JoinPermissionId", joinPermissionId);
            this.joinPermissionId = joinPermissionId;
            return this;
        }

        /**
         * <p>The network connection method.</p>
         * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong> and the devices of the product are directly connected devices or gateways, you must configure this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>WIFI</strong>: Wi-Fi.</li>
         * <li><strong>CELLULAR</strong>: cellular network.</li>
         * <li><strong>ETHERNET</strong>: Ethernet.</li>
         * <li><strong>OTHER</strong>: other networks.</li>
         * </ul>
         * <p>Default value: WIFI.</p>
         * 
         * <strong>example:</strong>
         * <p>WIFI</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * <p>The node type of the product. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway. If you use the device as a sub-device, you must also configure the <strong>ProtocolType</strong> parameter.</li>
         * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nodeType(Integer nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The name of the product.</p>
         * <p>The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p><strong>Important</strong> Each product name must be unique within the current instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Light</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The protocol used by the devices of the product to connect to the gateway.</p>
         * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong> and a gateway is required to connect the devices of the product to IoT Platform, you must configure this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>modbus</strong>: Modbus.</li>
         * <li><strong>opc-ua</strong>: Open Platform Communication Unified Architecture (OPC UA).</li>
         * <li><strong>customize</strong>: custom protocol.</li>
         * <li><strong>ble</strong>: Bluetooth Low Energy (BLE).</li>
         * <li><strong>zigbee</strong>: ZigBee.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>modbus</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>Specifies whether to publish the TSL model after the product is created.</p>
         * <ul>
         * <li><strong>true</strong>: publishes the TSL model after the product is created.</li>
         * <li><strong>false</strong>: does not publish the TSL model after the product is created.</li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder publishAuto(Boolean publishAuto) {
            this.putQueryParameter("PublishAuto", publishAuto);
            this.publishAuto = publishAuto;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the product belongs. If you specify a value for this parameter, the product is added to the resource group.</p>
         * <p>You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a> to view the ID of the resource group.</p>
         * <p><strong>Important</strong></p>
         * <p>You can specify a value for this parameter only if you have activated Resource Management.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph***</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The level of data verification. If you do not configure this parameter, the default value is used. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: weak verification. Default value: 1. IoT Platform verifies only the identifier and dataType fields of the data. All data is forwarded.</p>
         * <p>In the IoT Platform console, the data is displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page. The data that fails to be verified is not displayed.</p>
         * <p>You can view the data that failed to be verified in the <strong>checkFailedData</strong> parameter of the forwarded data. For more information, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</p>
         * </li>
         * <li><p><strong>2</strong>: no verification. IoT Platform does not verify the data. All data is forwarded.</p>
         * <p>In the IoT Platform console, the data is not displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder validateType(Integer validateType) {
            this.putQueryParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

}
