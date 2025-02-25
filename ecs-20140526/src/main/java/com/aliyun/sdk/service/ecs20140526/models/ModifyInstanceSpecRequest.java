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
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Temporary")
    private Temporary temporary;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowMigrateAcrossZone")
    private Boolean allowMigrateAcrossZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disk")
    private java.util.List<Disk> disk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer internetMaxBandwidthIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.temporary = builder.temporary;
        this.sourceRegionId = builder.sourceRegionId;
        this.allowMigrateAcrossZone = builder.allowMigrateAcrossZone;
        this.async = builder.async;
        this.clientToken = builder.clientToken;
        this.disk = builder.disk;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return temporary
     */
    public Temporary getTemporary() {
        return this.temporary;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return allowMigrateAcrossZone
     */
    public Boolean getAllowMigrateAcrossZone() {
        return this.allowMigrateAcrossZone;
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disk
     */
    public java.util.List<Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private Temporary temporary; 
        private String sourceRegionId; 
        private Boolean allowMigrateAcrossZone; 
        private Boolean async; 
        private String clientToken; 
        private java.util.List<Disk> disk; 
        private Boolean dryRun; 
        private String instanceId; 
        private String instanceType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.temporary = request.temporary;
            this.sourceRegionId = request.sourceRegionId;
            this.allowMigrateAcrossZone = request.allowMigrateAcrossZone;
            this.async = request.async;
            this.clientToken = request.clientToken;
            this.disk = request.disk;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.modifyMode = request.modifyMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * Temporary.
         */
        public Builder temporary(Temporary temporary) {
            this.putQueryParameter("Temporary", temporary);
            this.temporary = temporary;
            return this;
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
         * <p>Specifies whether to allow cross-cluster instance type upgrade. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>When you set <code>AllowMigrateAcrossZone</code> to true and upgrade the instance based on the returned information, take note of the following items:</p>
         * <p>Instance that resides in the classic network:</p>
         * <ul>
         * <li>For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For a Linux instance, basic disks (<code>cloud</code>) are identified as xvd* such as <strong>xvda</strong> and <strong>xvdb</strong>, and ultra disks (<code>cloud_efficiency</code>) and standard SSDs (<code>cloud_ssd</code>) are identified as vd* such as <strong>vda</strong> and <strong>vdb</strong>.</li>
         * <li>For <a href="https://help.aliyun.com/document_detail/25378.html">instance families available for purchase</a>, when the instance type of an instance is changed, the private IP address of the instance changes.</li>
         * </ul>
         * <p>Instance that resides in a virtual private cloud (VPC): For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software authorization codes of the instance change. For a Linux instance, basic disks (<code>cloud</code>) are identified as xvd* such as <strong>xvda</strong> and <strong>xvdb</strong>, and ultra disks (<code>cloud_efficiency</code>) and standard SSDs (<code>cloud_ssd</code>) are identified as vd* such as <strong>vda</strong> and <strong>vdb</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
            this.putQueryParameter("AllowMigrateAcrossZone", allowMigrateAcrossZone);
            this.allowMigrateAcrossZone = allowMigrateAcrossZone;
            return this;
        }

        /**
         * <p>Specifies whether to submit an asynchronous request. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. <strong>The token can contain only ASCII characters and cannot exceed 64 characters in length.</strong> For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Disk.
         */
        public Builder disk(java.util.List<Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and unavailable ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li>false (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid value of this parameter ranges from 1 to 10 and the default value is 10.</li>
         * <li>When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the <code>InternetMaxBandwidthOut</code> value and the default value is the <code>InternetMaxBandwidthOut</code> value.</li>
         * </ul>
         * <blockquote>
         * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <blockquote>
         * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceSpecRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * <p>The new category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only when you upgrade a non-I/O optimized instance of <a href="https://help.aliyun.com/document_detail/55263.html">a retired instance type</a> to an I/O optimized instance of <a href="https://help.aliyun.com/document_detail/25378.html">an instance type available for purchase</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceSpecRequest</p>
     */
    public static class Temporary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Temporary(Builder builder) {
            this.endTime = builder.endTime;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Temporary create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer internetMaxBandwidthOut; 
            private String startTime; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Temporary build() {
                return new Temporary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceSpecRequest</p>
     */
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String performanceLevel; 

            /**
             * <p>The new category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only when you upgrade a non-I/O optimized instance of <a href="https://help.aliyun.com/document_detail/55263.html">a retired instance type</a> to an I/O optimized instance of <a href="https://help.aliyun.com/document_detail/25378.html">an instance type available for purchase</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
