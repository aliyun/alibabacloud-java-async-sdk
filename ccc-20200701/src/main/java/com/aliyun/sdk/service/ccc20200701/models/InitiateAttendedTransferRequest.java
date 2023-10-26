// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitiateAttendedTransferRequest} extends {@link RequestModel}
 *
 * <p>InitiateAttendedTransferRequest</p>
 */
public class InitiateAttendedTransferRequest extends Request {
    @Query
    @NameInMap("CallPriority")
    private Integer callPriority;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("StrategyName")
    private String strategyName;

    @Query
    @NameInMap("StrategyParams")
    private String strategyParams;

    @Query
    @NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    @Query
    @NameInMap("Transferee")
    @Validation(required = true)
    private String transferee;

    @Query
    @NameInMap("Transferor")
    private String transferor;

    @Query
    @NameInMap("UserId")
    private String userId;

    private InitiateAttendedTransferRequest(Builder builder) {
        super(builder);
        this.callPriority = builder.callPriority;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.strategyName = builder.strategyName;
        this.strategyParams = builder.strategyParams;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.transferee = builder.transferee;
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
        private String strategyName; 
        private String strategyParams; 
        private Integer timeoutSeconds; 
        private String transferee; 
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
            this.strategyName = request.strategyName;
            this.strategyParams = request.strategyParams;
            this.timeoutSeconds = request.timeoutSeconds;
            this.transferee = request.transferee;
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
