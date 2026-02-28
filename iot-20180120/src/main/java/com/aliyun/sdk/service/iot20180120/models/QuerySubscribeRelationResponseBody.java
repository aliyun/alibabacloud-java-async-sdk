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
 * {@link QuerySubscribeRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySubscribeRelationResponseBody</p>
 */
public class QuerySubscribeRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ConsumerGroupIds")
    private java.util.List<String> consumerGroupIds;

    @com.aliyun.core.annotation.NameInMap("DeviceDataFlag")
    private Boolean deviceDataFlag;

    @com.aliyun.core.annotation.NameInMap("DeviceLifeCycleFlag")
    private Boolean deviceLifeCycleFlag;

    @com.aliyun.core.annotation.NameInMap("DeviceStatusChangeFlag")
    private Boolean deviceStatusChangeFlag;

    @com.aliyun.core.annotation.NameInMap("DeviceTagFlag")
    private Boolean deviceTagFlag;

    @com.aliyun.core.annotation.NameInMap("DeviceTopoLifeCycleFlag")
    private Boolean deviceTopoLifeCycleFlag;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FoundDeviceListFlag")
    private Boolean foundDeviceListFlag;

    @com.aliyun.core.annotation.NameInMap("MnsConfiguration")
    private String mnsConfiguration;

    @com.aliyun.core.annotation.NameInMap("OtaEventFlag")
    private Boolean otaEventFlag;

    @com.aliyun.core.annotation.NameInMap("OtaJobFlag")
    private Boolean otaJobFlag;

    @com.aliyun.core.annotation.NameInMap("OtaVersionFlag")
    private Boolean otaVersionFlag;

    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscribeFlags")
    private String subscribeFlags;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ThingHistoryFlag")
    private Boolean thingHistoryFlag;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QuerySubscribeRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumerGroupIds = builder.consumerGroupIds;
        this.deviceDataFlag = builder.deviceDataFlag;
        this.deviceLifeCycleFlag = builder.deviceLifeCycleFlag;
        this.deviceStatusChangeFlag = builder.deviceStatusChangeFlag;
        this.deviceTagFlag = builder.deviceTagFlag;
        this.deviceTopoLifeCycleFlag = builder.deviceTopoLifeCycleFlag;
        this.errorMessage = builder.errorMessage;
        this.foundDeviceListFlag = builder.foundDeviceListFlag;
        this.mnsConfiguration = builder.mnsConfiguration;
        this.otaEventFlag = builder.otaEventFlag;
        this.otaJobFlag = builder.otaJobFlag;
        this.otaVersionFlag = builder.otaVersionFlag;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.subscribeFlags = builder.subscribeFlags;
        this.success = builder.success;
        this.thingHistoryFlag = builder.thingHistoryFlag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubscribeRelationResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return foundDeviceListFlag
     */
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscribeFlags
     */
    public String getSubscribeFlags() {
        return this.subscribeFlags;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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

    public static final class Builder {
        private String code; 
        private java.util.List<String> consumerGroupIds; 
        private Boolean deviceDataFlag; 
        private Boolean deviceLifeCycleFlag; 
        private Boolean deviceStatusChangeFlag; 
        private Boolean deviceTagFlag; 
        private Boolean deviceTopoLifeCycleFlag; 
        private String errorMessage; 
        private Boolean foundDeviceListFlag; 
        private String mnsConfiguration; 
        private Boolean otaEventFlag; 
        private Boolean otaJobFlag; 
        private Boolean otaVersionFlag; 
        private String productKey; 
        private String requestId; 
        private String subscribeFlags; 
        private Boolean success; 
        private Boolean thingHistoryFlag; 
        private String type; 

        private Builder() {
        } 

        private Builder(QuerySubscribeRelationResponseBody model) {
            this.code = model.code;
            this.consumerGroupIds = model.consumerGroupIds;
            this.deviceDataFlag = model.deviceDataFlag;
            this.deviceLifeCycleFlag = model.deviceLifeCycleFlag;
            this.deviceStatusChangeFlag = model.deviceStatusChangeFlag;
            this.deviceTagFlag = model.deviceTagFlag;
            this.deviceTopoLifeCycleFlag = model.deviceTopoLifeCycleFlag;
            this.errorMessage = model.errorMessage;
            this.foundDeviceListFlag = model.foundDeviceListFlag;
            this.mnsConfiguration = model.mnsConfiguration;
            this.otaEventFlag = model.otaEventFlag;
            this.otaJobFlag = model.otaJobFlag;
            this.otaVersionFlag = model.otaVersionFlag;
            this.productKey = model.productKey;
            this.requestId = model.requestId;
            this.subscribeFlags = model.subscribeFlags;
            this.success = model.success;
            this.thingHistoryFlag = model.thingHistoryFlag;
            this.type = model.type;
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
         * <p>The IDs of the consumer groups that are created in the AMQP subscription. This parameter is returned if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</p>
         */
        public Builder consumerGroupIds(java.util.List<String> consumerGroupIds) {
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * <p>Indicates whether upstream device messages were pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceDataFlag(Boolean deviceDataFlag) {
            this.deviceDataFlag = deviceDataFlag;
            return this;
        }

        /**
         * <p>Indicates whether messages about device lifecycle changes were pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
            this.deviceLifeCycleFlag = deviceLifeCycleFlag;
            return this;
        }

        /**
         * <p>Indicates whether messages about device status changes were pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
            this.deviceStatusChangeFlag = deviceStatusChangeFlag;
            return this;
        }

        /**
         * <p>Indicates whether messages about device tag changes were pushed. Valid values:</p>
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
            this.deviceTagFlag = deviceTagFlag;
            return this;
        }

        /**
         * <p>Indicates whether messages about topological relationship changes of devices were pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes. The value <strong>true</strong> is returned only when you query a gateway product.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
            this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
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
         * <p>Indicates whether messages were pushed if a gateway detected new sub-devices.</p>
         * <ul>
         * <li><strong>true</strong>: yes. The value <strong>true</strong> is returned only when you query a gateway product.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder foundDeviceListFlag(Boolean foundDeviceListFlag) {
            this.foundDeviceListFlag = foundDeviceListFlag;
            return this;
        }

        /**
         * <p>The configurations of the MNS queue. This parameter is returned if the <strong>Type</strong> parameter is set to <strong>MNS</strong>.</p>
         * <p>For more information, see the &quot;Definition of the MnsConfiguration parameter&quot; section.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;queueName&quot;: &quot;mns-test-topic1&quot;,     &quot;regionName&quot;: &quot;cn-shanghai&quot;,     &quot;role&quot;: {         &quot;roleArn&quot;: &quot;acs:ram::5645***:role/aliyuniotaccessingmnsrole&quot;,         &quot;roleName&quot;: &quot;AliyunIOTAccessingMNSRole&quot;     } }</p>
         */
        public Builder mnsConfiguration(String mnsConfiguration) {
            this.mnsConfiguration = mnsConfiguration;
            return this;
        }

        /**
         * <p>Indicates whether notifications about the status of OTA update batches were pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder otaEventFlag(Boolean otaEventFlag) {
            this.otaEventFlag = otaEventFlag;
            return this;
        }

        /**
         * <p>Indicates whether notifications about OTA batch updates were pushed. Valid values:</p>
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
            this.otaJobFlag = otaJobFlag;
            return this;
        }

        /**
         * <p>Indicates whether messages about the version numbers of OTA modules were pushed. Valid values:</p>
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
            this.otaVersionFlag = otaVersionFlag;
            return this;
        }

        /**
         * <p>The ProductKey of the product that is specified for the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>a1fyXVF****</p>
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>21D327AF-A7DE-4E59-B5D1-ACAC8C024555</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubscribeFlags.
         */
        public Builder subscribeFlags(String subscribeFlags) {
            this.subscribeFlags = subscribeFlags;
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

        /**
         * <p>Indicates whether upstream historical Thing Specification Language (TSL) data was pushed.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder thingHistoryFlag(Boolean thingHistoryFlag) {
            this.thingHistoryFlag = thingHistoryFlag;
            return this;
        }

        /**
         * <p>The type of the subscription. Valid values:</p>
         * <ul>
         * <li><strong>MNS</strong></li>
         * <li><strong>AMQP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AMQP</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public QuerySubscribeRelationResponseBody build() {
            return new QuerySubscribeRelationResponseBody(this);
        } 

    } 

}
