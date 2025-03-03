// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link DescribeScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduleResponseBody</p>
 */
public class DescribeScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduleId")
    private String scheduleId;

    @com.aliyun.core.annotation.NameInMap("ScheduleName")
    private String scheduleName;

    private DescribeScheduleResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.cronExpression = builder.cronExpression;
        this.description = builder.description;
        this.enable = builder.enable;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
        this.scheduleId = builder.scheduleId;
        this.scheduleName = builder.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleId
     */
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    public static final class Builder {
        private String createdTime; 
        private String cronExpression; 
        private String description; 
        private Boolean enable; 
        private String lastModifiedTime; 
        private String payload; 
        private String requestId; 
        private String scheduleId; 
        private String scheduleName; 

        /**
         * <p>The time when the time-based schedule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01T01:01:01.001Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The CRON expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 * * * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The description of the time-based schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the time-based schedule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The time when the time-based schedule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01T01:01:01.001Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The trigger message of the time-based schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the time-based schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testScheduleId</p>
         */
        public Builder scheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * <p>The name of the time-based schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testScheduleName</p>
         */
        public Builder scheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public DescribeScheduleResponseBody build() {
            return new DescribeScheduleResponseBody(this);
        } 

    } 

}
