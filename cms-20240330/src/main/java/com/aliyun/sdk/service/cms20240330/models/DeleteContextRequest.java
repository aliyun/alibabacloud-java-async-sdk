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
 * {@link DeleteContextRequest} extends {@link RequestModel}
 *
 * <p>DeleteContextRequest</p>
 */
public class DeleteContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String contextId;

    private DeleteContextRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.contextId = builder.contextId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextRequest create() {
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
     * @return contextId
     */
    public String getContextId() {
        return this.contextId;
    }

    public static final class Builder extends Request.Builder<DeleteContextRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String contextId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContextRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.contextId = request.contextId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
         */
        public Builder contextId(String contextId) {
            this.putPathParameter("contextId", contextId);
            this.contextId = contextId;
            return this;
        }

        @Override
        public DeleteContextRequest build() {
            return new DeleteContextRequest(this);
        } 

    } 

}
