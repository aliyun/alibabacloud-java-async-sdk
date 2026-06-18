// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ListQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaResponseBody</p>
 */
public class ListQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("quotas")
    private java.util.List<Quota> quotas;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotas
     */
    public java.util.List<Quota> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String nextToken; 
        private java.util.List<Quota> quotas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQuotaResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.quotas = model.quotas;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * quotas.
         */
        public Builder quotas(java.util.List<Quota> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuotaResponseBody build() {
            return new ListQuotaResponseBody(this);
        } 

    } 

}
