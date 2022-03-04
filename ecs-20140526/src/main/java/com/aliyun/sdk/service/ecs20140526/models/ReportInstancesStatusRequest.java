// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportInstancesStatusRequest} extends {@link RequestModel}
 *
 * <p>ReportInstancesStatusRequest</p>
 */
public class ReportInstancesStatusRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("Device")
    private java.util.List < String > device;

    @Query
    @NameInMap("DiskId")
    private java.util.List < String > diskId;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("IssueCategory")
    private String issueCategory;

    private ReportInstancesStatusRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.device = builder.device;
        this.diskId = builder.diskId;
        this.reason = builder.reason;
        this.description = builder.description;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.issueCategory = builder.issueCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportInstancesStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return device
     */
    public java.util.List < String > getDevice() {
        return this.device;
    }

    /**
     * @return diskId
     */
    public java.util.List < String > getDiskId() {
        return this.diskId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return issueCategory
     */
    public String getIssueCategory() {
        return this.issueCategory;
    }

    public static final class Builder extends Request.Builder<ReportInstancesStatusRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private java.util.List < String > instanceId; 
        private java.util.List < String > device; 
        private java.util.List < String > diskId; 
        private String reason; 
        private String description; 
        private String startTime; 
        private String endTime; 
        private String issueCategory; 

        private Builder() {
            super();
        } 

        private Builder(ReportInstancesStatusRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.device = request.device;
            this.diskId = request.diskId;
            this.reason = request.reason;
            this.description = request.description;
            this.startTime = request.startTime;
            this.endTime = request.endTime;
            this.issueCategory = request.issueCategory;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of one or more ECS instances. Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The list of device names attached to one or more disks with the same exception. If you are using an ecs bare metal instance, enter the SLOT information list of the disk device.
         * <p>
         * 
         * Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         * 
         * > for an ecs bare metal instance, this parameter is required when the value of "renew" is "abnormal-local-disk" or "abnormal-cloud-disk", or the value of "issuecategore" is "hardware-disk-error.
         */
        public Builder device(java.util.List < String > device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * The ID of one or more disks that have the same exception. If you are using an ECS bare metal instance, enter the SN list of the disk device.
         * <p>
         * 
         * Valid values of N: 1 to 100. Multiple values are in the form of duplicate lists.
         * 
         * > This parameter is required when the value of "renew" is "abnormal-local-disk" or "abnormal-cloud-disk", or the value of "issuecategore" is "hardware-disk-error.
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The impact of the exception on the ECS instance. Valid values:
         * <p>
         * 
         * -instance-hang: the ECS instance is unavailable or cannot be connected.
         * -instance-stuck-in-status: the ECS instance stays in a state for a long time, such as Starting or Stopping.
         * -abnormal-network: the ECS instance has a network exception.
         * -abnormal-local-disk: The local disk attached to the ECS instance is abnormal.
         * -abnormal-cloud-disk: An error occurred while mounting the cloud disk or shared block storage on the ECS instance.
         * -others: Other exception types. If the preceding impact types do not meet the requirements, you can set "Reason = others" and describe more information in "Description.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The detailed description of the exception.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The start time of the instance exception. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the instance exception. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the exception. This parameter applies only to ECS bare metal instances. Valid values:
         * <p>
         * -hardware-cpu-error:CPU failure
         * -hardware-motherboard-error: motherboard failure
         * -hardware-mem-error: memory failure
         * -hardware-power-error: power failure
         * -hardware-disk-error: disk failure
         * -hardware-networkcard-error: Nic failure
         * -hardware-raidcard-error:SAS/RAID card failure
         * -hardware-fan-error: fan failure
         * -others: others
         */
        public Builder issueCategory(String issueCategory) {
            this.putQueryParameter("IssueCategory", issueCategory);
            this.issueCategory = issueCategory;
            return this;
        }

        @Override
        public ReportInstancesStatusRequest build() {
            return new ReportInstancesStatusRequest(this);
        } 

    } 

}
