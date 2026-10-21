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
 * {@link SetAccessKeyPolicyForAccountRequest} extends {@link RequestModel}
 *
 * <p>SetAccessKeyPolicyForAccountRequest</p>
 */
public class SetAccessKeyPolicyForAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessKeyPolicy;

    private SetAccessKeyPolicyForAccountRequest(Builder builder) {
        super(builder);
        this.accessKeyPolicy = builder.accessKeyPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessKeyPolicyForAccountRequest create() {
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

    public static final class Builder extends Request.Builder<SetAccessKeyPolicyForAccountRequest, Builder> {
        private String accessKeyPolicy; 

        private Builder() {
            super();
        } 

        private Builder(SetAccessKeyPolicyForAccountRequest request) {
            super(request);
            this.accessKeyPolicy = request.accessKeyPolicy;
        } 

        /**
         * <p>The network access restriction policy. The value is a JSON-formatted string. For more information, see the AccessKeyPolicy structure description in the SetAccessKeyPolicy documentation.</p>
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

        @Override
        public SetAccessKeyPolicyForAccountRequest build() {
            return new SetAccessKeyPolicyForAccountRequest(this);
        } 

    } 

}
