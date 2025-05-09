// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link RevokeTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeTokenResponseBody</p>
 */
public class RevokeTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RevokeTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTokenResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(RevokeTokenResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>833EDFCB-C447-4CE3-B21F-3A4C2D1B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RevokeTokenResponseBody build() {
            return new RevokeTokenResponseBody(this);
        } 

    } 

}
