// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAuditHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditHistoryResponseBody</p>
 */
public class GetAuditHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Histories")
    private java.util.List < Histories> histories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The review records.</p>
         */
        public Builder histories(java.util.List < Histories> histories) {
            this.histories = histories;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-43*****D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The manual review result. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The video can be played.</li>
         * <li><strong>Blocked</strong>: The video is blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of review records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetAuditHistoryResponseBody build() {
            return new GetAuditHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuditHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditHistoryResponseBody</p>
     */
    public static class Histories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auditor")
        private String auditor;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>auditor</p>
             */
            public Builder auditor(String auditor) {
                this.auditor = auditor;
                return this;
            }

            /**
             * <p>The review comments, which are provided by the reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>Contains nudity</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the review record was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The reason why the video failed the review. If the video failed the review, specify the reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Pornographic video</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The manual review result. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The video can be played.</li>
             * <li><strong>Blocked</strong>: The video is blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Blocked</p>
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
