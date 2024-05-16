// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsageDetailDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUsageDetailDataExportTaskRequest</p>
 */
public class CreateUsageDetailDataExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateUsageDetailDataExportTaskRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.endTime = builder.endTime;
        this.group = builder.group;
        this.language = builder.language;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUsageDetailDataExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateUsageDetailDataExportTaskRequest, Builder> {
        private String domainNames; 
        private String endTime; 
        private String group; 
        private String language; 
        private String startTime; 
        private String taskName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsageDetailDataExportTaskRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.endTime = request.endTime;
            this.group = request.group;
            this.language = request.language;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
            this.type = request.type;
        } 

        /**
         * The domain names. If you do not specify the Group parameter, resource usage details of these domain names are exported.
         * <p>
         * 
         * If you do not specify this parameter, resource usage details are exported based on accounts.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The domain name group. If you specify this parameter, the **DomainNames** parameter is ignored.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * The language in which you want to export the file. Valid values:
         * <p>
         * 
         * *   **zh-cn**: Chinese. This is the default value.
         * *   **en-us**: English
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of resource usage data to query. Valid values:
         * <p>
         * 
         * *   **flow**: traffic and bandwidth
         * *   **vas**: requests
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateUsageDetailDataExportTaskRequest build() {
            return new CreateUsageDetailDataExportTaskRequest(this);
        } 

    } 

}
