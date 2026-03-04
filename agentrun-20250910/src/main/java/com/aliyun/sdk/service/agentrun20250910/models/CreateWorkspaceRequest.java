// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateWorkspaceInput body;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateWorkspaceInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private CreateWorkspaceInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateWorkspaceInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

}
