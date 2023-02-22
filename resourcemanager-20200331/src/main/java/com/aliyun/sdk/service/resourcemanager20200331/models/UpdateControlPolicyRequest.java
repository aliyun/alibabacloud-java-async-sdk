// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateControlPolicyRequest</p>
 */
public class UpdateControlPolicyRequest extends Request {
    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewPolicyDocument")
    private String newPolicyDocument;

    @Query
    @NameInMap("NewPolicyName")
    private String newPolicyName;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
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
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * NewPolicyDocument.
         */
        public Builder newPolicyDocument(String newPolicyDocument) {
            this.putQueryParameter("NewPolicyDocument", newPolicyDocument);
            this.newPolicyDocument = newPolicyDocument;
            return this;
        }

        /**
         * NewPolicyName.
         */
        public Builder newPolicyName(String newPolicyName) {
            this.putQueryParameter("NewPolicyName", newPolicyName);
            this.newPolicyName = newPolicyName;
            return this;
        }

        /**
         * PolicyId.
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
