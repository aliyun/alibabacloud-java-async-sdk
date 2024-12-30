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
 * {@link ListPublishRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListPublishRecordsRequest</p>
 */
public class ListPublishRecordsRequest extends Request {
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

    private ListPublishRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<ListPublishRecordsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishRecordsRequest request) {
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
        public ListPublishRecordsRequest build() {
            return new ListPublishRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishRecordsRequest} extends {@link TeaModel}
     *
     * <p>ListPublishRecordsRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("PublishEndTime")
        private String publishEndTime;

        @com.aliyun.core.annotation.NameInMap("PublishStartTime")
        private String publishStartTime;

        @com.aliyun.core.annotation.NameInMap("PublishStatusList")
        private java.util.List<Integer> publishStatusList;

        @com.aliyun.core.annotation.NameInMap("SubmitterList")
        private java.util.List<String> submitterList;

        private SearchFilter(Builder builder) {
            this.changeTypeList = builder.changeTypeList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectIdList = builder.projectIdList;
            this.publishEndTime = builder.publishEndTime;
            this.publishStartTime = builder.publishStartTime;
            this.publishStatusList = builder.publishStatusList;
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
         * @return publishEndTime
         */
        public String getPublishEndTime() {
            return this.publishEndTime;
        }

        /**
         * @return publishStartTime
         */
        public String getPublishStartTime() {
            return this.publishStartTime;
        }

        /**
         * @return publishStatusList
         */
        public java.util.List<Integer> getPublishStatusList() {
            return this.publishStatusList;
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
            private String publishEndTime; 
            private String publishStartTime; 
            private java.util.List<Integer> publishStatusList; 
            private java.util.List<String> submitterList; 

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
             * PublishEndTime.
             */
            public Builder publishEndTime(String publishEndTime) {
                this.publishEndTime = publishEndTime;
                return this;
            }

            /**
             * PublishStartTime.
             */
            public Builder publishStartTime(String publishStartTime) {
                this.publishStartTime = publishStartTime;
                return this;
            }

            /**
             * PublishStatusList.
             */
            public Builder publishStatusList(java.util.List<Integer> publishStatusList) {
                this.publishStatusList = publishStatusList;
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
     * {@link ListPublishRecordsRequest} extends {@link TeaModel}
     *
     * <p>ListPublishRecordsRequest</p>
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
