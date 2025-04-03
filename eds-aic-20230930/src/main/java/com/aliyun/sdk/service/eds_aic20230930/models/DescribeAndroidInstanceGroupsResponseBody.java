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
 * {@link DescribeAndroidInstanceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAndroidInstanceGroupsResponseBody</p>
 */
public class DescribeAndroidInstanceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceGroupModel")
    private java.util.List<InstanceGroupModel> instanceGroupModel;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceGroupModel
     */
    public java.util.List<InstanceGroupModel> getInstanceGroupModel() {
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
        private java.util.List<InstanceGroupModel> instanceGroupModel; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAndroidInstanceGroupsResponseBody model) {
            this.instanceGroupModel = model.instanceGroupModel;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The instance group.</p>
         */
        public Builder instanceGroupModel(java.util.List<InstanceGroupModel> instanceGroupModel) {
            this.instanceGroupModel = instanceGroupModel;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
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

            private Builder() {
            } 

            private Builder(Disks model) {
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
            } 

            /**
             * <p>The size of the disk. Unit: GB.</p>
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
     * {@link DescribeAndroidInstanceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstanceGroupsResponseBody</p>
     */
    public static class InstanceGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("EnableIpv6")
        private Boolean enableIpv6;

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

        @com.aliyun.core.annotation.NameInMap("Ipv6Bandwidth")
        private Integer ipv6Bandwidth;

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
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.disks = builder.disks;
            this.enableIpv6 = builder.enableIpv6;
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
            this.ipv6Bandwidth = builder.ipv6Bandwidth;
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
         * @return availableInstanceAmount
         */
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
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
         * @return enableIpv6
         */
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
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
         * @return ipv6Bandwidth
         */
        public Integer getIpv6Bandwidth() {
            return this.ipv6Bandwidth;
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
            private Integer availableInstanceAmount; 
            private String chargeType; 
            private String cpu; 
            private java.util.List<Disks> disks; 
            private Boolean enableIpv6; 
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
            private Integer ipv6Bandwidth; 
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

            private Builder() {
            } 

            private Builder(InstanceGroupModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.architectureType = model.architectureType;
                this.availableInstanceAmount = model.availableInstanceAmount;
                this.chargeType = model.chargeType;
                this.cpu = model.cpu;
                this.disks = model.disks;
                this.enableIpv6 = model.enableIpv6;
                this.errorCode = model.errorCode;
                this.gmtCreate = model.gmtCreate;
                this.gmtExpired = model.gmtExpired;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.installedAppList = model.installedAppList;
                this.instanceGroupId = model.instanceGroupId;
                this.instanceGroupName = model.instanceGroupName;
                this.instanceGroupSpec = model.instanceGroupSpec;
                this.instanceGroupSpecDescribe = model.instanceGroupSpecDescribe;
                this.instanceGroupStatus = model.instanceGroupStatus;
                this.ipv6Bandwidth = model.ipv6Bandwidth;
                this.memory = model.memory;
                this.numberOfInstances = model.numberOfInstances;
                this.officeSiteId = model.officeSiteId;
                this.policyGroupId = model.policyGroupId;
                this.regionId = model.regionId;
                this.renderingType = model.renderingType;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
                this.saleMode = model.saleMode;
                this.systemVersion = model.systemVersion;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-48xr63m4dybjk****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The type of the architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>ARM</p>
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * <p>The number of available instances.</p>
             * <blockquote>
             * <p> Available instances are those not in the Deleting or Deleted state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * <p>The billing method.</p>
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
             * <p>8</p>
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
             * EnableIpv6.
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * <p>The cause of the creation failure.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The time when the instance group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-01 10:56:36</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the subscription instance group expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2027-06-29 07:25:31</p>
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The time when the instance group was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-01 10:56:36</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-06zyt9m93zwax****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The list of installed applications.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;TikTok&quot;,&quot;WeChat&quot;</p>
             */
            public Builder installedAppList(String installedAppList) {
                this.installedAppList = installedAppList;
                return this;
            }

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>ag-h67a2cs0zprfdh****</p>
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * <p>The name of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>defaultInstanceGroup</p>
             */
            public Builder instanceGroupName(String instanceGroupName) {
                this.instanceGroupName = instanceGroupName;
                return this;
            }

            /**
             * <p>The specifications of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>acp.basic.small</p>
             */
            public Builder instanceGroupSpec(String instanceGroupSpec) {
                this.instanceGroupSpec = instanceGroupSpec;
                return this;
            }

            /**
             * <p>The description of the instance group specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>ARM-2vCPU4GiB 32GiB</p>
             */
            public Builder instanceGroupSpecDescribe(String instanceGroupSpecDescribe) {
                this.instanceGroupSpecDescribe = instanceGroupSpecDescribe;
                return this;
            }

            /**
             * <p>The status of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder instanceGroupStatus(String instanceGroupStatus) {
                this.instanceGroupStatus = instanceGroupStatus;
                return this;
            }

            /**
             * Ipv6Bandwidth.
             */
            public Builder ipv6Bandwidth(Integer ipv6Bandwidth) {
                this.ipv6Bandwidth = ipv6Bandwidth;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of instances in the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder numberOfInstances(String numberOfInstances) {
                this.numberOfInstances = numberOfInstances;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai+dir-030598****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-c6n38xucps8kl****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The rendering mode of the instance group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>GPURemote: GPU remote rendering.</li>
             * <li>CPU: CPU rendering.</li>
             * <li>GPUocal: GPU local rendering.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder renderingType(String renderingType) {
                this.renderingType = renderingType;
                return this;
            }

            /**
             * <p>The height of the resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * <p>The width of the resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * <p>The sales mode.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder saleMode(String saleMode) {
                this.saleMode = saleMode;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Android 12</p>
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-t4n0yqs009ho024wt****</p>
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
