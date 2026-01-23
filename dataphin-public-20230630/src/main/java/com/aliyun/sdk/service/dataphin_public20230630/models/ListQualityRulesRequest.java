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

    private ListQualityRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<ListQualityRulesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
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
         * ListQuery.
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
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
             * CatalogList.
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RuleStrengthList.
             */
            public Builder ruleStrengthList(java.util.List<String> ruleStrengthList) {
                this.ruleStrengthList = ruleStrengthList;
                return this;
            }

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * TemplateIdList.
             */
            public Builder templateIdList(java.util.List<Long> templateIdList) {
                this.templateIdList = templateIdList;
                return this;
            }

            /**
             * TestRunTaskStatusList.
             */
            public Builder testRunTaskStatusList(java.util.List<String> testRunTaskStatusList) {
                this.testRunTaskStatusList = testRunTaskStatusList;
                return this;
            }

            /**
             * TestRunTaskValidateResultList.
             */
            public Builder testRunTaskValidateResultList(java.util.List<String> testRunTaskValidateResultList) {
                this.testRunTaskValidateResultList = testRunTaskValidateResultList;
                return this;
            }

            /**
             * WatchId.
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
