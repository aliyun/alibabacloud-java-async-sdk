// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCloudAssetInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAssetInstancesRequest</p>
 */
public class ListCloudAssetInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetTypes")
    private java.util.List < CloudAssetTypes> cloudAssetTypes;

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

    private ListCloudAssetInstancesRequest(Builder builder) {
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

    public static ListCloudAssetInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssetTypes
     */
    public java.util.List < CloudAssetTypes> getCloudAssetTypes() {
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

    public static final class Builder extends Request.Builder<ListCloudAssetInstancesRequest, Builder> {
        private java.util.List < CloudAssetTypes> cloudAssetTypes; 
        private String criteria; 
        private Integer currentPage; 
        private String logicalExp; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAssetInstancesRequest request) {
            super(request);
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The details of the cloud asset.</p>
         */
        public Builder cloudAssetTypes(java.util.List < CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>name</strong>: the name of the search condition.</p>
         * </li>
         * <li><p><strong>value</strong>: the value of the search condition.</p>
         * </li>
         * <li><p><strong>logicalExp</strong>: the logical relation for multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;192.168&quot;,&quot;logicalExp&quot;:&quot;OR&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The logical relation for multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
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
         * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
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
         * <p>The region ID of the instance.</p>
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
        public ListCloudAssetInstancesRequest build() {
            return new ListCloudAssetInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAssetInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListCloudAssetInstancesRequest</p>
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

            /**
             * <p>The subtype of the cloud asset.</p>
             * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the subtype of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The type of the cloud asset.</p>
             * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the cloud asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
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
