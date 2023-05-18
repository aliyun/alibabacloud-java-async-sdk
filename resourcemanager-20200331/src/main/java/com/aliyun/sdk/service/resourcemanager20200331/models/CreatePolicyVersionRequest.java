// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyVersionRequest</p>
 */
public class CreatePolicyVersionRequest extends Request {
    @Query
    @NameInMap("PolicyDocument")
    @Validation(required = true)
    private String policyDocument;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("SetAsDefault")
    private Boolean setAsDefault;

    private CreatePolicyVersionRequest(Builder builder) {
        super(builder);
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
        this.setAsDefault = builder.setAsDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return setAsDefault
     */
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public static final class Builder extends Request.Builder<CreatePolicyVersionRequest, Builder> {
        private String policyDocument; 
        private String policyName; 
        private Boolean setAsDefault; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyVersionRequest request) {
            super(request);
            this.policyDocument = request.policyDocument;
            this.policyName = request.policyName;
            this.setAsDefault = request.setAsDefault;
        } 

        /**
         * The document of the policy.
         * <p>
         * 
         * The document must be 1 to 2,048 characters in length.
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * The name of the policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * Specifies whether to set the policy version as the default version. Valid values:
         * <p>
         * 
         * *   false: The policy version is not set as the default version.
         * *   true: The policy version is set as the default version.
         * 
         * Default value: false.
         */
        public Builder setAsDefault(Boolean setAsDefault) {
            this.putQueryParameter("SetAsDefault", setAsDefault);
            this.setAsDefault = setAsDefault;
            return this;
        }

        @Override
        public CreatePolicyVersionRequest build() {
            return new CreatePolicyVersionRequest(this);
        } 

    } 

}
