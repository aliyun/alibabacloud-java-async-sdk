// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceTypesRequest</p>
 */
public class ListInstanceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsModification")
    private Boolean isModification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private ListInstanceTypesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.deployMode = builder.deployMode;
        this.instanceType = builder.instanceType;
        this.isModification = builder.isModification;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupType = builder.nodeGroupType;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.releaseVersion = builder.releaseVersion;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isModification
     */
    public Boolean getIsModification() {
        return this.isModification;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListInstanceTypesRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String deployMode; 
        private String instanceType; 
        private Boolean isModification; 
        private String nodeGroupId; 
        private String nodeGroupType; 
        private String paymentType; 
        private String regionId; 
        private String releaseVersion; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceTypesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
            this.deployMode = request.deployMode;
            this.instanceType = request.instanceType;
            this.isModification = request.isModification;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeGroupType = request.nodeGroupType;
            this.paymentType = request.paymentType;
            this.regionId = request.regionId;
            this.releaseVersion = request.releaseVersion;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>集群ID，仅升配场景使用。</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>创建的EMR集群类型。取值范围：</p>
         * <ul>
         * <li>DATALAKE：新版数据湖。</li>
         * <li>OLAP：数据分析。</li>
         * <li>DATAFLOW：实时数据流。</li>
         * <li>DATASERVING：数据服务。</li>
         * <li>CUSTOM：自定义集群。</li>
         * <li>HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>集群中的应用部署模式。取值范围：</p>
         * <ul>
         * <li>NORMAL：非高可用部署。集群1个MASTER节点。</li>
         * <li>HA：高可用部署。高可用部署要求至少3个MASTER节点。</li>
         * </ul>
         * <p>默认值：NORMAL。</p>
         * 
         * <strong>example:</strong>
         * <p>HA</p>
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * <p>机型</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>是否变配。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isModification(Boolean isModification) {
            this.putQueryParameter("IsModification", isModification);
            this.isModification = isModification;
            return this;
        }

        /**
         * <p>节点组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>G-F06C4B47966A****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>节点组类型。取值范围：</p>
         * <ul>
         * <li>MASTER：管理类型节点组。</li>
         * <li>CORE：存储类型节点组。</li>
         * <li>TASK：计算类型节点组。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CORE</p>
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.putQueryParameter("NodeGroupType", nodeGroupType);
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * <p>集群的付费类型。取值范围：</p>
         * <ul>
         * <li>PayAsYouGo：后付费。</li>
         * <li>Subscription：预付费。</li>
         * </ul>
         * <p>默认值：PayAsYouGo。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>EMR发行版。</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.3.0</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>可用区ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListInstanceTypesRequest build() {
            return new ListInstanceTypesRequest(this);
        } 

    } 

}
