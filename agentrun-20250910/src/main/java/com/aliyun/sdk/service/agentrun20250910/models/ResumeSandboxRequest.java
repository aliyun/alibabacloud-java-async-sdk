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
 * {@link ResumeSandboxRequest} extends {@link RequestModel}
 *
 * <p>ResumeSandboxRequest</p>
 */
public class ResumeSandboxRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    private ResumeSandboxRequest(Builder builder) {
        super(builder);
        this.sandboxId = builder.sandboxId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeSandboxRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeSandboxRequest, Builder> {
        private String sandboxId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeSandboxRequest request) {
            super(request);
            this.sandboxId = request.sandboxId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sb-1234567890abcdef</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.putPathParameter("sandboxId", sandboxId);
            this.sandboxId = sandboxId;
            return this;
        }

        @Override
        public ResumeSandboxRequest build() {
            return new ResumeSandboxRequest(this);
        } 

    } 

}
