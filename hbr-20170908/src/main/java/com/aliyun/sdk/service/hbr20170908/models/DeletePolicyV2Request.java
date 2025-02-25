// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DeletePolicyV2Request} extends {@link RequestModel}
 *
 * <p>DeletePolicyV2Request</p>
 */
public class DeletePolicyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    private DeletePolicyV2Request(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DeletePolicyV2Request, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyV2Request request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************2l6</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DeletePolicyV2Request build() {
            return new DeletePolicyV2Request(this);
        } 

    } 

}
