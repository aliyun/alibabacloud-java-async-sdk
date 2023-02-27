// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BlindTransferRequest} extends {@link RequestModel}
 *
 * <p>BlindTransferRequest</p>
 */
public class BlindTransferRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
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
    @NameInMap("TimeoutSeconds")
    @Validation(maximum = 120, minimum = 3)
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

    private BlindTransferRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.transferee = builder.transferee;
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

    public static final class Builder extends Request.Builder<BlindTransferRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private Integer timeoutSeconds; 
        private String transferee; 
        private String transferor; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(BlindTransferRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.transferee = request.transferee;
            this.transferor = request.transferor;
            this.userId = request.userId;
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
        public BlindTransferRequest build() {
            return new BlindTransferRequest(this);
        } 

    } 

}
