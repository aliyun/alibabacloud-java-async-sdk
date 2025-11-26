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
 * {@link IncidentEventForView} extends {@link TeaModel}
 *
 * <p>IncidentEventForView</p>
 */
public class IncidentEventForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverTime")
    private Long autoRecoverTime;

    @com.aliyun.core.annotation.NameInMap("content")
    private CmsEventForView content;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("dimension")
    private java.util.Map<String, ?> dimension;

    @com.aliyun.core.annotation.NameInMap("eventResource")
    private EventResourceForIncidentView eventResource;

    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.Map<String, ?> groupBy;

    @com.aliyun.core.annotation.NameInMap("incidentEventUuid")
    private String incidentEventUuid;

    @com.aliyun.core.annotation.NameInMap("incidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.NameInMap("lastTime")
    private Long lastTime;

    @com.aliyun.core.annotation.NameInMap("recoverTime")
    private Long recoverTime;

    @com.aliyun.core.annotation.NameInMap("searchIndex")
    private java.util.List<String> searchIndex;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("severityCountMap")
    private java.util.Map<String, ?> severityCountMap;

    @com.aliyun.core.annotation.NameInMap("state")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("textIndex")
    private String textIndex;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentEventForView(Builder builder) {
        this.autoRecoverTime = builder.autoRecoverTime;
        this.content = builder.content;
        this.count = builder.count;
        this.dimension = builder.dimension;
        this.eventResource = builder.eventResource;
        this.groupBy = builder.groupBy;
        this.incidentEventUuid = builder.incidentEventUuid;
        this.incidentUuid = builder.incidentUuid;
        this.labels = builder.labels;
        this.lastTime = builder.lastTime;
        this.recoverTime = builder.recoverTime;
        this.searchIndex = builder.searchIndex;
        this.severity = builder.severity;
        this.severityCountMap = builder.severityCountMap;
        this.state = builder.state;
        this.textIndex = builder.textIndex;
        this.time = builder.time;
        this.title = builder.title;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEventForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecoverTime
     */
    public Long getAutoRecoverTime() {
        return this.autoRecoverTime;
    }

    /**
     * @return content
     */
    public CmsEventForView getContent() {
        return this.content;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return dimension
     */
    public java.util.Map<String, ?> getDimension() {
        return this.dimension;
    }

    /**
     * @return eventResource
     */
    public EventResourceForIncidentView getEventResource() {
        return this.eventResource;
    }

    /**
     * @return groupBy
     */
    public java.util.Map<String, ?> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return incidentEventUuid
     */
    public String getIncidentEventUuid() {
        return this.incidentEventUuid;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return lastTime
     */
    public Long getLastTime() {
        return this.lastTime;
    }

    /**
     * @return recoverTime
     */
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    /**
     * @return searchIndex
     */
    public java.util.List<String> getSearchIndex() {
        return this.searchIndex;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return severityCountMap
     */
    public java.util.Map<String, ?> getSeverityCountMap() {
        return this.severityCountMap;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return textIndex
     */
    public String getTextIndex() {
        return this.textIndex;
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

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Long autoRecoverTime; 
        private CmsEventForView content; 
        private Integer count; 
        private java.util.Map<String, ?> dimension; 
        private EventResourceForIncidentView eventResource; 
        private java.util.Map<String, ?> groupBy; 
        private String incidentEventUuid; 
        private String incidentUuid; 
        private java.util.Map<String, ?> labels; 
        private Long lastTime; 
        private Long recoverTime; 
        private java.util.List<String> searchIndex; 
        private String severity; 
        private java.util.Map<String, ?> severityCountMap; 
        private Integer state; 
        private String textIndex; 
        private Long time; 
        private String title; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentEventForView model) {
            this.autoRecoverTime = model.autoRecoverTime;
            this.content = model.content;
            this.count = model.count;
            this.dimension = model.dimension;
            this.eventResource = model.eventResource;
            this.groupBy = model.groupBy;
            this.incidentEventUuid = model.incidentEventUuid;
            this.incidentUuid = model.incidentUuid;
            this.labels = model.labels;
            this.lastTime = model.lastTime;
            this.recoverTime = model.recoverTime;
            this.searchIndex = model.searchIndex;
            this.severity = model.severity;
            this.severityCountMap = model.severityCountMap;
            this.state = model.state;
            this.textIndex = model.textIndex;
            this.time = model.time;
            this.title = model.title;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * autoRecoverTime.
         */
        public Builder autoRecoverTime(Long autoRecoverTime) {
            this.autoRecoverTime = autoRecoverTime;
            return this;
        }

        /**
         * content.
         */
        public Builder content(CmsEventForView content) {
            this.content = content;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * dimension.
         */
        public Builder dimension(java.util.Map<String, ?> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * eventResource.
         */
        public Builder eventResource(EventResourceForIncidentView eventResource) {
            this.eventResource = eventResource;
            return this;
        }

        /**
         * groupBy.
         */
        public Builder groupBy(java.util.Map<String, ?> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * incidentEventUuid.
         */
        public Builder incidentEventUuid(String incidentEventUuid) {
            this.incidentEventUuid = incidentEventUuid;
            return this;
        }

        /**
         * incidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
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
         * lastTime.
         */
        public Builder lastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * recoverTime.
         */
        public Builder recoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * searchIndex.
         */
        public Builder searchIndex(java.util.List<String> searchIndex) {
            this.searchIndex = searchIndex;
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
         * severityCountMap.
         */
        public Builder severityCountMap(java.util.Map<String, ?> severityCountMap) {
            this.severityCountMap = severityCountMap;
            return this;
        }

        /**
         * state.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * textIndex.
         */
        public Builder textIndex(String textIndex) {
            this.textIndex = textIndex;
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
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentEventForView build() {
            return new IncidentEventForView(this);
        } 

    } 

}
