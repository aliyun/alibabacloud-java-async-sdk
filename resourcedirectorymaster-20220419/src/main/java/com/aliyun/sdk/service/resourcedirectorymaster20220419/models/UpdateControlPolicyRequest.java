// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPolicyRequest</p>
 */
public class UpdateControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPolicyDocument")
    private String newPolicyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPolicyName")
    private String newPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private UpdateControlPolicyRequest(Builder builder) {
        super(builder);
        this.newDescription = builder.newDescription;
        this.newPolicyDocument = builder.newPolicyDocument;
        this.newPolicyName = builder.newPolicyName;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateControlPolicyRequest create() {
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
     * @return newPolicyDocument
     */
    public String getNewPolicyDocument() {
        return this.newPolicyDocument;
    }

    /**
     * @return newPolicyName
     */
    public String getNewPolicyName() {
        return this.newPolicyName;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<UpdateControlPolicyRequest, Builder> {
        private String newDescription; 
        private String newPolicyDocument; 
        private String newPolicyName; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateControlPolicyRequest request) {
            super(request);
            this.newDescription = request.newDescription;
            this.newPolicyDocument = request.newPolicyDocument;
            this.newPolicyName = request.newPolicyName;
            this.policyId = request.policyId;
        } 

        /**
         * The new description of the access control policy.
         * <p>
         * 
         * The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * The new document of the access control policy.
         * <p>
         * 
         * The document can be a maximum of 4,096 characters in length.
         * 
         * For more information about the languages of access control policies, see [Languages of access control policies](~~179096~~).
         * 
         * For more information about the examples of access control policies, see [Examples of custom access control policies](~~181474~~).
         */
        public Builder newPolicyDocument(String newPolicyDocument) {
            this.putQueryParameter("NewPolicyDocument", newPolicyDocument);
            this.newPolicyDocument = newPolicyDocument;
            return this;
        }

        /**
         * The new name of the access control policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.
         */
        public Builder newPolicyName(String newPolicyName) {
            this.putQueryParameter("NewPolicyName", newPolicyName);
            this.newPolicyName = newPolicyName;
            return this;
        }

        /**
         * The ID of the access control policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public UpdateControlPolicyRequest build() {
            return new UpdateControlPolicyRequest(this);
        } 

    } 

}
