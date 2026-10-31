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
 * {@link ListQualityRuleTasksRequest} extends {@link RequestModel}
 *
 * <p>ListQualityRuleTasksRequest</p>
 */
public class ListQualityRuleTasksRequest extends Request {
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

    private ListQualityRuleTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityRuleTasksRequest create() {
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

    public static final class Builder extends Request.Builder<ListQualityRuleTasksRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityRuleTasksRequest request) {
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
         * <p>The paging query conditions.</p>
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
         * <p>The operator user ID.</p>
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
        public ListQualityRuleTasksRequest build() {
            return new ListQualityRuleTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityRuleTasksRequest} extends {@link TeaModel}
     *
     * <p>ListQualityRuleTasksRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("CatalogList")
        private java.util.List<String> catalogList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RuleStrengthList")
        private java.util.List<String> ruleStrengthList;

        @com.aliyun.core.annotation.NameInMap("RuleTagList")
        private java.util.List<String> ruleTagList;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("ValidateResultList")
        private java.util.List<String> validateResultList;

        @com.aliyun.core.annotation.NameInMap("WatchTaskId")
        private Long watchTaskId;

        private ListQuery(Builder builder) {
            this.bizDate = builder.bizDate;
            this.catalogList = builder.catalogList;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.ruleStrengthList = builder.ruleStrengthList;
            this.ruleTagList = builder.ruleTagList;
            this.statusList = builder.statusList;
            this.validateResultList = builder.validateResultList;
            this.watchTaskId = builder.watchTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return catalogList
         */
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
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
         * @return ruleStrengthList
         */
        public java.util.List<String> getRuleStrengthList() {
            return this.ruleStrengthList;
        }

        /**
         * @return ruleTagList
         */
        public java.util.List<String> getRuleTagList() {
            return this.ruleTagList;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return validateResultList
         */
        public java.util.List<String> getValidateResultList() {
            return this.validateResultList;
        }

        /**
         * @return watchTaskId
         */
        public Long getWatchTaskId() {
            return this.watchTaskId;
        }

        public static final class Builder {
            private String bizDate; 
            private java.util.List<String> catalogList; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> ruleStrengthList; 
            private java.util.List<String> ruleTagList; 
            private java.util.List<String> statusList; 
            private java.util.List<String> validateResultList; 
            private Long watchTaskId; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.bizDate = model.bizDate;
                this.catalogList = model.catalogList;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.ruleStrengthList = model.ruleStrengthList;
                this.ruleTagList = model.ruleTagList;
                this.statusList = model.statusList;
                this.validateResultList = model.validateResultList;
                this.watchTaskId = model.watchTaskId;
            } 

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The rule types. Valid values: CONSISTENT (consistency), EFFECTIVE (effectiveness), TIMELINESE (timeliness), ACCURATE (accuracy), UNIQUENESS (uniqueness), COMPLETENESS (completeness), STABILITY (stability), and CUSTOM (custom).</p>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * <p>The search keyword. You can search by field name or rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * <p>The rule strengths. Valid values: STRONG (strong) and WEAK (weak).</p>
             */
            public Builder ruleStrengthList(java.util.List<String> ruleStrengthList) {
                this.ruleStrengthList = ruleStrengthList;
                return this;
            }

            /**
             * <p>The rule labels. Valid values: DEFAULT (default label), DATA_STANDARD_MANUAL (manually created standard rules), DATA_STANDARD_AUTO (standard quality rules created by automatic creation), PIPELINE (rules created by pipelines), and DATA_MODELING (data modeling).</p>
             */
            public Builder ruleTagList(java.util.List<String> ruleTagList) {
                this.ruleTagList = ruleTagList;
                return this;
            }

            /**
             * <p>The task statuses. Valid values: NOT_RUN (not run), WAITING (waiting), RUNNING (running), SUCCESS (successful), FAILED (failed), CANCEL (canceled), TIMEOUT (timed out), and OFFLINE (offline).</p>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * <p>The validation results. Valid values: NOT_RUN (not run), WAITING (waiting), RUNNING (running), PASS (passed), NOT_PASS (not passed), FAILED (failed), OFFLINE (offline and requires restart), CANCEL (canceled), and TIMEOUT (timed out).</p>
             */
            public Builder validateResultList(java.util.List<String> validateResultList) {
                this.validateResultList = validateResultList;
                return this;
            }

            /**
             * <p>The quality watchtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchTaskId(Long watchTaskId) {
                this.watchTaskId = watchTaskId;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
