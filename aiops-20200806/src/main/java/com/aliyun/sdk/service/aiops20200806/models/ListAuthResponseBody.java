// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthResponseBody</p>
 */
public class ListAuthResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < String > list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListAuthResponseBody(Builder builder) {
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < String > getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > list; 
        private String message; 
        private String requestId; 

        /**
         * List.
         */
        public Builder list(java.util.List < String > list) {
            this.list = list;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAuthResponseBody build() {
            return new ListAuthResponseBody(this);
        } 

    } 

}
