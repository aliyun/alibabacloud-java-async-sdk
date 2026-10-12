// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectionsRequest</p>
 */
public class ListConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionIds")
    private java.util.List<String> connectionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTypes")
    private java.util.List<String> connectionTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptOption")
    private String encryptOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTypes")
    private java.util.List<String> modelTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolCall")
    private Boolean toolCall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListConnectionsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.connectionIds = builder.connectionIds;
        this.connectionName = builder.connectionName;
        this.connectionTypes = builder.connectionTypes;
        this.creator = builder.creator;
        this.encryptOption = builder.encryptOption;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.modelTypes = builder.modelTypes;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.sortBy = builder.sortBy;
        this.toolCall = builder.toolCall;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return connectionIds
     */
    public java.util.List<String> getConnectionIds() {
        return this.connectionIds;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return connectionTypes
     */
    public java.util.List<String> getConnectionTypes() {
        return this.connectionTypes;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return encryptOption
     */
    public String getEncryptOption() {
        return this.encryptOption;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return modelTypes
     */
    public java.util.List<String> getModelTypes() {
        return this.modelTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return toolCall
     */
    public Boolean getToolCall() {
        return this.toolCall;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListConnectionsRequest, Builder> {
        private String accessibility; 
        private java.util.List<String> connectionIds; 
        private String connectionName; 
        private java.util.List<String> connectionTypes; 
        private String creator; 
        private String encryptOption; 
        private Integer maxResults; 
        private String model; 
        private java.util.List<String> modelTypes; 
        private String nextToken; 
        private String order; 
        private String sortBy; 
        private Boolean toolCall; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectionsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.connectionIds = request.connectionIds;
            this.connectionName = request.connectionName;
            this.connectionTypes = request.connectionTypes;
            this.creator = request.creator;
            this.encryptOption = request.encryptOption;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.modelTypes = request.modelTypes;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.sortBy = request.sortBy;
            this.toolCall = request.toolCall;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Visibility of the connection. Valid values:</p>
         * <ul>
         * <li><p>PUBLIC: visible to all workspace members.</p>
         * </li>
         * <li><p>PRIVATE: visible only to the creator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>List of connection IDs to filter by.</p>
         */
        public Builder connectionIds(java.util.List<String> connectionIds) {
            String connectionIdsShrink = shrink(connectionIds, "ConnectionIds", "simple");
            this.putQueryParameter("ConnectionIds", connectionIdsShrink);
            this.connectionIds = connectionIds;
            return this;
        }

        /**
         * <p>Connection name. Supports fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>Database connection</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>List of connection types to filter by.</p>
         */
        public Builder connectionTypes(java.util.List<String> connectionTypes) {
            String connectionTypesShrink = shrink(connectionTypes, "ConnectionTypes", "simple");
            this.putQueryParameter("ConnectionTypes", connectionTypesShrink);
            this.connectionTypes = connectionTypes;
            return this;
        }

        /**
         * <p>Alibaba Cloud account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>12908*******3242</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>Encryption option for sensitive fields in the response. Valid values:</p>
         * <ul>
         * <li><p>PlainText: returns values in plaintext.</p>
         * </li>
         * <li><p>Secret: returns values in ciphertext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder encryptOption(String encryptOption) {
            this.putQueryParameter("EncryptOption", encryptOption);
            this.encryptOption = encryptOption;
            return this;
        }

        /**
         * <p>Maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Model identifier. Filters connections associated with this model.</p>
         * 
         * <strong>example:</strong>
         * <p>model_001</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>List of model types to filter by.</p>
         */
        public Builder modelTypes(java.util.List<String> modelTypes) {
            String modelTypesShrink = shrink(modelTypes, "ModelTypes", "simple");
            this.putQueryParameter("ModelTypes", modelTypesShrink);
            this.modelTypes = modelTypes;
            return this;
        }

        /**
         * <p>The token that marks the starting position for the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Sort order. Use with the SortBy parameter. Valid values:</p>
         * <ul>
         * <li><p>ASC: ascending order.</p>
         * </li>
         * <li><p>DESC (default): descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Field by which to sort results. Default value: GmtCreateTime. Valid values:</p>
         * <ul>
         * <li>GmtCreateTime (default): sorts by creation time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Whether tool calling is supported. Valid values:</p>
         * <ul>
         * <li><p>true: supported.</p>
         * </li>
         * <li><p>false: not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder toolCall(Boolean toolCall) {
            this.putQueryParameter("ToolCall", toolCall);
            this.toolCall = toolCall;
            return this;
        }

        /**
         * <p>Workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListConnectionsRequest build() {
            return new ListConnectionsRequest(this);
        } 

    } 

}
