// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAIConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAIConfigRequest</p>
 */
public class UpdateAIConfigRequest extends Request {
    @Query
    @NameInMap("CaptureInterval")
    private Integer captureInterval;

    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    @Query
    @NameInMap("Configs")
    private String configs;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Features")
    private String features;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private UpdateAIConfigRequest(Builder builder) {
        super(builder);
        this.captureInterval = builder.captureInterval;
        this.configId = builder.configId;
        this.configs = builder.configs;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.features = builder.features;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAIConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captureInterval
     */
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return features
     */
    public String getFeatures() {
        return this.features;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateAIConfigRequest, Builder> {
        private Integer captureInterval; 
        private String configId; 
        private String configs; 
        private String description; 
        private Long endTime; 
        private String features; 
        private Long ownerId; 
        private Long startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAIConfigRequest response) {
            super(response);
            this.captureInterval = response.captureInterval;
            this.configId = response.configId;
            this.configs = response.configs;
            this.description = response.description;
            this.endTime = response.endTime;
            this.features = response.features;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.status = response.status;
        } 

        /**
         * CaptureInterval.
         */
        public Builder captureInterval(Integer captureInterval) {
            this.putQueryParameter("CaptureInterval", captureInterval);
            this.captureInterval = captureInterval;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(String configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(String features) {
            this.putQueryParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateAIConfigRequest build() {
            return new UpdateAIConfigRequest(this);
        } 

    } 

}
