// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
         * The description of the access control policy.
         * <p>
         * 
         * The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The effective scope of the access control policy.
         * <p>
         * 
         * The value RAM indicates that the access control policy takes effect only for RAM users and RAM roles.
         */
        public Builder effectScope(String effectScope) {
            this.putQueryParameter("EffectScope", effectScope);
            this.effectScope = effectScope;
            return this;
        }

        /**
         * The document of the access control policy.
         * <p>
         * 
         * The document can be a maximum of 4,096 characters in length.
         * 
         * For more information about the languages of access control policies, see [Languages of access control policies](~~179096~~).
         * 
         * For more information about the examples of access control policies, see [Examples of custom access control policies](~~181474~~).
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * The name of the access control policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.
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
