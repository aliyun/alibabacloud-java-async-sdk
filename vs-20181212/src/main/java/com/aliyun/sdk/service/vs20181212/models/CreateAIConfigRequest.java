// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAIConfigRequest</p>
 */
public class CreateAIConfigRequest extends Request {
    @Query
    @NameInMap("CaptureInterval")
    @Validation(required = true)
    private Integer captureInterval;

    @Query
    @NameInMap("Configs")
    @Validation(required = true)
    private String configs;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Features")
    @Validation(required = true)
    private String features;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private Long instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private CreateAIConfigRequest(Builder builder) {
        super(builder);
        this.captureInterval = builder.captureInterval;
        this.configs = builder.configs;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.features = builder.features;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIConfigRequest create() {
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
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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

    public static final class Builder extends Request.Builder<CreateAIConfigRequest, Builder> {
        private Integer captureInterval; 
        private String configs; 
        private String description; 
        private Long endTime; 
        private String features; 
        private Long instanceId; 
        private String instanceType; 
        private Long ownerId; 
        private Long startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIConfigRequest response) {
            super(response);
            this.captureInterval = response.captureInterval;
            this.configs = response.configs;
            this.description = response.description;
            this.endTime = response.endTime;
            this.features = response.features;
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
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
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
        public CreateAIConfigRequest build() {
            return new CreateAIConfigRequest(this);
        } 

    } 

}
