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
 * {@link GetCloudAssetCriteriaRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetCriteriaRequest</p>
 */
public class GetCloudAssetCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List<CloudAssetTypes> cloudAssetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetCloudAssetCriteriaRequest(Builder builder) {
        super(builder);
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetCriteriaRequest create() {
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetCriteriaRequest, Builder> {
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetCriteriaRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.value = request.value;
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
         * <p>The keyword for fuzzy search when you query the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>testwww</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public GetCloudAssetCriteriaRequest build() {
            return new GetCloudAssetCriteriaRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetCriteriaRequest} extends {@link TeaModel}
     *
     * <p>GetCloudAssetCriteriaRequest</p>
     */
    public static class CloudAssetTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        private CloudAssetTypes(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
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

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 

            private Builder() {
            } 

            private Builder(CloudAssetTypes model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
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
             * <p>2</p>
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
             * <p>9</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            public CloudAssetTypes build() {
                return new CloudAssetTypes(this);
            } 

        } 

    }
}
