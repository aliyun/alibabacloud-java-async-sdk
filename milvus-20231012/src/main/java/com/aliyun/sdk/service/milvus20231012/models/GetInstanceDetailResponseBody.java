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

        private Builder() {
        } 

        private Builder(GetInstanceDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
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

        public GetInstanceDetailResponseBody build() {
            return new GetInstanceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
    public static class MilvusResourceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("CuNum")
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("CuRatio")
        private Integer cuRatio;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        private MilvusResourceInfoList(Builder builder) {
            this.componentType = builder.componentType;
            this.cuNum = builder.cuNum;
            this.cuRatio = builder.cuRatio;
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
         * @return cuRatio
         */
        public Integer getCuRatio() {
            return this.cuRatio;
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
            private Integer cuRatio; 
            private Integer diskSize; 
            private String diskType; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(MilvusResourceInfoList model) {
                this.componentType = model.componentType;
                this.cuNum = model.cuNum;
                this.cuRatio = model.cuRatio;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
                this.replica = model.replica;
            } 

            /**
             * <p>The component type. Valid values:</p>
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
             * <p>QueryNode</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The number of CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

            /**
             * CuRatio.
             */
            public Builder cuRatio(Integer cuRatio) {
                this.cuRatio = cuRatio;
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
             * <p>2</p>
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
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
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
        public java.util.List<MilvusResourceInfoList> getMilvusResourceInfoList() {
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
            private java.util.List<MilvusResourceInfoList> milvusResourceInfoList; 
            private String ossStorageSize; 
            private Long ossStorageTimestamp; 
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
                this.ossStorageSize = model.ossStorageSize;
                this.ossStorageTimestamp = model.ossStorageTimestamp;
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
             * <p>c-123xxx-.milvus.aliyuncs.com</p>
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * <p>The internal IP address.</p>
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
             * <p>The size of the data stored in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>125.15 GB</p>
             */
            public Builder ossStorageSize(String ossStorageSize) {
                this.ossStorageSize = ossStorageSize;
                return this;
            }

            /**
             * <p>The timestamp when the OSS metric is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>1718604000000</p>
             */
            public Builder ossStorageTimestamp(Long ossStorageTimestamp) {
                this.ossStorageTimestamp = ossStorageTimestamp;
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
             * <p>The total number of CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder totalCuNum(Integer totalCuNum) {
                this.totalCuNum = totalCuNum;
                return this;
            }

            /**
             * <p>The total number of disks.</p>
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
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(MeasureConfig model) {
                this.dataNodeCuNum = model.dataNodeCuNum;
                this.dataNodeReplica = model.dataNodeReplica;
                this.indexNodeCuNum = model.indexNodeCuNum;
                this.indexNodeReplica = model.indexNodeReplica;
                this.mixCoodinatorNodeCuNum = model.mixCoodinatorNodeCuNum;
                this.mixCoodinatorNodeReplica = model.mixCoodinatorNodeReplica;
                this.proxyNodeCuNum = model.proxyNodeCuNum;
                this.proxyNodeReplica = model.proxyNodeReplica;
                this.queryNodeCuNum = model.queryNodeCuNum;
                this.queryNodeReplica = model.queryNodeReplica;
            } 

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
    /**
     * 
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
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
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("EnableHa")
        private Boolean enableHa;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("MeasureConfig")
        private MeasureConfig measureConfig;

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
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.enableHa = builder.enableHa;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.measureConfig = builder.measureConfig;
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
         * @return enableHa
         */
        public Boolean getEnableHa() {
            return this.enableHa;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private Boolean enableHa; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceStatus; 
            private MeasureConfig measureConfig; 
            private String nodeType; 
            private Boolean openPublicNet; 
            private String packageType; 
            private Integer payType; 
            private String productCode; 
            private String regionId; 
            private String resourceGroupId; 
            private Long runningTime; 
            private String sgId; 
            private java.util.List<Tags> tags; 
            private String templateVersion; 
            private String userConfig; 
            private String version; 
            private String vpcId; 
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aclId = model.aclId;
                this.beginTime = model.beginTime;
                this.bucketName = model.bucketName;
                this.bucketPath = model.bucketPath;
                this.clusterInfo = model.clusterInfo;
                this.clusterName = model.clusterName;
                this.enableHa = model.enableHa;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.measureConfig = model.measureConfig;
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
                this.templateVersion = model.templateVersion;
                this.userConfig = model.userConfig;
                this.version = model.version;
                this.vpcId = model.vpcId;
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>AclId for Public Network Access Control.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-123xxx</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1716863508000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>milvus-test</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The address of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&path=milvus-c-123xxxx">https://oss.console.aliyun.com/bucket/oss-cn-beijing/xxxx/object?spm=a2cug.25127996.0.0.577990370Ebsqt&amp;path=milvus-c-123xxxx</a></p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
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
             * <p>aliyun-test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * EnableHa.
             */
            public Builder enableHa(Boolean enableHa) {
                this.enableHa = enableHa;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1721664000000</p>
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
             * <p>The instance status. Valid values:</p>
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
             * MeasureConfig.
             */
            public Builder measureConfig(MeasureConfig measureConfig) {
                this.measureConfig = measureConfig;
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
             * <p>standard</p>
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
             * <p>1743679</p>
             */
            public Builder runningTime(Long runningTime) {
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
             * <p>The version of the software stack.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4.1-1.0-0.0.1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>User-defined configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>dataCoord:\n  segment:\n    maxSize: 1024</p>
             */
            public Builder userConfig(String userConfig) {
                this.userConfig = userConfig;
                return this;
            }

            /**
             * <p>The kernel version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4</p>
             */
            public Builder version(String version) {
                this.version = version;
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
