// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceDetailResponseBody</p>
 */
public class GetInstanceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private GetInstanceDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceDetailResponseBody create() {
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
    public Data getData() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
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

        public GetInstanceDetailResponseBody build() {
            return new GetInstanceDetailResponseBody(this);
        } 

    } 

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
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttuPort")
        private Integer attuPort;

        @com.aliyun.core.annotation.NameInMap("InternetUrl")
        private String internetUrl;

        @com.aliyun.core.annotation.NameInMap("IntranetUrl")
        private String intranetUrl;

        @com.aliyun.core.annotation.NameInMap("MilvusResourceInfoList")
        private java.util.List < MilvusResourceInfoList> milvusResourceInfoList;

        @com.aliyun.core.annotation.NameInMap("OssStorageSize")
        private String ossStorageSize;

        @com.aliyun.core.annotation.NameInMap("OssStorageTimestamp")
        private Long ossStorageTimestamp;

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
            this.ossStorageSize = builder.ossStorageSize;
            this.ossStorageTimestamp = builder.ossStorageTimestamp;
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
        public java.util.List < MilvusResourceInfoList> getMilvusResourceInfoList() {
            return this.milvusResourceInfoList;
        }

        /**
         * @return ossStorageSize
         */
        public String getOssStorageSize() {
            return this.ossStorageSize;
        }

        /**
         * @return ossStorageTimestamp
         */
        public Long getOssStorageTimestamp() {
            return this.ossStorageTimestamp;
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
            private java.util.List < MilvusResourceInfoList> milvusResourceInfoList; 
            private String ossStorageSize; 
            private Long ossStorageTimestamp; 
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
            public Builder milvusResourceInfoList(java.util.List < MilvusResourceInfoList> milvusResourceInfoList) {
                this.milvusResourceInfoList = milvusResourceInfoList;
                return this;
            }

            /**
             * OssStorageSize.
             */
            public Builder ossStorageSize(String ossStorageSize) {
                this.ossStorageSize = ossStorageSize;
                return this;
            }

            /**
             * OssStorageTimestamp.
             */
            public Builder ossStorageTimestamp(Long ossStorageTimestamp) {
                this.ossStorageTimestamp = ossStorageTimestamp;
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
    public static class MeasureConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataNodeCuNum")
        private Integer dataNodeCuNum;

        @com.aliyun.core.annotation.NameInMap("DataNodeReplica")
        private Integer dataNodeReplica;

        @com.aliyun.core.annotation.NameInMap("IndexNodeCuNum")
        private Integer indexNodeCuNum;

        @com.aliyun.core.annotation.NameInMap("IndexNodeReplica")
        private Integer indexNodeReplica;

        @com.aliyun.core.annotation.NameInMap("MixCoodinatorNodeCuNum")
        private Integer mixCoodinatorNodeCuNum;

        @com.aliyun.core.annotation.NameInMap("MixCoodinatorNodeReplica")
        private Integer mixCoodinatorNodeReplica;

        @com.aliyun.core.annotation.NameInMap("ProxyNodeCuNum")
        private Integer proxyNodeCuNum;

        @com.aliyun.core.annotation.NameInMap("ProxyNodeReplica")
        private Integer proxyNodeReplica;

        @com.aliyun.core.annotation.NameInMap("QueryNodeCuNum")
        private Integer queryNodeCuNum;

        @com.aliyun.core.annotation.NameInMap("QueryNodeReplica")
        private Integer queryNodeReplica;

        private MeasureConfig(Builder builder) {
            this.dataNodeCuNum = builder.dataNodeCuNum;
            this.dataNodeReplica = builder.dataNodeReplica;
            this.indexNodeCuNum = builder.indexNodeCuNum;
            this.indexNodeReplica = builder.indexNodeReplica;
            this.mixCoodinatorNodeCuNum = builder.mixCoodinatorNodeCuNum;
            this.mixCoodinatorNodeReplica = builder.mixCoodinatorNodeReplica;
            this.proxyNodeCuNum = builder.proxyNodeCuNum;
            this.proxyNodeReplica = builder.proxyNodeReplica;
            this.queryNodeCuNum = builder.queryNodeCuNum;
            this.queryNodeReplica = builder.queryNodeReplica;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasureConfig create() {
            return builder().build();
        }

        /**
         * @return dataNodeCuNum
         */
        public Integer getDataNodeCuNum() {
            return this.dataNodeCuNum;
        }

        /**
         * @return dataNodeReplica
         */
        public Integer getDataNodeReplica() {
            return this.dataNodeReplica;
        }

        /**
         * @return indexNodeCuNum
         */
        public Integer getIndexNodeCuNum() {
            return this.indexNodeCuNum;
        }

        /**
         * @return indexNodeReplica
         */
        public Integer getIndexNodeReplica() {
            return this.indexNodeReplica;
        }

        /**
         * @return mixCoodinatorNodeCuNum
         */
        public Integer getMixCoodinatorNodeCuNum() {
            return this.mixCoodinatorNodeCuNum;
        }

        /**
         * @return mixCoodinatorNodeReplica
         */
        public Integer getMixCoodinatorNodeReplica() {
            return this.mixCoodinatorNodeReplica;
        }

        /**
         * @return proxyNodeCuNum
         */
        public Integer getProxyNodeCuNum() {
            return this.proxyNodeCuNum;
        }

        /**
         * @return proxyNodeReplica
         */
        public Integer getProxyNodeReplica() {
            return this.proxyNodeReplica;
        }

        /**
         * @return queryNodeCuNum
         */
        public Integer getQueryNodeCuNum() {
            return this.queryNodeCuNum;
        }

        /**
         * @return queryNodeReplica
         */
        public Integer getQueryNodeReplica() {
            return this.queryNodeReplica;
        }

        public static final class Builder {
            private Integer dataNodeCuNum; 
            private Integer dataNodeReplica; 
            private Integer indexNodeCuNum; 
            private Integer indexNodeReplica; 
            private Integer mixCoodinatorNodeCuNum; 
            private Integer mixCoodinatorNodeReplica; 
            private Integer proxyNodeCuNum; 
            private Integer proxyNodeReplica; 
            private Integer queryNodeCuNum; 
            private Integer queryNodeReplica; 

            /**
             * DataNodeCuNum.
             */
            public Builder dataNodeCuNum(Integer dataNodeCuNum) {
                this.dataNodeCuNum = dataNodeCuNum;
                return this;
            }

            /**
             * DataNodeReplica.
             */
            public Builder dataNodeReplica(Integer dataNodeReplica) {
                this.dataNodeReplica = dataNodeReplica;
                return this;
            }

            /**
             * IndexNodeCuNum.
             */
            public Builder indexNodeCuNum(Integer indexNodeCuNum) {
                this.indexNodeCuNum = indexNodeCuNum;
                return this;
            }

            /**
             * IndexNodeReplica.
             */
            public Builder indexNodeReplica(Integer indexNodeReplica) {
                this.indexNodeReplica = indexNodeReplica;
                return this;
            }

            /**
             * MixCoodinatorNodeCuNum.
             */
            public Builder mixCoodinatorNodeCuNum(Integer mixCoodinatorNodeCuNum) {
                this.mixCoodinatorNodeCuNum = mixCoodinatorNodeCuNum;
                return this;
            }

            /**
             * MixCoodinatorNodeReplica.
             */
            public Builder mixCoodinatorNodeReplica(Integer mixCoodinatorNodeReplica) {
                this.mixCoodinatorNodeReplica = mixCoodinatorNodeReplica;
                return this;
            }

            /**
             * ProxyNodeCuNum.
             */
            public Builder proxyNodeCuNum(Integer proxyNodeCuNum) {
                this.proxyNodeCuNum = proxyNodeCuNum;
                return this;
            }

            /**
             * ProxyNodeReplica.
             */
            public Builder proxyNodeReplica(Integer proxyNodeReplica) {
                this.proxyNodeReplica = proxyNodeReplica;
                return this;
            }

            /**
             * QueryNodeCuNum.
             */
            public Builder queryNodeCuNum(Integer queryNodeCuNum) {
                this.queryNodeCuNum = queryNodeCuNum;
                return this;
            }

            /**
             * QueryNodeReplica.
             */
            public Builder queryNodeReplica(Integer queryNodeReplica) {
                this.queryNodeReplica = queryNodeReplica;
                return this;
            }

            public MeasureConfig build() {
                return new MeasureConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("BucketPath")
        private String bucketPath;

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

        @com.aliyun.core.annotation.NameInMap("MeasureConfig")
        private MeasureConfig measureConfig;

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
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UserConfig")
        private String userConfig;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.aclId = builder.aclId;
            this.beginTime = builder.beginTime;
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
            this.clusterInfo = builder.clusterInfo;
            this.clusterName = builder.clusterName;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.measureConfig = builder.measureConfig;
            this.openPublicNet = builder.openPublicNet;
            this.packageType = builder.packageType;
            this.payType = builder.payType;
            this.productCode = builder.productCode;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runningTime = builder.runningTime;
            this.sgId = builder.sgId;
            this.templateVersion = builder.templateVersion;
            this.userConfig = builder.userConfig;
            this.version = builder.version;
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
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
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
         * @return measureConfig
         */
        public MeasureConfig getMeasureConfig() {
            return this.measureConfig;
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
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return userConfig
         */
        public String getUserConfig() {
            return this.userConfig;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
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
            private String aclId; 
            private Long beginTime; 
            private String bucketName; 
            private String bucketPath; 
            private ClusterInfo clusterInfo; 
            private String clusterName; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceStatus; 
            private MeasureConfig measureConfig; 
            private Boolean openPublicNet; 
            private String packageType; 
            private Integer payType; 
            private String productCode; 
            private String regionId; 
            private String resourceGroupId; 
            private Long runningTime; 
            private String sgId; 
            private String templateVersion; 
            private String userConfig; 
            private String version; 
            private String vpcId; 
            private String vswId; 
            private String zoneId; 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
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
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * BucketPath.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
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
             * MeasureConfig.
             */
            public Builder measureConfig(MeasureConfig measureConfig) {
                this.measureConfig = measureConfig;
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
            public Builder runningTime(Long runningTime) {
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
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * UserConfig.
             */
            public Builder userConfig(String userConfig) {
                this.userConfig = userConfig;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
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
