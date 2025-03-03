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
 * {@link CreatePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyVersionRequest</p>
 */
public class CreatePolicyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SetAsDefault")
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
         * <p>The document of the policy.</p>
         * <p>The document must be 1 to 2,048 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Statement&quot;: [{ &quot;Action&quot;: [&quot;oss:<em>&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: [&quot;acs:oss:</em>:<em>:</em>&quot;]}], &quot;Version&quot;: &quot;1&quot;}</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Specifies whether to set the policy version as the default version. Valid values:</p>
         * <ul>
         * <li>false: The policy version is not set as the default version.</li>
         * <li>true: The policy version is set as the default version.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
