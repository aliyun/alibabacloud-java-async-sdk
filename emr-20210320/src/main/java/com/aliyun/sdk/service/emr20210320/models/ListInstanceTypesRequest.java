// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceTypesRequest</p>
 */
public class ListInstanceTypesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("DeployMode")
    private String deployMode;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsModification")
    private Boolean isModification;

    @Query
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @Query
    @NameInMap("NodeGroupType")
    @Validation(required = true)
    private String nodeGroupType;

    @Query
    @NameInMap("PaymentType")
    @Validation(required = true)
    private String paymentType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseVersion")
    private String releaseVersion;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
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
         * 集群ID，仅升配场景使用。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 创建的EMR集群类型。取值范围：
         * <p>
         * - DATALAKE：新版数据湖。
         * - OLAP：数据分析。
         * - DATAFLOW：实时数据流。
         * - DATASERVING：数据服务。
         * - CUSTOM：自定义集群。
         * - HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 集群中的应用部署模式。取值范围：
         * <p>
         * - NORMAL：非高可用部署。集群1个MASTER节点。
         * - HA：高可用部署。高可用部署要求至少3个MASTER节点。
         * 
         * 默认值：NORMAL。
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * 机型
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 是否变配。
         */
        public Builder isModification(Boolean isModification) {
            this.putQueryParameter("IsModification", isModification);
            this.isModification = isModification;
            return this;
        }

        /**
         * 节点组ID。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点组类型。取值范围：
         * <p>
         * - MASTER：管理类型节点组。
         * - CORE：存储类型节点组。
         * - TASK：计算类型节点组。
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.putQueryParameter("NodeGroupType", nodeGroupType);
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * 集群的付费类型。取值范围：
         * <p>
         * - PayAsYouGo：后付费。
         * - Subscription：预付费。
         * 
         * 默认值：PayAsYouGo。
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EMR发行版。
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * 可用区ID。
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
