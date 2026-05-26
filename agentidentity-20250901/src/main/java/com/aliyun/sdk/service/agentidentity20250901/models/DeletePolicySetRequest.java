// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link DeletePolicySetRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicySetRequest</p>
 */
public class DeletePolicySetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicySetName")
    private String policySetName;

    private DeletePolicySetRequest(Builder builder) {
        super(builder);
        this.policySetName = builder.policySetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicySetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policySetName
     */
    public String getPolicySetName() {
        return this.policySetName;
    }

    public static final class Builder extends Request.Builder<DeletePolicySetRequest, Builder> {
        private String policySetName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicySetRequest request) {
            super(request);
            this.policySetName = request.policySetName;
        } 

        /**
         * PolicySetName.
         */
        public Builder policySetName(String policySetName) {
            this.putBodyParameter("PolicySetName", policySetName);
            this.policySetName = policySetName;
            return this;
        }

        @Override
        public DeletePolicySetRequest build() {
            return new DeletePolicySetRequest(this);
        } 

    } 

}
