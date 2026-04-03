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
 * {@link ListKspmInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListKspmInstancesRequest</p>
 */
public class ListKspmInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List<CloudAssetTypes> cloudAssetTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListKspmInstancesRequest(Builder builder) {
        super(builder);
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKspmInstancesRequest create() {
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
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListKspmInstancesRequest, Builder> {
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private String criteria; 
        private Integer currentPage; 
        private String logicalExp; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListKspmInstancesRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>List of Kubernetes asset type information.</p>
         */
        public Builder cloudAssetTypes(java.util.List<CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>Set the conditions for searching assets. This parameter is in JSON format, and case sensitivity should be noted when entering parameters. It includes the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: Search item</li>
         * <li><strong>value</strong>: Value of the search item</li>
         * <li><strong>logicalExp</strong>: The relationship between search items when multiple conditions are used. Values:<ul>
         * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple conditions.</li>
         * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple conditions.<blockquote>
         * <p>Supports using region, instance name, instance ID, alarm status, risk status, and tag search conditions.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>Set which page to start displaying the query results from. The default value is 1, indicating that the display starts from the first page.</p>
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
         * <p>Set the logical relationship that takes effect between multiple search conditions. Values:</p>
         * <ul>
         * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple search conditions.</li>
         * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple search conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The maximum number of data entries displayed per page during pagination. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListKspmInstancesRequest build() {
            return new ListKspmInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListKspmInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListKspmInstancesRequest</p>
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
             * <p>Subtype of the product.
             * Asset type-subtype. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Workload<ul>
             * <li><strong>0</strong>: Pod</li>
             * <li><strong>1</strong>: DaemonSet</li>
             * <li><strong>2</strong>: StatefulSet</li>
             * </ul>
             * </li>
             * <li><strong>1</strong>: Service<ul>
             * <li><strong>0</strong>: Service</li>
             * </ul>
             * </li>
             * <li><strong>2</strong>: Namespace<ul>
             * <li><strong>0</strong>: Namespace</li>
             * </ul>
             * </li>
             * <li><strong>3</strong>: Authorization<ul>
             * <li><strong>0</strong>: Role</li>
             * <li><strong>1</strong>: ClusterRole</li>
             * <li><strong>2</strong>: ClusterRoleBinding</li>
             * <li><strong>3</strong>: RoleBinding</li>
             * <li><strong>4</strong>: ServiceAccount</li>
             * </ul>
             * </li>
             * <li><strong>4</strong>: Storage<ul>
             * <li><strong>0</strong>: PersistentVolume</li>
             * <li><strong>1</strong>: PersistentVolumeClaim</li>
             * <li><strong>2</strong>: StorageClass</li>
             * </ul>
             * </li>
             * <li><strong>5</strong>: Container<ul>
             * <li><strong>0</strong>: Image</li>
             * </ul>
             * </li>
             * <li><strong>6</strong>: Network<ul>
             * <li><strong>0</strong>: Route</li>
             * <li><strong>0</strong>: Ingress</li>
             * </ul>
             * </li>
             * <li><strong>7</strong>: Configuration<ul>
             * <li><strong>0</strong>: ConfigMap</li>
             * </ul>
             * </li>
             * <li><strong>8</strong>: Policies<ul>
             * <li><strong>0</strong>: LimitRanges</li>
             * <li><strong>1</strong>: ResourceQuota</li>
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
             * <p>Type of the asset. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Workload</li>
             * <li><strong>1</strong>: Service</li>
             * <li><strong>2</strong>: Namespace</li>
             * <li><strong>3</strong>: Authorization</li>
             * <li><strong>4</strong>: Storage</li>
             * <li><strong>5</strong>: Container</li>
             * <li><strong>6</strong>: Network</li>
             * <li><strong>7</strong>: Configuration</li>
             * <li><strong>8</strong>: Policies</li>
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
             * <p>Vendor of the asset. The fixed value is <strong>200</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
