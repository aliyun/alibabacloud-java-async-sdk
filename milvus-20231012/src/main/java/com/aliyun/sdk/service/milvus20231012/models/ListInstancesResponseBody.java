// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListInstancesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class MilvusResourceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("CuNum")
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        private MilvusResourceInfoList(Builder builder) {
            this.componentType = builder.componentType;
            this.cuNum = builder.cuNum;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.replica = builder.replica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MilvusResourceInfoList create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return cuNum
         */
        public Integer getCuNum() {
            return this.cuNum;
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

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private String componentType; 
            private Integer cuNum; 
            private Integer diskSize; 
            private String diskType; 
            private Integer replica; 

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * CuNum.
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

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

            /**
             * Replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public MilvusResourceInfoList build() {
                return new MilvusResourceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttuPort")
        private Integer attuPort;

        @com.aliyun.core.annotation.NameInMap("InternetUrl")
        private String internetUrl;

        @com.aliyun.core.annotation.NameInMap("IntranetUrl")
        private String intranetUrl;

        @com.aliyun.core.annotation.NameInMap("MilvusResourceInfoList")
        private java.util.List<MilvusResourceInfoList> milvusResourceInfoList;

        @com.aliyun.core.annotation.NameInMap("ProxyPort")
        private Integer proxyPort;

        @com.aliyun.core.annotation.NameInMap("TotalCuNum")
        private Integer totalCuNum;

        @com.aliyun.core.annotation.NameInMap("TotalDiskSize")
        private Integer totalDiskSize;

        private ClusterInfo(Builder builder) {
            this.attuPort = builder.attuPort;
            this.internetUrl = builder.internetUrl;
            this.intranetUrl = builder.intranetUrl;
            this.milvusResourceInfoList = builder.milvusResourceInfoList;
            this.proxyPort = builder.proxyPort;
            this.totalCuNum = builder.totalCuNum;
            this.totalDiskSize = builder.totalDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return attuPort
         */
        public Integer getAttuPort() {
            return this.attuPort;
        }

        /**
         * @return internetUrl
         */
        public String getInternetUrl() {
            return this.internetUrl;
        }

        /**
         * @return intranetUrl
         */
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        /**
         * @return milvusResourceInfoList
         */
        public java.util.List<MilvusResourceInfoList> getMilvusResourceInfoList() {
            return this.milvusResourceInfoList;
        }

        /**
         * @return proxyPort
         */
        public Integer getProxyPort() {
            return this.proxyPort;
        }

        /**
         * @return totalCuNum
         */
        public Integer getTotalCuNum() {
            return this.totalCuNum;
        }

        /**
         * @return totalDiskSize
         */
        public Integer getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public static final class Builder {
            private Integer attuPort; 
            private String internetUrl; 
            private String intranetUrl; 
            private java.util.List<MilvusResourceInfoList> milvusResourceInfoList; 
            private Integer proxyPort; 
            private Integer totalCuNum; 
            private Integer totalDiskSize; 

            /**
             * AttuPort.
             */
            public Builder attuPort(Integer attuPort) {
                this.attuPort = attuPort;
                return this;
            }

            /**
             * InternetUrl.
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * IntranetUrl.
             */
            public Builder intranetUrl(String intranetUrl) {
                this.intranetUrl = intranetUrl;
                return this;
            }

            /**
             * MilvusResourceInfoList.
             */
            public Builder milvusResourceInfoList(java.util.List<MilvusResourceInfoList> milvusResourceInfoList) {
                this.milvusResourceInfoList = milvusResourceInfoList;
                return this;
            }

            /**
             * ProxyPort.
             */
            public Builder proxyPort(Integer proxyPort) {
                this.proxyPort = proxyPort;
                return this;
            }

            /**
             * TotalCuNum.
             */
            public Builder totalCuNum(Integer totalCuNum) {
                this.totalCuNum = totalCuNum;
                return this;
            }

            /**
             * TotalDiskSize.
             */
            public Builder totalDiskSize(Integer totalDiskSize) {
                this.totalDiskSize = totalDiskSize;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoBackup")
        private Boolean autoBackup;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ClusterInfo")
        private ClusterInfo clusterInfo;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OpenPublicNet")
        private Boolean openPublicNet;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunningTime")
        private Integer runningTime;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.autoBackup = builder.autoBackup;
            this.beginTime = builder.beginTime;
            this.clusterInfo = builder.clusterInfo;
            this.clusterName = builder.clusterName;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.nodeType = builder.nodeType;
            this.openPublicNet = builder.openPublicNet;
            this.packageType = builder.packageType;
            this.payType = builder.payType;
            this.productCode = builder.productCode;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runningTime = builder.runningTime;
            this.sgId = builder.sgId;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoBackup
         */
        public Boolean getAutoBackup() {
            return this.autoBackup;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return clusterInfo
         */
        public ClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return openPublicNet
         */
        public Boolean getOpenPublicNet() {
            return this.openPublicNet;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return runningTime
         */
        public Integer getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean autoBackup; 
            private Long beginTime; 
            private ClusterInfo clusterInfo; 
            private String clusterName; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceStatus; 
            private String nodeType; 
            private Boolean openPublicNet; 
            private String packageType; 
            private Integer payType; 
            private String productCode; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer runningTime; 
            private String sgId; 
            private String vpcId; 
            private String vswId; 
            private String zoneId; 

            /**
             * AutoBackup.
             */
            public Builder autoBackup(Boolean autoBackup) {
                this.autoBackup = autoBackup;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ClusterInfo.
             */
            public Builder clusterInfo(ClusterInfo clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OpenPublicNet.
             */
            public Builder openPublicNet(Boolean openPublicNet) {
                this.openPublicNet = openPublicNet;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(Integer runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * SgId.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
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
             * VswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
