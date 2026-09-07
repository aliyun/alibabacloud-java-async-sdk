// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenStructRefreshJobModel} extends {@link TeaModel}
 *
 * <p>OpenStructRefreshJobModel</p>
 */
public class OpenStructRefreshJobModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Processid")
    private String processid;

    @com.aliyun.core.annotation.NameInMap("RefreshInterval")
    private String refreshInterval;

    @com.aliyun.core.annotation.NameInMap("RefreshModel")
    private String refreshModel;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.NameInMap("ScheduledStartTime")
    private String scheduledStartTime;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private OpenStructRefreshJobModel(Builder builder) {
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.processid = builder.processid;
        this.refreshInterval = builder.refreshInterval;
        this.refreshModel = builder.refreshModel;
        this.resourceGroup = builder.resourceGroup;
        this.scheduledStartTime = builder.scheduledStartTime;
        this.schemaName = builder.schemaName;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructRefreshJobModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return processid
     */
    public String getProcessid() {
        return this.processid;
    }

    /**
     * @return refreshInterval
     */
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    /**
     * @return refreshModel
     */
    public String getRefreshModel() {
        return this.refreshModel;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return scheduledStartTime
     */
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String endTime; 
        private String name; 
        private String processid; 
        private String refreshInterval; 
        private String refreshModel; 
        private String resourceGroup; 
        private String scheduledStartTime; 
        private String schemaName; 
        private String startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(OpenStructRefreshJobModel model) {
            this.endTime = model.endTime;
            this.name = model.name;
            this.processid = model.processid;
            this.refreshInterval = model.refreshInterval;
            this.refreshModel = model.refreshModel;
            this.resourceGroup = model.resourceGroup;
            this.scheduledStartTime = model.scheduledStartTime;
            this.schemaName = model.schemaName;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The end time of the refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15 10:12:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The materialized view name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_mv</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2025103010xxxxxxx</p>
         */
        public Builder processid(String processid) {
            this.processid = processid;
            return this;
        }

        /**
         * <p>The refresh interval.</p>
         * 
         * <strong>example:</strong>
         * <p>30s</p>
         */
        public Builder refreshInterval(String refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        /**
         * <p>The refresh model.</p>
         * <ul>
         * <li>FAST</li>
         * <li>COMPLETE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAST</p>
         */
        public Builder refreshModel(String refreshModel) {
            this.refreshModel = refreshModel;
            return this;
        }

        /**
         * <p>The resource group used for the refresh.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The scheduled start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15 10:11:00</p>
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The actual start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15 10:11:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the queried refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public OpenStructRefreshJobModel build() {
            return new OpenStructRefreshJobModel(this);
        } 

    } 

}
