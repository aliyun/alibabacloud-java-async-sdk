// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowLogRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowLogRequest</p>
 */
public class CreateFlowLogRequest extends Request {
    @Query
    @NameInMap("AggregationInterval")
    private Integer aggregationInterval;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FlowLogName")
    private String flowLogName;

    @Query
    @NameInMap("LogStoreName")
    @Validation(required = true)
    private String logStoreName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TrafficPath")
    private java.util.List < String > trafficPath;

    @Query
    @NameInMap("TrafficType")
    @Validation(required = true)
    private String trafficType;

    private CreateFlowLogRequest(Builder builder) {
        super(builder);
        this.aggregationInterval = builder.aggregationInterval;
        this.description = builder.description;
        this.flowLogName = builder.flowLogName;
        this.logStoreName = builder.logStoreName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.trafficPath = builder.trafficPath;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregationInterval
     */
    public Integer getAggregationInterval() {
        return this.aggregationInterval;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowLogName
     */
    public String getFlowLogName() {
        return this.flowLogName;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return trafficPath
     */
    public java.util.List < String > getTrafficPath() {
        return this.trafficPath;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<CreateFlowLogRequest, Builder> {
        private Integer aggregationInterval; 
        private String description; 
        private String flowLogName; 
        private String logStoreName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String projectName; 
        private String regionId; 
        private String resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List < String > trafficPath; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowLogRequest request) {
            super(request);
            this.aggregationInterval = request.aggregationInterval;
            this.description = request.description;
            this.flowLogName = request.flowLogName;
            this.logStoreName = request.logStoreName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.trafficPath = request.trafficPath;
            this.trafficType = request.trafficType;
        } 

        /**
         * AggregationInterval.
         */
        public Builder aggregationInterval(Integer aggregationInterval) {
            this.putQueryParameter("AggregationInterval", aggregationInterval);
            this.aggregationInterval = aggregationInterval;
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
         * FlowLogName.
         */
        public Builder flowLogName(String flowLogName) {
            this.putQueryParameter("FlowLogName", flowLogName);
            this.flowLogName = flowLogName;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TrafficPath.
         */
        public Builder trafficPath(java.util.List < String > trafficPath) {
            this.putQueryParameter("TrafficPath", trafficPath);
            this.trafficPath = trafficPath;
            return this;
        }

        /**
         * TrafficType.
         */
        public Builder trafficType(String trafficType) {
            this.putQueryParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public CreateFlowLogRequest build() {
            return new CreateFlowLogRequest(this);
        } 

    } 

}
