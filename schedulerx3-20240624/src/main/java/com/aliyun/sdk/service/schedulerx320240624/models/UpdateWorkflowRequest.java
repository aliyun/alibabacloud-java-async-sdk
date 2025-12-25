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
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
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
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 6)
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
         * Calendar.
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TimeExpression.
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * TimeType.
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
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
