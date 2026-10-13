// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InsertClusterRequest} extends {@link RequestModel}
 *
 * <p>InsertClusterRequest</p>
 */
public class InsertClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IaasProvider")
    private String iaasProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer networkMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldFactor")
    private Integer oversoldFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private InsertClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.iaasProvider = builder.iaasProvider;
        this.logicalRegionId = builder.logicalRegionId;
        this.networkMode = builder.networkMode;
        this.oversoldFactor = builder.oversoldFactor;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public Integer getClusterType() {
        return this.clusterType;
    }

    /**
     * @return iaasProvider
     */
    public String getIaasProvider() {
        return this.iaasProvider;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return networkMode
     */
    public Integer getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return oversoldFactor
     */
    public Integer getOversoldFactor() {
        return this.oversoldFactor;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<InsertClusterRequest, Builder> {
        private String clusterName; 
        private Integer clusterType; 
        private String iaasProvider; 
        private String logicalRegionId; 
        private Integer networkMode; 
        private Integer oversoldFactor; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(InsertClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.iaasProvider = request.iaasProvider;
            this.logicalRegionId = request.logicalRegionId;
            this.networkMode = request.networkMode;
            this.oversoldFactor = request.oversoldFactor;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The name of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****_product_test2</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>2: ECS cluster.</li>
         * <li>3: EDAS built-in Kubernetes cluster.</li>
         * <li>5: Kubernetes cluster.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The IaaS resource provider.</p>
         * <p><note>When you select Alibaba Cloud, you must use uppercase Pinyin, such as <code>ALIYUN</code>.</note></p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder iaasProvider(String iaasProvider) {
            this.putQueryParameter("IaasProvider", iaasProvider);
            this.iaasProvider = iaasProvider;
            return this;
        }

        /**
         * <p>The region ID of the custom namespace. Format: <code>physical region:custom namespace identifier</code>, such as <code>cn-hangzhou:test</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:td****</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>1: Classic network.</li>
         * <li>2: VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkMode(Integer networkMode) {
            this.putQueryParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The CPU overselling ratio for Docker clusters. Valid values:</p>
         * <ul>
         * <li>2: 1:2 ratio.</li>
         * <li>4: 1:4 ratio.</li>
         * <li>8: 1:8 ratio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder oversoldFactor(Integer oversoldFactor) {
            this.putQueryParameter("OversoldFactor", oversoldFactor);
            this.oversoldFactor = oversoldFactor;
            return this;
        }

        /**
         * <p>The ID of the VPC. This parameter is required if the network type is set to VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef6ob8mrlzv8x3q****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public InsertClusterRequest build() {
            return new InsertClusterRequest(this);
        } 

    } 

}
