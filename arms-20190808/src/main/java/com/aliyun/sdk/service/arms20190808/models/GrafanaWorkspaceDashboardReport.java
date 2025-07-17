// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceDashboardReport} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceDashboardReport</p>
 */
public class GrafanaWorkspaceDashboardReport extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("lastSendTime")
    private Long lastSendTime;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("reportChannelTarget")
    private String reportChannelTarget;

    @com.aliyun.core.annotation.NameInMap("reportChannelType")
    private String reportChannelType;

    @com.aliyun.core.annotation.NameInMap("reportStyle")
    private String reportStyle;

    @com.aliyun.core.annotation.NameInMap("reportType")
    private String reportType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("triggerDay")
    private String triggerDay;

    @com.aliyun.core.annotation.NameInMap("triggerTime")
    private String triggerTime;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GrafanaWorkspaceDashboardReport(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.id = builder.id;
        this.lastSendTime = builder.lastSendTime;
        this.msg = builder.msg;
        this.name = builder.name;
        this.reportChannelTarget = builder.reportChannelTarget;
        this.reportChannelType = builder.reportChannelType;
        this.reportStyle = builder.reportStyle;
        this.reportType = builder.reportType;
        this.status = builder.status;
        this.triggerDay = builder.triggerDay;
        this.triggerTime = builder.triggerTime;
        this.triggerType = builder.triggerType;
        this.url = builder.url;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceDashboardReport create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lastSendTime
     */
    public Long getLastSendTime() {
        return this.lastSendTime;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reportChannelTarget
     */
    public String getReportChannelTarget() {
        return this.reportChannelTarget;
    }

    /**
     * @return reportChannelType
     */
    public String getReportChannelType() {
        return this.reportChannelType;
    }

    /**
     * @return reportStyle
     */
    public String getReportStyle() {
        return this.reportStyle;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return triggerDay
     */
    public String getTriggerDay() {
        return this.triggerDay;
    }

    /**
     * @return triggerTime
     */
    public String getTriggerTime() {
        return this.triggerTime;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Long gmtCreate; 
        private String grafanaWorkspaceId; 
        private Long id; 
        private Long lastSendTime; 
        private String msg; 
        private String name; 
        private String reportChannelTarget; 
        private String reportChannelType; 
        private String reportStyle; 
        private String reportType; 
        private String status; 
        private String triggerDay; 
        private String triggerTime; 
        private String triggerType; 
        private String url; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GrafanaWorkspaceDashboardReport model) {
            this.gmtCreate = model.gmtCreate;
            this.grafanaWorkspaceId = model.grafanaWorkspaceId;
            this.id = model.id;
            this.lastSendTime = model.lastSendTime;
            this.msg = model.msg;
            this.name = model.name;
            this.reportChannelTarget = model.reportChannelTarget;
            this.reportChannelType = model.reportChannelType;
            this.reportStyle = model.reportStyle;
            this.reportType = model.reportType;
            this.status = model.status;
            this.triggerDay = model.triggerDay;
            this.triggerTime = model.triggerTime;
            this.triggerType = model.triggerType;
            this.url = model.url;
            this.userId = model.userId;
        } 

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * lastSendTime.
         */
        public Builder lastSendTime(Long lastSendTime) {
            this.lastSendTime = lastSendTime;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * reportChannelTarget.
         */
        public Builder reportChannelTarget(String reportChannelTarget) {
            this.reportChannelTarget = reportChannelTarget;
            return this;
        }

        /**
         * reportChannelType.
         */
        public Builder reportChannelType(String reportChannelType) {
            this.reportChannelType = reportChannelType;
            return this;
        }

        /**
         * reportStyle.
         */
        public Builder reportStyle(String reportStyle) {
            this.reportStyle = reportStyle;
            return this;
        }

        /**
         * reportType.
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
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
         * triggerDay.
         */
        public Builder triggerDay(String triggerDay) {
            this.triggerDay = triggerDay;
            return this;
        }

        /**
         * triggerTime.
         */
        public Builder triggerTime(String triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }

        /**
         * triggerType.
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GrafanaWorkspaceDashboardReport build() {
            return new GrafanaWorkspaceDashboardReport(this);
        } 

    } 

}
