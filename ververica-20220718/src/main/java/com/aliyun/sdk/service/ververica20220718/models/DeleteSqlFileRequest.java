// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DeleteSqlFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteSqlFileRequest</p>
 */
public class DeleteSqlFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sqlFileId")
    private String sqlFileId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private DeleteSqlFileRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.sqlFileId = builder.sqlFileId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSqlFileRequest create() {
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
     * @return sqlFileId
     */
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteSqlFileRequest, Builder> {
        private String namespace; 
        private String sqlFileId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSqlFileRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.sqlFileId = request.sqlFileId;
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
         * sqlFileId.
         */
        public Builder sqlFileId(String sqlFileId) {
            this.putPathParameter("sqlFileId", sqlFileId);
            this.sqlFileId = sqlFileId;
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
        public DeleteSqlFileRequest build() {
            return new DeleteSqlFileRequest(this);
        } 

    } 

}
