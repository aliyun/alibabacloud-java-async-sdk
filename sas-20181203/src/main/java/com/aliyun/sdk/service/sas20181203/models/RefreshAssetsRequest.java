// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link RefreshAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshAssetsRequest</p>
 */
public class RefreshAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthIds")
    private java.util.List<Long> authIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetSubType")
    private Integer cloudAssetSubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetType")
    private Integer cloudAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private java.util.List<String> clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeIds")
    private java.util.List<String> scopeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    private RefreshAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
        this.authIds = builder.authIds;
        this.clientToken = builder.clientToken;
        this.cloudAssetSubType = builder.cloudAssetSubType;
        this.cloudAssetType = builder.cloudAssetType;
        this.clusterIds = builder.clusterIds;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.scopeIds = builder.scopeIds;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return authIds
     */
    public java.util.List<Long> getAuthIds() {
        return this.authIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudAssetSubType
     */
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    /**
     * @return cloudAssetType
     */
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

    /**
     * @return clusterIds
     */
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return scopeIds
     */
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<RefreshAssetsRequest, Builder> {
        private String assetType; 
        private java.util.List<Long> authIds; 
        private String clientToken; 
        private Integer cloudAssetSubType; 
        private Integer cloudAssetType; 
        private java.util.List<String> clusterIds; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<String> scopeIds; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
            this.authIds = request.authIds;
            this.clientToken = request.clientToken;
            this.cloudAssetSubType = request.cloudAssetSubType;
            this.cloudAssetType = request.cloudAssetType;
            this.clusterIds = request.clusterIds;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.scopeIds = request.scopeIds;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The asset type for synchronization. Default value: <strong>ecs</strong>. Valid values:</p>
         * <ul>
         * <li><strong>cloud_product</strong>: Cloud service</li>
         * <li><strong>ecs</strong>: Server</li>
         * <li><strong>container_image</strong>: Container image</li>
         * <li><strong>cloud_k8s</strong>: Multi-cloud Kubernetes clusters and nodes. If you specify this value, you must also specify Vendor and ClientToken. The API only accepts asynchronous tasks. You can call the GetCloudK8sSyncTask operation to query the result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_product</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The IDs of the authorization records. You can specify up to 1,000 IDs. This parameter is only used when AssetType is set to cloud_k8s. If you do not specify this parameter or specify an empty array, all available authorizations for the specified cloud provider under the current tenant are selected.</p>
         */
        public Builder authIds(java.util.List<Long> authIds) {
            this.putQueryParameter("AuthIds", authIds);
            this.authIds = authIds;
            return this;
        }

        /**
         * <p>The idempotency key that is 1 to 128 characters in length. This parameter is required when AssetType is set to cloud_k8s. For other asset types, this parameter is optional and validated by the backend based on specific conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-k8s-sync-example-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The subtype of the cloud service.</p>
         * <blockquote>
         * <p>For more information about valid values, see the following list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cloudAssetSubType(Integer cloudAssetSubType) {
            this.putQueryParameter("CloudAssetSubType", cloudAssetSubType);
            this.cloudAssetSubType = cloudAssetSubType;
            return this;
        }

        /**
         * <p>The type of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS) server</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>3</strong>: ApsaraDB RDS</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB</li>
         * <li><strong>5</strong>: Tair (Redis® OSS-Compatible)</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: Content Delivery Network (CDN)</li>
         * <li><strong>13</strong>: SSL Certificates Service</li>
         * <li><strong>14</strong>: Apsara DevOps</li>
         * <li><strong>15</strong>: Resource Access Management (RAM)</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: Apsara File Storage NAS</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cloudAssetType(Integer cloudAssetType) {
            this.putQueryParameter("CloudAssetType", cloudAssetType);
            this.cloudAssetType = cloudAssetType;
            return this;
        }

        /**
         * <p>The locators of the cloud provider clusters. You can specify up to 1,000 locators. This parameter is only used when AssetType is set to cloud_k8s. If you do not specify this parameter or specify an empty array, it indicates full coverage of the region.</p>
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is one of the resource directory member accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The regions of the cloud provider. You can specify up to 1,000 regions. This parameter is only used when AssetType is set to cloud_k8s. If you do not specify this parameter or specify an empty array, the regions are expanded by using the region API.</p>
         */
        public Builder scopeIds(java.util.List<String> scopeIds) {
            this.putQueryParameter("ScopeIds", scopeIds);
            this.scopeIds = scopeIds;
            return this;
        }

        /**
         * <p>The cloud provider of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud assets</li>
         * <li><strong>1</strong>: Assets outside Alibaba Cloud</li>
         * <li><strong>2</strong>: IDC assets</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: Assets on other cloud platforms</li>
         * <li><strong>8</strong>: Simple Application Server assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}
