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
 * {@link ListCloudAssetSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAssetSchemasResponseBody</p>
 */
public class ListCloudAssetSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAssetSchemas")
    private java.util.List<CloudAssetSchemas> cloudAssetSchemas;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCloudAssetSchemasResponseBody(Builder builder) {
        this.cloudAssetSchemas = builder.cloudAssetSchemas;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAssetSchemasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssetSchemas
     */
    public java.util.List<CloudAssetSchemas> getCloudAssetSchemas() {
        return this.cloudAssetSchemas;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<CloudAssetSchemas> cloudAssetSchemas; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCloudAssetSchemasResponseBody model) {
            this.cloudAssetSchemas = model.cloudAssetSchemas;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>List of asset structure definitions</p>
         */
        public Builder cloudAssetSchemas(java.util.List<CloudAssetSchemas> cloudAssetSchemas) {
            this.cloudAssetSchemas = cloudAssetSchemas;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Values: </p>
         * <ul>
         * <li><strong>true</strong>: The call was successful. </li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudAssetSchemasResponseBody build() {
            return new ListCloudAssetSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAssetSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetSchemasResponseBody</p>
     */
    public static class CloudAssetSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("DataName")
        private String dataName;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private CloudAssetSchemas(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.dataName = builder.dataName;
            this.properties = builder.properties;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetSchemas create() {
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
         * @return dataName
         */
        public String getDataName() {
            return this.dataName;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
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
            private String dataName; 
            private String properties; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(CloudAssetSchemas model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.dataName = model.dataName;
                this.properties = model.properties;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Subtype of the cloud product.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetSubType(Integer assetSubType) {
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
             * <p>0</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>Asset structure definition name</p>
             * 
             * <strong>example:</strong>
             * <p>ACS_ECS_Disk</p>
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * <p>Current asset structure definition text.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;associatedData&quot;:[{&quot;assetSubType&quot;:100,&quot;assetType&quot;:0,&quot;dataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;properties&quot;:[{&quot;name&quot;:&quot;InstanceId&quot;,&quot;path&quot;:&quot;InstanceId&quot;}],&quot;vendor&quot;:0}],&quot;description&quot;:&quot;The ID of the instance to which the disk is attached.&quot;,&quot;example&quot;:&quot;i-bp67acfmxazb4q****&quot;,&quot;name&quot;:&quot;InstanceId&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;withAssociatedData&quot;:true},{&quot;description&quot;:&quot;Disk name&quot;,&quot;example&quot;:&quot;testDiskName&quot;,&quot;name&quot;:&quot;DiskName&quot;,&quot;type&quot;:&quot;STRING&quot;},{&quot;description&quot;:&quot;Only encrypted disks&quot;,&quot;example&quot;:&quot;false&quot;,&quot;name&quot;:&quot;Encrypted&quot;,&quot;type&quot;:&quot;BOOLEAN&quot;},{&quot;description&quot;:&quot;Disk status&quot;,&quot;example&quot;:&quot;In_use&quot;,&quot;name&quot;:&quot;Status&quot;,&quot;type&quot;:&quot;STRING&quot;},{&quot;description&quot;:&quot;Disk category&quot;,&quot;example&quot;:&quot;cloud_ssd&quot;,&quot;name&quot;:&quot;Category&quot;,&quot;type&quot;:&quot;STRING&quot;},{&quot;description&quot;:&quot;Disk type&quot;,&quot;example&quot;:&quot;system&quot;,&quot;name&quot;:&quot;Type&quot;,&quot;type&quot;:&quot;STRING&quot;},{&quot;description&quot;:&quot;Specifies whether to set an automatic snapshot policy for the disk.&quot;,&quot;example&quot;:&quot;false&quot;,&quot;name&quot;:&quot;EnableAutomatedSnapshotPolicy&quot;,&quot;type&quot;:&quot;BOOLEAN&quot;},{&quot;description&quot;:&quot;The ID of the automatic snapshot policy.&quot;,&quot;example&quot;:&quot;sp-bp67acfmxazb4p****&quot;,&quot;name&quot;:&quot;AutoSnapshotPolicyId&quot;,&quot;type&quot;:&quot;STRING&quot;},{&quot;description&quot;:&quot;Disk, local disk, or elastic ephemeral disk ID&quot;,&quot;example&quot;:&quot;d-bp18um4r4f2fve24****&quot;,&quot;name&quot;:&quot;DiskId&quot;,&quot;type&quot;:&quot;STRING&quot;}]</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The source of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: a third-party cloud server</li>
             * <li><strong>2</strong>: a server in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public CloudAssetSchemas build() {
                return new CloudAssetSchemas(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAssetSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetSchemasResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>54</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
