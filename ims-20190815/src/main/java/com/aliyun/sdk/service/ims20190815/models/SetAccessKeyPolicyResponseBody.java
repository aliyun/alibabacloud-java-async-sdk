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
 * {@link SetAccessKeyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>SetAccessKeyPolicyResponseBody</p>
 */
public class SetAccessKeyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    private String accessKeyPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetAccessKeyPolicyResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeyPolicy = builder.accessKeyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessKeyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
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
        private String accessKeyId; 
        private String accessKeyPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetAccessKeyPolicyResponseBody model) {
            this.accessKeyId = model.accessKeyId;
            this.accessKeyPolicy = model.accessKeyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The access key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI*******************</p>
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * <p>The network access restriction policy.</p>
         * <p>A JSON-formatted string. For more information, see the AccessKeyPolicy structure description.</p>
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
         * <p>30C9068D-FBAA-4998-9986-8A562FED0BC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetAccessKeyPolicyResponseBody build() {
            return new SetAccessKeyPolicyResponseBody(this);
        } 

    } 

}
