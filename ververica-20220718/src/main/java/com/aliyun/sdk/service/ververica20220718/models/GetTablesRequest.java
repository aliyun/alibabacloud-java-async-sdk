// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTablesRequest} extends {@link RequestModel}
 *
 * <p>GetTablesRequest</p>
 */
public class GetTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("databaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetTablesRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.catalogName = builder.catalogName;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetTablesRequest, Builder> {
        private String namespace; 
        private String catalogName; 
        private String databaseName; 
        private String tableName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetTablesRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.catalogName = request.catalogName;
            this.databaseName = request.databaseName;
            this.tableName = request.tableName;
            this.workspace = request.workspace;
        } 

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.putPathParameter("catalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putPathParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetTablesRequest build() {
            return new GetTablesRequest(this);
        } 

    } 

}
