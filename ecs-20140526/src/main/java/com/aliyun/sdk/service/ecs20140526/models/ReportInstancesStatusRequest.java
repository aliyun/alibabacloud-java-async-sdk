// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<String> device;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private java.util.List<String> diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceId;

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
    public java.util.List<String> getDevice() {
        return this.device;
    }

    /**
     * @return diskId
     */
    public java.util.List<String> getDiskId() {
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
    public java.util.List<String> getInstanceId() {
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
        private java.util.List<String> device; 
        private java.util.List<String> diskId; 
        private String endTime; 
        private java.util.List<String> instanceId; 
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
         * <p>The description of the exception.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The local disk is unavailable, the mount point is inaccessible, or files cannot be loaded.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The device names of disks on an instance that have the exception. You can specify to 100 device names in a single request.</p>
         * <p>If you are using an ECS bare metal instance, enter the slot numbers of disks on the instance.</p>
         * <blockquote>
         * <p>For ECS bare metal instances, this parameter is required when the value of the <code>Reason</code> parameter is <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code> or when the value of the <code>IssueCategory</code> parameter is <code>hardware-disk-error</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        public Builder device(java.util.List<String> device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * <p>The IDs of disks on an instance that have the exception. You can specify up to 100 disk IDs in a single request. If you are using an ECS bare metal instance, enter the serial numbers of disks on the instance.</p>
         * <blockquote>
         * <p>This parameter is required when the value of the <code>Reason</code> parameter is <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code> or when the value of the <code>IssueCategory</code> parameter is <code>hardware-disk-error</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bp1aeljlfad7x6u1****</p>
         */
        public Builder diskId(java.util.List<String> diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The end time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-31T06:32:31Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The IDs of instances. You can specify up to 100 instance IDs in a single request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp165p6xk2tmdhj0****</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The category of the exception. This parameter is applicable only to ECS bare metal instances. Valid values:</p>
         * <ul>
         * <li>hardware-cpu-error: CPU failure</li>
         * <li>hardware-motherboard-error: motherboard failure</li>
         * <li>hardware-mem-error: memory failure</li>
         * <li>hardware-power-error: power failure</li>
         * <li>hardware-disk-error: disk failure</li>
         * <li>hardware-networkcard-error: network interface controller (NIC) failure</li>
         * <li>hardware-raidcard-error: SAS/RAID card failure</li>
         * <li>hardware-fan-error: fan failure</li>
         * <li>others: other failures</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hardware-cpu-error</p>
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
         * <p>The impact of the exception on the instance. Valid values:</p>
         * <ul>
         * <li>instance-hang: The instance is unavailable or cannot be connected.</li>
         * <li>instance-stuck-in-status: The instance is stuck in a state such as Starting or Stopping.</li>
         * <li>abnormal-network: The instance has a network exception.</li>
         * <li>abnormal-local-disk: A local disk attached to the instance has an exception.</li>
         * <li>abnormal-cloud-disk: A disk or a Shared Block Storage device attached to the instance has an exception.</li>
         * <li>others: other exception types. If the impact is not of the preceding types, you can set <code>Reason</code> to others and specify the <code>Description</code> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abnormal-local-disk</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The start time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-30T06:32:31Z</p>
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
