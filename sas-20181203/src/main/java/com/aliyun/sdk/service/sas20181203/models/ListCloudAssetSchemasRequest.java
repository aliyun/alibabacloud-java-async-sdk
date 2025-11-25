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
 * {@link ListCloudAssetSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAssetSchemasRequest</p>
 */
public class ListCloudAssetSchemasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedDataOnly")
    private Boolean associatedDataOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List<CloudAssetTypes> cloudAssetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataNames")
    private java.util.List<String> dataNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    private ListCloudAssetSchemasRequest(Builder builder) {
        super(builder);
        this.associatedDataOnly = builder.associatedDataOnly;
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.currentPage = builder.currentPage;
        this.dataNames = builder.dataNames;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAssetSchemasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedDataOnly
     */
    public Boolean getAssociatedDataOnly() {
        return this.associatedDataOnly;
    }

    /**
     * @return cloudAssetTypes
     */
    public java.util.List<CloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataNames
     */
    public java.util.List<String> getDataNames() {
        return this.dataNames;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListCloudAssetSchemasRequest, Builder> {
        private Boolean associatedDataOnly; 
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private Integer currentPage; 
        private java.util.List<String> dataNames; 
        private String lang; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAssetSchemasRequest request) {
            super(request);
            this.associatedDataOnly = request.associatedDataOnly;
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.currentPage = request.currentPage;
            this.dataNames = request.dataNames;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Whether to filter out attributes that can be associated with other assets.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder associatedDataOnly(Boolean associatedDataOnly) {
            this.putQueryParameter("AssociatedDataOnly", associatedDataOnly);
            this.associatedDataOnly = associatedDataOnly;
            return this;
        }

        /**
         * <p>The types of cloud assets.</p>
         */
        public Builder cloudAssetTypes(java.util.List<CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>List of asset data names</p>
         */
        public Builder dataNames(java.util.List<String> dataNames) {
            this.putQueryParameter("DataNames", dataNames);
            this.dataNames = dataNames;
            return this;
        }

        /**
         * <p>The language type for requesting and receiving messages, with a default value of <strong>zh</strong>. The values can be: - <strong>zh</strong>: Chinese - <strong>en</strong>: English</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListCloudAssetSchemasRequest build() {
            return new ListCloudAssetSchemasRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAssetSchemasRequest} extends {@link TeaModel}
     *
     * <p>ListCloudAssetSchemasRequest</p>
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
             * <p>The subtype of the cloud service or asset. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: ECS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * <li><strong>1</strong>: disk (storage)</li>
             * <li><strong>2</strong>: security group</li>
             * </ul>
             * </li>
             * <li><p><strong>1</strong>: SLB</p>
             * <ul>
             * <li><strong>0</strong>: SLB</li>
             * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
             * </ul>
             * </li>
             * <li><p><strong>3</strong>: ApsaraDB RDS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>4</strong>: MongoDB</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>5</strong>: Redis</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>6</strong>: Container Registry</p>
             * <ul>
             * <li><strong>1</strong>: Enterprise Edition</li>
             * <li><strong>2</strong>: Personal Edition</li>
             * </ul>
             * </li>
             * <li><p><strong>8</strong>: ACK</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>9</strong>: VPC</p>
             * <ul>
             * <li><strong>0</strong>: NAT gateway</li>
             * <li><strong>1</strong>: Elastic IP address (EIP)</li>
             * <li><strong>2</strong>: VPN</li>
             * <li><strong>3</strong>: VPC Flow Logs</li>
             * </ul>
             * </li>
             * <li><p><strong>11</strong>: ActionTrail</p>
             * <ul>
             * <li><strong>0</strong>: trail</li>
             * </ul>
             * </li>
             * <li><p><strong>12</strong>: CDN</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</p>
             * <ul>
             * <li><strong>0</strong>: certificate</li>
             * </ul>
             * </li>
             * <li><p><strong>14</strong>: Apsara Devops</p>
             * <ul>
             * <li><strong>0</strong>: organization</li>
             * </ul>
             * </li>
             * <li><p><strong>16</strong>: Anti-DDoS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>17</strong>: WAF</p>
             * <ul>
             * <li><strong>0</strong>: domain name</li>
             * </ul>
             * </li>
             * <li><p><strong>18</strong>: OSS</p>
             * <ul>
             * <li><strong>0</strong>: bucket</li>
             * </ul>
             * </li>
             * <li><p><strong>19</strong>: PolarDB</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>20</strong>: ApsaraDB RDS for PostgreSQL</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>21</strong>: MSE</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>22</strong>: NAS</p>
             * <ul>
             * <li><strong>0</strong>: file system</li>
             * </ul>
             * </li>
             * <li><p><strong>23</strong>: DSC</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>24</strong>: EIP</p>
             * <ul>
             * <li><strong>0</strong>: Anycast EIP</li>
             * </ul>
             * </li>
             * <li><p><strong>25</strong>: IDaaS EIAM</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>26</strong>: PolarDB-X</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>27</strong>: Elasticsearch</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
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
             * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
             * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
             * <li><strong>3</strong>: ApsaraDB RDS</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB (MongoDB)</li>
             * <li><strong>5</strong>: ApsaraDB for Redis (Redis)</li>
             * <li><strong>6</strong>: Container Registry</li>
             * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
             * <li><strong>11</strong>: ActionTrail</li>
             * <li><strong>12</strong>: Alibaba Cloud CDN (CDN)</li>
             * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
             * <li><strong>14</strong>: Apsara Devops</li>
             * <li><strong>16</strong>: Anti-DDoS</li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
             * <li><strong>18</strong>: Object Storage Service (OSS)</li>
             * <li><strong>19</strong>: PolarDB</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
             * <li><strong>21</strong>: Microservices Engine (MSE)</li>
             * <li><strong>22</strong>: File Storage NAS (NAS)</li>
             * <li><strong>23</strong>: Data Security Center (DSC)</li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
             * <li><strong>25</strong>: IDaaS EIAM</li>
             * <li><strong>26</strong>: PolarDB-X</li>
             * <li><strong>27</strong>: Elasticsearch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The server type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a cloud asset outside Alibaba Cloud</li>
             * <li><strong>2</strong>: a cloud asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: a cloud asset provided by a third-party service provider</li>
             * <li><strong>8</strong>: a lightweight cloud asset</li>
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
