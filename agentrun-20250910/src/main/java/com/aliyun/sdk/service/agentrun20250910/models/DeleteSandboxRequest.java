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
 * {@link DeleteSandboxRequest} extends {@link RequestModel}
 *
 * <p>DeleteSandboxRequest</p>
 */
public class DeleteSandboxRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    private DeleteSandboxRequest(Builder builder) {
        super(builder);
        this.sandboxId = builder.sandboxId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSandboxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
    }

    public static final class Builder extends Request.Builder<DeleteSandboxRequest, Builder> {
        private String sandboxId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSandboxRequest request) {
            super(request);
            this.sandboxId = request.sandboxId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sb-1234567</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.putPathParameter("sandboxId", sandboxId);
            this.sandboxId = sandboxId;
            return this;
        }

        @Override
        public DeleteSandboxRequest build() {
            return new DeleteSandboxRequest(this);
        } 

    } 

}
