// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link AlertQuery} extends {@link TeaModel}
 *
 * <p>AlertQuery</p>
 */
public class AlertQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chartTitle")
    private String chartTitle;

    @com.aliyun.core.annotation.NameInMap("dashboardId")
    private String dashboardId;

    @com.aliyun.core.annotation.NameInMap("end")
    @com.aliyun.core.annotation.Validation(required = true)
    private String end;

    @com.aliyun.core.annotation.NameInMap("powerSqlMode")
    private String powerSqlMode;

    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("start")
    @com.aliyun.core.annotation.Validation(required = true)
    private String start;

    @com.aliyun.core.annotation.NameInMap("store")
    @com.aliyun.core.annotation.Validation(required = true)
    private String store;

    @com.aliyun.core.annotation.NameInMap("storeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeType;

    @com.aliyun.core.annotation.NameInMap("timeSpanType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeSpanType;

    @com.aliyun.core.annotation.NameInMap("ui")
    private String ui;

    private AlertQuery(Builder builder) {
        this.chartTitle = builder.chartTitle;
        this.dashboardId = builder.dashboardId;
        this.end = builder.end;
        this.powerSqlMode = builder.powerSqlMode;
        this.project = builder.project;
        this.query = builder.query;
        this.region = builder.region;
        this.roleArn = builder.roleArn;
        this.start = builder.start;
        this.store = builder.store;
        this.storeType = builder.storeType;
        this.timeSpanType = builder.timeSpanType;
        this.ui = builder.ui;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertQuery create() {
        return builder().build();
    }

    /**
     * @return chartTitle
     */
    public String getChartTitle() {
        return this.chartTitle;
    }

    /**
     * @return dashboardId
     */
    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return powerSqlMode
     */
    public String getPowerSqlMode() {
        return this.powerSqlMode;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    /**
     * @return store
     */
    public String getStore() {
        return this.store;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    /**
     * @return timeSpanType
     */
    public String getTimeSpanType() {
        return this.timeSpanType;
    }

    /**
     * @return ui
     */
    public String getUi() {
        return this.ui;
    }

    public static final class Builder {
        private String chartTitle; 
        private String dashboardId; 
        private String end; 
        private String powerSqlMode; 
        private String project; 
        private String query; 
        private String region; 
        private String roleArn; 
        private String start; 
        private String store; 
        private String storeType; 
        private String timeSpanType; 
        private String ui; 

        /**
         * chartTitle.
         */
        public Builder chartTitle(String chartTitle) {
            this.chartTitle = chartTitle;
            return this;
        }

        /**
         * dashboardId.
         */
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>now</p>
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        /**
         * powerSqlMode.
         */
        public Builder powerSqlMode(String powerSqlMode) {
            this.powerSqlMode = powerSqlMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectExample</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| select *</li>
         * </ul>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-5m</p>
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>store Example</p>
         */
        public Builder store(String store) {
            this.store = store;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Relative</p>
         */
        public Builder timeSpanType(String timeSpanType) {
            this.timeSpanType = timeSpanType;
            return this;
        }

        /**
         * ui.
         */
        public Builder ui(String ui) {
            this.ui = ui;
            return this;
        }

        public AlertQuery build() {
            return new AlertQuery(this);
        } 

    } 

}
