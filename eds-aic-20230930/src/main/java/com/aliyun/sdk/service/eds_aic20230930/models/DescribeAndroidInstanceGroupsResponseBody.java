// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAndroidInstanceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAndroidInstanceGroupsResponseBody</p>
 */
public class DescribeAndroidInstanceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceGroupModel")
    private java.util.List < InstanceGroupModel> instanceGroupModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAndroidInstanceGroupsResponseBody(Builder builder) {
        this.instanceGroupModel = builder.instanceGroupModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAndroidInstanceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceGroupModel
     */
    public java.util.List < InstanceGroupModel> getInstanceGroupModel() {
        return this.instanceGroupModel;
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
        private java.util.List < InstanceGroupModel> instanceGroupModel; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceGroupModel.
         */
        public Builder instanceGroupModel(java.util.List < InstanceGroupModel> instanceGroupModel) {
            this.instanceGroupModel = instanceGroupModel;
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

        public DescribeAndroidInstanceGroupsResponseBody build() {
            return new DescribeAndroidInstanceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAndroidInstanceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstanceGroupsResponseBody</p>
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
     * {@link DescribeAndroidInstanceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstanceGroupsResponseBody</p>
     */
    public static class InstanceGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List < Disks> disks;

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

        @com.aliyun.core.annotation.NameInMap("InstalledAppList")
        private String installedAppList;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupName")
        private String instanceGroupName;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
        private String instanceGroupSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupSpecDescribe")
        private String instanceGroupSpecDescribe;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupStatus")
        private String instanceGroupStatus;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NumberOfInstances")
        private String numberOfInstances;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RenderingType")
        private String renderingType;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        @com.aliyun.core.annotation.NameInMap("SaleMode")
        private String saleMode;

        @com.aliyun.core.annotation.NameInMap("SystemVersion")
        private String systemVersion;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private InstanceGroupModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.architectureType = builder.architectureType;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.disks = builder.disks;
            this.errorCode = builder.errorCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.installedAppList = builder.installedAppList;
            this.instanceGroupId = builder.instanceGroupId;
            this.instanceGroupName = builder.instanceGroupName;
            this.instanceGroupSpec = builder.instanceGroupSpec;
            this.instanceGroupSpecDescribe = builder.instanceGroupSpecDescribe;
            this.instanceGroupStatus = builder.instanceGroupStatus;
            this.memory = builder.memory;
            this.numberOfInstances = builder.numberOfInstances;
            this.officeSiteId = builder.officeSiteId;
            this.policyGroupId = builder.policyGroupId;
            this.regionId = builder.regionId;
            this.renderingType = builder.renderingType;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
            this.saleMode = builder.saleMode;
            this.systemVersion = builder.systemVersion;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceGroupModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
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
        public java.util.List < Disks> getDisks() {
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return installedAppList
         */
        public String getInstalledAppList() {
            return this.installedAppList;
        }

        /**
         * @return instanceGroupId
         */
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        /**
         * @return instanceGroupName
         */
        public String getInstanceGroupName() {
            return this.instanceGroupName;
        }

        /**
         * @return instanceGroupSpec
         */
        public String getInstanceGroupSpec() {
            return this.instanceGroupSpec;
        }

        /**
         * @return instanceGroupSpecDescribe
         */
        public String getInstanceGroupSpecDescribe() {
            return this.instanceGroupSpecDescribe;
        }

        /**
         * @return instanceGroupStatus
         */
        public String getInstanceGroupStatus() {
            return this.instanceGroupStatus;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return numberOfInstances
         */
        public String getNumberOfInstances() {
            return this.numberOfInstances;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
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

        /**
         * @return saleMode
         */
        public String getSaleMode() {
            return this.saleMode;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String architectureType; 
            private String chargeType; 
            private String cpu; 
            private java.util.List < Disks> disks; 
            private String errorCode; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String imageId; 
            private String installedAppList; 
            private String instanceGroupId; 
            private String instanceGroupName; 
            private String instanceGroupSpec; 
            private String instanceGroupSpecDescribe; 
            private String instanceGroupStatus; 
            private Integer memory; 
            private String numberOfInstances; 
            private String officeSiteId; 
            private String policyGroupId; 
            private String regionId; 
            private String renderingType; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 
            private String saleMode; 
            private String systemVersion; 
            private String vSwitchId; 

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
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
            public Builder disks(java.util.List < Disks> disks) {
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
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstalledAppList.
             */
            public Builder installedAppList(String installedAppList) {
                this.installedAppList = installedAppList;
                return this;
            }

            /**
             * InstanceGroupId.
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * InstanceGroupName.
             */
            public Builder instanceGroupName(String instanceGroupName) {
                this.instanceGroupName = instanceGroupName;
                return this;
            }

            /**
             * InstanceGroupSpec.
             */
            public Builder instanceGroupSpec(String instanceGroupSpec) {
                this.instanceGroupSpec = instanceGroupSpec;
                return this;
            }

            /**
             * InstanceGroupSpecDescribe.
             */
            public Builder instanceGroupSpecDescribe(String instanceGroupSpecDescribe) {
                this.instanceGroupSpecDescribe = instanceGroupSpecDescribe;
                return this;
            }

            /**
             * InstanceGroupStatus.
             */
            public Builder instanceGroupStatus(String instanceGroupStatus) {
                this.instanceGroupStatus = instanceGroupStatus;
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
             * NumberOfInstances.
             */
            public Builder numberOfInstances(String numberOfInstances) {
                this.numberOfInstances = numberOfInstances;
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
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
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

            /**
             * SaleMode.
             */
            public Builder saleMode(String saleMode) {
                this.saleMode = saleMode;
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
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public InstanceGroupModel build() {
                return new InstanceGroupModel(this);
            } 

        } 

    }
}
