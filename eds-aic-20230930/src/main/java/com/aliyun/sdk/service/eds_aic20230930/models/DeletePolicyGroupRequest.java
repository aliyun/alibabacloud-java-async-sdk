// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeletePolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyGroupRequest</p>
 */
public class DeletePolicyGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> policyGroupIds;

    private DeletePolicyGroupRequest(Builder builder) {
        super(builder);
        this.policyGroupIds = builder.policyGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyGroupIds
     */
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public static final class Builder extends Request.Builder<DeletePolicyGroupRequest, Builder> {
        private java.util.List<String> policyGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyGroupRequest request) {
            super(request);
            this.policyGroupIds = request.policyGroupIds;
        } 

        /**
         * <p>The IDs of the policies.</p>
         * <p>This parameter is required.</p>
         */
        public Builder policyGroupIds(java.util.List<String> policyGroupIds) {
            this.putQueryParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        @Override
        public DeletePolicyGroupRequest build() {
            return new DeletePolicyGroupRequest(this);
        } 

    } 

}
