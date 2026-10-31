// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListQualityTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListQualityTemplatesRequest</p>
 */
public class ListQualityTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListQualityTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListQualityTemplatesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The paged query conditions.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListQualityTemplatesRequest build() {
            return new ListQualityTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityTemplatesRequest} extends {@link TeaModel}
     *
     * <p>ListQualityTemplatesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogList")
        private java.util.List<String> catalogList;

        @com.aliyun.core.annotation.NameInMap("CurrentUserOwned")
        private Boolean currentUserOwned;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SupportDataSourceTypeList")
        private java.util.List<String> supportDataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("TemplateOwnerList")
        private java.util.List<String> templateOwnerList;

        @com.aliyun.core.annotation.NameInMap("TemplateSourceList")
        private java.util.List<String> templateSourceList;

        @com.aliyun.core.annotation.NameInMap("TemplateTypeList")
        private java.util.List<String> templateTypeList;

        @com.aliyun.core.annotation.NameInMap("WatchTypeList")
        private java.util.List<String> watchTypeList;

        private ListQuery(Builder builder) {
            this.catalogList = builder.catalogList;
            this.currentUserOwned = builder.currentUserOwned;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.supportDataSourceTypeList = builder.supportDataSourceTypeList;
            this.templateOwnerList = builder.templateOwnerList;
            this.templateSourceList = builder.templateSourceList;
            this.templateTypeList = builder.templateTypeList;
            this.watchTypeList = builder.watchTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return catalogList
         */
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        /**
         * @return currentUserOwned
         */
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return supportDataSourceTypeList
         */
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        /**
         * @return templateOwnerList
         */
        public java.util.List<String> getTemplateOwnerList() {
            return this.templateOwnerList;
        }

        /**
         * @return templateSourceList
         */
        public java.util.List<String> getTemplateSourceList() {
            return this.templateSourceList;
        }

        /**
         * @return templateTypeList
         */
        public java.util.List<String> getTemplateTypeList() {
            return this.templateTypeList;
        }

        /**
         * @return watchTypeList
         */
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

        public static final class Builder {
            private java.util.List<String> catalogList; 
            private Boolean currentUserOwned; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> supportDataSourceTypeList; 
            private java.util.List<String> templateOwnerList; 
            private java.util.List<String> templateSourceList; 
            private java.util.List<String> templateTypeList; 
            private java.util.List<String> watchTypeList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.catalogList = model.catalogList;
                this.currentUserOwned = model.currentUserOwned;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.supportDataSourceTypeList = model.supportDataSourceTypeList;
                this.templateOwnerList = model.templateOwnerList;
                this.templateSourceList = model.templateSourceList;
                this.templateTypeList = model.templateTypeList;
                this.watchTypeList = model.watchTypeList;
            } 

            /**
             * <p>The rule types. Valid values:</p>
             * <ul>
             * <li>CONSISTENT: Consistency.</li>
             * <li>EFFECTIVE: Effectiveness.</li>
             * <li>TIMELINESE: Timeliness.</li>
             * <li>ACCURATE: Accuracy.</li>
             * <li>UNIQUENESS: Uniqueness.</li>
             * <li>COMPLETENESS: Completeness.</li>
             * <li>STABILITY: Stability.</li>
             * <li>CUSTOM: Custom.</li>
             * </ul>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * <p>Specifies whether the template is owned by the current user.</p>
             */
            public Builder currentUserOwned(Boolean currentUserOwned) {
                this.currentUserOwned = currentUserOwned;
                return this;
            }

            /**
             * <p>The search keyword filter, which supports template names.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The supported data source types, such as MAX_COMPUTE, MYSQL, and HIVE.</p>
             */
            public Builder supportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
                this.supportDataSourceTypeList = supportDataSourceTypeList;
                return this;
            }

            /**
             * <p>The template owners.</p>
             */
            public Builder templateOwnerList(java.util.List<String> templateOwnerList) {
                this.templateOwnerList = templateOwnerList;
                return this;
            }

            /**
             * <p>The template sources. Valid values:</p>
             * <ul>
             * <li>SYSTEM: System template.</li>
             * <li>CUSTOM: Custom template.</li>
             * </ul>
             */
            public Builder templateSourceList(java.util.List<String> templateSourceList) {
                this.templateSourceList = templateSourceList;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li>FIELD_NULL_VALUE_VALIDATE: Field null value check.</li>
             * <li>FIELD_EMPTY_STRING_VALIDATE: Field empty character check.</li>
             * <li>FIELD_UNIQUE_VALIDATE: Field uniqueness check.</li>
             * <li>FIELD_GROUP_COUNT_VALIDATE: Field unique value count check.</li>
             * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: Field duplicate value count check.</li>
             * <li>FUNCTION_TIME_COMPARE: Time function comparison.</li>
             * <li>SINGLE_TABLE_TIME_COMPARE: Non-partitioned table time field comparison.</li>
             * <li>DOUBLE_TABLE_TIME_COMPARE: Two-table time field comparison.</li>
             * <li>FIELD_FORMAT_VALIDATE: Field format check.</li>
             * <li>FIELD_LENGTH_VALIDATE: Field length check.</li>
             * <li>FIELD_VALUE_RANGE_VALIDATE: Field value range check.</li>
             * <li>CODE_TABLE_COMPARE: Lookup table reference comparison.</li>
             * <li>STANDARD_CODE_TABLE_COMPARE: Data standard lookup table reference comparison.</li>
             * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: Non-partitioned table field value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: Non-partitioned table field statistical value consistency comparison.</li>
             * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: Non-partitioned table field business logic consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: Two-table field value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Two-table field statistical value consistency comparison.</li>
             * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: Cross-source two-table field statistical value consistency comparison.</li>
             * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: Two-table field business logic consistency comparison.</li>
             * <li>TABLE_STABILITY_VALIDATE: Table stability check.</li>
             * <li>TABLE_FLUCTUATION_VALIDATE: Table fluctuation check.</li>
             * <li>FIELD_STABILITY_VALIDATE: Field stability check.</li>
             * <li>FIELD_FLUCTUATION_VALIDATE: Field fluctuation check.</li>
             * <li>CUSTOM_STATISTICAL_VALIDATE: Custom statistical metric check.</li>
             * <li>CUSTOM_DATA_DETAILS_VALIDATE: Custom data details check.</li>
             * <li>DATASOURCE_AVAILABLE_CHECK: Data source connectivity monitoring.</li>
             * <li>TABLE_SCHEMA_CHECK: Table schema change monitoring.</li>
             * <li>REAL_TIME_OFFLINE_COMPARE: Real-time and offline comparison.</li>
             * <li>REAL_TIME_STATISTICAL_VALIDATE: Real-time statistical value monitoring.</li>
             * <li>REAL_TIME_MULTI_CHAIN_COMPARE: Real-time multi-link comparison.</li>
             * </ul>
             */
            public Builder templateTypeList(java.util.List<String> templateTypeList) {
                this.templateTypeList = templateTypeList;
                return this;
            }

            /**
             * <p>The monitored object types. Valid values:</p>
             * <ul>
             * <li>TABLE: Dataphin table.</li>
             * <li>DATASOURCE_TABLE: Global table.</li>
             * <li>DATASOURCE: Data source.</li>
             * <li>INDEX: Metric.</li>
             * <li>REALTIME_LOGICAL_TABLE: Real-time metadata table.</li>
             * </ul>
             */
            public Builder watchTypeList(java.util.List<String> watchTypeList) {
                this.watchTypeList = watchTypeList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
