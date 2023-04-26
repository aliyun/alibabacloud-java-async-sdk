// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditHistoryResponseBody</p>
 */
public class GetAuditHistoryResponseBody extends TeaModel {
    @NameInMap("Histories")
    private java.util.List < Histories> histories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Total")
    private Long total;

    private GetAuditHistoryResponseBody(Builder builder) {
        this.histories = builder.histories;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return histories
     */
    public java.util.List < Histories> getHistories() {
        return this.histories;
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Histories> histories; 
        private String requestId; 
        private String status; 
        private Long total; 

        /**
         * The ID of the request.
         */
        public Builder histories(java.util.List < Histories> histories) {
            this.histories = histories;
            return this;
        }

        /**
         * The review comments, which are provided by the reviewer.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The reviewer.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The sorting rule of the results. Valid values:
         * <p>
         * 
         * *   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.
         * *   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetAuditHistoryResponseBody build() {
            return new GetAuditHistoryResponseBody(this);
        } 

    } 

    public static class Histories extends TeaModel {
        @NameInMap("Auditor")
        private String auditor;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private Histories(Builder builder) {
            this.auditor = builder.auditor;
            this.comment = builder.comment;
            this.creationTime = builder.creationTime;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
            return builder().build();
        }

        /**
         * @return auditor
         */
        public String getAuditor() {
            return this.auditor;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String auditor; 
            private String comment; 
            private String creationTime; 
            private String reason; 
            private String status; 

            /**
             * Auditor.
             */
            public Builder auditor(String auditor) {
                this.auditor = auditor;
                return this;
            }

            /**
             * Queries the manual review history.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The manual review result. Valid values:
             * <p>
             * 
             * - **Normal**: The video can be played.
             * - **Blocked**: The video is blocked.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The time when the review record was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
}
