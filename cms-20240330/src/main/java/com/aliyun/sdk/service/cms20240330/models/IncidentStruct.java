// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentStruct} extends {@link TeaModel}
 *
 * <p>IncidentStruct</p>
 */
public class IncidentStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("escalations")
    private java.util.List<IncidentEscalationStruct> escalations;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("incidentPlan")
    private IncidentPlanStruct incidentPlan;

    @com.aliyun.core.annotation.NameInMap("resource")
    private IncidentResourceDetail resource;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private IncidentStruct(Builder builder) {
        this.content = builder.content;
        this.escalations = builder.escalations;
        this.incidentId = builder.incidentId;
        this.incidentPlan = builder.incidentPlan;
        this.resource = builder.resource;
        this.severity = builder.severity;
        this.status = builder.status;
        this.time = builder.time;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return escalations
     */
    public java.util.List<IncidentEscalationStruct> getEscalations() {
        return this.escalations;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentPlan
     */
    public IncidentPlanStruct getIncidentPlan() {
        return this.incidentPlan;
    }

    /**
     * @return resource
     */
    public IncidentResourceDetail getResource() {
        return this.resource;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String content; 
        private java.util.List<IncidentEscalationStruct> escalations; 
        private String incidentId; 
        private IncidentPlanStruct incidentPlan; 
        private IncidentResourceDetail resource; 
        private String severity; 
        private String status; 
        private Long time; 
        private String title; 
        private String userId; 

        private Builder() {
        } 

        private Builder(IncidentStruct model) {
            this.content = model.content;
            this.escalations = model.escalations;
            this.incidentId = model.incidentId;
            this.incidentPlan = model.incidentPlan;
            this.resource = model.resource;
            this.severity = model.severity;
            this.status = model.status;
            this.time = model.time;
            this.title = model.title;
            this.userId = model.userId;
        } 

        /**
         * <p>The content of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Detected that the connection count of RDS instance rds-bp1234567890abcdef has reached 1000, triggering an alert.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The list of escalation policies.</p>
         */
        public Builder escalations(java.util.List<IncidentEscalationStruct> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * <p>The unique ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>incident-001</p>
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * <p>The associated incident plan.</p>
         */
        public Builder incidentPlan(IncidentPlanStruct incidentPlan) {
            this.incidentPlan = incidentPlan;
            return this;
        }

        /**
         * <p>The details of the associated resource.</p>
         */
        public Builder resource(IncidentResourceDetail resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The severity level of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>P1</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The current status.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The title of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Excessively high database connection count.</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user-12345</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public IncidentStruct build() {
            return new IncidentStruct(this);
        } 

    } 

}
