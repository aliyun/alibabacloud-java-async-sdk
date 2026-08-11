// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListModelPermissionsRequest</p>
 */
public class ListModelPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizationScope")
    private String authorizationScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelAction")
    private String modelAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String workspaceId;

    private ListModelPermissionsRequest(Builder builder) {
        super(builder);
        this.authorizationScope = builder.authorizationScope;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.modelAction = builder.modelAction;
        this.nextToken = builder.nextToken;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationScope
     */
    public String getAuthorizationScope() {
        return this.authorizationScope;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return modelAction
     */
    public String getModelAction() {
        return this.modelAction;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListModelPermissionsRequest, Builder> {
        private String authorizationScope; 
        private Filter filter; 
        private Integer maxResults; 
        private String modelAction; 
        private String nextToken; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListModelPermissionsRequest request) {
            super(request);
            this.authorizationScope = request.authorizationScope;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.modelAction = request.modelAction;
            this.nextToken = request.nextToken;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * authorizationScope.
         */
        public Builder authorizationScope(String authorizationScope) {
            this.putQueryParameter("authorizationScope", authorizationScope);
            this.authorizationScope = authorizationScope;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(Filter filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * modelAction.
         */
        public Builder modelAction(String modelAction) {
            this.putQueryParameter("modelAction", modelAction);
            this.modelAction = modelAction;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-32klhjk2312334jkh</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListModelPermissionsRequest build() {
            return new ListModelPermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListModelPermissionsRequest} extends {@link TeaModel}
     *
     * <p>ListModelPermissionsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Filter(Builder builder) {
            this.model = builder.model;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String model; 
            private String name; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.model = model.model;
                this.name = model.name;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
