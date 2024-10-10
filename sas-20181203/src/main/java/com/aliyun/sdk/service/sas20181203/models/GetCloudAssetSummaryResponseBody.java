// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCloudAssetSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetSummaryResponseBody</p>
 */
public class GetCloudAssetSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetSummaryResponseBody(Builder builder) {
        this.groupedFields = builder.groupedFields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedFields
     */
    public GroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupedFields groupedFields; 
        private String requestId; 

        /**
         * <p>The summary of cloud services.</p>
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudAssetSummaryResponseBody build() {
            return new GetCloudAssetSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAssetSummaryResponseBody</p>
     */
    public static class CloudAssetSummaryMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceRiskCount")
        private Integer instanceRiskCount;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private CloudAssetSummaryMetas(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.instanceCount = builder.instanceCount;
            this.instanceRiskCount = builder.instanceRiskCount;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetSummaryMetas create() {
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
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceRiskCount
         */
        public Integer getInstanceRiskCount() {
            return this.instanceRiskCount;
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
            private Integer instanceCount; 
            private Integer instanceRiskCount; 
            private Integer vendor; 

            /**
             * <p>The subtype of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The type of the cloud service. Valid values:</p>
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
             * <li><strong>15</strong>: Resource Access Management (RAM)</li>
             * <li><strong>16</strong>: Anti-DDoS</li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
             * <li><strong>18</strong>: Object Storage Service (OSS)</li>
             * <li><strong>19</strong>: PolarDB</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
             * <li><strong>21</strong>: Microservices Engine (MSE)</li>
             * <li><strong>22</strong>: Apsara File Storage NAS (NAS)</li>
             * <li><strong>23</strong>: Data Security Center (DSC)</li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
             * <li><strong>25</strong>: Identity as a Service (IDaaS) - Enterprise Identity Access Management (EIAM)</li>
             * <li><strong>26</strong>: PolarDB for Xscale (PolarDB-X)</li>
             * <li><strong>27</strong>: Elasticsearch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The total number of cloud service instances of this type.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The total number of cloud service instances that are at risk of this type.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instanceRiskCount(Integer instanceRiskCount) {
                this.instanceRiskCount = instanceRiskCount;
                return this;
            }

            /**
             * <p>The server type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset provided by a third-party service provider</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public CloudAssetSummaryMetas build() {
                return new CloudAssetSummaryMetas(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudAssetSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAssetSummaryResponseBody</p>
     */
    public static class GroupedFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAssetSummaryMetas")
        private java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas;

        @com.aliyun.core.annotation.NameInMap("InstanceCountTotal")
        private Integer instanceCountTotal;

        @com.aliyun.core.annotation.NameInMap("InstanceRiskCountTotal")
        private Integer instanceRiskCountTotal;

        private GroupedFields(Builder builder) {
            this.cloudAssetSummaryMetas = builder.cloudAssetSummaryMetas;
            this.instanceCountTotal = builder.instanceCountTotal;
            this.instanceRiskCountTotal = builder.instanceRiskCountTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedFields create() {
            return builder().build();
        }

        /**
         * @return cloudAssetSummaryMetas
         */
        public java.util.List < CloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
            return this.cloudAssetSummaryMetas;
        }

        /**
         * @return instanceCountTotal
         */
        public Integer getInstanceCountTotal() {
            return this.instanceCountTotal;
        }

        /**
         * @return instanceRiskCountTotal
         */
        public Integer getInstanceRiskCountTotal() {
            return this.instanceRiskCountTotal;
        }

        public static final class Builder {
            private java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas; 
            private Integer instanceCountTotal; 
            private Integer instanceRiskCountTotal; 

            /**
             * <p>The statistics of cloud services.</p>
             */
            public Builder cloudAssetSummaryMetas(java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas) {
                this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
                return this;
            }

            /**
             * <p>The total number of cloud service instances.</p>
             * 
             * <strong>example:</strong>
             * <p>919</p>
             */
            public Builder instanceCountTotal(Integer instanceCountTotal) {
                this.instanceCountTotal = instanceCountTotal;
                return this;
            }

            /**
             * <p>The total number of cloud service instances that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>544</p>
             */
            public Builder instanceRiskCountTotal(Integer instanceRiskCountTotal) {
                this.instanceRiskCountTotal = instanceRiskCountTotal;
                return this;
            }

            public GroupedFields build() {
                return new GroupedFields(this);
            } 

        } 

    }
}
