// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateControlPolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.effectScope = builder.effectScope;
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
        this.tag = builder.tag;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateControlPolicyRequest, Builder> {
        private String description; 
        private String effectScope; 
        private String policyDocument; 
        private String policyName; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateControlPolicyRequest request) {
            super(request);
            this.description = request.description;
            this.effectScope = request.effectScope;
            this.policyDocument = request.policyDocument;
            this.policyName = request.policyName;
            this.tag = request.tag;
        } 

        /**
         * <p>The description of the access control policy.</p>
         * <p>The description must be 1 to 1,024 characters in length. The description can contain letters, digits, underscores (_), and hyphens (-) and must start with a letter.</p>
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
         * <p>The effective scope of the access control policy.</p>
         * <p>The value RAM indicates that the access control policy takes effect only for RAM users and RAM roles.</p>
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
         * <p>The document of the access control policy.</p>
         * <p>The document can be a maximum of 4,096 characters in length.</p>
         * <p>For more information about the languages of access control policies, see <a href="https://help.aliyun.com/document_detail/179096.html">Languages of access control policies</a>.</p>
         * <p>For more information about the examples of access control policies, see <a href="https://help.aliyun.com/document_detail/181474.html">Examples of custom access control policies</a>.</p>
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
         * <p>The name of the access control policy.</p>
         * <p>The name must be 1 to 128 characters in length. The name can contain letters, digits, and hyphens (-) and must start with a letter.</p>
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

        /**
         * <p>The tag to add to the access control policy.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateControlPolicyRequest build() {
            return new CreateControlPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateControlPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateControlPolicyRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
