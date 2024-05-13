// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * CallPriority.
         */
        public Builder callPriority(Integer callPriority) {
            this.putQueryParameter("CallPriority", callPriority);
            this.callPriority = callPriority;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * QueuingOverflowThreshold.
         */
        public Builder queuingOverflowThreshold(Long queuingOverflowThreshold) {
            this.putQueryParameter("QueuingOverflowThreshold", queuingOverflowThreshold);
            this.queuingOverflowThreshold = queuingOverflowThreshold;
            return this;
        }

        /**
         * QueuingTimeoutSeconds.
         */
        public Builder queuingTimeoutSeconds(Long queuingTimeoutSeconds) {
            this.putQueryParameter("QueuingTimeoutSeconds", queuingTimeoutSeconds);
            this.queuingTimeoutSeconds = queuingTimeoutSeconds;
            return this;
        }

        /**
         * RoutingType.
         */
        public Builder routingType(String routingType) {
            this.putQueryParameter("RoutingType", routingType);
            this.routingType = routingType;
            return this;
        }

        /**
         * StrategyName.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * StrategyParams.
         */
        public Builder strategyParams(String strategyParams) {
            this.putQueryParameter("StrategyParams", strategyParams);
            this.strategyParams = strategyParams;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Transferee.
         */
        public Builder transferee(String transferee) {
            this.putQueryParameter("Transferee", transferee);
            this.transferee = transferee;
            return this;
        }

        /**
         * TransfereeType.
         */
        public Builder transfereeType(String transfereeType) {
            this.putQueryParameter("TransfereeType", transfereeType);
            this.transfereeType = transfereeType;
            return this;
        }

        /**
         * Transferor.
         */
        public Builder transferor(String transferor) {
            this.putQueryParameter("Transferor", transferor);
            this.transferor = transferor;
            return this;
        }

        /**
         * UserId.
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
