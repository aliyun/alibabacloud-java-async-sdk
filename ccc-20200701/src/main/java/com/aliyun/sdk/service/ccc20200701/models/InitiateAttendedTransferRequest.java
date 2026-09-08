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
 * {@link InitiateAttendedTransferRequest} extends {@link RequestModel}
 *
 * <p>InitiateAttendedTransferRequest</p>
 */
public class InitiateAttendedTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPriority")
    private Integer callPriority;

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

    private InitiateAttendedTransferRequest(Builder builder) {
        super(builder);
        this.callPriority = builder.callPriority;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.queuingOverflowThreshold = builder.queuingOverflowThreshold;
        this.queuingTimeoutSeconds = builder.queuingTimeoutSeconds;
        this.routingType = builder.routingType;
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

    public static InitiateAttendedTransferRequest create() {
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

    public static final class Builder extends Request.Builder<InitiateAttendedTransferRequest, Builder> {
        private Integer callPriority; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private Long queuingOverflowThreshold; 
        private Long queuingTimeoutSeconds; 
        private String routingType; 
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

        private Builder(InitiateAttendedTransferRequest request) {
            super(request);
            this.callPriority = request.callPriority;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.queuingOverflowThreshold = request.queuingOverflowThreshold;
            this.queuingTimeoutSeconds = request.queuingTimeoutSeconds;
            this.routingType = request.routingType;
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
         * <p>The queuing priority when transferring to a skill group queue. Valid values range from 0 to 9, where 0 is the highest priority and 9 is the lowest.</p>
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
         * <p>The queuing timeout period in seconds when the transfer target is a skill group queue.</p>
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
         * <p>The call assignment type. Valid values are Automatic or Manual. If this parameter is empty, the default value is Automatic, which is also the current system\&quot;s default behavior. When Manual is selected, you must invoke APIs such as ClaimCall to assign the call to a specific agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatic</p>
         */
        public Builder routingType(String routingType) {
            this.putQueryParameter("RoutingType", routingType);
            this.routingType = routingType;
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
         * <p>The policy parameters for agent assignment when transferring to a skill group queue.</p>
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
         * <p>Ingest endpoint data, primarily used for extension requirements. Regular users do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>a=b</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Timeout duration for the consultation transfer, in seconds. If the transferee does not answer within the specified time, the call is disconnected. This field is optional. Default value is 30 seconds.</p>
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
         * <p>The transferee, which can be an agent ID or a skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent2@ccc-test</p>
         */
        public Builder transferee(String transferee) {
            this.putQueryParameter("Transferee", transferee);
            this.transferee = transferee;
            return this;
        }

        /**
         * <p>The destination type for the transfer. Valid values are AGENT, SKILL_GROUP, and EXTERNAL. If this parameter is not provided, the system determines the destination type based on the format of the target number. If inaccurate detection occurs, explicitly specify this parameter.</p>
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
         * <p>The party initiating the transfer. When transferring to an external number, this parameter specifies the caller number. This parameter is invalid when transferring to an internal agent or skill group; in such cases, the initiator is determined by the UserId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder transferor(String transferor) {
            this.putQueryParameter("Transferor", transferor);
            this.transferor = transferor;
            return this;
        }

        /**
         * <p>The agent ID initiating the consultation transfer.</p>
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
        public InitiateAttendedTransferRequest build() {
            return new InitiateAttendedTransferRequest(this);
        } 

    } 

}
