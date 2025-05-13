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
 * {@link IncidentTimeline} extends {@link TeaModel}
 *
 * <p>IncidentTimeline</p>
 */
public class IncidentTimeline extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("childType")
    private String childType;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("incidentTimelineId")
    private String incidentTimelineId;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("timelineId")
    private String timelineId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private IncidentTimeline(Builder builder) {
        this.childType = builder.childType;
        this.content = builder.content;
        this.incidentId = builder.incidentId;
        this.incidentTimelineId = builder.incidentTimelineId;
        this.time = builder.time;
        this.timelineId = builder.timelineId;
        this.title = builder.title;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentTimeline create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childType
     */
    public String getChildType() {
        return this.childType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentTimelineId
     */
    public String getIncidentTimelineId() {
        return this.incidentTimelineId;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return timelineId
     */
    public String getTimelineId() {
        return this.timelineId;
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

    public static final class Builder {
        private String childType; 
        private String content; 
        private String incidentId; 
        private String incidentTimelineId; 
        private Long time; 
        private String timelineId; 
        private String title; 
        private String type; 
        private String userId; 

        private Builder() {
        } 

        private Builder(IncidentTimeline model) {
            this.childType = model.childType;
            this.content = model.content;
            this.incidentId = model.incidentId;
            this.incidentTimelineId = model.incidentTimelineId;
            this.time = model.time;
            this.timelineId = model.timelineId;
            this.title = model.title;
            this.type = model.type;
            this.userId = model.userId;
        } 

        /**
         * childType.
         */
        public Builder childType(String childType) {
            this.childType = childType;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * incidentTimelineId.
         */
        public Builder incidentTimelineId(String incidentTimelineId) {
            this.incidentTimelineId = incidentTimelineId;
            return this;
        }

        /**
         * time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * timelineId.
         */
        public Builder timelineId(String timelineId) {
            this.timelineId = timelineId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
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
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public IncidentTimeline build() {
            return new IncidentTimeline(this);
        } 

    } 

}
