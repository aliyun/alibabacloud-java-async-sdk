// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link BlindTransferRequest} extends {@link RequestModel}
 *
 * <p>BlindTransferRequest</p>
 */
public class BlindTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPriority")
    private Integer callPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowVariables")
    private String contactFlowVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingOverflowThreshold")
    private Long queuingOverflowThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuingTimeoutSeconds")
    private Long queuingTimeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutingType")
    private String routingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyParams")
    private String strategyParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 120, minimum = 3)
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transferee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transferee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransfereeType")
    private String transfereeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transferor")
    private String transferor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private BlindTransferRequest(Builder builder) {
        super(builder);
        this.callPriority = builder.callPriority;
        this.contactFlowVariables = builder.contactFlowVariables;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.queuingOverflowThreshold = builder.queuingOverflowThreshold;
        this.queuingTimeoutSeconds = builder.queuingTimeoutSeconds;
        this.routingType = builder.routingType;
        this.skillGroupId = builder.skillGroupId;
        this.strategyName = builder.strategyName;
        this.strategyParams = builder.strategyParams;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.transferee = builder.transferee;
        this.transfereeType = builder.transfereeType;
        this.transferor = builder.transferor;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BlindTransferRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callPriority
     */
    public Integer getCallPriority() {
        return this.callPriority;
    }

    /**
     * @return contactFlowVariables
     */
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return queuingOverflowThreshold
     */
    public Long getQueuingOverflowThreshold() {
        return this.queuingOverflowThreshold;
    }

    /**
     * @return queuingTimeoutSeconds
     */
    public Long getQueuingTimeoutSeconds() {
        return this.queuingTimeoutSeconds;
    }

    /**
     * @return routingType
     */
    public String getRoutingType() {
        return this.routingType;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return strategyParams
     */
    public String getStrategyParams() {
        return this.strategyParams;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return transferee
     */
    public String getTransferee() {
        return this.transferee;
    }

    /**
     * @return transfereeType
     */
    public String getTransfereeType() {
        return this.transfereeType;
    }

    /**
     * @return transferor
     */
    public String getTransferor() {
        return this.transferor;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<BlindTransferRequest, Builder> {
        private Integer callPriority; 
        private String contactFlowVariables; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private Long queuingOverflowThreshold; 
        private Long queuingTimeoutSeconds; 
        private String routingType; 
        private String skillGroupId; 
        private String strategyName; 
        private String strategyParams; 
        private String tags; 
        private Integer timeoutSeconds; 
        private String transferee; 
        private String transfereeType; 
        private String transferor; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(BlindTransferRequest request) {
            super(request);
            this.callPriority = request.callPriority;
            this.contactFlowVariables = request.contactFlowVariables;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.queuingOverflowThreshold = request.queuingOverflowThreshold;
            this.queuingTimeoutSeconds = request.queuingTimeoutSeconds;
            this.routingType = request.routingType;
            this.skillGroupId = request.skillGroupId;
            this.strategyName = request.strategyName;
            this.strategyParams = request.strategyParams;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
            this.transferee = request.transferee;
            this.transfereeType = request.transfereeType;
            this.transferor = request.transferor;
            this.userId = request.userId;
        } 

        /**
         * <p>The queue priority when transferring to a skill group. Valid values are 0–9, where 0 is the highest priority and 9 is the lowest.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder callPriority(Integer callPriority) {
            this.putQueryParameter("CallPriority", callPriority);
            this.callPriority = callPriority;
            return this;
        }

        /**
         * <p>Variables passed to the contact flow. This field is optional. The variables configured here can be retrieved and used in the IVR flow. The format is a JSON string representing a set of key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;王先生&quot;,&quot;time&quot;:&quot;19点20分&quot;,&quot;address&quot;:&quot;某某中心&quot;}</p>
         */
        public Builder contactFlowVariables(String contactFlowVariables) {
            this.putQueryParameter("ContactFlowVariables", contactFlowVariables);
            this.contactFlowVariables = contactFlowVariables;
            return this;
        }

        /**
         * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
         * 
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The call ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The queuing overflow threshold when the transfer target is a skill group queue. The default value is 0, which means no overflow occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder queuingOverflowThreshold(Long queuingOverflowThreshold) {
            this.putQueryParameter("QueuingOverflowThreshold", queuingOverflowThreshold);
            this.queuingOverflowThreshold = queuingOverflowThreshold;
            return this;
        }

        /**
         * <p>The queuing timeout duration in seconds when the transfer target is a skill group queue.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder queuingTimeoutSeconds(Long queuingTimeoutSeconds) {
            this.putQueryParameter("QueuingTimeoutSeconds", queuingTimeoutSeconds);
            this.queuingTimeoutSeconds = queuingTimeoutSeconds;
            return this;
        }

        /**
         * <p>The call routing type. Valid values are Automatic or Manual. If this parameter is empty, the system defaults to Automatic routing, which is also the current default behavior of the system. When Manual routing is selected, you must invoke APIs such as ClaimCall to assign the call to a specific agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder routingType(String routingType) {
            this.putQueryParameter("RoutingType", routingType);
            this.routingType = routingType;
            return this;
        }

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ee914df4-82bf-4919-bcb3-9cb8aa437f35</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>The policy name for agent assignment when transferring to a skill group queue.</p>
         * 
         * <strong>example:</strong>
         * <p>MOST_IDLE，MOST_SKILLED，MOST_ACQUAINTED，CUSTOMIZED等</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The parameters for the agent assignment policy when transferring to a skill group queue.</p>
         * 
         * <strong>example:</strong>
         * <p>当分配策略为CUSTOMIZED时，本参数的内容为如下格式：
         *  {
         *   &quot;functionId&quot;: &quot;512fed64-e379-400f-a1a5-14d5730xxxxx&quot;,
         *   &quot;functionName&quot;: &quot;routing-strategy-test-2&quot;
         * }</p>
         */
        public Builder strategyParams(String strategyParams) {
            this.putQueryParameter("StrategyParams", strategyParams);
            this.strategyParams = strategyParams;
            return this;
        }

        /**
         * <p>Ingest endpoint data, primarily used for extension purposes. Regular users do not need to concern themselves with this field.</p>
         * 
         * <strong>example:</strong>
         * <p>5295578135#WAEtqY5U&amp;Biz_Package_Rexian_Zhuanjieanquanyungaojie_2527</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Timeout duration for the direct transfer, in seconds. If the transferee does not answer within the specified time, the call is disconnected. This field is optional and defaults to 30 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * <p>The transfer recipient, which can be either an agent ID or a skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder transferee(String transferee) {
            this.putQueryParameter("Transferee", transferee);
            this.transferee = transferee;
            return this;
        }

        /**
         * <p>Destination type for the transfer. Valid values are AGENT, SKILL_GROUP, IVR, and EXTERNAL_NUMBER. If this parameter is not specified, the system determines the destination type based on the format of the target number. If the automatic detection is inaccurate, you must explicitly specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_GROUP</p>
         */
        public Builder transfereeType(String transfereeType) {
            this.putQueryParameter("TransfereeType", transfereeType);
            this.transfereeType = transfereeType;
            return this;
        }

        /**
         * <p>The transfer initiator. When the scenario involves directly transferring to an external number, the number specified by this parameter is used as the caller. This parameter is invalid when transferring to an internal agent or skill group; in such cases, the initiator is specified by the UserId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>08314325****</p>
         */
        public Builder transferor(String transferor) {
            this.putQueryParameter("Transferor", transferor);
            this.transferor = transferor;
            return this;
        }

        /**
         * <p>The agent ID that initiates a direct transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public BlindTransferRequest build() {
            return new BlindTransferRequest(this);
        } 

    } 

}
