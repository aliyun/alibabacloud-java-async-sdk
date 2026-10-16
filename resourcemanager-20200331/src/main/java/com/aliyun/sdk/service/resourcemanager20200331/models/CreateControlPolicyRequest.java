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
 * {@link CreateControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateControlPolicyRequest</p>
 */
public class CreateControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String effectScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description of the control policy.</p>
         * <p>The description must be 1 to 1024 characters in length, must start with a letter, and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleControlPolicy</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The effective scope of the control policy.</p>
         * <p>Valid values: RAM, which indicates that the control policy takes effect only for Resource Access Management (RAM) users or RAM roles.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        public Builder effectScope(String effectScope) {
            this.putQueryParameter("EffectScope", effectScope);
            this.effectScope = effectScope;
            return this;
        }

        /**
         * <p>The content of the control policy.</p>
         * <p>The maximum length is 4096 characters.</p>
         * <p>For information about the control policy language, see <a href="https://help.aliyun.com/document_detail/179096.html">Control policy language</a>.</p>
         * <p>For examples of control policies, see <a href="https://help.aliyun.com/document_detail/181474.html">Examples of custom control policies</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:[&quot;ram:UpdateRole&quot;,&quot;ram:DeleteRole&quot;,&quot;ram:AttachPolicyToRole&quot;,&quot;ram:DetachPolicyFromRole&quot;],&quot;Resource&quot;:&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole&quot;}]}</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>Policy Name of the control policy.</p>
         * <p>Policy Name must be 1 to 128 characters in length, must start with a letter, and can contain letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleControlPolicy</p>
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
