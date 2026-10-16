// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetKeyPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetKeyPolicyRequest</p>
 */
public class GetKeyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private GetKeyPolicyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeyPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<GetKeyPolicyRequest, Builder> {
        private String keyId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(GetKeyPolicyRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.policyName = request.policyName;
        } 

        /**
         * <p>The ID or Alibaba Cloud Resource Name (ARN) of the key.</p>
         * <blockquote>
         * <p>When you access a key in another Alibaba Cloud account, you must enter the ARN of the key. The ARN of a key is in the <code>acs:kms:${region}:${account}:key/${keyid}</code> format.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz630494463ejqjx****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The name of the key policy. Only the static value default is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public GetKeyPolicyRequest build() {
            return new GetKeyPolicyRequest(this);
        } 

    } 

}
