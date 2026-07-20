// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetServiceLinkedRoleStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLinkedRoleStatusRequest</p>
 */
public class GetServiceLinkedRoleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authType;

    private GetServiceLinkedRoleStatusRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    public static final class Builder extends Request.Builder<GetServiceLinkedRoleStatusRequest, Builder> {
        private String authType; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceLinkedRoleStatusRequest request) {
            super(request);
            this.authType = request.authType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DisposalTool</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        @Override
        public GetServiceLinkedRoleStatusRequest build() {
            return new GetServiceLinkedRoleStatusRequest(this);
        } 

    } 

}
