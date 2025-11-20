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
 * {@link StopSandboxRequest} extends {@link RequestModel}
 *
 * <p>StopSandboxRequest</p>
 */
public class StopSandboxRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    private StopSandboxRequest(Builder builder) {
        super(builder);
        this.sandboxId = builder.sandboxId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopSandboxRequest create() {
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

    public static final class Builder extends Request.Builder<StopSandboxRequest, Builder> {
        private String sandboxId; 

        private Builder() {
            super();
        } 

        private Builder(StopSandboxRequest request) {
            super(request);
            this.sandboxId = request.sandboxId;
        } 

        /**
         * <p>要停止的沙箱ID</p>
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
        public StopSandboxRequest build() {
            return new StopSandboxRequest(this);
        } 

    } 

}
