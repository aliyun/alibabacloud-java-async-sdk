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
 * {@link ListSubmitRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListSubmitRecordsRequest</p>
 */
public class ListSubmitRecordsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListSubmitRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubmitRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSubmitRecordsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSubmitRecordsRequest request) {
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
         * <p>This parameter is required.</p>
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
        public ListSubmitRecordsRequest build() {
            return new ListSubmitRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSubmitRecordsRequest} extends {@link TeaModel}
     *
     * <p>ListSubmitRecordsRequest</p>
     */
    public static class SearchFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeTypeList")
        private java.util.List<Integer> changeTypeList;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> projectIdList;

        @com.aliyun.core.annotation.NameInMap("SubmitEndTime")
        private String submitEndTime;

        @com.aliyun.core.annotation.NameInMap("SubmitStartTime")
        private String submitStartTime;

        @com.aliyun.core.annotation.NameInMap("SubmitterList")
        private java.util.List<String> submitterList;

        private SearchFilter(Builder builder) {
            this.changeTypeList = builder.changeTypeList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectIdList = builder.projectIdList;
            this.submitEndTime = builder.submitEndTime;
            this.submitStartTime = builder.submitStartTime;
            this.submitterList = builder.submitterList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchFilter create() {
            return builder().build();
        }

        /**
         * @return changeTypeList
         */
        public java.util.List<Integer> getChangeTypeList() {
            return this.changeTypeList;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projectIdList
         */
        public java.util.List<Long> getProjectIdList() {
            return this.projectIdList;
        }

        /**
         * @return submitEndTime
         */
        public String getSubmitEndTime() {
            return this.submitEndTime;
        }

        /**
         * @return submitStartTime
         */
        public String getSubmitStartTime() {
            return this.submitStartTime;
        }

        /**
         * @return submitterList
         */
        public java.util.List<String> getSubmitterList() {
            return this.submitterList;
        }

        public static final class Builder {
            private java.util.List<Integer> changeTypeList; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<Long> projectIdList; 
            private String submitEndTime; 
            private String submitStartTime; 
            private java.util.List<String> submitterList; 

            private Builder() {
            } 

            private Builder(SearchFilter model) {
                this.changeTypeList = model.changeTypeList;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.projectIdList = model.projectIdList;
                this.submitEndTime = model.submitEndTime;
                this.submitStartTime = model.submitStartTime;
                this.submitterList = model.submitterList;
            } 

            /**
             * ChangeTypeList.
             */
            public Builder changeTypeList(java.util.List<Integer> changeTypeList) {
                this.changeTypeList = changeTypeList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder projectIdList(java.util.List<Long> projectIdList) {
                this.projectIdList = projectIdList;
                return this;
            }

            /**
             * SubmitEndTime.
             */
            public Builder submitEndTime(String submitEndTime) {
                this.submitEndTime = submitEndTime;
                return this;
            }

            /**
             * SubmitStartTime.
             */
            public Builder submitStartTime(String submitStartTime) {
                this.submitStartTime = submitStartTime;
                return this;
            }

            /**
             * SubmitterList.
             */
            public Builder submitterList(java.util.List<String> submitterList) {
                this.submitterList = submitterList;
                return this;
            }

            public SearchFilter build() {
                return new SearchFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubmitRecordsRequest} extends {@link TeaModel}
     *
     * <p>ListSubmitRecordsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("SearchFilter")
        @com.aliyun.core.annotation.Validation(required = true)
        private SearchFilter searchFilter;

        private ListQuery(Builder builder) {
            this.keyword = builder.keyword;
            this.searchFilter = builder.searchFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return searchFilter
         */
        public SearchFilter getSearchFilter() {
            return this.searchFilter;
        }

        public static final class Builder {
            private String keyword; 
            private SearchFilter searchFilter; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.keyword = model.keyword;
                this.searchFilter = model.searchFilter;
            } 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder searchFilter(SearchFilter searchFilter) {
                this.searchFilter = searchFilter;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
