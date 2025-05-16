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
    @com.aliyun.core.annotation.NameInMap("ConnectionIds")
    private java.util.List<String> connectionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTypes")
    private java.util.List<String> connectionTypes;

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
        this.connectionIds = builder.connectionIds;
        this.connectionName = builder.connectionName;
        this.connectionTypes = builder.connectionTypes;
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
        private java.util.List<String> connectionIds; 
        private String connectionName; 
        private java.util.List<String> connectionTypes; 
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
            this.connectionIds = request.connectionIds;
            this.connectionName = request.connectionName;
            this.connectionTypes = request.connectionTypes;
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
         * <p>The list of connection IDs.</p>
         */
        public Builder connectionIds(java.util.List<String> connectionIds) {
            String connectionIdsShrink = shrink(connectionIds, "ConnectionIds", "simple");
            this.putQueryParameter("ConnectionIds", connectionIdsShrink);
            this.connectionIds = connectionIds;
            return this;
        }

        /**
         * <p>The connection name.</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The list of connection types.</p>
         */
        public Builder connectionTypes(java.util.List<String> connectionTypes) {
            String connectionTypesShrink = shrink(connectionTypes, "ConnectionTypes", "simple");
            this.putQueryParameter("ConnectionTypes", connectionTypesShrink);
            this.connectionTypes = connectionTypes;
            return this;
        }

        /**
         * <p>The encryption settings. Valid values:</p>
         * <ul>
         * <li>PlainText</li>
         * <li>Secret</li>
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
         * <p>The maximum number of entries per page.</p>
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
         * <p>The model identifier.</p>
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
         * <p>The list of model types.</p>
         */
        public Builder modelTypes(java.util.List<String> modelTypes) {
            String modelTypesShrink = shrink(modelTypes, "ModelTypes", "simple");
            this.putQueryParameter("ModelTypes", modelTypesShrink);
            this.modelTypes = modelTypes;
            return this;
        }

        /**
         * <p>The pagination token that indicates the start position from which to retrieve data on the next page.</p>
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
         * <p>The order in which the entries are sorted by the specific field on the returned page. This parameter must be used together with SortBy.</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order. This is the default value.</li>
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
         * <p>The field used to sort the results in queries by page. Default value: GmtCreateTime. Valid value:</p>
         * <ul>
         * <li>GmtCreateTime: The results are sorted by creation time. This is the default value.</li>
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
         * <p>Specifies whether a tool can be called by using ToolCall. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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
