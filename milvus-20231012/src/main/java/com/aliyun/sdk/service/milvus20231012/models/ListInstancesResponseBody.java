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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The detailed information about the failed permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;milvus:xxxx&quot; }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to find instance c-123xxx</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCD-1234-5678-EFGH</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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

            private Builder() {
            } 

            private Builder(MilvusResourceInfoList model) {
                this.componentType = model.componentType;
                this.cuNum = model.cuNum;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
                this.replica = model.replica;
            } 

            /**
             * <p>The type of the component. Valid values:</p>
             * <ul>
             * <li>standalone</li>
             * <li>proxy</li>
             * <li>mix_coordinator</li>
             * <li>query</li>
             * <li>index</li>
             * <li>data</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standalone</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The number of CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

            /**
             * <p>The disk size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The disk type.</p>
             * 
             * <strong>example:</strong>
             * <p>essd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

            private Builder() {
            } 

            private Builder(ClusterInfo model) {
                this.attuPort = model.attuPort;
                this.internetUrl = model.internetUrl;
                this.intranetUrl = model.intranetUrl;
                this.milvusResourceInfoList = model.milvusResourceInfoList;
                this.proxyPort = model.proxyPort;
                this.totalCuNum = model.totalCuNum;
                this.totalDiskSize = model.totalDiskSize;
            } 

            /**
             * <p>The port of the Attu component.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder attuPort(Integer attuPort) {
                this.attuPort = attuPort;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>c-123xxx.milvus.aliyuncs.com</p>
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>c-123xxx-internal.milvus.aliyuncs.com</p>
             */
            public Builder intranetUrl(String intranetUrl) {
                this.intranetUrl = intranetUrl;
                return this;
            }

            /**
             * <p>The resource details.</p>
             */
            public Builder milvusResourceInfoList(java.util.List<MilvusResourceInfoList> milvusResourceInfoList) {
                this.milvusResourceInfoList = milvusResourceInfoList;
                return this;
            }

            /**
             * <p>The proxy port.</p>
             * 
             * <strong>example:</strong>
             * <p>19530</p>
             */
            public Builder proxyPort(Integer proxyPort) {
                this.proxyPort = proxyPort;
                return this;
            }

            /**
             * <p>The number of CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder totalCuNum(Integer totalCuNum) {
                this.totalCuNum = totalCuNum;
                return this;
            }

            /**
             * <p>The total capacity of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.tags = builder.tags;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoBackup = model.autoBackup;
                this.beginTime = model.beginTime;
                this.clusterInfo = model.clusterInfo;
                this.clusterName = model.clusterName;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.nodeType = model.nodeType;
                this.openPublicNet = model.openPublicNet;
                this.packageType = model.packageType;
                this.payType = model.payType;
                this.productCode = model.productCode;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runningTime = model.runningTime;
                this.sgId = model.sgId;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AutoBackup.
             */
            public Builder autoBackup(Boolean autoBackup) {
                this.autoBackup = autoBackup;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1718608505000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The instance details.</p>
             */
            public Builder clusterInfo(ClusterInfo clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>milvus-test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1721232000000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c-123xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the bastion host. Valid values:</p>
             * <ul>
             * <li>creating.</li>
             * <li>running.</li>
             * <li>updating. Cluster scaling (up/down), configuration changes, and enabling/disabling public network access.</li>
             * <li>disable. The cluster has expired and needs to be renewed for activation.</li>
             * <li>deleting.</li>
             * <li>deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
             * <p>Indicates whether Internet access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder openPublicNet(Boolean openPublicNet) {
                this.openPublicNet = openPublicNet;
                return this;
            }

            /**
             * <p>The specification details. Valid values:</p>
             * <ul>
             * <li>trial.</li>
             * <li>standard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>trial</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li>0: pay-as-you-go</li>
             * <li>1: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>milvus_milvuspre_public_cn</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The region code.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-123xxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>536611</p>
             */
            public Builder runningTime(Integer runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-123xxx</p>
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-123xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-123xxx</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
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
