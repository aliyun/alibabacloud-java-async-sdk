// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("RolloutConfig")
    private java.util.Map < String, ? > rolloutConfig;

    @Query
    @NameInMap("TimeoutConfig")
    private java.util.Map < String, ? > timeoutConfig;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.rolloutConfig = builder.rolloutConfig;
        this.timeoutConfig = builder.timeoutConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return rolloutConfig
     */
    public java.util.Map < String, ? > getRolloutConfig() {
        return this.rolloutConfig;
    }

    /**
     * @return timeoutConfig
     */
    public java.util.Map < String, ? > getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String jobId; 
        private java.util.Map < String, ? > rolloutConfig; 
        private java.util.Map < String, ? > timeoutConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.rolloutConfig = request.rolloutConfig;
            this.timeoutConfig = request.timeoutConfig;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * RolloutConfig.
         */
        public Builder rolloutConfig(java.util.Map < String, ? > rolloutConfig) {
            String rolloutConfigShrink = shrink(rolloutConfig, "RolloutConfig", "json");
            this.putQueryParameter("RolloutConfig", rolloutConfigShrink);
            this.rolloutConfig = rolloutConfig;
            return this;
        }

        /**
         * TimeoutConfig.
         */
        public Builder timeoutConfig(java.util.Map < String, ? > timeoutConfig) {
            String timeoutConfigShrink = shrink(timeoutConfig, "TimeoutConfig", "json");
            this.putQueryParameter("TimeoutConfig", timeoutConfigShrink);
            this.timeoutConfig = timeoutConfig;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
        } 

    } 

}
