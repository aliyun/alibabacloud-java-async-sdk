// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuditResultResponseBody</p>
 */
public class QueryAuditResultResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("Total")
    private Integer total;

    private QueryAuditResultResponseBody(Builder builder) {
        this.message = builder.message;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuditResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
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
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String message; 
        private java.util.List < Records> records; 
        private String requestId; 
        private Integer status; 
        private Integer total; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
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
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryAuditResultResponseBody build() {
            return new QueryAuditResultResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("Crid")
        private String crid;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("State")
        private Integer state;

        private Records(Builder builder) {
            this.crid = builder.crid;
            this.reason = builder.reason;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return crid
         */
        public String getCrid() {
            return this.crid;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        public static final class Builder {
            private String crid; 
            private String reason; 
            private Integer state; 

            /**
             * Crid.
             */
            public Builder crid(String crid) {
                this.crid = crid;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
