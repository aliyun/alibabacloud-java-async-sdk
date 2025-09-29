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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAndroidInstancesResponseBody model) {
            this.instanceModel = model.instanceModel;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cloud phone instances.</p>
         */
        public Builder instanceModel(java.util.List<InstanceModel> instanceModel) {
            this.instanceModel = instanceModel;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmma/xxE9WtwL/ADvZ****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
    public static class AppManagePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppManagePolicyId")
        private String appManagePolicyId;

        @com.aliyun.core.annotation.NameInMap("AppManagePolicyName")
        private String appManagePolicyName;

        private AppManagePolicy(Builder builder) {
            this.appManagePolicyId = builder.appManagePolicyId;
            this.appManagePolicyName = builder.appManagePolicyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppManagePolicy create() {
            return builder().build();
        }

        /**
         * @return appManagePolicyId
         */
        public String getAppManagePolicyId() {
            return this.appManagePolicyId;
        }

        /**
         * @return appManagePolicyName
         */
        public String getAppManagePolicyName() {
            return this.appManagePolicyName;
        }

        public static final class Builder {
            private String appManagePolicyId; 
            private String appManagePolicyName; 

            private Builder() {
            } 

            private Builder(AppManagePolicy model) {
                this.appManagePolicyId = model.appManagePolicyId;
                this.appManagePolicyName = model.appManagePolicyName;
            } 

            /**
             * AppManagePolicyId.
             */
            public Builder appManagePolicyId(String appManagePolicyId) {
                this.appManagePolicyId = appManagePolicyId;
                return this;
            }

            /**
             * AppManagePolicyName.
             */
            public Builder appManagePolicyName(String appManagePolicyName) {
                this.appManagePolicyName = appManagePolicyName;
                return this;
            }

            public AppManagePolicy build() {
                return new AppManagePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesResponseBody</p>
     */
    public static class BizTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BizTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizTags create() {
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

            private Builder(BizTags model) {
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

            public BizTags build() {
                return new BizTags(this);
            } 

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

            private Builder() {
            } 

            private Builder(Disks model) {
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
            } 

            /**
             * <p>The disk size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
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
    public static class DisplayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dpi")
        private Integer dpi;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("LockResolution")
        private String lockResolution;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        private DisplayConfig(Builder builder) {
            this.dpi = builder.dpi;
            this.fps = builder.fps;
            this.lockResolution = builder.lockResolution;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayConfig create() {
            return builder().build();
        }

        /**
         * @return dpi
         */
        public Integer getDpi() {
            return this.dpi;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return lockResolution
         */
        public String getLockResolution() {
            return this.lockResolution;
        }

        /**
         * @return resolutionHeight
         */
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        /**
         * @return resolutionWidth
         */
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public static final class Builder {
            private Integer dpi; 
            private Integer fps; 
            private String lockResolution; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 

            private Builder() {
            } 

            private Builder(DisplayConfig model) {
                this.dpi = model.dpi;
                this.fps = model.fps;
                this.lockResolution = model.lockResolution;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
            } 

            /**
             * Dpi.
             */
            public Builder dpi(Integer dpi) {
                this.dpi = dpi;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * LockResolution.
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            /**
             * ResolutionHeight.
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * ResolutionWidth.
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            public DisplayConfig build() {
                return new DisplayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesResponseBody</p>
     */
    public static class PhoneDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneDataId")
        private String phoneDataId;

        @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
        private Integer phoneDataVolume;

        private PhoneDataInfo(Builder builder) {
            this.phoneDataId = builder.phoneDataId;
            this.phoneDataVolume = builder.phoneDataVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneDataInfo create() {
            return builder().build();
        }

        /**
         * @return phoneDataId
         */
        public String getPhoneDataId() {
            return this.phoneDataId;
        }

        /**
         * @return phoneDataVolume
         */
        public Integer getPhoneDataVolume() {
            return this.phoneDataVolume;
        }

        public static final class Builder {
            private String phoneDataId; 
            private Integer phoneDataVolume; 

            private Builder() {
            } 

            private Builder(PhoneDataInfo model) {
                this.phoneDataId = model.phoneDataId;
                this.phoneDataVolume = model.phoneDataVolume;
            } 

            /**
             * PhoneDataId.
             */
            public Builder phoneDataId(String phoneDataId) {
                this.phoneDataId = phoneDataId;
                return this;
            }

            /**
             * PhoneDataVolume.
             */
            public Builder phoneDataVolume(Integer phoneDataVolume) {
                this.phoneDataVolume = phoneDataVolume;
                return this;
            }

            public PhoneDataInfo build() {
                return new PhoneDataInfo(this);
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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

        @com.aliyun.core.annotation.NameInMap("AppManagePolicy")
        private AppManagePolicy appManagePolicy;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private String authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @com.aliyun.core.annotation.NameInMap("BindUserId")
        private String bindUserId;

        @com.aliyun.core.annotation.NameInMap("BizTags")
        private java.util.List<BizTags> bizTags;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("DisplayConfig")
        private DisplayConfig displayConfig;

        @com.aliyun.core.annotation.NameInMap("DownBandwidthLimit")
        private Integer downBandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private String gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetStatus")
        private String internetStatus;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIpv6Address")
        private String networkInterfaceIpv6Address;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("PersistentAppInstanceId")
        private String persistentAppInstanceId;

        @com.aliyun.core.annotation.NameInMap("PhoneDataInfo")
        private PhoneDataInfo phoneDataInfo;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("PublicIpv6Address")
        private String publicIpv6Address;

        @com.aliyun.core.annotation.NameInMap("QosRuleId")
        private String qosRuleId;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RenderingType")
        private String renderingType;

        @com.aliyun.core.annotation.NameInMap("ServerStatus")
        private String serverStatus;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("StreamMode")
        private Integer streamMode;

        @com.aliyun.core.annotation.NameInMap("SystemVersion")
        private String systemVersion;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpBandwidthLimit")
        private Integer upBandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceModel(Builder builder) {
            this.androidInstanceGroupId = builder.androidInstanceGroupId;
            this.androidInstanceGroupName = builder.androidInstanceGroupName;
            this.androidInstanceId = builder.androidInstanceId;
            this.androidInstanceName = builder.androidInstanceName;
            this.androidInstanceStatus = builder.androidInstanceStatus;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.appManagePolicy = builder.appManagePolicy;
            this.authorizedUserId = builder.authorizedUserId;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageType = builder.bandwidthPackageType;
            this.bindUserId = builder.bindUserId;
            this.bizTags = builder.bizTags;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.disks = builder.disks;
            this.displayConfig = builder.displayConfig;
            this.downBandwidthLimit = builder.downBandwidthLimit;
            this.errorCode = builder.errorCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.imageVersion = builder.imageVersion;
            this.instanceType = builder.instanceType;
            this.internetStatus = builder.internetStatus;
            this.keyPairId = builder.keyPairId;
            this.memory = builder.memory;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.networkInterfaceIpv6Address = builder.networkInterfaceIpv6Address;
            this.networkType = builder.networkType;
            this.officeSiteId = builder.officeSiteId;
            this.persistentAppInstanceId = builder.persistentAppInstanceId;
            this.phoneDataInfo = builder.phoneDataInfo;
            this.policyGroupId = builder.policyGroupId;
            this.publicIpAddress = builder.publicIpAddress;
            this.publicIpv6Address = builder.publicIpv6Address;
            this.qosRuleId = builder.qosRuleId;
            this.rate = builder.rate;
            this.regionId = builder.regionId;
            this.renderingType = builder.renderingType;
            this.serverStatus = builder.serverStatus;
            this.serverType = builder.serverType;
            this.sessionStatus = builder.sessionStatus;
            this.streamMode = builder.streamMode;
            this.systemVersion = builder.systemVersion;
            this.tags = builder.tags;
            this.upBandwidthLimit = builder.upBandwidthLimit;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
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
         * @return appManagePolicy
         */
        public AppManagePolicy getAppManagePolicy() {
            return this.appManagePolicy;
        }

        /**
         * @return authorizedUserId
         */
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageType
         */
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        /**
         * @return bindUserId
         */
        public String getBindUserId() {
            return this.bindUserId;
        }

        /**
         * @return bizTags
         */
        public java.util.List<BizTags> getBizTags() {
            return this.bizTags;
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
         * @return displayConfig
         */
        public DisplayConfig getDisplayConfig() {
            return this.displayConfig;
        }

        /**
         * @return downBandwidthLimit
         */
        public Integer getDownBandwidthLimit() {
            return this.downBandwidthLimit;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return internetStatus
         */
        public String getInternetStatus() {
            return this.internetStatus;
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
         * @return networkInterfaceIpv6Address
         */
        public String getNetworkInterfaceIpv6Address() {
            return this.networkInterfaceIpv6Address;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return phoneDataInfo
         */
        public PhoneDataInfo getPhoneDataInfo() {
            return this.phoneDataInfo;
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
         * @return publicIpv6Address
         */
        public String getPublicIpv6Address() {
            return this.publicIpv6Address;
        }

        /**
         * @return qosRuleId
         */
        public String getQosRuleId() {
            return this.qosRuleId;
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
         * @return serverStatus
         */
        public String getServerStatus() {
            return this.serverStatus;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return streamMode
         */
        public Integer getStreamMode() {
            return this.streamMode;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return upBandwidthLimit
         */
        public Integer getUpBandwidthLimit() {
            return this.upBandwidthLimit;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String androidInstanceGroupId; 
            private String androidInstanceGroupName; 
            private String androidInstanceId; 
            private String androidInstanceName; 
            private String androidInstanceStatus; 
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private AppManagePolicy appManagePolicy; 
            private String authorizedUserId; 
            private String bandwidthPackageId; 
            private String bandwidthPackageType; 
            private String bindUserId; 
            private java.util.List<BizTags> bizTags; 
            private String chargeType; 
            private String cpu; 
            private java.util.List<Disks> disks; 
            private DisplayConfig displayConfig; 
            private Integer downBandwidthLimit; 
            private String errorCode; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String imageId; 
            private String imageVersion; 
            private String instanceType; 
            private String internetStatus; 
            private String keyPairId; 
            private Integer memory; 
            private String networkInterfaceIp; 
            private String networkInterfaceIpv6Address; 
            private String networkType; 
            private String officeSiteId; 
            private String persistentAppInstanceId; 
            private PhoneDataInfo phoneDataInfo; 
            private String policyGroupId; 
            private String publicIpAddress; 
            private String publicIpv6Address; 
            private String qosRuleId; 
            private Integer rate; 
            private String regionId; 
            private String renderingType; 
            private String serverStatus; 
            private String serverType; 
            private String sessionStatus; 
            private Integer streamMode; 
            private String systemVersion; 
            private java.util.List<Tags> tags; 
            private Integer upBandwidthLimit; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(InstanceModel model) {
                this.androidInstanceGroupId = model.androidInstanceGroupId;
                this.androidInstanceGroupName = model.androidInstanceGroupName;
                this.androidInstanceId = model.androidInstanceId;
                this.androidInstanceName = model.androidInstanceName;
                this.androidInstanceStatus = model.androidInstanceStatus;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceId = model.appInstanceId;
                this.appManagePolicy = model.appManagePolicy;
                this.authorizedUserId = model.authorizedUserId;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthPackageType = model.bandwidthPackageType;
                this.bindUserId = model.bindUserId;
                this.bizTags = model.bizTags;
                this.chargeType = model.chargeType;
                this.cpu = model.cpu;
                this.disks = model.disks;
                this.displayConfig = model.displayConfig;
                this.downBandwidthLimit = model.downBandwidthLimit;
                this.errorCode = model.errorCode;
                this.gmtCreate = model.gmtCreate;
                this.gmtExpired = model.gmtExpired;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.imageVersion = model.imageVersion;
                this.instanceType = model.instanceType;
                this.internetStatus = model.internetStatus;
                this.keyPairId = model.keyPairId;
                this.memory = model.memory;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.networkInterfaceIpv6Address = model.networkInterfaceIpv6Address;
                this.networkType = model.networkType;
                this.officeSiteId = model.officeSiteId;
                this.persistentAppInstanceId = model.persistentAppInstanceId;
                this.phoneDataInfo = model.phoneDataInfo;
                this.policyGroupId = model.policyGroupId;
                this.publicIpAddress = model.publicIpAddress;
                this.publicIpv6Address = model.publicIpv6Address;
                this.qosRuleId = model.qosRuleId;
                this.rate = model.rate;
                this.regionId = model.regionId;
                this.renderingType = model.renderingType;
                this.serverStatus = model.serverStatus;
                this.serverType = model.serverType;
                this.sessionStatus = model.sessionStatus;
                this.streamMode = model.streamMode;
                this.systemVersion = model.systemVersion;
                this.tags = model.tags;
                this.upBandwidthLimit = model.upBandwidthLimit;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>ag-ayyhomlal7po****</p>
             */
            public Builder androidInstanceGroupId(String androidInstanceGroupId) {
                this.androidInstanceGroupId = androidInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>AndroidInstanceGroupName</p>
             */
            public Builder androidInstanceGroupName(String androidInstanceGroupName) {
                this.androidInstanceGroupName = androidInstanceGroupName;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-8at8h6ejkadjh****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * <p>The state of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder androidInstanceStatus(String androidInstanceStatus) {
                this.androidInstanceStatus = androidInstanceStatus;
                return this;
            }

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-i7yv6tkn7kh8dv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The ID of the physical instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-9ey6io0q58rcd****</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * AppManagePolicy.
             */
            public Builder appManagePolicy(AppManagePolicy appManagePolicy) {
                this.appManagePolicy = appManagePolicy;
                return this;
            }

            /**
             * <p>The ID of the user to whom the instance is assigned.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder authorizedUserId(String authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * BandwidthPackageType.
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
                return this;
            }

            /**
             * <p>The ID of the bound user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bindUserId(String bindUserId) {
                this.bindUserId = bindUserId;
                return this;
            }

            /**
             * BizTags.
             */
            public Builder bizTags(java.util.List<BizTags> bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * DisplayConfig.
             */
            public Builder displayConfig(DisplayConfig displayConfig) {
                this.displayConfig = displayConfig;
                return this;
            }

            /**
             * DownBandwidthLimit.
             */
            public Builder downBandwidthLimit(Integer downBandwidthLimit) {
                this.downBandwidthLimit = downBandwidthLimit;
                return this;
            }

            /**
             * <p>The cause of the instance data backup failure or restoration failure.</p>
             * 
             * <strong>example:</strong>
             * <p>FilePathNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-06 10:42:10</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the subscription instance group expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-15T02:03:33Z</p>
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The time when the instance was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-06 10:42:10</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.3.867</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acp.basic.small</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetStatus.
             */
            public Builder internetStatus(String internetStatus) {
                this.internetStatus = internetStatus;
                return this;
            }

            /**
             * <p>The ID of the key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>kp-5hh431emkpucs****</p>
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.22.48</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
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
            public Builder networkInterfaceIpv6Address(String networkInterfaceIpv6Address) {
                this.networkInterfaceIpv6Address = networkInterfaceIpv6Address;
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
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen+dir-211620****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The ID of the persistent session.</p>
             * 
             * <strong>example:</strong>
             * <p>p-0btrd5zj8epo****</p>
             */
            public Builder persistentAppInstanceId(String persistentAppInstanceId) {
                this.persistentAppInstanceId = persistentAppInstanceId;
                return this;
            }

            /**
             * PhoneDataInfo.
             */
            public Builder phoneDataInfo(PhoneDataInfo phoneDataInfo) {
                this.phoneDataInfo = phoneDataInfo;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-0bszojpu0seql****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.32.1.41</p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
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
            public Builder publicIpv6Address(String publicIpv6Address) {
                this.publicIpv6Address = publicIpv6Address;
                return this;
            }

            /**
             * QosRuleId.
             */
            public Builder qosRuleId(String qosRuleId) {
                this.qosRuleId = qosRuleId;
                return this;
            }

            /**
             * <p>The progress of instance data backup or restoration.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The rendering type.</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder renderingType(String renderingType) {
                this.renderingType = renderingType;
                return this;
            }

            /**
             * ServerStatus.
             */
            public Builder serverStatus(String serverStatus) {
                this.serverStatus = serverStatus;
                return this;
            }

            /**
             * ServerType.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The session status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>disConnect: The session is disconnected.</li>
             * <li>connect: The session is connected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>connect</p>
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * StreamMode.
             */
            public Builder streamMode(Integer streamMode) {
                this.streamMode = streamMode;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpBandwidthLimit.
             */
            public Builder upBandwidthLimit(Integer upBandwidthLimit) {
                this.upBandwidthLimit = upBandwidthLimit;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceModel build() {
                return new InstanceModel(this);
            } 

        } 

    }
}
