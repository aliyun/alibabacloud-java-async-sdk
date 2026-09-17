// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link UpdateWorkflowRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowRequest</p>
 */
public class UpdateWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Calendar")
    private String calendar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    private String timeExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private Integer timeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowId;

    private UpdateWorkflowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.calendar = builder.calendar;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.maxConcurrency = builder.maxConcurrency;
        this.name = builder.name;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timezone = builder.timezone;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return calendar
     */
    public String getCalendar() {
        return this.calendar;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return timeExpression
     */
    public String getTimeExpression() {
        return this.timeExpression;
    }

    /**
     * @return timeType
     */
    public Integer getTimeType() {
        return this.timeType;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String calendar; 
        private String clientToken; 
        private String clusterId; 
        private String description; 
        private Integer maxConcurrency; 
        private String name; 
        private String timeExpression; 
        private Integer timeType; 
        private String timezone; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.calendar = request.calendar;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.maxConcurrency = request.maxConcurrency;
            this.name = request.name;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timezone = request.timezone;
            this.workflowId = request.workflowId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The name of a custom calendar to exclude specific dates from the schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * <p>A unique token that you provide to ensure the request is idempotent. The token can be up to 64 ASCII characters long.</p>
         * 
         * <strong>example:</strong>
         * <p>D0DE9C33-992A-580B-89C4-B609A292748D</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-d6a5243b6fa</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The workflow description.</p>
         * 
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The maximum concurrency for the workflow.</p>
         * <blockquote>
         * <p>The maximum number of concurrent instances that can run for the same workflow. A value of <code>1</code> prevents overlapping runs. If the number of running instances reaches this limit, subsequent scheduled runs are skipped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The cron expression for the schedule. This parameter is required only when <code>TimeType</code> is set to <code>1</code> (cron).</p>
         * <ul>
         * <li><p>If <code>TimeType</code> is <code>-1</code> (none), this parameter is not required.</p>
         * </li>
         * <li><p>If <code>TimeType</code> is <code>1</code> (cron), specify a standard cron expression.</p>
         * </li>
         * <li><p>If <code>TimeType</code> is <code>100</code> (api), this parameter is not required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0 0/10 * * * ?</p>
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li><p><code>-1</code> (none): The workflow is not scheduled and must be triggered on demand.</p>
         * </li>
         * <li><p><code>1</code> (cron): The workflow runs based on the cron expression in the <code>TimeExpression</code> parameter.</p>
         * </li>
         * <li><p><code>100</code> (api): The workflow is triggered by an API call.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>The time zone for the schedule.</p>
         * <blockquote>
         * <p>Defaults to the time zone of the SchedulerX server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public UpdateWorkflowRequest build() {
            return new UpdateWorkflowRequest(this);
        } 

    } 

}
