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
 * {@link UpdatePolicyDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolicyDescriptionRequest</p>
 */
public class UpdatePolicyDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private UpdatePolicyDescriptionRequest(Builder builder) {
        super(builder);
        this.newDescription = builder.newDescription;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolicyDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<UpdatePolicyDescriptionRequest, Builder> {
        private String newDescription; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolicyDescriptionRequest request) {
            super(request);
            this.newDescription = request.newDescription;
            this.policyName = request.policyName;
        } 

        /**
         * <p>The description of the policy.</p>
         * <p>The value of the parameter must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test policy.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TestPolicy</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public UpdatePolicyDescriptionRequest build() {
            return new UpdatePolicyDescriptionRequest(this);
        } 

    } 

}
