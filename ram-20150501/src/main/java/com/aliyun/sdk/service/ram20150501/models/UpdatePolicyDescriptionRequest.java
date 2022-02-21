// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolicyDescriptionRequest</p>
 */
public class UpdatePolicyDescriptionRequest extends Request {
    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("PolicyName")
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

        private Builder(UpdatePolicyDescriptionRequest response) {
            super(response);
            this.newDescription = response.newDescription;
            this.policyName = response.policyName;
        } 

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
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
        public UpdatePolicyDescriptionRequest build() {
            return new UpdatePolicyDescriptionRequest(this);
        } 

    } 

}
