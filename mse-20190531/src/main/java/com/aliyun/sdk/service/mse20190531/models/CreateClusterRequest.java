// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterSpecification")
    @Validation(required = true)
    private String clusterSpecification;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("ClusterVersion")
    @Validation(required = true)
    private String clusterVersion;

    @Query
    @NameInMap("ConnectionType")
    private String connectionType;

    @Query
    @NameInMap("DiskType")
    private String diskType;

    @Query
    @NameInMap("InstanceCount")
    @Validation(required = true)
    private Integer instanceCount;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    @Query
    @NameInMap("NetType")
    @Validation(required = true)
    private String netType;

    @Query
    @NameInMap("PrivateSlbSpecification")
    private String privateSlbSpecification;

    @Query
    @NameInMap("PubNetworkFlow")
    private String pubNetworkFlow;

    @Query
    @NameInMap("PubSlbSpecification")
    private String pubSlbSpecification;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterSpecification = builder.clusterSpecification;
        this.clusterType = builder.clusterType;
        this.clusterVersion = builder.clusterVersion;
        this.connectionType = builder.connectionType;
        this.diskType = builder.diskType;
        this.instanceCount = builder.instanceCount;
        this.instanceName = builder.instanceName;
        this.mseSessionId = builder.mseSessionId;
        this.mseVersion = builder.mseVersion;
        this.netType = builder.netType;
        this.privateSlbSpecification = builder.privateSlbSpecification;
        this.pubNetworkFlow = builder.pubNetworkFlow;
        this.pubSlbSpecification = builder.pubSlbSpecification;
        this.region = builder.region;
        this.requestPars = builder.requestPars;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterSpecification
     */
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return privateSlbSpecification
     */
    public String getPrivateSlbSpecification() {
        return this.privateSlbSpecification;
    }

    /**
     * @return pubNetworkFlow
     */
    public String getPubNetworkFlow() {
        return this.pubNetworkFlow;
    }

    /**
     * @return pubSlbSpecification
     */
    public String getPubSlbSpecification() {
        return this.pubSlbSpecification;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String acceptLanguage; 
        private String clusterSpecification; 
        private String clusterType; 
        private String clusterVersion; 
        private String connectionType; 
        private String diskType; 
        private Integer instanceCount; 
        private String instanceName; 
        private String mseSessionId; 
        private String mseVersion; 
        private String netType; 
        private String privateSlbSpecification; 
        private String pubNetworkFlow; 
        private String pubSlbSpecification; 
        private String region; 
        private String requestPars; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterSpecification = request.clusterSpecification;
            this.clusterType = request.clusterType;
            this.clusterVersion = request.clusterVersion;
            this.connectionType = request.connectionType;
            this.diskType = request.diskType;
            this.instanceCount = request.instanceCount;
            this.instanceName = request.instanceName;
            this.mseSessionId = request.mseSessionId;
            this.mseVersion = request.mseVersion;
            this.netType = request.netType;
            this.privateSlbSpecification = request.privateSlbSpecification;
            this.pubNetworkFlow = request.pubNetworkFlow;
            this.pubSlbSpecification = request.pubSlbSpecification;
            this.region = request.region;
            this.requestPars = request.requestPars;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterSpecification.
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * ClusterVersion.
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * ConnectionType.
         */
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * DiskType.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * 用于区分基础/专业版本
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * PrivateSlbSpecification.
         */
        public Builder privateSlbSpecification(String privateSlbSpecification) {
            this.putQueryParameter("PrivateSlbSpecification", privateSlbSpecification);
            this.privateSlbSpecification = privateSlbSpecification;
            return this;
        }

        /**
         * PubNetworkFlow.
         */
        public Builder pubNetworkFlow(String pubNetworkFlow) {
            this.putQueryParameter("PubNetworkFlow", pubNetworkFlow);
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        /**
         * PubSlbSpecification.
         */
        public Builder pubSlbSpecification(String pubSlbSpecification) {
            this.putQueryParameter("PubSlbSpecification", pubSlbSpecification);
            this.pubSlbSpecification = pubSlbSpecification;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 标签列表，最多包含20个子项
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
