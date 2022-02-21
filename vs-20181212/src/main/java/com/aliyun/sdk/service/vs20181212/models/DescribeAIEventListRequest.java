// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIEventListRequest</p>
 */
public class DescribeAIEventListRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Feature")
    private String feature;

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
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Triggered")
    private Boolean triggered;

    private DescribeAIEventListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.feature = builder.feature;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.triggered = builder.triggered;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return feature
     */
    public String getFeature() {
        return this.feature;
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
     * @return triggered
     */
    public Boolean getTriggered() {
        return this.triggered;
    }

    public static final class Builder extends Request.Builder<DescribeAIEventListRequest, Builder> {
        private Long endTime; 
        private String feature; 
        private Long instanceId; 
        private String instanceType; 
        private Long ownerId; 
        private Long startTime; 
        private Boolean triggered; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIEventListRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.feature = response.feature;
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.triggered = response.triggered;
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
         * Feature.
         */
        public Builder feature(String feature) {
            this.putQueryParameter("Feature", feature);
            this.feature = feature;
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
         * Triggered.
         */
        public Builder triggered(Boolean triggered) {
            this.putQueryParameter("Triggered", triggered);
            this.triggered = triggered;
            return this;
        }

        @Override
        public DescribeAIEventListRequest build() {
            return new DescribeAIEventListRequest(this);
        } 

    } 

}
