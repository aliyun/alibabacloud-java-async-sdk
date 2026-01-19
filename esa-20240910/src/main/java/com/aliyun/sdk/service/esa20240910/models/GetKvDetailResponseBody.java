// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetKvDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetKvDetailResponseBody</p>
 */
public class GetKvDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpirationTtl")
    private String expirationTtl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetKvDetailResponseBody(Builder builder) {
        this.expirationTtl = builder.expirationTtl;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKvDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetKvDetailResponseBody model) {
            this.expirationTtl = model.expirationTtl;
            this.requestId = model.requestId;
            this.value = model.value;
        } 

        /**
         * <p>The expiration time of the key. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder expirationTtl(String expirationTtl) {
            this.expirationTtl = expirationTtl;
            return this;
        }

        /**
         * <p>The expiration time of the key. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The value of the key. The value of the root node.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public GetKvDetailResponseBody build() {
            return new GetKvDetailResponseBody(this);
        } 

    } 

}
