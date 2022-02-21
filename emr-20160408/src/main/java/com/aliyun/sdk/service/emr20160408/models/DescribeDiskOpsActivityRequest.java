// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskOpsActivityRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskOpsActivityRequest</p>
 */
public class DescribeDiskOpsActivityRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CurrentStage")
    private String currentStage;

    @Query
    @NameInMap("CurrentState")
    private String currentState;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeDiskOpsActivityRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentStage = builder.currentStage;
        this.currentState = builder.currentState;
        this.diskId = builder.diskId;
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskOpsActivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentStage
     */
    public String getCurrentStage() {
        return this.currentStage;
    }

    /**
     * @return currentState
     */
    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeDiskOpsActivityRequest, Builder> {
        private String clusterId; 
        private String currentStage; 
        private String currentState; 
        private String diskId; 
        private String eventId; 
        private String instanceId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskOpsActivityRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.currentStage = response.currentStage;
            this.currentState = response.currentState;
            this.diskId = response.diskId;
            this.eventId = response.eventId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CurrentStage.
         */
        public Builder currentStage(String currentStage) {
            this.putQueryParameter("CurrentStage", currentStage);
            this.currentStage = currentStage;
            return this;
        }

        /**
         * CurrentState.
         */
        public Builder currentState(String currentState) {
            this.putQueryParameter("CurrentState", currentState);
            this.currentState = currentState;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeDiskOpsActivityRequest build() {
            return new DescribeDiskOpsActivityRequest(this);
        } 

    } 

}
