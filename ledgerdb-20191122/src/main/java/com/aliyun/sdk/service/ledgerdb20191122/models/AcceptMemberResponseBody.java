// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptMemberResponseBody} extends {@link TeaModel}
 *
 * <p>AcceptMemberResponseBody</p>
 */
public class AcceptMemberResponseBody extends TeaModel {
    @NameInMap("MemberId")
    private String memberId;

    @NameInMap("RequestId")
    private String requestId;

    private AcceptMemberResponseBody(Builder builder) {
        this.memberId = builder.memberId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String memberId; 
        private String requestId; 

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AcceptMemberResponseBody build() {
            return new AcceptMemberResponseBody(this);
        } 

    } 

}
