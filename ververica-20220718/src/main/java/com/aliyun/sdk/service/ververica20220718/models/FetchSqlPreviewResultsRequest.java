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
 * {@link FetchSqlPreviewResultsRequest} extends {@link RequestModel}
 *
 * <p>FetchSqlPreviewResultsRequest</p>
 */
public class FetchSqlPreviewResultsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private FetchSqlPreviewResultsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.queryId = builder.queryId;
        this.sessionClusterName = builder.sessionClusterName;
        this.sessionId = builder.sessionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchSqlPreviewResultsRequest create() {
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
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<FetchSqlPreviewResultsRequest, Builder> {
        private String namespace; 
        private String queryId; 
        private String sessionClusterName; 
        private String sessionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(FetchSqlPreviewResultsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.queryId = request.queryId;
            this.sessionClusterName = request.sessionClusterName;
            this.sessionId = request.sessionId;
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
         * <p>19426537348647121698828223472</p>
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("queryId", queryId);
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session</p>
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.putQueryParameter("sessionClusterName", sessionClusterName);
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5f581795-4c5b-43f1-bdae-d7b0871080a1</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
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
        public FetchSqlPreviewResultsRequest build() {
            return new FetchSqlPreviewResultsRequest(this);
        } 

    } 

}
