// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CheckSmsSignNewResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSmsSignNewResponseBody</p>
 */
public class CheckSmsSignNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Common")
    private Boolean common;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Verification")
    private Boolean verification;

    private CheckSmsSignNewResponseBody(Builder builder) {
        this.common = builder.common;
        this.requestId = builder.requestId;
        this.verification = builder.verification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSmsSignNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return common
     */
    public Boolean getCommon() {
        return this.common;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verification
     */
    public Boolean getVerification() {
        return this.verification;
    }

    public static final class Builder {
        private Boolean common; 
        private String requestId; 
        private Boolean verification; 

        private Builder() {
        } 

        private Builder(CheckSmsSignNewResponseBody model) {
            this.common = model.common;
            this.requestId = model.requestId;
            this.verification = model.verification;
        } 

        /**
         * Common.
         */
        public Builder common(Boolean common) {
            this.common = common;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Verification.
         */
        public Builder verification(Boolean verification) {
            this.verification = verification;
            return this;
        }

        public CheckSmsSignNewResponseBody build() {
            return new CheckSmsSignNewResponseBody(this);
        } 

    } 

}
