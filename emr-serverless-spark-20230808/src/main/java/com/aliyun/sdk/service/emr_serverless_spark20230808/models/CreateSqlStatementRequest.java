// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSqlStatementRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlStatementRequest</p>
 */
public class CreateSqlStatementRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeContent")
    private String codeContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultCatalog")
    private String defaultCatalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultDatabase")
    private String defaultDatabase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sqlComputeId")
    private String sqlComputeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateSqlStatementRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.codeContent = builder.codeContent;
        this.defaultCatalog = builder.defaultCatalog;
        this.defaultDatabase = builder.defaultDatabase;
        this.limit = builder.limit;
        this.sqlComputeId = builder.sqlComputeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlStatementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return codeContent
     */
    public String getCodeContent() {
        return this.codeContent;
    }

    /**
     * @return defaultCatalog
     */
    public String getDefaultCatalog() {
        return this.defaultCatalog;
    }

    /**
     * @return defaultDatabase
     */
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return sqlComputeId
     */
    public String getSqlComputeId() {
        return this.sqlComputeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSqlStatementRequest, Builder> {
        private String workspaceId; 
        private String codeContent; 
        private String defaultCatalog; 
        private String defaultDatabase; 
        private Integer limit; 
        private String sqlComputeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlStatementRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.codeContent = request.codeContent;
            this.defaultCatalog = request.defaultCatalog;
            this.defaultDatabase = request.defaultDatabase;
            this.limit = request.limit;
            this.sqlComputeId = request.sqlComputeId;
            this.regionId = request.regionId;
        } 

        /**
         * The workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The SQL code. You can specify one or more SQL statements.
         */
        public Builder codeContent(String codeContent) {
            this.putBodyParameter("codeContent", codeContent);
            this.codeContent = codeContent;
            return this;
        }

        /**
         * The default Data Lake Formation (DLF) catalog ID.
         */
        public Builder defaultCatalog(String defaultCatalog) {
            this.putBodyParameter("defaultCatalog", defaultCatalog);
            this.defaultCatalog = defaultCatalog;
            return this;
        }

        /**
         * The name of the default database.
         */
        public Builder defaultDatabase(String defaultDatabase) {
            this.putBodyParameter("defaultDatabase", defaultDatabase);
            this.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * The maximum number of entries to return. Valid values: 1 to 10000.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The SQL compute ID. You can create an SQL compute in the workspace created in EMR Serverless Spark.
         */
        public Builder sqlComputeId(String sqlComputeId) {
            this.putBodyParameter("sqlComputeId", sqlComputeId);
            this.sqlComputeId = sqlComputeId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateSqlStatementRequest build() {
            return new CreateSqlStatementRequest(this);
        } 

    } 

}
