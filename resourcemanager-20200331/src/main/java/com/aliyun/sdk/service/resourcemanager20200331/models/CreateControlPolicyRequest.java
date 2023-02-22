// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateControlPolicyRequest</p>
 */
public class CreateControlPolicyRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EffectScope")
    @Validation(required = true)
    private String effectScope;

    @Query
    @NameInMap("PolicyDocument")
    @Validation(required = true)
    private String policyDocument;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private CreateControlPolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.effectScope = builder.effectScope;
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectScope
     */
    public String getEffectScope() {
        return this.effectScope;
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

    public static final class Builder extends Request.Builder<CreateControlPolicyRequest, Builder> {
        private String description; 
        private String effectScope; 
        private String policyDocument; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(CreateControlPolicyRequest request) {
            super(request);
            this.description = request.description;
            this.effectScope = request.effectScope;
            this.policyDocument = request.policyDocument;
            this.policyName = request.policyName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EffectScope.
         */
        public Builder effectScope(String effectScope) {
            this.putQueryParameter("EffectScope", effectScope);
            this.effectScope = effectScope;
            return this;
        }

        /**
         * PolicyDocument.
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
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
        public CreateControlPolicyRequest build() {
            return new CreateControlPolicyRequest(this);
        } 

    } 

}
