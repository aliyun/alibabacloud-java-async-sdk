// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAndroidInstancesResponseBody</p>
 */
public class DescribeAndroidInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceModel")
    private java.util.List<InstanceModel> instanceModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAndroidInstancesResponseBody(Builder builder) {
        this.instanceModel = builder.instanceModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAndroidInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceModel
     */
    public java.util.List<InstanceModel> getInstanceModel() {
        return this.instanceModel;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<InstanceModel> instanceModel; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceModel.
         */
        public Builder instanceModel(java.util.List<InstanceModel> instanceModel) {
            this.instanceModel = instanceModel;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAndroidInstancesResponseBody build() {
            return new DescribeAndroidInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        private Disks(Builder builder) {
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private Integer diskSize; 
            private String diskType; 

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesResponseBody</p>
     */
    public static class InstanceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceGroupId")
        private String androidInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceGroupName")
        private String androidInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
        private String androidInstanceName;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceStatus")
        private String androidInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private String authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("BindUserId")
        private String bindUserId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private String gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("PersistentAppInstanceId")
        private String persistentAppInstanceId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RenderingType")
        private String renderingType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private InstanceModel(Builder builder) {
            this.androidInstanceGroupId = builder.androidInstanceGroupId;
            this.androidInstanceGroupName = builder.androidInstanceGroupName;
            this.androidInstanceId = builder.androidInstanceId;
            this.androidInstanceName = builder.androidInstanceName;
            this.androidInstanceStatus = builder.androidInstanceStatus;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.authorizedUserId = builder.authorizedUserId;
            this.bindUserId = builder.bindUserId;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.disks = builder.disks;
            this.errorCode = builder.errorCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.imageVersion = builder.imageVersion;
            this.instanceType = builder.instanceType;
            this.keyPairId = builder.keyPairId;
            this.memory = builder.memory;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.persistentAppInstanceId = builder.persistentAppInstanceId;
            this.policyGroupId = builder.policyGroupId;
            this.publicIpAddress = builder.publicIpAddress;
            this.rate = builder.rate;
            this.regionId = builder.regionId;
            this.renderingType = builder.renderingType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModel create() {
            return builder().build();
        }

        /**
         * @return androidInstanceGroupId
         */
        public String getAndroidInstanceGroupId() {
            return this.androidInstanceGroupId;
        }

        /**
         * @return androidInstanceGroupName
         */
        public String getAndroidInstanceGroupName() {
            return this.androidInstanceGroupName;
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return androidInstanceName
         */
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        /**
         * @return androidInstanceStatus
         */
        public String getAndroidInstanceStatus() {
            return this.androidInstanceStatus;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return authorizedUserId
         */
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return bindUserId
         */
        public String getBindUserId() {
            return this.bindUserId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return disks
         */
        public java.util.List<Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtExpired
         */
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return keyPairId
         */
        public String getKeyPairId() {
            return this.keyPairId;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return persistentAppInstanceId
         */
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return renderingType
         */
        public String getRenderingType() {
            return this.renderingType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String androidInstanceGroupId; 
            private String androidInstanceGroupName; 
            private String androidInstanceId; 
            private String androidInstanceName; 
            private String androidInstanceStatus; 
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String authorizedUserId; 
            private String bindUserId; 
            private String chargeType; 
            private String cpu; 
            private java.util.List<Disks> disks; 
            private String errorCode; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String imageVersion; 
            private String instanceType; 
            private String keyPairId; 
            private Integer memory; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String persistentAppInstanceId; 
            private String policyGroupId; 
            private String publicIpAddress; 
            private Integer rate; 
            private String regionId; 
            private String renderingType; 
            private java.util.List<Tags> tags; 

            /**
             * AndroidInstanceGroupId.
             */
            public Builder androidInstanceGroupId(String androidInstanceGroupId) {
                this.androidInstanceGroupId = androidInstanceGroupId;
                return this;
            }

            /**
             * AndroidInstanceGroupName.
             */
            public Builder androidInstanceGroupName(String androidInstanceGroupName) {
                this.androidInstanceGroupName = androidInstanceGroupName;
                return this;
            }

            /**
             * AndroidInstanceId.
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * AndroidInstanceName.
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * AndroidInstanceStatus.
             */
            public Builder androidInstanceStatus(String androidInstanceStatus) {
                this.androidInstanceStatus = androidInstanceStatus;
                return this;
            }

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * AuthorizedUserId.
             */
            public Builder authorizedUserId(String authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * BindUserId.
             */
            public Builder bindUserId(String bindUserId) {
                this.bindUserId = bindUserId;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Disks.
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtExpired.
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * KeyPairId.
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NetworkInterfaceIp.
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * PersistentAppInstanceId.
             */
            public Builder persistentAppInstanceId(String persistentAppInstanceId) {
                this.persistentAppInstanceId = persistentAppInstanceId;
                return this;
            }

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RenderingType.
             */
            public Builder renderingType(String renderingType) {
                this.renderingType = renderingType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public InstanceModel build() {
                return new InstanceModel(this);
            } 

        } 

    }
}
