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
 * {@link GetCloudAssetSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetSummaryRequest</p>
 */
public class GetCloudAssetSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List<CloudAssetTypes> cloudAssetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSaleData")
    private Boolean isSaleData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<Integer> vendors;

    private GetCloudAssetSummaryRequest(Builder builder) {
        super(builder);
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.isSaleData = builder.isSaleData;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssetTypes
     */
    public java.util.List<CloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    /**
     * @return isSaleData
     */
    public Boolean getIsSaleData() {
        return this.isSaleData;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return vendors
     */
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetSummaryRequest, Builder> {
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private Boolean isSaleData; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<Integer> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetSummaryRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.isSaleData = request.isSaleData;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The list of asset type information for cloud assets.</p>
         */
        public Builder cloudAssetTypes(java.util.List<CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>Specifies whether to return sale-related data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Returns sale-related data.</li>
         * <li><strong>false</strong>: Does not return sale-related data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSaleData(Boolean isSaleData) {
            this.putQueryParameter("IsSaleData", isSaleData);
            this.isSaleData = isSaleData;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The list of cloud vendors to query.</p>
         */
        public Builder vendors(java.util.List<Integer> vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCloudAssetSummaryRequest build() {
            return new GetCloudAssetSummaryRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetSummaryRequest} extends {@link TeaModel}
     *
     * <p>GetCloudAssetSummaryRequest</p>
     */
    public static class CloudAssetTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private CloudAssetTypes(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetTypes create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(CloudAssetTypes model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The subtype of the cloud service. The asset type-subtype. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Elastic Compute Service (ECS) server<ul>
             * <li><strong>1</strong>: Cloud disk (storage)</li>
             * <li><strong>2</strong>: Security group</li>
             * <li><strong>100</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>1</strong>: Load balancing<ul>
             * <li><strong>0</strong>: Classic Load Balancer (CLB)</li>
             * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
             * </ul>
             * </li>
             * <li><strong>3</strong>: ApsaraDB RDS database<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB database<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>6</strong>: Container Registry<ul>
             * <li><strong>1</strong>: Enterprise Edition</li>
             * <li><strong>2</strong>: Personal Edition</li>
             * </ul>
             * </li>
             * <li><strong>8</strong>: Container Service for Kubernetes (ACK)<ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC)<ul>
             * <li><strong>0</strong>: NAT gateway</li>
             * <li><strong>1</strong>: EIP</li>
             * <li><strong>2</strong>: VPN</li>
             * <li><strong>3</strong>: FLOW_LOG</li>
             * </ul>
             * </li>
             * <li><strong>11</strong>: ActionTrail<ul>
             * <li><strong>0</strong>: Trail</li>
             * </ul>
             * </li>
             * <li><strong>12</strong>: CDN<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)<ul>
             * <li><strong>0</strong>: Certificate</li>
             * </ul>
             * </li>
             * <li><strong>14</strong>: Apsara Devops<ul>
             * <li><strong>0</strong>: Organization</li>
             * </ul>
             * </li>
             * <li><strong>16</strong>: Anti-DDoS<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)<ul>
             * <li><strong>0</strong>: Domain name</li>
             * </ul>
             * </li>
             * <li><strong>18</strong>: Object Storage Service (OSS)<ul>
             * <li><strong>0</strong>: Bucket</li>
             * </ul>
             * </li>
             * <li><strong>19</strong>: Cloud-native relational database PolarDB<ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>21</strong>: Microservices Engine (MSE)<ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>22</strong>: Apsara File Storage NAS<ul>
             * <li><strong>0</strong>: File system</li>
             * </ul>
             * </li>
             * <li><strong>23</strong>: Data Security Center (DSC)<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)<ul>
             * <li><strong>0</strong>: Anycast EIP</li>
             * </ul>
             * </li>
             * <li><strong>25</strong>: Alibaba Cloud IDaaS EIAM<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>26</strong>: PolarDB-X<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>27</strong>: Elasticsearch<ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Elastic Compute Service (ECS) server</li>
             * <li><strong>1</strong>: Load balancing</li>
             * <li><strong>3</strong>: ApsaraDB RDS database</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
             * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database</li>
             * <li><strong>6</strong>: Container Registry</li>
             * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
             * <li><strong>11</strong>: ActionTrail</li>
             * <li><strong>12</strong>: CDN</li>
             * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
             * <li><strong>14</strong>: Apsara Devops</li>
             * <li><strong>16</strong>: Anti-DDoS</li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
             * <li><strong>18</strong>: Object Storage Service (OSS)</li>
             * <li><strong>19</strong>: Cloud-native relational database PolarDB</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database</li>
             * <li><strong>21</strong>: Microservices Engine (MSE)</li>
             * <li><strong>22</strong>: Apsara File Storage NAS</li>
             * <li><strong>23</strong>: Data Security Center (DSC)</li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
             * <li><strong>25</strong>: Alibaba Cloud IDaaS EIAM</li>
             * <li><strong>26</strong>: PolarDB-X</li>
             * <li><strong>27</strong>: Elasticsearch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The server vendor. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud asset</li>
             * <li><strong>1</strong>: Non-cloud asset</li>
             * <li><strong>2</strong>: IDC asset</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other cloud asset</li>
             * <li><strong>8</strong>: Lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public CloudAssetTypes build() {
                return new CloudAssetTypes(this);
            } 

        } 

    }
}
