// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertsRequest</p>
 */
public class ListAlertsRequest extends Request {
    @Query
    @NameInMap("AlertName")
    private String alertName;

    @Query
    @NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("IntegrationType")
    private String integrationType;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("ShowActivities")
    private Boolean showActivities;

    @Query
    @NameInMap("ShowEvents")
    private Boolean showEvents;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("State")
    private Long state;

    private ListAlertsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.dispatchRuleId = builder.dispatchRuleId;
        this.endTime = builder.endTime;
        this.integrationType = builder.integrationType;
        this.page = builder.page;
        this.severity = builder.severity;
        this.showActivities = builder.showActivities;
        this.showEvents = builder.showEvents;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return dispatchRuleId
     */
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return integrationType
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return showActivities
     */
    public Boolean getShowActivities() {
        return this.showActivities;
    }

    /**
     * @return showEvents
     */
    public Boolean getShowEvents() {
        return this.showEvents;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public Long getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListAlertsRequest, Builder> {
        private String alertName; 
        private Long dispatchRuleId; 
        private String endTime; 
        private String integrationType; 
        private Long page; 
        private String severity; 
        private Boolean showActivities; 
        private Boolean showEvents; 
        private Long size; 
        private String startTime; 
        private Long state; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertsRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.dispatchRuleId = request.dispatchRuleId;
            this.endTime = request.endTime;
            this.integrationType = request.integrationType;
            this.page = request.page;
            this.severity = request.severity;
            this.showActivities = request.showActivities;
            this.showEvents = request.showEvents;
            this.size = request.size;
            this.startTime = request.startTime;
            this.state = request.state;
        } 

        /**
         * 告警名称
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * 通知策略ID
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.putQueryParameter("DispatchRuleId", dispatchRuleId);
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * 查询告警发送历史记录的开始时间，时间格式：YYYY-MM-DD HH:mm:ss
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 集成类型
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * 页数
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * 告警等级(P1~P6)
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * 默认不查活动记录，showActivities=true才查，只查最近3天的内容
         */
        public Builder showActivities(Boolean showActivities) {
            this.putQueryParameter("ShowActivities", showActivities);
            this.showActivities = showActivities;
            return this;
        }

        /**
         * 默认不查事件，showEvents=true才查
         */
        public Builder showEvents(Boolean showEvents) {
            this.putQueryParameter("ShowEvents", showEvents);
            this.showEvents = showEvents;
            return this;
        }

        /**
         * 每页展示数目
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * 查询告警发送历史记录的开始时间，时间格式：YYYY-MM-DD HH:mm:ss
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 告警状态(0 - 待处理， 1 - 处理中， 2 - 已处理)
         */
        public Builder state(Long state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListAlertsRequest build() {
            return new ListAlertsRequest(this);
        } 

    } 

}
