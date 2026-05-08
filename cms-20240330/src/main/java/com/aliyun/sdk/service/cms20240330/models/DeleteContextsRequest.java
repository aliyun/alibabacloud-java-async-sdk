// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteContextsRequest} extends {@link RequestModel}
 *
 * <p>DeleteContextsRequest</p>
 */
public class DeleteContextsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextIds")
    private String contextIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    private DeleteContextsRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.contextIds = builder.contextIds;
        this.filter = builder.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextIds
     */
    public String getContextIds() {
        return this.contextIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    public static final class Builder extends Request.Builder<DeleteContextsRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String contextIds; 
        private String filter; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContextsRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.contextIds = request.contextIds;
            this.filter = request.filter;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * contextIds.
         */
        public Builder contextIds(String contextIds) {
            this.putQueryParameter("contextIds", contextIds);
            this.contextIds = contextIds;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        @Override
        public DeleteContextsRequest build() {
            return new DeleteContextsRequest(this);
        } 

    } 

}
