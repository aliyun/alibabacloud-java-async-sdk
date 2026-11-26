// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetVirtualMcpToolValidationRequest} extends {@link RequestModel}
 *
 * <p>GetVirtualMcpToolValidationRequest</p>
 */
public class GetVirtualMcpToolValidationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("validationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validationId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetVirtualMcpToolValidationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.validationId = builder.validationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirtualMcpToolValidationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return validationId
     */
    public String getValidationId() {
        return this.validationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetVirtualMcpToolValidationRequest, Builder> {
        private String workspaceId; 
        private String validationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetVirtualMcpToolValidationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.validationId = request.validationId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The validation task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>val-1234567890</p>
         */
        public Builder validationId(String validationId) {
            this.putPathParameter("validationId", validationId);
            this.validationId = validationId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetVirtualMcpToolValidationRequest build() {
            return new GetVirtualMcpToolValidationRequest(this);
        } 

    } 

}
