// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDcdnKvDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDcdnKvDetailResponseBody</p>
 */
public class GetDcdnKvDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpirationTtl")
    private String expirationTtl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetDcdnKvDetailResponseBody(Builder builder) {
        this.expirationTtl = builder.expirationTtl;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return expirationTtl
     */
    public String getExpirationTtl() {
        return this.expirationTtl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String expirationTtl; 
        private String requestId; 
        private String value; 

        /**
         * ExpirationTtl.
         */
        public Builder expirationTtl(String expirationTtl) {
            this.expirationTtl = expirationTtl;
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
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public GetDcdnKvDetailResponseBody build() {
            return new GetDcdnKvDetailResponseBody(this);
        } 

    } 

}
