// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchRegistAnonymousTbAccountResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBatchRegistAnonymousTbAccountResultResponseBody</p>
 */
public class QueryBatchRegistAnonymousTbAccountResultResponseBody extends TeaModel {
    @NameInMap("BatchId")
    private String batchId;

    @NameInMap("Code")
    private String code;

    @NameInMap("FailIds")
    private FailIds failIds;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private QueryBatchRegistAnonymousTbAccountResultResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.code = builder.code;
        this.failIds = builder.failIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchRegistAnonymousTbAccountResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failIds
     */
    public FailIds getFailIds() {
        return this.failIds;
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
        private String batchId; 
        private String code; 
        private FailIds failIds; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FailIds.
         */
        public Builder failIds(FailIds failIds) {
            this.failIds = failIds;
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

        public QueryBatchRegistAnonymousTbAccountResultResponseBody build() {
            return new QueryBatchRegistAnonymousTbAccountResultResponseBody(this);
        } 

    } 

    public static class FailIds extends TeaModel {
        @NameInMap("FailId")
        private java.util.List < String > failId;

        private FailIds(Builder builder) {
            this.failId = builder.failId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailIds create() {
            return builder().build();
        }

        /**
         * @return failId
         */
        public java.util.List < String > getFailId() {
            return this.failId;
        }

        public static final class Builder {
            private java.util.List < String > failId; 

            /**
             * FailId.
             */
            public Builder failId(java.util.List < String > failId) {
                this.failId = failId;
                return this;
            }

            public FailIds build() {
                return new FailIds(this);
            } 

        } 

    }
}
