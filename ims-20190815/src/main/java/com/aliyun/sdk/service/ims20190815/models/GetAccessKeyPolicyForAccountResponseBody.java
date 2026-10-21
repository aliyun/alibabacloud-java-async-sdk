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
 * {@link GetAccessKeyPolicyForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyPolicyForAccountResponseBody</p>
 */
public class GetAccessKeyPolicyForAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    private String accessKeyPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessKeyPolicyForAccountResponseBody(Builder builder) {
        this.accessKeyPolicy = builder.accessKeyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyPolicyForAccountResponseBody create() {
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

        private Builder(GetAccessKeyPolicyForAccountResponseBody model) {
            this.accessKeyPolicy = model.accessKeyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network access restriction policy. The value is a JSON-formatted string. For more information about the AccessKeyPolicy structure, see the SetAccessKeyPolicy documentation.</p>
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
         * <p>85836703-8D4F-485F-9726-4D1C730F957E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyPolicyForAccountResponseBody build() {
            return new GetAccessKeyPolicyForAccountResponseBody(this);
        } 

    } 

}
