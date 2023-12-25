// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubscribedCalendarResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSubscribedCalendarResponseBody</p>
 */
public class DeleteSubscribedCalendarResponseBody extends TeaModel {
    @NameInMap("Result")
    private Boolean result;

    @NameInMap("requestId")
    private String requestId;

    private DeleteSubscribedCalendarResponseBody(Builder builder) {
        this.result = builder.result;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubscribedCalendarResponseBody create() {
        return builder().build();
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean result; 
        private String requestId; 

        /**
         * Result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteSubscribedCalendarResponseBody build() {
            return new DeleteSubscribedCalendarResponseBody(this);
        } 

    } 

}
