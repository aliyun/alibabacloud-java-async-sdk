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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCloudAssetSummaryResponseBody model) {
            this.groupedFields = model.groupedFields;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Summary information of cloud assets.</p>
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
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

            private Builder() {
            } 

            private Builder(CloudAssetSummaryMetas model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.instanceCount = model.instanceCount;
                this.instanceRiskCount = model.instanceRiskCount;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Subtype of the cloud product</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>云产品的类型。取值：</p>
             * <ul>
             * <li><strong>0</strong>：云服务器 ECS</li>
             * <li><strong>1</strong>：负载均衡</li>
             * <li><strong>3</strong>：云数据库 RDS</li>
             * <li><strong>4</strong>：云数据库 MongoDB 版</li>
             * <li><strong>5</strong>：云数据库 Tair（兼容 Redis）</li>
             * <li><strong>6</strong>：容器镜像服务</li>
             * <li><strong>8</strong>：容器服务Kubernetes版</li>
             * <li><strong>9</strong>：专有网络VPC</li>
             * <li><strong>11</strong>：操作审计</li>
             * <li><strong>12</strong>：CDN</li>
             * <li><strong>13</strong>：数字证书管理服务（原SSL证书）</li>
             * <li><strong>14</strong>：云效</li>
             * <li><strong>15</strong>：访问控制</li>
             * <li><strong>16</strong>：DDoS防护</li>
             * <li><strong>17</strong>：Web应用防火墙</li>
             * <li><strong>18</strong>：对象存储</li>
             * <li><strong>19</strong>：云原生关系型数据库 PolarDB</li>
             * <li><strong>20</strong>：云数据库 PostgreSQL 版</li>
             * <li><strong>21</strong>：微服务引擎</li>
             * <li><strong>22</strong>：文件存储NAS</li>
             * <li><strong>23</strong>：数据安全中心</li>
             * <li><strong>24</strong>：弹性公网IP</li>
             * <li><strong>25</strong>：云身份服务-EIAM</li>
             * <li><strong>26</strong>：PolarDB-X</li>
             * <li><strong>27</strong>：Elasticsearch</li>
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
             * <p>Total number of this type of cloud product instances.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>Total number of risky instances for this type of cloud product.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instanceRiskCount(Integer instanceRiskCount) {
                this.instanceRiskCount = instanceRiskCount;
                return this;
            }

            /**
             * <p>服务器厂商。取值：</p>
             * <ul>
             * <li><strong>0</strong>：阿里云资产</li>
             * <li><strong>1</strong>：云外资产</li>
             * <li><strong>2</strong>：IDC资产</li>
             * <li><strong>3</strong>、<strong>4</strong>、<strong>5</strong>、<strong>7</strong>：其它云资产</li>
             * <li><strong>8</strong>：轻量级资产</li>
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
        private java.util.List<CloudAssetSummaryMetas> cloudAssetSummaryMetas;

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
        public java.util.List<CloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
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
            private java.util.List<CloudAssetSummaryMetas> cloudAssetSummaryMetas; 
            private Integer instanceCountTotal; 
            private Integer instanceRiskCountTotal; 

            private Builder() {
            } 

            private Builder(GroupedFields model) {
                this.cloudAssetSummaryMetas = model.cloudAssetSummaryMetas;
                this.instanceCountTotal = model.instanceCountTotal;
                this.instanceRiskCountTotal = model.instanceRiskCountTotal;
            } 

            /**
             * <p>List of cloud product statistics</p>
             */
            public Builder cloudAssetSummaryMetas(java.util.List<CloudAssetSummaryMetas> cloudAssetSummaryMetas) {
                this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
                return this;
            }

            /**
             * <p>Total number of cloud product instances.</p>
             * 
             * <strong>example:</strong>
             * <p>919</p>
             */
            public Builder instanceCountTotal(Integer instanceCountTotal) {
                this.instanceCountTotal = instanceCountTotal;
                return this;
            }

            /**
             * <p>Total number of cloud product instances at risk</p>
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
