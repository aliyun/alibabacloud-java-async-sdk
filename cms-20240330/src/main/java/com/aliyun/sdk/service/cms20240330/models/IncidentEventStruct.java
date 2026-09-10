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
 * {@link IncidentEventStruct} extends {@link TeaModel}
 *
 * <p>IncidentEventStruct</p>
 */
public class IncidentEventStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverTime")
    private Long autoRecoverTime;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("dimension")
    private java.util.Map<String, String> dimension;

    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.Map<String, String> groupBy;

    @com.aliyun.core.annotation.NameInMap("incidentEventId")
    private String incidentEventId;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("lastTime")
    private Long lastTime;

    @com.aliyun.core.annotation.NameInMap("recoverTime")
    private Long recoverTime;

    @com.aliyun.core.annotation.NameInMap("resource")
    private java.util.Map<String, String> resource;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private IncidentEventStruct(Builder builder) {
        this.autoRecoverTime = builder.autoRecoverTime;
        this.content = builder.content;
        this.count = builder.count;
        this.dimension = builder.dimension;
        this.groupBy = builder.groupBy;
        this.incidentEventId = builder.incidentEventId;
        this.incidentId = builder.incidentId;
        this.lastTime = builder.lastTime;
        this.recoverTime = builder.recoverTime;
        this.resource = builder.resource;
        this.status = builder.status;
        this.time = builder.time;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEventStruct create() {
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
    public String getContent() {
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
    public java.util.Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * @return groupBy
     */
    public java.util.Map<String, String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return incidentEventId
     */
    public String getIncidentEventId() {
        return this.incidentEventId;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
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
     * @return resource
     */
    public java.util.Map<String, String> getResource() {
        return this.resource;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return time
     */
    public String getTime() {
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
        private Long autoRecoverTime; 
        private String content; 
        private Integer count; 
        private java.util.Map<String, String> dimension; 
        private java.util.Map<String, String> groupBy; 
        private String incidentEventId; 
        private String incidentId; 
        private Long lastTime; 
        private Long recoverTime; 
        private java.util.Map<String, String> resource; 
        private Long status; 
        private String time; 
        private String title; 
        private String userId; 

        private Builder() {
        } 

        private Builder(IncidentEventStruct model) {
            this.autoRecoverTime = model.autoRecoverTime;
            this.content = model.content;
            this.count = model.count;
            this.dimension = model.dimension;
            this.groupBy = model.groupBy;
            this.incidentEventId = model.incidentEventId;
            this.incidentId = model.incidentId;
            this.lastTime = model.lastTime;
            this.recoverTime = model.recoverTime;
            this.resource = model.resource;
            this.status = model.status;
            this.time = model.time;
            this.title = model.title;
            this.userId = model.userId;
        } 

        /**
         * <p>The time of automatic recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        public Builder autoRecoverTime(Long autoRecoverTime) {
            this.autoRecoverTime = autoRecoverTime;
            return this;
        }

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>Detected that the CPU usage of the user-service instance i-abc123 has reached 95%, triggering an alert.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The dimension.</p>
         */
        public Builder dimension(java.util.Map<String, String> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The dimension for grouping.</p>
         */
        public Builder groupBy(java.util.Map<String, String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The incident event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>event-001</p>
         */
        public Builder incidentEventId(String incidentEventId) {
            this.incidentEventId = incidentEventId;
            return this;
        }

        /**
         * <p>The incident ID.</p>
         * 
         * <strong>example:</strong>
         * <p>incident-001</p>
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * <p>The time of the last occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        public Builder lastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }

        /**
         * <p>The time of manual recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        public Builder recoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * <p>The resource associated with the event.</p>
         */
        public Builder resource(java.util.Map<String, String> resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>User service CPU usage is too high.</p>
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

        public IncidentEventStruct build() {
            return new IncidentEventStruct(this);
        } 

    } 

}
