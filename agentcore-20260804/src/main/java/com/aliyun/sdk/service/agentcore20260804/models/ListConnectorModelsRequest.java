// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListConnectorModelsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectorModelsRequest</p>
 */
public class ListConnectorModelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("connectorKeyId")
    private String connectorKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListConnectorModelsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectorName = builder.connectorName;
        this.connectorKeyId = builder.connectorKeyId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectorModelsRequest create() {
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
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return connectorKeyId
     */
    public String getConnectorKeyId() {
        return this.connectorKeyId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListConnectorModelsRequest, Builder> {
        private String workspaceId; 
        private String connectorName; 
        private String connectorKeyId; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectorModelsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectorName = request.connectorName;
            this.connectorKeyId = request.connectorKeyId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The Connector name. Currently, only qodercli is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        public Builder connectorName(String connectorName) {
            this.putPathParameter("connectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>The Connector Key ID. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>ckey-xxxx</p>
         */
        public Builder connectorKeyId(String connectorKeyId) {
            this.putQueryParameter("connectorKeyId", connectorKeyId);
            this.connectorKeyId = connectorKeyId;
            return this;
        }

        /**
         * <p>The page size. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The next page token. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListConnectorModelsRequest build() {
            return new ListConnectorModelsRequest(this);
        } 

    } 

}
