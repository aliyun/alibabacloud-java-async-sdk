// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link SetAccessKeyPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetAccessKeyPolicyRequest</p>
 */
public class SetAccessKeyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessKeyPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private SetAccessKeyPolicyRequest(Builder builder) {
        super(builder);
        this.accessKeyPolicy = builder.accessKeyPolicy;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessKeyPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyPolicy
     */
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<SetAccessKeyPolicyRequest, Builder> {
        private String accessKeyPolicy; 
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(SetAccessKeyPolicyRequest request) {
            super(request);
            this.accessKeyPolicy = request.accessKeyPolicy;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Status&quot;:&quot;Inactive&quot;,&quot;Statements&quot;:[{&quot;Value&quot;:&quot;AllowAllVPC&quot;,&quot;Type&quot;:&quot;VPCWhiteList&quot;,&quot;IPList&quot;:[&quot;::/0&quot;,&quot;0.0.0.0/0&quot;]}]}</p>
         */
        public Builder accessKeyPolicy(String accessKeyPolicy) {
            this.putQueryParameter("AccessKeyPolicy", accessKeyPolicy);
            this.accessKeyPolicy = accessKeyPolicy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI*******************</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public SetAccessKeyPolicyRequest build() {
            return new SetAccessKeyPolicyRequest(this);
        } 

    } 

}
