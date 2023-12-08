// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudAssetInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAssetInstancesRequest</p>
 */
public class ListCloudAssetInstancesRequest extends Request {
    @Query
    @NameInMap("CloudAssetTypes")
    private java.util.List < CloudAssetTypes> cloudAssetTypes;

    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("LogicalExp")
    private String logicalExp;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
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
         * The details of the cloud asset.
         */
        public Builder cloudAssetTypes(java.util.List < CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **name**: the name of the search condition.
         * 
         * *   **value**: the value of the search condition.
         * 
         * *   **logicalExp**: the logical relation for multiple search conditions. Valid values:
         * 
         *     *   **OR**: The search conditions use a logical **OR**.
         *     *   **AND**: The search conditions use a logical **AND**.
         * 
         * > You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The logical relation for multiple search conditions. Valid values:
         * <p>
         * 
         * *   **OR**: The search conditions use a logical **OR**.
         * *   **AND**: The search conditions use a logical **AND**.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the instance.
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

    public static class CloudAssetTypes extends TeaModel {
        @NameInMap("AssetSubType")
        private Integer assetSubType;

        @NameInMap("AssetType")
        private Integer assetType;

        @NameInMap("Vendor")
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
             * The subtype of the cloud asset.
             * <p>
             * 
             * You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query the subtype of the cloud asset.
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * The type of the cloud asset.
             * <p>
             * 
             * You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query the cloud asset type.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The server type. Valid values:
             * <p>
             * 
             * *   **0**: a cloud asset provided by Alibaba Cloud
             * *   **1**: a cloud asset outside Alibaba Cloud
             * *   **2**: a cloud asset in a data center
             * *   **3**, **4**, **5**, and **7**: a cloud asset provided by a third-party service provider
             * *   **8**: a lightweight cloud asset
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
