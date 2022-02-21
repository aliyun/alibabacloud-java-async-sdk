// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("Temporary")
    private Temporary temporary;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("AllowMigrateAcrossZone")
    private Boolean allowMigrateAcrossZone;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.temporary = builder.temporary;
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.clientToken = builder.clientToken;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.instanceType = builder.instanceType;
        this.async = builder.async;
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
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
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
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Integer internetMaxBandwidthOut; 
        private String clientToken; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private Integer internetMaxBandwidthIn; 
        private String instanceType; 
        private Boolean async; 
        private Boolean allowMigrateAcrossZone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest response) {
            super(response);
            this.temporary = response.temporary;
            this.systemDisk = response.systemDisk;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.clientToken = response.clientToken;
            this.resourceOwnerId = response.resourceOwnerId;
            this.instanceId = response.instanceId;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
            this.instanceType = response.instanceType;
            this.async = response.async;
            this.allowMigrateAcrossZone = response.allowMigrateAcrossZone;
        } 

        /**
         * Temporary.
         */
        public Builder temporary(Temporary temporary) {
            this.temporary = temporary;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
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
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The specified instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Public network into bandwidth maximum value, unit for Mbit/s(Megabit per second). Valid values:
         * <p>
         * 
         * -When purchased public outlet bandwidth less than equal to 10 Mbit/s: 1~10, the default is 10.
         * -When purchased public outlet bandwidth greater than 10 Mbit/s: 1 ~ "internetmaxbandwidthout" value, default for "internetmaxbandwidthout" value.
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
         * Instance of the target dimension. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * If asynchronous request.
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
         * Whether support cross-Cluster Upgrade instance specifications.
         * <p>
         * 
         * Default value: false
         * 
         * When the parameter "allowmigrateacrosszone" value is true, once you according to return information upgrade cloud server, please note the following considerations:
         * 
         * Classic network type instance:
         * 
         * * For [stop an instance of dimension](~~ 55263 ~~), non-I/O optimization instance variable with to I/O optimization instance instance private network IP ADDRESS, disk device name and software authorization code will change. For Linux instances, ordinary cloud ("cloud") are identified as **xvda** or **xvdb** etc., high efficiency cloud ("cloud_efficiency") and SSD cloud ("cloud_ssd") are identified as **vda** or **vdb** etc.
         * 
         * * For [normal sold instance dimension family](~~ 25378 ~~), instance private network IP ADDRESS will change.
         * 
         * Proprietary Network VPC type instance: for [has stop an instance of dimension](~~ 55263 ~~), non-I/O optimization instance variable with to I/O optimization instance, cloud server disk device name and software authorization code will change. Linux instances ordinary cloud ("cloud") are identified as **xvda** or **xvdb** etc., high efficiency cloud ("cloud_efficiency") and SSD cloud ("cloud_ssd") are identified as **vda** or **vdb** etc.
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
             * Replacement System disk type. This parameter is only in [stop an instance of dimension](~~ 55263 ~~) upgrade to [normal sold instance dimension family](~~ 25378 ~~), and non-I/O optimization instance dimension upgrade for the I/O optimization instance dimension when effective. Valid values:
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
