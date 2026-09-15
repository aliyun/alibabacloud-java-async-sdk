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
 * {@link ListCloudAssetInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAssetInstancesRequest</p>
 */
public class ListCloudAssetInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetQueryData")
    private java.util.List<CloudAssetQueryData> cloudAssetQueryData;

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
    @com.aliyun.core.annotation.NameInMap("IsSaleData")
    private Boolean isSaleData;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private ListCloudAssetInstancesRequest(Builder builder) {
        super(builder);
        this.cloudAssetQueryData = builder.cloudAssetQueryData;
        this.cloudAssetTypes = builder.cloudAssetTypes;
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.isSaleData = builder.isSaleData;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return cloudAssetQueryData
     */
    public java.util.List<CloudAssetQueryData> getCloudAssetQueryData() {
        return this.cloudAssetQueryData;
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
     * @return isSaleData
     */
    public Boolean getIsSaleData() {
        return this.isSaleData;
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

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<ListCloudAssetInstancesRequest, Builder> {
        private java.util.List<CloudAssetQueryData> cloudAssetQueryData; 
        private java.util.List<CloudAssetTypes> cloudAssetTypes; 
        private String criteria; 
        private Integer currentPage; 
        private Boolean isSaleData; 
        private String logicalExp; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAssetInstancesRequest request) {
            super(request);
            this.cloudAssetQueryData = request.cloudAssetQueryData;
            this.cloudAssetTypes = request.cloudAssetTypes;
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.isSaleData = request.isSaleData;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The data list queried by keyword.</p>
         */
        public Builder cloudAssetQueryData(java.util.List<CloudAssetQueryData> cloudAssetQueryData) {
            this.putQueryParameter("CloudAssetQueryData", cloudAssetQueryData);
            this.cloudAssetQueryData = cloudAssetQueryData;
            return this;
        }

        /**
         * <p>The list of cloud asset instance types.</p>
         */
        public Builder cloudAssetTypes(java.util.List<CloudAssetTypes> cloudAssetTypes) {
            this.putQueryParameter("CloudAssetTypes", cloudAssetTypes);
            this.cloudAssetTypes = cloudAssetTypes;
            return this;
        }

        /**
         * <p>The search conditions for assets. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: The search item.</li>
         * <li><strong>value</strong>: The value of the search item.</li>
         * <li><strong>logicalExp</strong>: The logical relationship between multiple search item values. Valid values:<ul>
         * <li><strong>OR</strong>: The search item values are evaluated using the OR operator.</li>
         * <li><strong>AND</strong>: The search item values are evaluated using the AND operator.<blockquote>
         * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;internetIp\&quot;,\&quot;value\&quot;:\&quot;192.168\&quot;,\&quot;logicalExp\&quot;:\&quot;OR\&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query.</p>
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
         * <p>Specifies whether to return sale-related data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Returns sale-related data.</li>
         * <li><strong>false</strong>: Does not return sale-related data.</li>
         * </ul>
         */
        public Builder isSaleData(Boolean isSaleData) {
            this.putQueryParameter("IsSaleData", isSaleData);
            this.isSaleData = isSaleData;
            return this;
        }

        /**
         * <p>The logical relationship between multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions are evaluated using the OR operator.</li>
         * <li><strong>AND</strong>: The search conditions are evaluated using the AND operator.</li>
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
         * <p>The maximum number of entries per page. Maximum value: 100. Default value: 20.</p>
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

        /**
         * <p>The ID of the Alibaba Cloud account of the resource folder member accounts.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
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
    public static class CloudAssetQueryData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private CloudAssetQueryData(Builder builder) {
            this.data = builder.data;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetQueryData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String data; 
            private String operator; 

            private Builder() {
            } 

            private Builder(CloudAssetQueryData model) {
                this.data = model.data;
                this.operator = model.operator;
            } 

            /**
             * <p>The query content.</p>
             * 
             * <strong>example:</strong>
             * <p>163.8.8.9</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The query operator. Currently, only INCLUDE is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>INCLUDE</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public CloudAssetQueryData build() {
                return new CloudAssetQueryData(this);
            } 

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

            private Builder() {
            } 

            private Builder(CloudAssetTypes model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The subtype of the cloud service.</p>
             * <blockquote>
             * <p>For specific meanings, refer to the AssetSubType parameter in the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
             * </blockquote>
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
             * <blockquote>
             * <p>For specific meanings, refer to the AssetType parameter in the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The server vendor. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud asset</li>
             * <li><strong>1</strong>: Non-cloud asset</li>
             * <li><strong>2</strong>: IDC asset</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Third-party cloud asset</li>
             * <li><strong>8</strong>: Lightweight asset</li>
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
