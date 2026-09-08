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
 * {@link GetSignalResponseBody} extends {@link TeaModel}
 *
 * <p>GetSignalResponseBody</p>
 */
public class GetSignalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PodNames")
    private java.util.List<String> podNames;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetSignalResponseBody(Builder builder) {
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.jobId = builder.jobId;
        this.message = builder.message;
        this.podNames = builder.podNames;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.scope = builder.scope;
        this.signal = builder.signal;
        this.signalId = builder.signalId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSignalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String jobId; 
        private String message; 
        private java.util.List<String> podNames; 
        private String reason; 
        private String requestId; 
        private java.util.List<String> roles; 
        private String scope; 
        private String signal; 
        private String signalId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetSignalResponseBody model) {
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.jobId = model.jobId;
            this.message = model.message;
            this.podNames = model.podNames;
            this.reason = model.reason;
            this.requestId = model.requestId;
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
         * <p>2026-03-18T10:02:04+08:00</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:02:04+08:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>oper***********</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The status description, which contains a summary for each pod (number of successful deliveries, names of failed or pending pods, etc.).</p>
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
         * <p>The status reason code, such as <code>Completed</code>, <code>SignalFailed</code>, or <code>StoppedByJobEnded</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * <p>The list of role objects.</p>
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
         * <p>The signal.</p>
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
         * <p>dlc***********</p>
         */
        public Builder signalId(String signalId) {
            this.signalId = signalId;
            return this;
        }

        /**
         * <p>The signal status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetSignalResponseBody build() {
            return new GetSignalResponseBody(this);
        } 

    } 

}
