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
 * {@link IncidentTimelineForView} extends {@link TeaModel}
 *
 * <p>IncidentTimelineForView</p>
 */
public class IncidentTimelineForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("changeType")
    private String changeType;

    @com.aliyun.core.annotation.NameInMap("content")
    private Object content;

    @com.aliyun.core.annotation.NameInMap("incidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.NameInMap("operator")
    private ContactForIncidentView operator;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("timelineUuid")
    private String timelineUuid;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentTimelineForView(Builder builder) {
        this.changeType = builder.changeType;
        this.content = builder.content;
        this.incidentUuid = builder.incidentUuid;
        this.operator = builder.operator;
        this.time = builder.time;
        this.timelineUuid = builder.timelineUuid;
        this.title = builder.title;
        this.type = builder.type;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentTimelineForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return content
     */
    public Object getContent() {
        return this.content;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return operator
     */
    public ContactForIncidentView getOperator() {
        return this.operator;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return timelineUuid
     */
    public String getTimelineUuid() {
        return this.timelineUuid;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String changeType; 
        private Object content; 
        private String incidentUuid; 
        private ContactForIncidentView operator; 
        private Long time; 
        private String timelineUuid; 
        private String title; 
        private String type; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentTimelineForView model) {
            this.changeType = model.changeType;
            this.content = model.content;
            this.incidentUuid = model.incidentUuid;
            this.operator = model.operator;
            this.time = model.time;
            this.timelineUuid = model.timelineUuid;
            this.title = model.title;
            this.type = model.type;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The type of status change.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Open -&gt; In Progress&quot;</p>
         */
        public Builder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The content of the timeline event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;action&quot;:&quot;restart&quot;,&quot;resourceId&quot;:&quot;i-bp123456&quot;}&quot;</p>
         */
        public Builder content(Object content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The unique identifier of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * <p>Information about the operator.</p>
         */
        public Builder operator(ContactForIncidentView operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The UNIX timestamp when the timeline event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1743876000000</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The unique identifier of the timeline record.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;x1y2z3a4-b5c6-d7e8-f9g0-h1i2j3k4l5m6&quot;</p>
         */
        public Builder timelineUuid(String timelineUuid) {
            this.timelineUuid = timelineUuid;
            return this;
        }

        /**
         * <p>The title of the timeline event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;故障已升级至值班主管&quot;</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The type of the timeline event.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Comment&quot;</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;user-abc123&quot;</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ws-xyz789&quot;</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentTimelineForView build() {
            return new IncidentTimelineForView(this);
        } 

    } 

}
