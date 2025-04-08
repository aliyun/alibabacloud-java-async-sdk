// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateProcessDefinitionWithScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProcessDefinitionWithScheduleResponseBody</p>
 */
public class UpdateProcessDefinitionWithScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("failed")
    private String failed;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private UpdateProcessDefinitionWithScheduleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.failed = builder.failed;
        this.httpStatusCode = builder.httpStatusCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProcessDefinitionWithScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return failed
     */
    public String getFailed() {
        return this.failed;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String failed; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(UpdateProcessDefinitionWithScheduleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.failed = model.failed;
            this.httpStatusCode = model.httpStatusCode;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The code that is returned by the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>1400009</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder failed(String failed) {
            this.failed = failed;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>No permission for resource action</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateProcessDefinitionWithScheduleResponseBody build() {
            return new UpdateProcessDefinitionWithScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProcessDefinitionWithScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateProcessDefinitionWithScheduleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertEmailAddress")
        private String alertEmailAddress;

        @com.aliyun.core.annotation.NameInMap("bizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("crontab")
        private String crontab;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("executionType")
        private String executionType;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("releaseState")
        private String releaseState;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("timezoneId")
        private String timezoneId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("versionHashCode")
        private String versionHashCode;

        private Data(Builder builder) {
            this.alertEmailAddress = builder.alertEmailAddress;
            this.bizId = builder.bizId;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.crontab = builder.crontab;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.executionType = builder.executionType;
            this.id = builder.id;
            this.name = builder.name;
            this.projectName = builder.projectName;
            this.releaseState = builder.releaseState;
            this.startTime = builder.startTime;
            this.timezoneId = builder.timezoneId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.version = builder.version;
            this.versionHashCode = builder.versionHashCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertEmailAddress
         */
        public String getAlertEmailAddress() {
            return this.alertEmailAddress;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crontab
         */
        public String getCrontab() {
            return this.crontab;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executionType
         */
        public String getExecutionType() {
            return this.executionType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return releaseState
         */
        public String getReleaseState() {
            return this.releaseState;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timezoneId
         */
        public String getTimezoneId() {
            return this.timezoneId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionHashCode
         */
        public String getVersionHashCode() {
            return this.versionHashCode;
        }

        public static final class Builder {
            private String alertEmailAddress; 
            private String bizId; 
            private String code; 
            private String createTime; 
            private String crontab; 
            private String description; 
            private String endTime; 
            private String executionType; 
            private String id; 
            private String name; 
            private String projectName; 
            private String releaseState; 
            private String startTime; 
            private String timezoneId; 
            private String updateTime; 
            private String userId; 
            private String userName; 
            private Integer version; 
            private String versionHashCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertEmailAddress = model.alertEmailAddress;
                this.bizId = model.bizId;
                this.code = model.code;
                this.createTime = model.createTime;
                this.crontab = model.crontab;
                this.description = model.description;
                this.endTime = model.endTime;
                this.executionType = model.executionType;
                this.id = model.id;
                this.name = model.name;
                this.projectName = model.projectName;
                this.releaseState = model.releaseState;
                this.startTime = model.startTime;
                this.timezoneId = model.timezoneId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.userName = model.userName;
                this.version = model.version;
                this.versionHashCode = model.versionHashCode;
            } 

            /**
             * <p>The email address to receive alerts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
             */
            public Builder alertEmailAddress(String alertEmailAddress) {
                this.alertEmailAddress = alertEmailAddress;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_ack_one_cluster</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12***********</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the workflow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-05T02:03:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The CRON expression that is used for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 * * ?</p>
             */
            public Builder crontab(String crontab) {
                this.crontab = crontab;
                return this;
            }

            /**
             * <p>The node description.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end of the end time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1710432000000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The execution policy.</p>
             * 
             * <strong>example:</strong>
             * <p>SERIAL</p>
             */
            public Builder executionType(String executionType) {
                this.executionType = executionType;
                return this;
            }

            /**
             * <p>The serial number of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>123223</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_batch_workflow</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the project to which the workflow belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>w-********</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The status of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder releaseState(String releaseState) {
                this.releaseState = releaseState;
                return this;
            }

            /**
             * <p>The start time of the scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezoneId(String timezoneId) {
                this.timezoneId = timezoneId;
                return this;
            }

            /**
             * <p>The time when the workflow was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05T06:24:27Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user that is used to initiate a scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>113*********</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The name of the user that is used to initiate a scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>w-********</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The hash code of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>dwerf*********</p>
             */
            public Builder versionHashCode(String versionHashCode) {
                this.versionHashCode = versionHashCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
