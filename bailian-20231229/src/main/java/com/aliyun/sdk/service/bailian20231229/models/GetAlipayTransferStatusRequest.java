// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetAlipayTransferStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAlipayTransferStatusRequest</p>
 */
public class GetAlipayTransferStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace_id")
    private String workspaceId;

    private GetAlipayTransferStatusRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlipayTransferStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetAlipayTransferStatusRequest, Builder> {
        private String code; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlipayTransferStatusRequest request) {
            super(request);
            this.code = request.code;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * workspace_id.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspace_id", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetAlipayTransferStatusRequest build() {
            return new GetAlipayTransferStatusRequest(this);
        } 

    } 

}
