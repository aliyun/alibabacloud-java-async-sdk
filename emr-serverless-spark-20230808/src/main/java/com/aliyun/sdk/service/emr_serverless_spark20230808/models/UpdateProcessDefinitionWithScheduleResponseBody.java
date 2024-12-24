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

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * failed.
         */
        public Builder failed(String failed) {
            this.failed = failed;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
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

            /**
             * alertEmailAddress.
             */
            public Builder alertEmailAddress(String alertEmailAddress) {
                this.alertEmailAddress = alertEmailAddress;
                return this;
            }

            /**
             * bizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * crontab.
             */
            public Builder crontab(String crontab) {
                this.crontab = crontab;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * executionType.
             */
            public Builder executionType(String executionType) {
                this.executionType = executionType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * projectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * releaseState.
             */
            public Builder releaseState(String releaseState) {
                this.releaseState = releaseState;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * timezoneId.
             */
            public Builder timezoneId(String timezoneId) {
                this.timezoneId = timezoneId;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * versionHashCode.
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
