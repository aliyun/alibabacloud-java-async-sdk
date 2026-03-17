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
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<Integer> vendors;

    private GetCloudAssetSummaryRequest(Builder builder) {
        super(builder);
        this.cloudAssetTypes = builder.cloudAssetTypes;
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
     * @return vendors
     */
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetSummaryRequest, Builder> {
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private java.util.List<Integer> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetSummaryRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.vendors = request.vendors;
        } 

        /**
         * <p>List of asset type information for cloud assets</p>
         */
        public Builder cloudAssetTypes(java.util.List<CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>List of cloud vendors to be queried.</p>
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
             * <p>Subtypes of cloud products. Asset type-subtype. Values:</p>
             * <ul>
             * <li><strong>0</strong>: ECS (Elastic Compute Service)<ul>
             * <li><strong>1</strong>: Disk (Storage)</li>
             * <li><strong>2</strong>: Security Group</li>
             * <li><strong>100</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>1</strong>: Load Balancer <ul>
             * <li><strong>0</strong>: Load Balancer </li>
             * <li><strong>1</strong>: Application Load Balancer</li>
             * </ul>
             * </li>
             * <li><strong>3</strong>: ApsaraDB RDS <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>5</strong>: ApsaraDB Tair (Redis Compatible) <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>6</strong>: Container Registry <ul>
             * <li><strong>1</strong>: Enterprise Edition </li>
             * <li><strong>2</strong>: Personal Edition</li>
             * </ul>
             * </li>
             * <li><strong>8</strong>: Container Service for Kubernetes <ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC) <ul>
             * <li><strong>0</strong>: NAT Gateway </li>
             * <li><strong>1</strong>: EIP (Elastic IP) </li>
             * <li><strong>2</strong>: VPN </li>
             * <li><strong>3</strong>: FLOW_LOG</li>
             * </ul>
             * </li>
             * <li><strong>11</strong>: ActionTrail <ul>
             * <li><strong>0</strong>: Trail</li>
             * </ul>
             * </li>
             * <li><strong>12</strong>: CDN <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>13</strong>: Digital Certificate Management Service (formerly SSL Certificates) <ul>
             * <li><strong>0</strong>: Certificate</li>
             * </ul>
             * </li>
             * <li><strong>14</strong>: DevOps <ul>
             * <li><strong>0</strong>: Organization</li>
             * </ul>
             * </li>
             * <li><strong>16</strong>: DDoS Protection <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>17</strong>: Web Application Firewall <ul>
             * <li><strong>0</strong>: Domain</li>
             * </ul>
             * </li>
             * <li><strong>18</strong>: Object Storage <ul>
             * <li><strong>0</strong>: Bucket</li>
             * </ul>
             * </li>
             * <li><strong>19</strong>: PolarDB (Cloud-Native Relational Database) <ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>20</strong>: ApsaraDB for PostgreSQL <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>21</strong>: Microservices Engine <ul>
             * <li><strong>0</strong>: Cluster</li>
             * </ul>
             * </li>
             * <li><strong>22</strong>: File Storage NAS <ul>
             * <li><strong>0</strong>: File System</li>
             * </ul>
             * </li>
             * <li><strong>23</strong>: Data Security Center <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>24</strong>: Elastic Public IP <ul>
             * <li><strong>0</strong>: Anycast Elastic Public IP</li>
             * </ul>
             * </li>
             * <li><strong>25</strong>: Cloud Identity Service - EIAM <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>26</strong>: PolarDB-X <ul>
             * <li><strong>0</strong>: Instance</li>
             * </ul>
             * </li>
             * <li><strong>27</strong>: Elasticsearch <ul>
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
             * <p>The type of asset. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Elastic Compute Service (ECS) </li>
             * <li><strong>1</strong>: Load Balancer </li>
             * <li><strong>3</strong>: ApsaraDB for RDS </li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB </li>
             * <li><strong>5</strong>: ApsaraDB for Tair (Redis compatible) </li>
             * <li><strong>6</strong>: Container Registry </li>
             * <li><strong>8</strong>: Container Service for Kubernetes </li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC) </li>
             * <li><strong>11</strong>: ActionTrail </li>
             * <li><strong>12</strong>: Content Delivery Network (CDN) </li>
             * <li><strong>13</strong>: SSL Certificates (now known as Certificate Management Service) </li>
             * <li><strong>14</strong>: DevOps </li>
             * <li><strong>16</strong>: DDoS Protection </li>
             * <li><strong>17</strong>: Web Application Firewall </li>
             * <li><strong>18</strong>: Object Storage Service (OSS) </li>
             * <li><strong>19</strong>: PolarDB </li>
             * <li><strong>20</strong>: ApsaraDB for PostgreSQL </li>
             * <li><strong>21</strong>: Microservices Engine </li>
             * <li><strong>22</strong>: File Storage NAS </li>
             * <li><strong>23</strong>: Data Security Center </li>
             * <li><strong>24</strong>: Elastic IP Address </li>
             * <li><strong>25</strong>: Cloud Identity Service - EIAM </li>
             * <li><strong>26</strong>: PolarDB-X </li>
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
             * <p>Server vendor. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud Asset </li>
             * <li><strong>1</strong>: Non-cloud Asset </li>
             * <li><strong>2</strong>: IDC Asset </li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other Cloud Assets </li>
             * <li><strong>8</strong>: Lightweight Asset</li>
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
