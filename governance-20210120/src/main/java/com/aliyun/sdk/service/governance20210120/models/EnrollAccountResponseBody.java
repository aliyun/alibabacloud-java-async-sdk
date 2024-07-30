// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnrollAccountResponseBody} extends {@link TeaModel}
 *
 * <p>EnrollAccountResponseBody</p>
 */
public class EnrollAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountUid")
    private Long accountUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnrollAccountResponseBody(Builder builder) {
        this.accountUid = builder.accountUid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnrollAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountUid
     */
    public Long getAccountUid() {
        return this.accountUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long accountUid; 
        private String requestId; 

        /**
         * The account ID.
         */
        public Builder accountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnrollAccountResponseBody build() {
            return new EnrollAccountResponseBody(this);
        } 

    } 

}
