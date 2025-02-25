// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizedUidResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedUidResponseBody</p>
 */
public class ListAuthorizedUidResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("List")
    private java.util.List < Long > list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private ListAuthorizedUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < Long > getList() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Long > list; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List < Long > list) {
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListAuthorizedUidResponseBody build() {
            return new ListAuthorizedUidResponseBody(this);
        } 

    } 

}
