// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetGlobalCloudAccountSystemRolePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetGlobalCloudAccountSystemRolePolicyResponseBody</p>
 */
public class GetGlobalCloudAccountSystemRolePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyDocument;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private GetGlobalCloudAccountSystemRolePolicyResponseBody(Builder builder) {
        this.policyDocument = builder.policyDocument;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalCloudAccountSystemRolePolicyResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyDocument; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGlobalCloudAccountSystemRolePolicyResponseBody model) {
            this.policyDocument = model.policyDocument;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>本次请求的唯一标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGlobalCloudAccountSystemRolePolicyResponseBody build() {
            return new GetGlobalCloudAccountSystemRolePolicyResponseBody(this);
        } 

    } 

}
