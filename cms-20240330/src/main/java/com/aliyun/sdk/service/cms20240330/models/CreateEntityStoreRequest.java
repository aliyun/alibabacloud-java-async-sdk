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
 * {@link CreateEntityStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateEntityStoreRequest</p>
 */
public class CreateEntityStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateEntityStoreRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEntityStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateEntityStoreRequest, Builder> {
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateEntityStoreRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test-001</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateEntityStoreRequest build() {
            return new CreateEntityStoreRequest(this);
        } 

    } 

}
