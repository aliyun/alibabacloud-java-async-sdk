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
 * {@link FetchSqlExecutionResultRequest} extends {@link RequestModel}
 *
 * <p>FetchSqlExecutionResultRequest</p>
 */
public class FetchSqlExecutionResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sqlExecutionId")
    private String sqlExecutionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private FetchSqlExecutionResultRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.sqlExecutionId = builder.sqlExecutionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchSqlExecutionResultRequest create() {
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
     * @return sqlExecutionId
     */
    public String getSqlExecutionId() {
        return this.sqlExecutionId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<FetchSqlExecutionResultRequest, Builder> {
        private String namespace; 
        private String sqlExecutionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(FetchSqlExecutionResultRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.sqlExecutionId = request.sqlExecutionId;
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
         * sqlExecutionId.
         */
        public Builder sqlExecutionId(String sqlExecutionId) {
            this.putPathParameter("sqlExecutionId", sqlExecutionId);
            this.sqlExecutionId = sqlExecutionId;
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
        public FetchSqlExecutionResultRequest build() {
            return new FetchSqlExecutionResultRequest(this);
        } 

    } 

}
