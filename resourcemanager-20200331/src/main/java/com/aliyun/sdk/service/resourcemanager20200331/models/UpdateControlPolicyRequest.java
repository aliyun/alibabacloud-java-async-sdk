// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
         * <p>The new description of the access control policy.</p>
         * <p>The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (_), and hyphens (-) and must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleControlPolicy</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The new document of the access control policy.</p>
         * <p>The document can be a maximum of 4,096 characters in length.</p>
         * <p>For more information about the languages of access control policies, see <a href="https://help.aliyun.com/document_detail/179096.html">Languages of access control policies</a>.</p>
         * <p>For more information about the examples of access control policies, see <a href="https://help.aliyun.com/document_detail/181474.html">Examples of custom access control policies</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:[&quot;ram:UpdateRole&quot;,&quot;ram:DeleteRole&quot;,&quot;ram:AttachPolicyToRole&quot;,&quot;ram:DetachPolicyFromRole&quot;],&quot;Resource&quot;:&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole&quot;}]}</p>
         */
        public Builder newPolicyDocument(String newPolicyDocument) {
            this.putQueryParameter("NewPolicyDocument", newPolicyDocument);
            this.newPolicyDocument = newPolicyDocument;
            return this;
        }

        /**
         * <p>The new name of the access control policy.</p>
         * <p>The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>NewControlPolicy</p>
         */
        public Builder newPolicyName(String newPolicyName) {
            this.putQueryParameter("NewPolicyName", newPolicyName);
            this.newPolicyName = newPolicyName;
            return this;
        }

        /**
         * <p>The ID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-jExXAqIYkwHN****</p>
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
