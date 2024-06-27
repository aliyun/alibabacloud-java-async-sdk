// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimulationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSimulationTaskRequest</p>
 */
public class CreateSimulationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceConfig")
    private String dataSourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filtersStr")
    private String filtersStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rulesStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rulesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runTask")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean runTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateSimulationTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataSourceConfig = builder.dataSourceConfig;
        this.dataSourceType = builder.dataSourceType;
        this.endTime = builder.endTime;
        this.eventCode = builder.eventCode;
        this.filtersStr = builder.filtersStr;
        this.regId = builder.regId;
        this.rulesStr = builder.rulesStr;
        this.runTask = builder.runTask;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimulationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return dataSourceConfig
     */
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return filtersStr
     */
    public String getFiltersStr() {
        return this.filtersStr;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return rulesStr
     */
    public String getRulesStr() {
        return this.rulesStr;
    }

    /**
     * @return runTask
     */
    public Boolean getRunTask() {
        return this.runTask;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateSimulationTaskRequest, Builder> {
        private String lang; 
        private String dataSourceConfig; 
        private String dataSourceType; 
        private Long endTime; 
        private String eventCode; 
        private String filtersStr; 
        private String regId; 
        private String rulesStr; 
        private Boolean runTask; 
        private Long startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimulationTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataSourceConfig = request.dataSourceConfig;
            this.dataSourceType = request.dataSourceType;
            this.endTime = request.endTime;
            this.eventCode = request.eventCode;
            this.filtersStr = request.filtersStr;
            this.regId = request.regId;
            this.rulesStr = request.rulesStr;
            this.runTask = request.runTask;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * dataSourceConfig.
         */
        public Builder dataSourceConfig(String dataSourceConfig) {
            this.putQueryParameter("dataSourceConfig", dataSourceConfig);
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * dataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * filtersStr.
         */
        public Builder filtersStr(String filtersStr) {
            this.putQueryParameter("filtersStr", filtersStr);
            this.filtersStr = filtersStr;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * rulesStr.
         */
        public Builder rulesStr(String rulesStr) {
            this.putQueryParameter("rulesStr", rulesStr);
            this.rulesStr = rulesStr;
            return this;
        }

        /**
         * runTask.
         */
        public Builder runTask(Boolean runTask) {
            this.putQueryParameter("runTask", runTask);
            this.runTask = runTask;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateSimulationTaskRequest build() {
            return new CreateSimulationTaskRequest(this);
        } 

    } 

}
