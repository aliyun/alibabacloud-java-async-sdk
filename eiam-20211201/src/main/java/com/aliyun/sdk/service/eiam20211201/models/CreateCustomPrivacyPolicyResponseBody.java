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
 * {@link CreateCustomPrivacyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomPrivacyPolicyResponseBody</p>
 */
public class CreateCustomPrivacyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyId")
    private String customPrivacyPolicyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomPrivacyPolicyResponseBody(Builder builder) {
        this.customPrivacyPolicyId = builder.customPrivacyPolicyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomPrivacyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPrivacyPolicyId
     */
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customPrivacyPolicyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomPrivacyPolicyResponseBody model) {
            this.customPrivacyPolicyId = model.customPrivacyPolicyId;
            this.requestId = model.requestId;
        } 

        /**
         * CustomPrivacyPolicyId.
         */
        public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
            this.customPrivacyPolicyId = customPrivacyPolicyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomPrivacyPolicyResponseBody build() {
            return new CreateCustomPrivacyPolicyResponseBody(this);
        } 

    } 

}
