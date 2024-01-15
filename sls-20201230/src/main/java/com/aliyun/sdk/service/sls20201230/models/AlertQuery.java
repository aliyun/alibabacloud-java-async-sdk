// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link AlertQuery} extends {@link TeaModel}
 *
 * <p>AlertQuery</p>
 */
public class AlertQuery extends TeaModel {
    @NameInMap("chartTitle")
    private String chartTitle;

    @NameInMap("dashboardId")
    private String dashboardId;

    @NameInMap("end")
    @Validation(required = true)
    private String end;

    @NameInMap("powerSqlMode")
    private String powerSqlMode;

    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @NameInMap("query")
    @Validation(required = true)
    private String query;

    @NameInMap("region")
    @Validation(required = true)
    private String region;

    @NameInMap("roleArn")
    private String roleArn;

    @NameInMap("start")
    @Validation(required = true)
    private String start;

    @NameInMap("store")
    @Validation(required = true)
    private String store;

    @NameInMap("storeType")
    @Validation(required = true)
    private String storeType;

    @NameInMap("timeSpanType")
    @Validation(required = true)
    private String timeSpanType;

    @NameInMap("ui")
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
         * end.
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
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * region.
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
         * start.
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        /**
         * store.
         */
        public Builder store(String store) {
            this.store = store;
            return this;
        }

        /**
         * storeType.
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        /**
         * timeSpanType.
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
