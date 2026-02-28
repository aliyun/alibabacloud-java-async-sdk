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
 * {@link UpdateSubscribeRelationRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscribeRelationRequest</p>
 */
public class UpdateSubscribeRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupIds")
    private java.util.List<String> consumerGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceDataFlag")
    private Boolean deviceDataFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceLifeCycleFlag")
    private Boolean deviceLifeCycleFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceStatusChangeFlag")
    private Boolean deviceStatusChangeFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTagFlag")
    private Boolean deviceTagFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTopoLifeCycleFlag")
    private Boolean deviceTopoLifeCycleFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FoundDeviceListFlag")
    private Boolean foundDeviceListFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MnsConfiguration")
    private String mnsConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtaEventFlag")
    private Boolean otaEventFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtaJobFlag")
    private Boolean otaJobFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtaVersionFlag")
    private Boolean otaVersionFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeFlags")
    private String subscribeFlags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThingHistoryFlag")
    private Boolean thingHistoryFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateSubscribeRelationRequest(Builder builder) {
        super(builder);
        this.consumerGroupIds = builder.consumerGroupIds;
        this.deviceDataFlag = builder.deviceDataFlag;
        this.deviceLifeCycleFlag = builder.deviceLifeCycleFlag;
        this.deviceStatusChangeFlag = builder.deviceStatusChangeFlag;
        this.deviceTagFlag = builder.deviceTagFlag;
        this.deviceTopoLifeCycleFlag = builder.deviceTopoLifeCycleFlag;
        this.foundDeviceListFlag = builder.foundDeviceListFlag;
        this.iotInstanceId = builder.iotInstanceId;
        this.mnsConfiguration = builder.mnsConfiguration;
        this.otaEventFlag = builder.otaEventFlag;
        this.otaJobFlag = builder.otaJobFlag;
        this.otaVersionFlag = builder.otaVersionFlag;
        this.productKey = builder.productKey;
        this.subscribeFlags = builder.subscribeFlags;
        this.thingHistoryFlag = builder.thingHistoryFlag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscribeRelationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupIds
     */
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    /**
     * @return deviceDataFlag
     */
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    /**
     * @return deviceLifeCycleFlag
     */
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    /**
     * @return deviceStatusChangeFlag
     */
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    /**
     * @return deviceTagFlag
     */
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    /**
     * @return deviceTopoLifeCycleFlag
     */
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    /**
     * @return foundDeviceListFlag
     */
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return mnsConfiguration
     */
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    /**
     * @return otaEventFlag
     */
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    /**
     * @return otaJobFlag
     */
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    /**
     * @return otaVersionFlag
     */
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return subscribeFlags
     */
    public String getSubscribeFlags() {
        return this.subscribeFlags;
    }

    /**
     * @return thingHistoryFlag
     */
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateSubscribeRelationRequest, Builder> {
        private java.util.List<String> consumerGroupIds; 
        private Boolean deviceDataFlag; 
        private Boolean deviceLifeCycleFlag; 
        private Boolean deviceStatusChangeFlag; 
        private Boolean deviceTagFlag; 
        private Boolean deviceTopoLifeCycleFlag; 
        private Boolean foundDeviceListFlag; 
        private String iotInstanceId; 
        private String mnsConfiguration; 
        private Boolean otaEventFlag; 
        private Boolean otaJobFlag; 
        private Boolean otaVersionFlag; 
        private String productKey; 
        private String subscribeFlags; 
        private Boolean thingHistoryFlag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscribeRelationRequest request) {
            super(request);
            this.consumerGroupIds = request.consumerGroupIds;
            this.deviceDataFlag = request.deviceDataFlag;
            this.deviceLifeCycleFlag = request.deviceLifeCycleFlag;
            this.deviceStatusChangeFlag = request.deviceStatusChangeFlag;
            this.deviceTagFlag = request.deviceTagFlag;
            this.deviceTopoLifeCycleFlag = request.deviceTopoLifeCycleFlag;
            this.foundDeviceListFlag = request.foundDeviceListFlag;
            this.iotInstanceId = request.iotInstanceId;
            this.mnsConfiguration = request.mnsConfiguration;
            this.otaEventFlag = request.otaEventFlag;
            this.otaJobFlag = request.otaJobFlag;
            this.otaVersionFlag = request.otaVersionFlag;
            this.productKey = request.productKey;
            this.subscribeFlags = request.subscribeFlags;
            this.thingHistoryFlag = request.thingHistoryFlag;
            this.type = request.type;
        } 

        /**
         * ConsumerGroupIds.
         */
        public Builder consumerGroupIds(java.util.List<String> consumerGroupIds) {
            this.putQueryParameter("ConsumerGroupIds", consumerGroupIds);
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * <p>Specifies whether to push upstream device messages. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceDataFlag(Boolean deviceDataFlag) {
            this.putQueryParameter("DeviceDataFlag", deviceDataFlag);
            this.deviceDataFlag = deviceDataFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages about device lifecycle changes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
            this.putQueryParameter("DeviceLifeCycleFlag", deviceLifeCycleFlag);
            this.deviceLifeCycleFlag = deviceLifeCycleFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages about device status changes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
            this.putQueryParameter("DeviceStatusChangeFlag", deviceStatusChangeFlag);
            this.deviceStatusChangeFlag = deviceStatusChangeFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceTagFlag(Boolean deviceTagFlag) {
            this.putQueryParameter("DeviceTagFlag", deviceTagFlag);
            this.deviceTagFlag = deviceTagFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. This parameter is valid only for gateway products.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
            this.putQueryParameter("DeviceTopoLifeCycleFlag", deviceTopoLifeCycleFlag);
            this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages if a gateway detects new sub-devices. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. This parameter is valid only for gateway products.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder foundDeviceListFlag(Boolean foundDeviceListFlag) {
            this.putQueryParameter("FoundDeviceListFlag", foundDeviceListFlag);
            this.foundDeviceListFlag = foundDeviceListFlag;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The configurations of the MNS queue. This parameter is required if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</p>
         * <p>For more information, see the &quot;Definition of the MnsConfiguration parameter&quot; section.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;queueName&quot;: &quot;mns-test-topic1&quot;,     &quot;regionName&quot;: &quot;cn-shanghai&quot;,     &quot;role&quot;: {         &quot;roleArn&quot;: &quot;acs:ram::5645***:role/aliyuniotaccessingmnsrole&quot;,         &quot;roleName&quot;: &quot;AliyunIOTAccessingMNSRole&quot;     } }</p>
         */
        public Builder mnsConfiguration(String mnsConfiguration) {
            this.putQueryParameter("MnsConfiguration", mnsConfiguration);
            this.mnsConfiguration = mnsConfiguration;
            return this;
        }

        /**
         * <p>Specifies whether to push notifications about the status of OTA update batches. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder otaEventFlag(Boolean otaEventFlag) {
            this.putQueryParameter("OtaEventFlag", otaEventFlag);
            this.otaEventFlag = otaEventFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push notifications about the statuses of OTA update batches. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder otaJobFlag(Boolean otaJobFlag) {
            this.putQueryParameter("OtaJobFlag", otaJobFlag);
            this.otaJobFlag = otaJobFlag;
            return this;
        }

        /**
         * <p>Specifies whether to push messages about OTA module version numbers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder otaVersionFlag(Boolean otaVersionFlag) {
            this.putQueryParameter("OtaVersionFlag", otaVersionFlag);
            this.otaVersionFlag = otaVersionFlag;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product that is specified for the subscription.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1fyXVF****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SubscribeFlags.
         */
        public Builder subscribeFlags(String subscribeFlags) {
            this.putQueryParameter("SubscribeFlags", subscribeFlags);
            this.subscribeFlags = subscribeFlags;
            return this;
        }

        /**
         * <p>Specifies whether to push upstream historical Thing Specification Language (TSL) data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder thingHistoryFlag(Boolean thingHistoryFlag) {
            this.putQueryParameter("ThingHistoryFlag", thingHistoryFlag);
            this.thingHistoryFlag = thingHistoryFlag;
            return this;
        }

        /**
         * <p>The type of the subscription. Valid values:</p>
         * <ul>
         * <li><strong>MNS</strong></li>
         * <li><strong>AMQP</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AMQP</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateSubscribeRelationRequest build() {
            return new UpdateSubscribeRelationRequest(this);
        } 

    } 

}
