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
 * {@link CreatePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyVersionRequest</p>
 */
public class CreatePolicyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotateStrategy")
    private String rotateStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SetAsDefault")
    private Boolean setAsDefault;

    private CreatePolicyVersionRequest(Builder builder) {
        super(builder);
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
        this.rotateStrategy = builder.rotateStrategy;
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
     * @return rotateStrategy
     */
    public String getRotateStrategy() {
        return this.rotateStrategy;
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
        private String rotateStrategy; 
        private Boolean setAsDefault; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyVersionRequest request) {
            super(request);
            this.policyDocument = request.policyDocument;
            this.policyName = request.policyName;
            this.rotateStrategy = request.rotateStrategy;
            this.setAsDefault = request.setAsDefault;
        } 

        /**
         * <p>The document of the policy. The document can be up to 6,144 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:[&quot;oss:<em>&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Resource&quot;:[&quot;acs:oss:</em>:<em>:</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
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
         * <p>The rotation strategy of the policy. The rotation strategy can be used to delete an early policy version.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>None</code>: disables the rotation strategy.</li>
         * <li><code>DeleteOldestNonDefaultVersionWhenLimitExceeded</code>: deletes the earliest non-active version if the number of versions exceeds the limit.</li>
         * </ul>
         * <p>Default value: <code>None</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder rotateStrategy(String rotateStrategy) {
            this.putQueryParameter("RotateStrategy", rotateStrategy);
            this.rotateStrategy = rotateStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to set this policy as the default policy. Default value: <code>false</code>.</p>
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
