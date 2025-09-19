// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteCheckPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteCheckPolicyRequest</p>
 */
public class DeleteCheckPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> policyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    private DeleteCheckPolicyRequest(Builder builder) {
        super(builder);
        this.policyIds = builder.policyIds;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCheckPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyIds
     */
    public java.util.List<Long> getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<DeleteCheckPolicyRequest, Builder> {
        private java.util.List<Long> policyIds; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCheckPolicyRequest request) {
            super(request);
            this.policyIds = request.policyIds;
            this.policyType = request.policyType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder policyIds(java.util.List<Long> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public DeleteCheckPolicyRequest build() {
            return new DeleteCheckPolicyRequest(this);
        } 

    } 

}
