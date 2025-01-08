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
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private String description; 
        private String policyDocument; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.description = request.description;
            this.policyDocument = request.policyDocument;
            this.policyName = request.policyName;
        } 

        /**
         * <p>The description of the policy.</p>
         * <p>The description must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Query ECS instances in a specific region</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The document of the policy.</p>
         * <p>The document must be 1 to 6,144 characters in length.</p>
         * <p>For more information about policy elements and sample policies, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a> and <a href="https://help.aliyun.com/document_detail/210969.html">Overview of sample policies</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Effect&quot;: &quot;Allow&quot;,&quot;Action&quot;: &quot;ecs:Describe*&quot;,&quot;Resource&quot;: &quot;acs:ecs:cn-qingdao:<em>:instance/</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>View-ECS-instances-in-a-specific-region</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

}
