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
 * {@link GetEntityStoreRequest} extends {@link RequestModel}
 *
 * <p>GetEntityStoreRequest</p>
 */
public class GetEntityStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private GetEntityStoreRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityStoreRequest create() {
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

    public static final class Builder extends Request.Builder<GetEntityStoreRequest, Builder> {
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(GetEntityStoreRequest request) {
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
        public GetEntityStoreRequest build() {
            return new GetEntityStoreRequest(this);
        } 

    } 

}
