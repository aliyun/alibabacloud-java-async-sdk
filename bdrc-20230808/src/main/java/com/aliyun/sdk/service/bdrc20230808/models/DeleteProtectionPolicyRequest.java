// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link DeleteProtectionPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteProtectionPolicyRequest</p>
 */
public class DeleteProtectionPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectionPolicyId;

    private DeleteProtectionPolicyRequest(Builder builder) {
        super(builder);
        this.protectionPolicyId = builder.protectionPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProtectionPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return protectionPolicyId
     */
    public String getProtectionPolicyId() {
        return this.protectionPolicyId;
    }

    public static final class Builder extends Request.Builder<DeleteProtectionPolicyRequest, Builder> {
        private String protectionPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProtectionPolicyRequest request) {
            super(request);
            this.protectionPolicyId = request.protectionPolicyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.putPathParameter("ProtectionPolicyId", protectionPolicyId);
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }

        @Override
        public DeleteProtectionPolicyRequest build() {
            return new DeleteProtectionPolicyRequest(this);
        } 

    } 

}
