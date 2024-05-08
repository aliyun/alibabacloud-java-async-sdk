// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportInstancesStatusRequest} extends {@link RequestModel}
 *
 * <p>ReportInstancesStatusRequest</p>
 */
public class ReportInstancesStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Device")
    private java.util.List < String > device;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private java.util.List < String > diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssueCategory")
    private String issueCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ReportInstancesStatusRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.description = builder.description;
        this.device = builder.device;
        this.diskId = builder.diskId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.issueCategory = builder.issueCategory;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return issueCategory
     */
    public String getIssueCategory() {
        return this.issueCategory;
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ReportInstancesStatusRequest, Builder> {
        private String sourceRegionId; 
        private String description; 
        private java.util.List < String > device; 
        private java.util.List < String > diskId; 
        private String endTime; 
        private java.util.List < String > instanceId; 
        private String issueCategory; 
        private String ownerAccount; 
        private Long ownerId; 
        private String reason; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ReportInstancesStatusRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.description = request.description;
            this.device = request.device;
            this.diskId = request.diskId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.issueCategory = request.issueCategory;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.reason = request.reason;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
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
         * The description of the exception.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The device names of disks on an instance that have the exception. You can specify to 100 device names in a single request.
         * <p>
         * 
         * If you are using an ECS bare metal instance, enter the slot numbers of disks on the instance.
         * 
         * > For ECS bare metal instances, this parameter is required when the value of the `Reason` parameter is `abnormal-local-disk` or `abnormal-cloud-disk` or when the value of the `IssueCategory` parameter is `hardware-disk-error`.
         */
        public Builder device(java.util.List < String > device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * The IDs of disks on an instance that have the exception. You can specify up to 100 disk IDs in a single request. If you are using an ECS bare metal instance, enter the serial numbers of disks on the instance.
         * <p>
         * 
         * > This parameter is required when the value of the `Reason` parameter is `abnormal-local-disk` or `abnormal-cloud-disk` or when the value of the `IssueCategory` parameter is `hardware-disk-error`.
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The end time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The IDs of instances. You can specify up to 100 instance IDs in a single request.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The category of the exception. This parameter is applicable only to ECS bare metal instances. Valid values:
         * <p>
         * 
         * *   hardware-cpu-error: CPU failure
         * *   hardware-motherboard-error: motherboard failure
         * *   hardware-mem-error: memory failure
         * *   hardware-power-error: power failure
         * *   hardware-disk-error: disk failure
         * *   hardware-networkcard-error: network interface controller (NIC) failure
         * *   hardware-raidcard-error: SAS/RAID card failure
         * *   hardware-fan-error: fan failure
         * *   others: other failures
         */
        public Builder issueCategory(String issueCategory) {
            this.putQueryParameter("IssueCategory", issueCategory);
            this.issueCategory = issueCategory;
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
         * The impact of the exception on the instance. Valid values:
         * <p>
         * 
         * *   instance-hang: The instance is unavailable or cannot be connected.
         * *   instance-stuck-in-status: The instance is stuck in a state such as Starting or Stopping.
         * *   abnormal-network: The instance has a network exception.
         * *   abnormal-local-disk: A local disk attached to the instance has an exception.
         * *   abnormal-cloud-disk: A disk or a Shared Block Storage device attached to the instance has an exception.
         * *   others: other exception types. If the impact is not of the preceding types, you can set `Reason` to others and specify the `Description` parameter.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The start time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ReportInstancesStatusRequest build() {
            return new ReportInstancesStatusRequest(this);
        } 

    } 

}
