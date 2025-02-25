// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventResponseBody</p>
 */
public class ListEventResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("List")
    private java.util.List < java.util.Map<String, ?>> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageTotal")
    private Long pageTotal;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private ListEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < java.util.Map<String, ?>> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageTotal
     */
    public Long getPageTotal() {
        return this.pageTotal;
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
        private Long code; 
        private java.util.List < java.util.Map<String, ?>> list; 
        private String message; 
        private Long pageTotal; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List < java.util.Map<String, ?>> list) {
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
         * PageTotal.
         */
        public Builder pageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
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

        public ListEventResponseBody build() {
            return new ListEventResponseBody(this);
        } 

    } 

}
