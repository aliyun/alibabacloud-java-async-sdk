// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ScheduleWorkItemResponseBody} extends {@link TeaModel}
 *
 * <p>ScheduleWorkItemResponseBody</p>
 */
public class ScheduleWorkItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("created")
    private Boolean created;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("revision")
    private Long revision;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("runSeq")
    private Long runSeq;

    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private ScheduleWorkItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.created = builder.created;
        this.message = builder.message;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.runId = builder.runId;
        this.runSeq = builder.runSeq;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleWorkItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return created
     */
    public Boolean getCreated() {
        return this.created;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public Long getRevision() {
        return this.revision;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return runSeq
     */
    public Long getRunSeq() {
        return this.runSeq;
    }

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder {
        private String code; 
        private Boolean created; 
        private String message; 
        private String planId; 
        private String requestId; 
        private Long revision; 
        private String runId; 
        private Long runSeq; 
        private String workItemId; 

        private Builder() {
        } 

        private Builder(ScheduleWorkItemResponseBody model) {
            this.code = model.code;
            this.created = model.created;
            this.message = model.message;
            this.planId = model.planId;
            this.requestId = model.requestId;
            this.revision = model.revision;
            this.runId = model.runId;
            this.runSeq = model.runSeq;
            this.workItemId = model.workItemId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether a new plan is created in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder created(Boolean created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the physical plan.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The revision number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder revision(Long revision) {
            this.revision = revision;
            return this;
        }

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>The run sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder runSeq(Long runSeq) {
            this.runSeq = runSeq;
            return this;
        }

        /**
         * <p>The ID of the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }

        public ScheduleWorkItemResponseBody build() {
            return new ScheduleWorkItemResponseBody(this);
        } 

    } 

}
