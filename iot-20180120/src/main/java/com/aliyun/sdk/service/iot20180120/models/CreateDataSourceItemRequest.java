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
 * {@link CreateDataSourceItemRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceItemRequest</p>
 */
public class CreateDataSourceItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999999D)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    private CreateDataSourceItemRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.scopeType = builder.scopeType;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
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
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceItemRequest, Builder> {
        private Long dataSourceId; 
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String scopeType; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceItemRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.scopeType = request.scopeType;
            this.topic = request.topic;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The instance ID. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-0pp1n8t***</p>
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
         * ScopeType.
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The topic that you want to add to the data source in the rules engine. Format: <code>/${productKey}/${deviceName}/topicShortName</code>. <code>${productKey}</code> specifies the <strong>ProductKey</strong> of the product to which a device belongs. <code>${deviceName}</code> specifies the name of the device. <code>topicShortName</code> specifies the custom name of the topic.</p>
         * <ul>
         * <li><p>Basic communication topics or Thing Specification Language (TSL) communication topics are in the <code>/${productKey}/${deviceName}/topicShortName</code> format. You can replace <code>${deviceName}</code> with the plus sign (<code>+</code>) wildcard character. The wildcard character specifies that the topic applies to all devices in the product. Valid values of <code>topicShortName</code>:</p>
         * <ul>
         * <li><code>/thing/event/property/post</code>: submits the property data of a device.</li>
         * <li><code>/thing/event/${tsl.event.identifier}/post</code>: submits the event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</li>
         * <li><code>/thing/lifecycle</code>: submits device lifecycle changes.</li>
         * <li><code>/thing/downlink/reply/message</code>: sends a response to a request from IoT Platform.</li>
         * <li><code>/thing/list/found</code>: submits data when a gateway detects a new sub-device.</li>
         * <li><code>/thing/topo/lifecycle</code>: submits device topology changes.</li>
         * <li><code>/thing/event/property/history/post</code>: submits the historical property data of a device.</li>
         * <li><code>/thing/event/${tsl.event.identifier}/post</code>: submits the historical event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</li>
         * <li><code>/ota/upgrade</code>: submits the over-the-air (OTA) update status.</li>
         * <li><code>/ota/version/post</code>: submits OTA module versions.</li>
         * <li><code>/thing/deviceinfo/update</code>: submits device tag changes.</li>
         * </ul>
         * <p><code>/${productKey}/${packageId}/${jobId}/ota/job/status</code>: submits the status of each OTA update batch. This topic is a basic communication topic. <code>${packageId}</code> specifies the ID of the update package. <code>${jobId}</code> specifies the ID of the update batch.</p>
         * </li>
         * <li><p>Custom topics are in the <code>/${productKey}/${deviceName}/user/#</code> format. Example: <code>/${productKey}/${deviceName}/user/get</code>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to view all custom topics of a product.</p>
         * <p>When you specify a custom topic, you can use the plus sign (<code>+</code>) and number sign (<code>#</code>) wildcard characters.</p>
         * <ul>
         * <li>You can replace <code>${deviceName}</code> with the plus sign (<code>+</code>) wildcard character. The wildcard character specifies that the topic applies to all devices in the product.</li>
         * <li>You can replace the fields that follow ${deviceName} with <code>/user/#</code>. The number sign (<code>#</code>) wildcard character specifies that the topic applies to all fields that follow <code>/user</code>.</li>
         * </ul>
         * </li>
         * <li><p>Topics that are used to submit device status changes are in the <code>/as/mqtt/status/${productKey}/${deviceName}</code> format.</p>
         * </li>
         * </ul>
         * <p>You can use the plus sign (<code>+</code>) wildcard character to specify that the status changes of all devices in the product are submitted.</p>
         * <p>For more information about how to use wildcard characters, see the &quot;Custom topics with wildcard characters&quot; section in <a href="https://help.aliyun.com/document_detail/85539.html">Use custom topics</a>.</p>
         * <p>For more information about the data formats of topics, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</p>
         * <blockquote>
         * <p>You can add only the following topics to the data source in the rules engine for MQTT gateways, devices of MQTT gateways, and products and devices that use the open source MQTT protocol: custom topics, topics that are used to submit device status changes, and topics that are used to submit device lifecycle changes. For more information about custom topics, see the &quot;Messaging&quot; topic. If you set this parameter to a custom topic, you must specify ScopeType and ProductKey. If you set ScopeType to DEVICE, you must specify DeviceName.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/as/mqtt/status/gy***z/+</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public CreateDataSourceItemRequest build() {
            return new CreateDataSourceItemRequest(this);
        } 

    } 

}
