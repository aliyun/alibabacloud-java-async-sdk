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
 * {@link ListSecurityIdentifyResultsRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityIdentifyResultsRequest</p>
 */
public class ListSecurityIdentifyResultsRequest extends Request {
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

    private ListSecurityIdentifyResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityIdentifyResultsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSecurityIdentifyResultsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityIdentifyResultsRequest request) {
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
        public ListSecurityIdentifyResultsRequest build() {
            return new ListSecurityIdentifyResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityIdentifyResultsRequest} extends {@link TeaModel}
     *
     * <p>ListSecurityIdentifyResultsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitNameList")
        private java.util.List<String> bizUnitNameList;

        @com.aliyun.core.annotation.NameInMap("ClassifyId")
        private Long classifyId;

        @com.aliyun.core.annotation.NameInMap("DatasourceNameList")
        private java.util.List<String> datasourceNameList;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private Boolean isLocked;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectNameList")
        private java.util.List<String> projectNameList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ListQuery(Builder builder) {
            this.bizUnitNameList = builder.bizUnitNameList;
            this.classifyId = builder.classifyId;
            this.datasourceNameList = builder.datasourceNameList;
            this.env = builder.env;
            this.isLocked = builder.isLocked;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.projectNameList = builder.projectNameList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return bizUnitNameList
         */
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        /**
         * @return classifyId
         */
        public Long getClassifyId() {
            return this.classifyId;
        }

        /**
         * @return datasourceNameList
         */
        public java.util.List<String> getDatasourceNameList() {
            return this.datasourceNameList;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return isLocked
         */
        public Boolean getIsLocked() {
            return this.isLocked;
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
         * @return projectNameList
         */
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> bizUnitNameList; 
            private Long classifyId; 
            private java.util.List<String> datasourceNameList; 
            private String env; 
            private Boolean isLocked; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> projectNameList; 
            private String status; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.bizUnitNameList = model.bizUnitNameList;
                this.classifyId = model.classifyId;
                this.datasourceNameList = model.datasourceNameList;
                this.env = model.env;
                this.isLocked = model.isLocked;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.projectNameList = model.projectNameList;
                this.status = model.status;
            } 

            /**
             * BizUnitNameList.
             */
            public Builder bizUnitNameList(java.util.List<String> bizUnitNameList) {
                this.bizUnitNameList = bizUnitNameList;
                return this;
            }

            /**
             * ClassifyId.
             */
            public Builder classifyId(Long classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * DatasourceNameList.
             */
            public Builder datasourceNameList(java.util.List<String> datasourceNameList) {
                this.datasourceNameList = datasourceNameList;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * IsLocked.
             */
            public Builder isLocked(Boolean isLocked) {
                this.isLocked = isLocked;
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
             * ProjectNameList.
             */
            public Builder projectNameList(java.util.List<String> projectNameList) {
                this.projectNameList = projectNameList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
