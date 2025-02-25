// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link DeletePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyRequest</p>
 */
public class DeletePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CascadingDelete")
    private Boolean cascadingDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private DeletePolicyRequest(Builder builder) {
        super(builder);
        this.cascadingDelete = builder.cascadingDelete;
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
     * @return cascadingDelete
     */
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DeletePolicyRequest, Builder> {
        private Boolean cascadingDelete; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyRequest request) {
            super(request);
            this.cascadingDelete = request.cascadingDelete;
            this.policyName = request.policyName;
        } 

        /**
         * CascadingDelete.
         */
        public Builder cascadingDelete(Boolean cascadingDelete) {
            this.putQueryParameter("CascadingDelete", cascadingDelete);
            this.cascadingDelete = cascadingDelete;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
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
