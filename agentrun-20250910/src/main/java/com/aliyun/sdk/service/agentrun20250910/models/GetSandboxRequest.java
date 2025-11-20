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
 * {@link GetSandboxRequest} extends {@link RequestModel}
 *
 * <p>GetSandboxRequest</p>
 */
public class GetSandboxRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    private GetSandboxRequest(Builder builder) {
        super(builder);
        this.sandboxId = builder.sandboxId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSandboxRequest create() {
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

    public static final class Builder extends Request.Builder<GetSandboxRequest, Builder> {
        private String sandboxId; 

        private Builder() {
            super();
        } 

        private Builder(GetSandboxRequest request) {
            super(request);
            this.sandboxId = request.sandboxId;
        } 

        /**
         * <p>要获取详情的沙箱ID</p>
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
        public GetSandboxRequest build() {
            return new GetSandboxRequest(this);
        } 

    } 

}
