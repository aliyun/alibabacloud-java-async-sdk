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
 * {@link ListQualityRulesRequest} extends {@link RequestModel}
 *
 * <p>ListQualityRulesRequest</p>
 */
public class ListQualityRulesRequest extends Request {
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

    private ListQualityRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityRulesRequest create() {
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

    public static final class Builder extends Request.Builder<ListQualityRulesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityRulesRequest request) {
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListQualityRulesRequest build() {
            return new ListQualityRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityRulesRequest} extends {@link TeaModel}
     *
     * <p>ListQualityRulesRequest</p>
     */
    public static class ListQuery extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("TemplateIdList")
        private java.util.List<Long> templateIdList;

        @com.aliyun.core.annotation.NameInMap("TestRunTaskStatusList")
        private java.util.List<String> testRunTaskStatusList;

        @com.aliyun.core.annotation.NameInMap("TestRunTaskValidateResultList")
        private java.util.List<String> testRunTaskValidateResultList;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private ListQuery(Builder builder) {
            this.catalogList = builder.catalogList;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.ruleStrengthList = builder.ruleStrengthList;
            this.statusList = builder.statusList;
            this.templateIdList = builder.templateIdList;
            this.testRunTaskStatusList = builder.testRunTaskStatusList;
            this.testRunTaskValidateResultList = builder.testRunTaskValidateResultList;
            this.watchId = builder.watchId;
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
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return templateIdList
         */
        public java.util.List<Long> getTemplateIdList() {
            return this.templateIdList;
        }

        /**
         * @return testRunTaskStatusList
         */
        public java.util.List<String> getTestRunTaskStatusList() {
            return this.testRunTaskStatusList;
        }

        /**
         * @return testRunTaskValidateResultList
         */
        public java.util.List<String> getTestRunTaskValidateResultList() {
            return this.testRunTaskValidateResultList;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private java.util.List<String> catalogList; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> ruleStrengthList; 
            private java.util.List<String> statusList; 
            private java.util.List<Long> templateIdList; 
            private java.util.List<String> testRunTaskStatusList; 
            private java.util.List<String> testRunTaskValidateResultList; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.catalogList = model.catalogList;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.ruleStrengthList = model.ruleStrengthList;
                this.statusList = model.statusList;
                this.templateIdList = model.templateIdList;
                this.testRunTaskStatusList = model.testRunTaskStatusList;
                this.testRunTaskValidateResultList = model.testRunTaskValidateResultList;
                this.watchId = model.watchId;
            } 

            /**
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li>CONSISTENT: consistency.</li>
             * <li>EFFECTIVE: validity.</li>
             * <li>TIMELINESE: timeliness.</li>
             * <li>ACCURATE: accuracy.</li>
             * <li>UNIQUENESS: uniqueness.</li>
             * <li>COMPLETENESS: completeness.</li>
             * <li>STABILITY: stability.</li>
             * <li>CUSTOM: custom.</li>
             * </ul>
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * <p>The search keyword for filtering. Supports searching by rule name and validation object.</p>
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
             * <p>The number of records per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The rule strength. Valid values:</p>
             * <ul>
             * <li>STRONG: strong.</li>
             * <li>WEAK: weak.</li>
             * </ul>
             */
            public Builder ruleStrengthList(java.util.List<String> ruleStrengthList) {
                this.ruleStrengthList = ruleStrengthList;
                return this;
            }

            /**
             * <p>The rule effective status. Valid values:</p>
             * <ul>
             * <li>ENABLE: enabled.</li>
             * <li>DISABLE: disabled.</li>
             * </ul>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * <p>The rule template.</p>
             */
            public Builder templateIdList(java.util.List<Long> templateIdList) {
                this.templateIdList = templateIdList;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: not executed.</li>
             * <li>WAITING: waiting.</li>
             * <li>RUNNING: executing.</li>
             * <li>SUCCESS: execution succeeded.</li>
             * <li>FAILED: execution failed.</li>
             * <li>CANCEL: canceled.</li>
             * <li>TIMEOUT: timed out.</li>
             * <li>OFFLINE: offline.</li>
             * </ul>
             */
            public Builder testRunTaskStatusList(java.util.List<String> testRunTaskStatusList) {
                this.testRunTaskStatusList = testRunTaskStatusList;
                return this;
            }

            /**
             * <p>The trial run validation result. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: not executed.</li>
             * <li>WAITING: waiting for execution.</li>
             * <li>RUNNING: executing.</li>
             * <li>PASS: passed.</li>
             * <li>NOT_PASS: not passed.</li>
             * <li>FAILED: execution failed.</li>
             * <li>OFFLINE: offline. The task needs to be restarted.</li>
             * <li>CANCEL: task canceled.</li>
             * <li>TIMEOUT: task timed out.</li>
             * </ul>
             */
            public Builder testRunTaskValidateResultList(java.util.List<String> testRunTaskValidateResultList) {
                this.testRunTaskValidateResultList = testRunTaskValidateResultList;
                return this;
            }

            /**
             * <p>The monitoring ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
