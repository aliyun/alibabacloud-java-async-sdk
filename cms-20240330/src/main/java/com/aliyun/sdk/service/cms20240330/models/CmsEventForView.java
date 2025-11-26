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
         * annotations.
         */
        public Builder annotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * datacontenttype.
         */
        public Builder datacontenttype(String datacontenttype) {
            this.datacontenttype = datacontenttype;
            return this;
        }

        /**
         * dataschema.
         */
        public Builder dataschema(String dataschema) {
            this.dataschema = dataschema;
            return this;
        }

        /**
         * dedupId.
         */
        public Builder dedupId(String dedupId) {
            this.dedupId = dedupId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * integrationUuid.
         */
        public Builder integrationUuid(String integrationUuid) {
            this.integrationUuid = integrationUuid;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * receiveTime.
         */
        public Builder receiveTime(Long receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(EventResourceForEventView resource) {
            this.resource = resource;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * sourcetype.
         */
        public Builder sourcetype(String sourcetype) {
            this.sourcetype = sourcetype;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * subtype.
         */
        public Builder subtype(String subtype) {
            this.subtype = subtype;
            return this;
        }

        /**
         * sysId.
         */
        public Builder sysId(String sysId) {
            this.sysId = sysId;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * workspaceTags.
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
