// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSignalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSignalsResponseBody</p>
 */
public class ListSignalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signals")
    private java.util.List<Signals> signals;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSignalsResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.signals = builder.signals;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSignalsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signals
     */
    public java.util.List<Signals> getSignals() {
        return this.signals;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String jobId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Signals> signals; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSignalsResponseBody model) {
            this.jobId = model.jobId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.signals = model.signals;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-...</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of signal records for the job. Each element has the same structure as the response of GetSignal.</p>
         */
        public Builder signals(java.util.List<Signals> signals) {
            this.signals = signals;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSignalsResponseBody build() {
            return new ListSignalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSignalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSignalsResponseBody</p>
     */
    public static class Signals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PodNames")
        private java.util.List<String> podNames;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private String signal;

        @com.aliyun.core.annotation.NameInMap("SignalId")
        private String signalId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Signals(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.podNames = builder.podNames;
            this.reason = builder.reason;
            this.roles = builder.roles;
            this.scope = builder.scope;
            this.signal = builder.signal;
            this.signalId = builder.signalId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signals create() {
            return builder().build();
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return podNames
         */
        public java.util.List<String> getPodNames() {
            return this.podNames;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return roles
         */
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return signal
         */
        public String getSignal() {
            return this.signal;
        }

        /**
         * @return signalId
         */
        public String getSignalId() {
            return this.signalId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreated; 
            private String gmtModified; 
            private String message; 
            private java.util.List<String> podNames; 
            private String reason; 
            private java.util.List<String> roles; 
            private String scope; 
            private String signal; 
            private String signalId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Signals model) {
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.message = model.message;
                this.podNames = model.podNames;
                this.reason = model.reason;
                this.roles = model.roles;
                this.scope = model.scope;
                this.signal = model.signal;
                this.signalId = model.signalId;
                this.status = model.status;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-30T14:07:38+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-30T14:07:38+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The message returned with the result.</p>
             * 
             * <strong>example:</strong>
             * <p>signal delivered to 1 pods</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The list of pod names.</p>
             */
            public Builder podNames(java.util.List<String> podNames) {
                this.podNames = podNames;
                return this;
            }

            /**
             * <p>The reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The list of role types.</p>
             */
            public Builder roles(java.util.List<String> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The delivery scope.</p>
             * 
             * <strong>example:</strong>
             * <p>pods</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The signal code.</p>
             * 
             * <strong>example:</strong>
             * <p>SIGUSR1</p>
             */
            public Builder signal(String signal) {
                this.signal = signal;
                return this;
            }

            /**
             * <p>The signal ID.</p>
             * 
             * <strong>example:</strong>
             * <p>oper*********</p>
             */
            public Builder signalId(String signalId) {
                this.signalId = signalId;
                return this;
            }

            /**
             * <p>The signal status.</p>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Signals build() {
                return new Signals(this);
            } 

        } 

    }
}
