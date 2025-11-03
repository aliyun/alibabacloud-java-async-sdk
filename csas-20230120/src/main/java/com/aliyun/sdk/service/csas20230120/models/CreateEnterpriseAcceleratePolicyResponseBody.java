// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateEnterpriseAcceleratePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnterpriseAcceleratePolicyResponseBody</p>
 */
public class CreateEnterpriseAcceleratePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EapId")
    private String eapId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEnterpriseAcceleratePolicyResponseBody(Builder builder) {
        this.eapId = builder.eapId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseAcceleratePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eapId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEnterpriseAcceleratePolicyResponseBody model) {
            this.eapId = model.eapId;
            this.requestId = model.requestId;
        } 

        /**
         * EapId.
         */
        public Builder eapId(String eapId) {
            this.eapId = eapId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEnterpriseAcceleratePolicyResponseBody build() {
            return new CreateEnterpriseAcceleratePolicyResponseBody(this);
        } 

    } 

}
