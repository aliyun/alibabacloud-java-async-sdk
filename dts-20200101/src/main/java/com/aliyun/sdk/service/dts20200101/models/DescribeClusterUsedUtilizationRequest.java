// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeClusterUsedUtilizationRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterUsedUtilizationRequest</p>
 */
public class DescribeClusterUsedUtilizationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerID")
    private String ownerID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeClusterUsedUtilizationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dtsJobId = builder.dtsJobId;
        this.env = builder.env;
        this.metricType = builder.metricType;
        this.ownerID = builder.ownerID;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterUsedUtilizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return ownerID
     */
    public String getOwnerID() {
        return this.ownerID;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeClusterUsedUtilizationRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String dedicatedClusterId; 
        private String dtsJobId; 
        private String env; 
        private String metricType; 
        private String ownerID; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterUsedUtilizationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.dtsJobId = request.dtsJobId;
            this.env = request.env;
            this.metricType = request.metricType;
            this.ownerID = request.ownerID;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter is discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the cluster. If the <strong>MetricType</strong> parameter is set to <strong>CLUSTER</strong>, enter the ID of the exclusive cluster. Otherwise, set this parameter to a node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nodeid</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putBodyParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The ID of the data migration or synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>k2gm967v16f****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putBodyParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The cluster environment. Default value: <strong>ALIYUN</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>Specifies whether to query the metrics of the cluster or a node. Default value: CLUSTER. Valid values:</p>
         * <ul>
         * <li><strong>CLUSTER</strong>: query the metrics of the cluster.</li>
         * <li><strong>NODE</strong>: query the metrics of a node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * OwnerID.
         */
        public Builder ownerID(String ownerID) {
            this.putBodyParameter("OwnerID", ownerID);
            this.ownerID = ownerID;
            return this;
        }

        /**
         * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putBodyParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeClusterUsedUtilizationRequest build() {
            return new DescribeClusterUsedUtilizationRequest(this);
        } 

    } 

}
