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
 * {@link GetCloudAssetDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetDetailRequest</p>
 */
public class GetCloudAssetDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetSubType")
    private Integer assetSubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private Integer assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetInstances")
    private java.util.List<CloudAssetInstances> cloudAssetInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    private GetCloudAssetDetailRequest(Builder builder) {
        super(builder);
        this.assetSubType = builder.assetSubType;
        this.assetType = builder.assetType;
        this.cloudAssetInstances = builder.cloudAssetInstances;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return cloudAssetInstances
     */
    public java.util.List<CloudAssetInstances> getCloudAssetInstances() {
        return this.cloudAssetInstances;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetDetailRequest, Builder> {
        private Integer assetSubType; 
        private Integer assetType; 
        private java.util.List<CloudAssetInstances> cloudAssetInstances; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetDetailRequest request) {
            super(request);
            this.assetSubType = request.assetSubType;
            this.assetType = request.assetType;
            this.cloudAssetInstances = request.cloudAssetInstances;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The subtype of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder assetSubType(Integer assetSubType) {
            this.putQueryParameter("AssetSubType", assetSubType);
            this.assetSubType = assetSubType;
            return this;
        }

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS).</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB).</li>
         * <li><strong>3</strong>: ApsaraDB RDS.</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>5</strong>: ApsaraDB for Redis.</li>
         * <li><strong>6</strong>: Container Registry.</li>
         * <li><strong>8</strong>: Container Service for Kubernetes.</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC).</li>
         * <li><strong>11</strong>: ActionTrail.</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN (CDN).</li>
         * <li><strong>13</strong>: Certificate Management Service.</li>
         * <li><strong>14</strong>: Apsara Devops.</li>
         * <li><strong>15</strong>: Resource Access Management (RAM).</li>
         * <li><strong>16</strong>: Anti-DDoS.</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF).</li>
         * <li><strong>18</strong>: Object Storage Service (OSS).</li>
         * <li><strong>19</strong>: PolarDB.</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL.</li>
         * <li><strong>21</strong>: Microservices Engine (MSE).</li>
         * <li><strong>22</strong>: File Storage NAS (NAS).</li>
         * <li><strong>23</strong>: Data Security Center (DSC).</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP).</li>
         * <li><strong>25</strong>: Identity as a Service (IDaaS)-Employee Identity and Access Management (EIAM).</li>
         * <li><strong>26</strong>: PolarDB-X.</li>
         * <li><strong>27</strong>: Elasticsearch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder assetType(Integer assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The details of the assets.</p>
         */
        public Builder cloudAssetInstances(java.util.List<CloudAssetInstances> cloudAssetInstances) {
            this.putQueryParameter("CloudAssetInstances", cloudAssetInstances);
            this.cloudAssetInstances = cloudAssetInstances;
            return this;
        }

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud.</li>
         * <li><strong>1</strong>: service provider that is unrecognized.</li>
         * <li><strong>2</strong>: data center.</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: third-party service provider.</li>
         * <li><strong>8</strong>: simple application server.</li>
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
        public GetCloudAssetDetailRequest build() {
            return new GetCloudAssetDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetDetailRequest} extends {@link TeaModel}
     *
     * <p>GetCloudAssetDetailRequest</p>
     */
    public static class CloudAssetInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private CloudAssetInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(CloudAssetInstances model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance ID of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz9hf86vbzbrrde7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region in which the cloud asset resides.</p>
             * <blockquote>
             * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public CloudAssetInstances build() {
                return new CloudAssetInstances(this);
            } 

        } 

    }
}
