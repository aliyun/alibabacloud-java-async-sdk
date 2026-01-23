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
 * {@link ListSecurityIdentifyRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityIdentifyRecordsRequest</p>
 */
public class ListSecurityIdentifyRecordsRequest extends Request {
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

    private ListSecurityIdentifyRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityIdentifyRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSecurityIdentifyRecordsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityIdentifyRecordsRequest request) {
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
        public ListSecurityIdentifyRecordsRequest build() {
            return new ListSecurityIdentifyRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityIdentifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>ListSecurityIdentifyRecordsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceEnv")
        private String datasourceEnv;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("IsDatasourceTable")
        private Boolean isDatasourceTable;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TableCatalog")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableCatalog;

        @com.aliyun.core.annotation.NameInMap("TableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableName;

        private ListQuery(Builder builder) {
            this.datasourceEnv = builder.datasourceEnv;
            this.datasourceName = builder.datasourceName;
            this.fieldName = builder.fieldName;
            this.isDatasourceTable = builder.isDatasourceTable;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.tableCatalog = builder.tableCatalog;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return datasourceEnv
         */
        public String getDatasourceEnv() {
            return this.datasourceEnv;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return isDatasourceTable
         */
        public Boolean getIsDatasourceTable() {
            return this.isDatasourceTable;
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
         * @return tableCatalog
         */
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String datasourceEnv; 
            private String datasourceName; 
            private String fieldName; 
            private Boolean isDatasourceTable; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private String tableCatalog; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.datasourceEnv = model.datasourceEnv;
                this.datasourceName = model.datasourceName;
                this.fieldName = model.fieldName;
                this.isDatasourceTable = model.isDatasourceTable;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.tableCatalog = model.tableCatalog;
                this.tableName = model.tableName;
            } 

            /**
             * DatasourceEnv.
             */
            public Builder datasourceEnv(String datasourceEnv) {
                this.datasourceEnv = datasourceEnv;
                return this;
            }

            /**
             * DatasourceName.
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>col1</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * IsDatasourceTable.
             */
            public Builder isDatasourceTable(Boolean isDatasourceTable) {
                this.isDatasourceTable = isDatasourceTable;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableCatalog(String tableCatalog) {
                this.tableCatalog = tableCatalog;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
