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
 * {@link CreateTrustedOriginResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrustedOriginResponseBody</p>
 */
public class CreateTrustedOriginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
    private String trustedOriginId;

    private CreateTrustedOriginResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trustedOriginId = builder.trustedOriginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrustedOriginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trustedOriginId
     */
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

    public static final class Builder {
        private String requestId; 
        private String trustedOriginId; 

        private Builder() {
        } 

        private Builder(CreateTrustedOriginResponseBody model) {
            this.requestId = model.requestId;
            this.trustedOriginId = model.trustedOriginId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrustedOriginId.
         */
        public Builder trustedOriginId(String trustedOriginId) {
            this.trustedOriginId = trustedOriginId;
            return this;
        }

        public CreateTrustedOriginResponseBody build() {
            return new CreateTrustedOriginResponseBody(this);
        } 

    } 

}
