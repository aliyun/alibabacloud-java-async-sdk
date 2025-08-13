// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Data source configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder dataSourceConfig(String dataSourceConfig) {
            this.putQueryParameter("dataSourceConfig", dataSourceConfig);
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * <p>Data source type</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735541040000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Event code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de_anbwns2231</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>Filters</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;left&quot;:&quot;score&quot;,&quot;operate&quot;:&quot;bw&quot;,&quot;right&quot;:&quot;222,333&quot;}</p>
         */
        public Builder filtersStr(String filtersStr) {
            this.putQueryParameter("filtersStr", filtersStr);
            this.filtersStr = filtersStr;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Rules list</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;100234&quot;]</p>
         */
        public Builder rulesStr(String rulesStr) {
            this.putQueryParameter("rulesStr", rulesStr);
            this.rulesStr = rulesStr;
            return this;
        }

        /**
         * <p>Whether to run the task directly</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder runTask(Boolean runTask) {
            this.putQueryParameter("runTask", runTask);
            this.runTask = runTask;
            return this;
        }

        /**
         * <p>Start time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1730448000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Task name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>仿真任务</p>
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
