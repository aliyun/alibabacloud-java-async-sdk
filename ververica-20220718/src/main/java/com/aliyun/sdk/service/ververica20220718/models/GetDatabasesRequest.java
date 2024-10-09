// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDatabasesRequest} extends {@link RequestModel}
 *
 * <p>GetDatabasesRequest</p>
 */
public class GetDatabasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetDatabasesRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.catalogName = builder.catalogName;
        this.databaseName = builder.databaseName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabasesRequest create() {
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetDatabasesRequest, Builder> {
        private String namespace; 
        private String catalogName; 
        private String databaseName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetDatabasesRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.catalogName = request.catalogName;
            this.databaseName = request.databaseName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>paimon</p>
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
            this.putQueryParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetDatabasesRequest build() {
            return new GetDatabasesRequest(this);
        } 

    } 

}
