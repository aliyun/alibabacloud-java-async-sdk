// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyRequest</p>
 */
public class DeletePolicyRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private DeletePolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DeletePolicyRequest, Builder> {
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
        } 

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DeletePolicyRequest build() {
            return new DeletePolicyRequest(this);
        } 

    } 

}
