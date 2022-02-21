// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAlertRuleRequest</p>
 */
public class CreateOrUpdateAlertRuleRequest extends Request {
    @Body
    @NameInMap("AlertCheckType")
    private String alertCheckType;

    @Body
    @NameInMap("AlertGroup")
    private Long alertGroup;

    @Body
    @NameInMap("AlertId")
    private Long alertId;

    @Body
    @NameInMap("AlertName")
    @Validation(required = true)
    private String alertName;

    @Body
    @NameInMap("AlertRuleContent")
    private String alertRuleContent;

    @Body
    @NameInMap("AlertStatus")
    private String alertStatus;

    @Body
    @NameInMap("AlertType")
    @Validation(required = true)
    private String alertType;

    @Body
    @NameInMap("Annotations")
    private String annotations;

    @Body
    @NameInMap("AutoAddNewApplication")
    private Boolean autoAddNewApplication;

    @Body
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("Duration")
    private Long duration;

    @Body
    @NameInMap("Filters")
    private String filters;

    @Body
    @NameInMap("Labels")
    private String labels;

    @Body
    @NameInMap("Level")
    private String level;

    @Body
    @NameInMap("Message")
    private String message;

    @Body
    @NameInMap("MetricsKey")
    private String metricsKey;

    @Body
    @NameInMap("MetricsType")
    private String metricsType;

    @Body
    @NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @Body
    @NameInMap("Pids")
    private String pids;

    @Body
    @NameInMap("PromQL")
    private String promQL;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateOrUpdateAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertCheckType = builder.alertCheckType;
        this.alertGroup = builder.alertGroup;
        this.alertId = builder.alertId;
        this.alertName = builder.alertName;
        this.alertRuleContent = builder.alertRuleContent;
        this.alertStatus = builder.alertStatus;
        this.alertType = builder.alertType;
        this.annotations = builder.annotations;
        this.autoAddNewApplication = builder.autoAddNewApplication;
        this.clusterId = builder.clusterId;
        this.duration = builder.duration;
        this.filters = builder.filters;
        this.labels = builder.labels;
        this.level = builder.level;
        this.message = builder.message;
        this.metricsKey = builder.metricsKey;
        this.metricsType = builder.metricsType;
        this.notifyStrategy = builder.notifyStrategy;
        this.pids = builder.pids;
        this.promQL = builder.promQL;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertCheckType
     */
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    /**
     * @return alertGroup
     */
    public Long getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertRuleContent
     */
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    /**
     * @return alertStatus
     */
    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return autoAddNewApplication
     */
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricsKey
     */
    public String getMetricsKey() {
        return this.metricsKey;
    }

    /**
     * @return metricsType
     */
    public String getMetricsType() {
        return this.metricsType;
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return promQL
     */
    public String getPromQL() {
        return this.promQL;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateAlertRuleRequest, Builder> {
        private String alertCheckType; 
        private Long alertGroup; 
        private Long alertId; 
        private String alertName; 
        private String alertRuleContent; 
        private String alertStatus; 
        private String alertType; 
        private String annotations; 
        private Boolean autoAddNewApplication; 
        private String clusterId; 
        private Long duration; 
        private String filters; 
        private String labels; 
        private String level; 
        private String message; 
        private String metricsKey; 
        private String metricsType; 
        private String notifyStrategy; 
        private String pids; 
        private String promQL; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateAlertRuleRequest response) {
            super(response);
            this.alertCheckType = response.alertCheckType;
            this.alertGroup = response.alertGroup;
            this.alertId = response.alertId;
            this.alertName = response.alertName;
            this.alertRuleContent = response.alertRuleContent;
            this.alertStatus = response.alertStatus;
            this.alertType = response.alertType;
            this.annotations = response.annotations;
            this.autoAddNewApplication = response.autoAddNewApplication;
            this.clusterId = response.clusterId;
            this.duration = response.duration;
            this.filters = response.filters;
            this.labels = response.labels;
            this.level = response.level;
            this.message = response.message;
            this.metricsKey = response.metricsKey;
            this.metricsType = response.metricsType;
            this.notifyStrategy = response.notifyStrategy;
            this.pids = response.pids;
            this.promQL = response.promQL;
            this.regionId = response.regionId;
        } 

        /**
         * AlertCheckType.
         */
        public Builder alertCheckType(String alertCheckType) {
            this.putBodyParameter("AlertCheckType", alertCheckType);
            this.alertCheckType = alertCheckType;
            return this;
        }

        /**
         * AlertGroup.
         */
        public Builder alertGroup(Long alertGroup) {
            this.putBodyParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * 告警规则ID
         */
        public Builder alertId(Long alertId) {
            this.putBodyParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * 告警规则名称
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertRuleContent.
         */
        public Builder alertRuleContent(String alertRuleContent) {
            this.putBodyParameter("AlertRuleContent", alertRuleContent);
            this.alertRuleContent = alertRuleContent;
            return this;
        }

        /**
         * AlertStatus.
         */
        public Builder alertStatus(String alertStatus) {
            this.putBodyParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * 告警规则类型
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * Annotations.
         */
        public Builder annotations(String annotations) {
            this.putBodyParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * AutoAddNewApplication.
         */
        public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
            this.putBodyParameter("AutoAddNewApplication", autoAddNewApplication);
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * MetricsKey.
         */
        public Builder metricsKey(String metricsKey) {
            this.putBodyParameter("MetricsKey", metricsKey);
            this.metricsKey = metricsKey;
            return this;
        }

        /**
         * MetricsType.
         */
        public Builder metricsType(String metricsType) {
            this.putBodyParameter("MetricsType", metricsType);
            this.metricsType = metricsType;
            return this;
        }

        /**
         * NotifyStrategy.
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putBodyParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * Pids.
         */
        public Builder pids(String pids) {
            this.putBodyParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * PromQL.
         */
        public Builder promQL(String promQL) {
            this.putBodyParameter("PromQL", promQL);
            this.promQL = promQL;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOrUpdateAlertRuleRequest build() {
            return new CreateOrUpdateAlertRuleRequest(this);
        } 

    } 

}
