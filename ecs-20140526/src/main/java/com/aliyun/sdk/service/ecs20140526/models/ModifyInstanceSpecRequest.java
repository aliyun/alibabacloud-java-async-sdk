// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @Query
    @NameInMap("Temporary")
    private Temporary temporary;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    @Validation(maximum = 200, minimum = 1)
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("AllowMigrateAcrossZone")
    private Boolean allowMigrateAcrossZone;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.temporary = builder.temporary;
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.async = builder.async;
        this.clientToken = builder.clientToken;
        this.instanceType = builder.instanceType;
        this.allowMigrateAcrossZone = builder.allowMigrateAcrossZone;
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
     * @return temporary
     */
    public Temporary getTemporary() {
        return this.temporary;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return allowMigrateAcrossZone
     */
    public Boolean getAllowMigrateAcrossZone() {
        return this.allowMigrateAcrossZone;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private Temporary temporary; 
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private Integer internetMaxBandwidthOut; 
        private Integer internetMaxBandwidthIn; 
        private Boolean async; 
        private String clientToken; 
        private String instanceType; 
        private Boolean allowMigrateAcrossZone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.temporary = request.temporary;
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.async = request.async;
            this.clientToken = request.clientToken;
            this.instanceType = request.instanceType;
            this.allowMigrateAcrossZone = request.allowMigrateAcrossZone;
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
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum outbound Internet bandwidth. Unit: Mbit/s(Megabit per second). Valid values: 0 to 100.
         * <p>
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         * 
         * 
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s(Megabit per second). Valid values:
         * <p>
         * 
         * -When the purchased internet outbound bandwidth is less than or equal to 10 Mbit/s: 1 to 10, the default value is 10.
         * -When the purchased public outbound bandwidth is greater than 10 Mbit/s: 1 to "InternetMaxBandwidthOut". The default value is "InternetMaxBandwidthOut.
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         * 
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * Specifies whether to submit an asynchronous request.
         * <p>
         * 
         * Default value: false
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The target instance type. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Indicates whether the instance type can be upgraded across clusters.
         * <p>
         * 
         * Default value: false
         * 
         * When "AllowMigrateAcrossZone" is set to true, note the following when you upgrade the ecs instance based on the returned information:
         * 
         * Classic network type instance:
         * 
         * * For [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the private ip address, disk device name, and software authorization code of the instance change. For Linux instances, basic cloud disks ("cloud") are identified as **xvda** or **xvdb**, and ultra cloud disks ("cloud_efficiency ") and SSD cloud disks ("cloud_ssd") are identified as **vda** or **vdb.
         * 
         * * For [normal instance type families](~~ 25378 ~~), the private ip address of the instance changes.
         * 
         * VPC instances: for [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device name and software authorization code of the ecs instance change. For Linux instances, basic cloud disks ("cloud") are identified as **xvda** or **xvdb**, and ultra cloud disks ("cloud_efficiency ") and SSD cloud disks ("cloud_ssd") are identified as **vda** or **vdb.
         */
        public Builder allowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
            this.putQueryParameter("AllowMigrateAcrossZone", allowMigrateAcrossZone);
            this.allowMigrateAcrossZone = allowMigrateAcrossZone;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

    public static class Temporary extends TeaModel {
        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(maximum = 100, minimum = 1)
        private Integer internetMaxBandwidthOut;

        private Temporary(Builder builder) {
            this.startTime = builder.startTime;
            this.endTime = builder.endTime;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Temporary create() {
            return builder().build();
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
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public static final class Builder {
            private String startTime; 
            private String endTime; 
            private Integer internetMaxBandwidthOut; 

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The maximum outbound Internet bandwidth. Unit: Mbit/s(Megabit per second). Valid values: 0 to 100.
             * <p>
             * 
             * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
             * 
             * 
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            public Temporary build() {
                return new Temporary(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
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
             * Change the system disk type. This parameter is valid only when the instance type is upgraded from [phased-out instance type](~~ 55263 ~~) to [normal instance type family](~~ 25378 ~~), and the non-I/O optimized instance type is upgraded to the I/O optimized instance type. Valid values:
             * <p>
             * 
             * -cloud_efficiency: Ultra disk
             * 
             * -cloud_ssd:SSD cloud disk
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
}
