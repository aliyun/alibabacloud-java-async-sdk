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
 * {@link SetAccessKeyPolicyForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>SetAccessKeyPolicyForAccountResponseBody</p>
 */
public class SetAccessKeyPolicyForAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    private String accessKeyPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetAccessKeyPolicyForAccountResponseBody(Builder builder) {
        this.accessKeyPolicy = builder.accessKeyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessKeyPolicyForAccountResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessKeyPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetAccessKeyPolicyForAccountResponseBody model) {
            this.accessKeyPolicy = model.accessKeyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network access restriction policy. The value is a JSON-formatted string. For more information, see the AccessKeyPolicy structure description in the SetAccessKeyPolicy documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Status&quot;:&quot;Inactive&quot;,&quot;Statements&quot;:[{&quot;Value&quot;:&quot;AllowAllVPC&quot;,&quot;Type&quot;:&quot;VPCWhiteList&quot;,&quot;IPList&quot;:[&quot;::/0&quot;,&quot;0.0.0.0/0&quot;]}]}</p>
         */
        public Builder accessKeyPolicy(String accessKeyPolicy) {
            this.accessKeyPolicy = accessKeyPolicy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6616F09B-2768-4C11-8866-A8EE4C4A583E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetAccessKeyPolicyForAccountResponseBody build() {
            return new SetAccessKeyPolicyForAccountResponseBody(this);
        } 

    } 

}
