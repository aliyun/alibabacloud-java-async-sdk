// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTokenResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTokenResponseBody</p>
 */
public class QueryTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenStatus")
    private Boolean tokenStatus;

    private QueryTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tokenStatus = builder.tokenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenStatus
     */
    public Boolean getTokenStatus() {
        return this.tokenStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean tokenStatus; 

        /**
         * The unique ID that the system generates for the request. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the queried token. Valid values:
         * <p>
         * 
         * *   **true**: indicates the token is valid.
         * *   **false**: indicates the token is invalid.
         */
        public Builder tokenStatus(Boolean tokenStatus) {
            this.tokenStatus = tokenStatus;
            return this;
        }

        public QueryTokenResponseBody build() {
            return new QueryTokenResponseBody(this);
        } 

    } 

}
