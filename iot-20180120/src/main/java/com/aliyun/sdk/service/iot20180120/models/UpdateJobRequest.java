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
    private String rolloutConfig;

    @Query
    @NameInMap("TimeoutConfig")
    private String timeoutConfig;

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
    public String getRolloutConfig() {
        return this.rolloutConfig;
    }

    /**
     * @return timeoutConfig
     */
    public String getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String jobId; 
        private String rolloutConfig; 
        private String timeoutConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest response) {
            super(response);
            this.description = response.description;
            this.iotInstanceId = response.iotInstanceId;
            this.jobId = response.jobId;
            this.rolloutConfig = response.rolloutConfig;
            this.timeoutConfig = response.timeoutConfig;
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
        public Builder rolloutConfig(String rolloutConfig) {
            this.putQueryParameter("RolloutConfig", rolloutConfig);
            this.rolloutConfig = rolloutConfig;
            return this;
        }

        /**
         * TimeoutConfig.
         */
        public Builder timeoutConfig(String timeoutConfig) {
            this.putQueryParameter("TimeoutConfig", timeoutConfig);
            this.timeoutConfig = timeoutConfig;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
        } 

    } 

}
