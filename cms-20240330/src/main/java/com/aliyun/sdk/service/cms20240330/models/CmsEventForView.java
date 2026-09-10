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
 * {@link CmsEventForView} extends {@link TeaModel}
 *
 * <p>CmsEventForView</p>
 */
public class CmsEventForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.Map<String, ?> annotations;

    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("datacontenttype")
    private String datacontenttype;

    @com.aliyun.core.annotation.NameInMap("dataschema")
    private String dataschema;

    @com.aliyun.core.annotation.NameInMap("dedupId")
    private String dedupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("integrationUuid")
    private String integrationUuid;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.NameInMap("receiveTime")
    private Long receiveTime;

    @com.aliyun.core.annotation.NameInMap("resource")
    private EventResourceForEventView resource;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("sourcetype")
    private String sourcetype;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("subject")
    private String subject;

    @com.aliyun.core.annotation.NameInMap("subtype")
    private String subtype;

    @com.aliyun.core.annotation.NameInMap("sysId")
    private String sysId;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    @com.aliyun.core.annotation.NameInMap("workspaceTags")
    private java.util.Map<String, ?> workspaceTags;

    private CmsEventForView(Builder builder) {
        this.annotations = builder.annotations;
        this.data = builder.data;
        this.datacontenttype = builder.datacontenttype;
        this.dataschema = builder.dataschema;
        this.dedupId = builder.dedupId;
        this.id = builder.id;
        this.integrationUuid = builder.integrationUuid;
        this.labels = builder.labels;
        this.receiveTime = builder.receiveTime;
        this.resource = builder.resource;
        this.severity = builder.severity;
        this.source = builder.source;
        this.sourcetype = builder.sourcetype;
        this.status = builder.status;
        this.subject = builder.subject;
        this.subtype = builder.subtype;
        this.sysId = builder.sysId;
        this.time = builder.time;
        this.timestamp = builder.timestamp;
        this.type = builder.type;
        this.workspace = builder.workspace;
        this.workspaceTags = builder.workspaceTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsEventForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public java.util.Map<String, ?> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return datacontenttype
     */
    public String getDatacontenttype() {
        return this.datacontenttype;
    }

    /**
     * @return dataschema
     */
    public String getDataschema() {
        return this.dataschema;
    }

    /**
     * @return dedupId
     */
    public String getDedupId() {
        return this.dedupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return integrationUuid
     */
    public String getIntegrationUuid() {
        return this.integrationUuid;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return receiveTime
     */
    public Long getReceiveTime() {
        return this.receiveTime;
    }

    /**
     * @return resource
     */
    public EventResourceForEventView getResource() {
        return this.resource;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourcetype
     */
    public String getSourcetype() {
        return this.sourcetype;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return subtype
     */
    public String getSubtype() {
        return this.subtype;
    }

    /**
     * @return sysId
     */
    public String getSysId() {
        return this.sysId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return workspaceTags
     */
    public java.util.Map<String, ?> getWorkspaceTags() {
        return this.workspaceTags;
    }

    public static final class Builder {
        private java.util.Map<String, ?> annotations; 
        private Object data; 
        private String datacontenttype; 
        private String dataschema; 
        private String dedupId; 
        private String id; 
        private String integrationUuid; 
        private java.util.Map<String, ?> labels; 
        private Long receiveTime; 
        private EventResourceForEventView resource; 
        private String severity; 
        private String source; 
        private String sourcetype; 
        private String status; 
        private String subject; 
        private String subtype; 
        private String sysId; 
        private String time; 
        private Long timestamp; 
        private String type; 
        private String workspace; 
        private java.util.Map<String, ?> workspaceTags; 

        private Builder() {
        } 

        private Builder(CmsEventForView model) {
            this.annotations = model.annotations;
            this.data = model.data;
            this.datacontenttype = model.datacontenttype;
            this.dataschema = model.dataschema;
            this.dedupId = model.dedupId;
            this.id = model.id;
            this.integrationUuid = model.integrationUuid;
            this.labels = model.labels;
            this.receiveTime = model.receiveTime;
            this.resource = model.resource;
            this.severity = model.severity;
            this.source = model.source;
            this.sourcetype = model.sourcetype;
            this.status = model.status;
            this.subject = model.subject;
            this.subtype = model.subtype;
            this.sysId = model.sysId;
            this.time = model.time;
            this.timestamp = model.timestamp;
            this.type = model.type;
            this.workspace = model.workspace;
            this.workspaceTags = model.workspaceTags;
        } 

        /**
         * <p>Additional annotations for the event. This is an unstructured description field.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;description&quot;: &quot;High load detected on server&quot;, &quot;operator&quot;: &quot;auto&quot; }</p>
         */
        public Builder annotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The raw data of the event. The format depends on the event type and dataschema.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;metricName&quot;: &quot;cpu_usage&quot;, &quot;value&quot;: 95.2, &quot;threshold&quot;: 80 }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The content type of the data field.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;application/json&quot;</p>
         */
        public Builder datacontenttype(String datacontenttype) {
            this.datacontenttype = datacontenttype;
            return this;
        }

        /**
         * <p>The data schema definition, which describes the structure of the data field.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://schema.alibabacloud.com/cms/alert/v1">https://schema.alibabacloud.com/cms/alert/v1</a>&quot;</p>
         */
        public Builder dataschema(String dataschema) {
            this.dataschema = dataschema;
            return this;
        }

        /**
         * <p>The deduplication ID. It identifies different instances of the same event, such as a repeatedly reported event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;dedup-abc123&quot;</p>
         */
        public Builder dedupId(String dedupId) {
            this.dedupId = dedupId;
            return this;
        }

        /**
         * <p>The unique identifier for the event. The system generates this globally unique ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;event-1234567890&quot;</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The unique integration identifier. It is used for identity recognition in cross-system integrations.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;integration-xyz&quot;</p>
         */
        public Builder integrationUuid(String integrationUuid) {
            this.integrationUuid = integrationUuid;
            return this;
        }

        /**
         * <p>The key-value pairs of the event labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;source\&quot;: \&quot;system\&quot;}</p>
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The timestamp when the event was received and processed.</p>
         * 
         * <strong>example:</strong>
         * <p>1743846610000</p>
         */
        public Builder receiveTime(Long receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }

        /**
         * <p>Information about the resource associated with the event, such as the instance ID, IP address, and region.</p>
         */
        public Builder resource(EventResourceForEventView resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The severity level of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;CRITICAL&quot;</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The name of the source system or service, such as ECS, RDS, or VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ECS&quot;</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The type of event source. It distinguishes between sources such as monitoring systems, Simple Log Service, and application observability.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;CloudMonitor&quot;</p>
         */
        public Builder sourcetype(String sourcetype) {
            this.sourcetype = sourcetype;
            return this;
        }

        /**
         * <p>The current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The subject or title of the event. It briefly describes the event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Instance cpu usage exceeds threshold&quot;</p>
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * <p>The event subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;HighCPUUsage&quot;</p>
         */
        public Builder subtype(String subtype) {
            this.subtype = subtype;
            return this;
        }

        /**
         * <p>The internal system event ID. It is used for internal tracking and log association.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;sys-event-987654321&quot;</p>
         */
        public Builder sysId(String sysId) {
            this.sysId = sysId;
            return this;
        }

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2025-04-05T10:30:00Z&quot;</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The timestamp of the event occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>1743846600000</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Alert&quot;</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The ID or name of the workspace. It is used for multi-tenant or organization fencing.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ws-abc123&quot;</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The workspace tags. They help you manage events by tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;department&quot;: &quot;finance&quot;, &quot;project&quot;: &quot;payment-gateway&quot; }</p>
         */
        public Builder workspaceTags(java.util.Map<String, ?> workspaceTags) {
            this.workspaceTags = workspaceTags;
            return this;
        }

        public CmsEventForView build() {
            return new CmsEventForView(this);
        } 

    } 

}
