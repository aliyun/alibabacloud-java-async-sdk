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
 * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplateVersionsResponseBody</p>
 */
public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionSets")
    private LaunchTemplateVersionSets launchTemplateVersionSets;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLaunchTemplateVersionsResponseBody(Builder builder) {
        this.launchTemplateVersionSets = builder.launchTemplateVersionSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplateVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return launchTemplateVersionSets
     */
    public LaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private LaunchTemplateVersionSets launchTemplateVersionSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLaunchTemplateVersionsResponseBody model) {
            this.launchTemplateVersionSets = model.launchTemplateVersionSets;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * LaunchTemplateVersionSets.
         */
        public Builder launchTemplateVersionSets(LaunchTemplateVersionSets launchTemplateVersionSets) {
            this.launchTemplateVersionSets = launchTemplateVersionSets;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page when paging is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3989ED0C-20A1-4351-A127-2067FF8390AX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of launch templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLaunchTemplateVersionsResponseBody build() {
            return new DescribeLaunchTemplateVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
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
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.device = model.device;
                this.diskName = model.diskName;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * BurstingEnabled.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * ProvisionedIops.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        private DataDisks(Builder builder) {
            this.dataDisk = builder.dataDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List<DataDisk> dataDisk; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.dataDisk = model.dataDisk;
            } 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginAsNonRoot")
        private Boolean loginAsNonRoot;

        private ImageOptions(Builder builder) {
            this.loginAsNonRoot = builder.loginAsNonRoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public static final class Builder {
            private Boolean loginAsNonRoot; 

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.loginAsNonRoot = model.loginAsNonRoot;
            } 

            /**
             * LoginAsNonRoot.
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List<String> securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupId; 

            private Builder() {
            } 

            private Builder(SecurityGroupIds model) {
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class NetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
        private Boolean deleteOnRelease;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterface(Builder builder) {
            this.deleteOnRelease = builder.deleteOnRelease;
            this.description = builder.description;
            this.instanceType = builder.instanceType;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return deleteOnRelease
         */
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private Boolean deleteOnRelease; 
            private String description; 
            private String instanceType; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private String securityGroupId; 
            private SecurityGroupIds securityGroupIds; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NetworkInterface model) {
                this.deleteOnRelease = model.deleteOnRelease;
                this.description = model.description;
                this.instanceType = model.instanceType;
                this.networkInterfaceName = model.networkInterfaceName;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.primaryIpAddress = model.primaryIpAddress;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * DeleteOnRelease.
             */
            public Builder deleteOnRelease(Boolean deleteOnRelease) {
                this.deleteOnRelease = deleteOnRelease;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * NetworkInterfaceName.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * NetworkInterfaceTrafficMode.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * PrimaryIpAddress.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterface")
        private java.util.List<NetworkInterface> networkInterface;

        private NetworkInterfaces(Builder builder) {
            this.networkInterface = builder.networkInterface;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return networkInterface
         */
        public java.util.List<NetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

        public static final class Builder {
            private java.util.List<NetworkInterface> networkInterface; 

            private Builder() {
            } 

            private Builder(NetworkInterfaces model) {
                this.networkInterface = model.networkInterface;
            } 

            /**
             * NetworkInterface.
             */
            public Builder networkInterface(java.util.List<NetworkInterface> networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class LaunchTemplateDataSecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List<String> securityGroupId;

        private LaunchTemplateDataSecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateDataSecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupId; 

            private Builder() {
            } 

            private Builder(LaunchTemplateDataSecurityGroupIds model) {
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public LaunchTemplateDataSecurityGroupIds build() {
                return new LaunchTemplateDataSecurityGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrustedSystemMode")
        private String trustedSystemMode;

        private SecurityOptions(Builder builder) {
            this.trustedSystemMode = builder.trustedSystemMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return trustedSystemMode
         */
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

        public static final class Builder {
            private String trustedSystemMode; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.trustedSystemMode = model.trustedSystemMode;
            } 

            /**
             * TrustedSystemMode.
             */
            public Builder trustedSystemMode(String trustedSystemMode) {
                this.trustedSystemMode = trustedSystemMode;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class InstanceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTag create() {
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

            private Builder() {
            } 

            private Builder(InstanceTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public InstanceTag build() {
                return new InstanceTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTag")
        private java.util.List<InstanceTag> instanceTag;

        private Tags(Builder builder) {
            this.instanceTag = builder.instanceTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return instanceTag
         */
        public java.util.List<InstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

        public static final class Builder {
            private java.util.List<InstanceTag> instanceTag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.instanceTag = model.instanceTag;
            } 

            /**
             * InstanceTag.
             */
            public Builder instanceTag(java.util.List<InstanceTag> instanceTag) {
                this.instanceTag = instanceTag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class LaunchTemplateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableVmOsConfig")
        private Boolean enableVmOsConfig;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
        private String httpEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpPutResponseHopLimit")
        private Integer httpPutResponseHopLimit;

        @com.aliyun.core.annotation.NameInMap("HttpTokens")
        private String httpTokens;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOptions")
        private ImageOptions imageOptions;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private String ioOptimized;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private NetworkInterfaces networkInterfaces;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private LaunchTemplateDataSecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SecurityOptions")
        private SecurityOptions securityOptions;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.AutoSnapshotPolicyId")
        private String systemDisk_autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.BurstingEnabled")
        private Boolean systemDisk_burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Category")
        private String systemDisk_category;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.DeleteWithInstance")
        private Boolean systemDisk_deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Description")
        private String systemDisk_description;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.DiskName")
        private String systemDisk_diskName;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Encrypted")
        private String systemDisk_encrypted;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Iops")
        private Integer systemDisk_iops;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.KMSKeyId")
        private String systemDisk_kMSKeyId;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.PerformanceLevel")
        private String systemDisk_performanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.ProvisionedIops")
        private Long systemDisk_provisionedIops;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Size")
        private Integer systemDisk_size;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private LaunchTemplateData(Builder builder) {
            this.autoReleaseTime = builder.autoReleaseTime;
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.creditSpecification = builder.creditSpecification;
            this.dataDisks = builder.dataDisks;
            this.deletionProtection = builder.deletionProtection;
            this.deploymentSetId = builder.deploymentSetId;
            this.description = builder.description;
            this.enableVmOsConfig = builder.enableVmOsConfig;
            this.hostName = builder.hostName;
            this.httpEndpoint = builder.httpEndpoint;
            this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
            this.httpTokens = builder.httpTokens;
            this.imageId = builder.imageId;
            this.imageOptions = builder.imageOptions;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.keyPairName = builder.keyPairName;
            this.networkInterfaces = builder.networkInterfaces;
            this.networkType = builder.networkType;
            this.passwordInherit = builder.passwordInherit;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.privateIpAddress = builder.privateIpAddress;
            this.ramRoleName = builder.ramRoleName;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.securityOptions = builder.securityOptions;
            this.spotDuration = builder.spotDuration;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDisk_autoSnapshotPolicyId = builder.systemDisk_autoSnapshotPolicyId;
            this.systemDisk_burstingEnabled = builder.systemDisk_burstingEnabled;
            this.systemDisk_category = builder.systemDisk_category;
            this.systemDisk_deleteWithInstance = builder.systemDisk_deleteWithInstance;
            this.systemDisk_description = builder.systemDisk_description;
            this.systemDisk_diskName = builder.systemDisk_diskName;
            this.systemDisk_encrypted = builder.systemDisk_encrypted;
            this.systemDisk_iops = builder.systemDisk_iops;
            this.systemDisk_kMSKeyId = builder.systemDisk_kMSKeyId;
            this.systemDisk_performanceLevel = builder.systemDisk_performanceLevel;
            this.systemDisk_provisionedIops = builder.systemDisk_provisionedIops;
            this.systemDisk_size = builder.systemDisk_size;
            this.tags = builder.tags;
            this.userData = builder.userData;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateData create() {
            return builder().build();
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return creditSpecification
         */
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        /**
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableVmOsConfig
         */
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return httpEndpoint
         */
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        /**
         * @return httpPutResponseHopLimit
         */
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        /**
         * @return httpTokens
         */
        public String getHttpTokens() {
            return this.httpTokens;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageOptions
         */
        public ImageOptions getImageOptions() {
            return this.imageOptions;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
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
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return ipv6AddressCount
         */
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return networkInterfaces
         */
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public LaunchTemplateDataSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return securityOptions
         */
        public SecurityOptions getSecurityOptions() {
            return this.securityOptions;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return systemDisk_autoSnapshotPolicyId
         */
        public String getSystemDisk_autoSnapshotPolicyId() {
            return this.systemDisk_autoSnapshotPolicyId;
        }

        /**
         * @return systemDisk_burstingEnabled
         */
        public Boolean getSystemDisk_burstingEnabled() {
            return this.systemDisk_burstingEnabled;
        }

        /**
         * @return systemDisk_category
         */
        public String getSystemDisk_category() {
            return this.systemDisk_category;
        }

        /**
         * @return systemDisk_deleteWithInstance
         */
        public Boolean getSystemDisk_deleteWithInstance() {
            return this.systemDisk_deleteWithInstance;
        }

        /**
         * @return systemDisk_description
         */
        public String getSystemDisk_description() {
            return this.systemDisk_description;
        }

        /**
         * @return systemDisk_diskName
         */
        public String getSystemDisk_diskName() {
            return this.systemDisk_diskName;
        }

        /**
         * @return systemDisk_encrypted
         */
        public String getSystemDisk_encrypted() {
            return this.systemDisk_encrypted;
        }

        /**
         * @return systemDisk_iops
         */
        public Integer getSystemDisk_iops() {
            return this.systemDisk_iops;
        }

        /**
         * @return systemDisk_kMSKeyId
         */
        public String getSystemDisk_kMSKeyId() {
            return this.systemDisk_kMSKeyId;
        }

        /**
         * @return systemDisk_performanceLevel
         */
        public String getSystemDisk_performanceLevel() {
            return this.systemDisk_performanceLevel;
        }

        /**
         * @return systemDisk_provisionedIops
         */
        public Long getSystemDisk_provisionedIops() {
            return this.systemDisk_provisionedIops;
        }

        /**
         * @return systemDisk_size
         */
        public Integer getSystemDisk_size() {
            return this.systemDisk_size;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String autoReleaseTime; 
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String creditSpecification; 
            private DataDisks dataDisks; 
            private Boolean deletionProtection; 
            private String deploymentSetId; 
            private String description; 
            private Boolean enableVmOsConfig; 
            private String hostName; 
            private String httpEndpoint; 
            private Integer httpPutResponseHopLimit; 
            private String httpTokens; 
            private String imageId; 
            private ImageOptions imageOptions; 
            private String imageOwnerAlias; 
            private String instanceChargeType; 
            private String instanceName; 
            private String instanceType; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private Integer ipv6AddressCount; 
            private String keyPairName; 
            private NetworkInterfaces networkInterfaces; 
            private String networkType; 
            private Boolean passwordInherit; 
            private Integer period; 
            private String periodUnit; 
            private String privateIpAddress; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private LaunchTemplateDataSecurityGroupIds securityGroupIds; 
            private SecurityOptions securityOptions; 
            private Integer spotDuration; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String systemDisk_autoSnapshotPolicyId; 
            private Boolean systemDisk_burstingEnabled; 
            private String systemDisk_category; 
            private Boolean systemDisk_deleteWithInstance; 
            private String systemDisk_description; 
            private String systemDisk_diskName; 
            private String systemDisk_encrypted; 
            private Integer systemDisk_iops; 
            private String systemDisk_kMSKeyId; 
            private String systemDisk_performanceLevel; 
            private Long systemDisk_provisionedIops; 
            private Integer systemDisk_size; 
            private Tags tags; 
            private String userData; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(LaunchTemplateData model) {
                this.autoReleaseTime = model.autoReleaseTime;
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.creditSpecification = model.creditSpecification;
                this.dataDisks = model.dataDisks;
                this.deletionProtection = model.deletionProtection;
                this.deploymentSetId = model.deploymentSetId;
                this.description = model.description;
                this.enableVmOsConfig = model.enableVmOsConfig;
                this.hostName = model.hostName;
                this.httpEndpoint = model.httpEndpoint;
                this.httpPutResponseHopLimit = model.httpPutResponseHopLimit;
                this.httpTokens = model.httpTokens;
                this.imageId = model.imageId;
                this.imageOptions = model.imageOptions;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.ioOptimized = model.ioOptimized;
                this.ipv6AddressCount = model.ipv6AddressCount;
                this.keyPairName = model.keyPairName;
                this.networkInterfaces = model.networkInterfaces;
                this.networkType = model.networkType;
                this.passwordInherit = model.passwordInherit;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.privateIpAddress = model.privateIpAddress;
                this.ramRoleName = model.ramRoleName;
                this.resourceGroupId = model.resourceGroupId;
                this.securityEnhancementStrategy = model.securityEnhancementStrategy;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.securityOptions = model.securityOptions;
                this.spotDuration = model.spotDuration;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.systemDisk_autoSnapshotPolicyId = model.systemDisk_autoSnapshotPolicyId;
                this.systemDisk_burstingEnabled = model.systemDisk_burstingEnabled;
                this.systemDisk_category = model.systemDisk_category;
                this.systemDisk_deleteWithInstance = model.systemDisk_deleteWithInstance;
                this.systemDisk_description = model.systemDisk_description;
                this.systemDisk_diskName = model.systemDisk_diskName;
                this.systemDisk_encrypted = model.systemDisk_encrypted;
                this.systemDisk_iops = model.systemDisk_iops;
                this.systemDisk_kMSKeyId = model.systemDisk_kMSKeyId;
                this.systemDisk_performanceLevel = model.systemDisk_performanceLevel;
                this.systemDisk_provisionedIops = model.systemDisk_provisionedIops;
                this.systemDisk_size = model.systemDisk_size;
                this.tags = model.tags;
                this.userData = model.userData;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AutoReleaseTime.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * AutoRenewPeriod.
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * CreditSpecification.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * DataDisks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * DeploymentSetId.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableVmOsConfig.
             */
            public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
                this.enableVmOsConfig = enableVmOsConfig;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * HttpEndpoint.
             */
            public Builder httpEndpoint(String httpEndpoint) {
                this.httpEndpoint = httpEndpoint;
                return this;
            }

            /**
             * HttpPutResponseHopLimit.
             */
            public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
                this.httpPutResponseHopLimit = httpPutResponseHopLimit;
                return this;
            }

            /**
             * HttpTokens.
             */
            public Builder httpTokens(String httpTokens) {
                this.httpTokens = httpTokens;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageOptions.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
                return this;
            }

            /**
             * ImageOwnerAlias.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * Ipv6AddressCount.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * PasswordInherit.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * RamRoleName.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityEnhancementStrategy.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(LaunchTemplateDataSecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * SecurityOptions.
             */
            public Builder securityOptions(SecurityOptions securityOptions) {
                this.securityOptions = securityOptions;
                return this;
            }

            /**
             * SpotDuration.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * SystemDisk.AutoSnapshotPolicyId.
             */
            public Builder systemDisk_autoSnapshotPolicyId(String systemDisk_autoSnapshotPolicyId) {
                this.systemDisk_autoSnapshotPolicyId = systemDisk_autoSnapshotPolicyId;
                return this;
            }

            /**
             * SystemDisk.BurstingEnabled.
             */
            public Builder systemDisk_burstingEnabled(Boolean systemDisk_burstingEnabled) {
                this.systemDisk_burstingEnabled = systemDisk_burstingEnabled;
                return this;
            }

            /**
             * SystemDisk.Category.
             */
            public Builder systemDisk_category(String systemDisk_category) {
                this.systemDisk_category = systemDisk_category;
                return this;
            }

            /**
             * SystemDisk.DeleteWithInstance.
             */
            public Builder systemDisk_deleteWithInstance(Boolean systemDisk_deleteWithInstance) {
                this.systemDisk_deleteWithInstance = systemDisk_deleteWithInstance;
                return this;
            }

            /**
             * SystemDisk.Description.
             */
            public Builder systemDisk_description(String systemDisk_description) {
                this.systemDisk_description = systemDisk_description;
                return this;
            }

            /**
             * SystemDisk.DiskName.
             */
            public Builder systemDisk_diskName(String systemDisk_diskName) {
                this.systemDisk_diskName = systemDisk_diskName;
                return this;
            }

            /**
             * SystemDisk.Encrypted.
             */
            public Builder systemDisk_encrypted(String systemDisk_encrypted) {
                this.systemDisk_encrypted = systemDisk_encrypted;
                return this;
            }

            /**
             * SystemDisk.Iops.
             */
            public Builder systemDisk_iops(Integer systemDisk_iops) {
                this.systemDisk_iops = systemDisk_iops;
                return this;
            }

            /**
             * SystemDisk.KMSKeyId.
             */
            public Builder systemDisk_kMSKeyId(String systemDisk_kMSKeyId) {
                this.systemDisk_kMSKeyId = systemDisk_kMSKeyId;
                return this;
            }

            /**
             * SystemDisk.PerformanceLevel.
             */
            public Builder systemDisk_performanceLevel(String systemDisk_performanceLevel) {
                this.systemDisk_performanceLevel = systemDisk_performanceLevel;
                return this;
            }

            /**
             * SystemDisk.ProvisionedIops.
             */
            public Builder systemDisk_provisionedIops(Long systemDisk_provisionedIops) {
                this.systemDisk_provisionedIops = systemDisk_provisionedIops;
                return this;
            }

            /**
             * SystemDisk.Size.
             */
            public Builder systemDisk_size(Integer systemDisk_size) {
                this.systemDisk_size = systemDisk_size;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public LaunchTemplateData build() {
                return new LaunchTemplateData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class LaunchTemplateVersionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateData")
        private LaunchTemplateData launchTemplateData;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
        private String launchTemplateName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("VersionDescription")
        private String versionDescription;

        @com.aliyun.core.annotation.NameInMap("VersionNumber")
        private Long versionNumber;

        private LaunchTemplateVersionSet(Builder builder) {
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.defaultVersion = builder.defaultVersion;
            this.launchTemplateData = builder.launchTemplateData;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateName = builder.launchTemplateName;
            this.modifiedTime = builder.modifiedTime;
            this.versionDescription = builder.versionDescription;
            this.versionNumber = builder.versionNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionSet create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return defaultVersion
         */
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return launchTemplateData
         */
        public LaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateName
         */
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        /**
         * @return versionNumber
         */
        public Long getVersionNumber() {
            return this.versionNumber;
        }

        public static final class Builder {
            private String createTime; 
            private String createdBy; 
            private Boolean defaultVersion; 
            private LaunchTemplateData launchTemplateData; 
            private String launchTemplateId; 
            private String launchTemplateName; 
            private String modifiedTime; 
            private String versionDescription; 
            private Long versionNumber; 

            private Builder() {
            } 

            private Builder(LaunchTemplateVersionSet model) {
                this.createTime = model.createTime;
                this.createdBy = model.createdBy;
                this.defaultVersion = model.defaultVersion;
                this.launchTemplateData = model.launchTemplateData;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateName = model.launchTemplateName;
                this.modifiedTime = model.modifiedTime;
                this.versionDescription = model.versionDescription;
                this.versionNumber = model.versionNumber;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatedBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * LaunchTemplateData.
             */
            public Builder launchTemplateData(LaunchTemplateData launchTemplateData) {
                this.launchTemplateData = launchTemplateData;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateName.
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * VersionDescription.
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            /**
             * VersionNumber.
             */
            public Builder versionNumber(Long versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            public LaunchTemplateVersionSet build() {
                return new LaunchTemplateVersionSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLaunchTemplateVersionsResponseBody</p>
     */
    public static class LaunchTemplateVersionSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionSet")
        private java.util.List<LaunchTemplateVersionSet> launchTemplateVersionSet;

        private LaunchTemplateVersionSets(Builder builder) {
            this.launchTemplateVersionSet = builder.launchTemplateVersionSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionSets create() {
            return builder().build();
        }

        /**
         * @return launchTemplateVersionSet
         */
        public java.util.List<LaunchTemplateVersionSet> getLaunchTemplateVersionSet() {
            return this.launchTemplateVersionSet;
        }

        public static final class Builder {
            private java.util.List<LaunchTemplateVersionSet> launchTemplateVersionSet; 

            private Builder() {
            } 

            private Builder(LaunchTemplateVersionSets model) {
                this.launchTemplateVersionSet = model.launchTemplateVersionSet;
            } 

            /**
             * LaunchTemplateVersionSet.
             */
            public Builder launchTemplateVersionSet(java.util.List<LaunchTemplateVersionSet> launchTemplateVersionSet) {
                this.launchTemplateVersionSet = launchTemplateVersionSet;
                return this;
            }

            public LaunchTemplateVersionSets build() {
                return new LaunchTemplateVersionSets(this);
            } 

        } 

    }
}
