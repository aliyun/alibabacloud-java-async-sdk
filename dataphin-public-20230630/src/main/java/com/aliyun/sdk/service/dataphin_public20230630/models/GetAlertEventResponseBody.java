// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetAlertEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertEventResponseBody</p>
 */
public class GetAlertEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertEventInfo")
    private AlertEventInfo alertEventInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAlertEventResponseBody(Builder builder) {
        this.alertEventInfo = builder.alertEventInfo;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertEventInfo
     */
    public AlertEventInfo getAlertEventInfo() {
        return this.alertEventInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AlertEventInfo alertEventInfo; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAlertEventResponseBody model) {
            this.alertEventInfo = model.alertEventInfo;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AlertEventInfo.
         */
        public Builder alertEventInfo(AlertEventInfo alertEventInfo) {
            this.alertEventInfo = alertEventInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAlertEventResponseBody build() {
            return new GetAlertEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class AlertObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SourceSystemType")
        private String sourceSystemType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AlertObject(Builder builder) {
            this.name = builder.name;
            this.sourceSystemType = builder.sourceSystemType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertObject create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceSystemType
         */
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String sourceSystemType; 
            private String type; 

            private Builder() {
            } 

            private Builder(AlertObject model) {
                this.name = model.name;
                this.sourceSystemType = model.sourceSystemType;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SourceSystemType.
             */
            public Builder sourceSystemType(String sourceSystemType) {
                this.sourceSystemType = sourceSystemType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlertObject build() {
                return new AlertObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class AlertReasonParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AlertReasonParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertReasonParamList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(AlertReasonParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AlertReasonParamList build() {
                return new AlertReasonParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class AlertReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReasonParamList")
        private java.util.List<AlertReasonParamList> alertReasonParamList;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UniqueKey")
        private String uniqueKey;

        private AlertReason(Builder builder) {
            this.alertReasonParamList = builder.alertReasonParamList;
            this.bizDate = builder.bizDate;
            this.type = builder.type;
            this.uniqueKey = builder.uniqueKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertReason create() {
            return builder().build();
        }

        /**
         * @return alertReasonParamList
         */
        public java.util.List<AlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uniqueKey
         */
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public static final class Builder {
            private java.util.List<AlertReasonParamList> alertReasonParamList; 
            private String bizDate; 
            private String type; 
            private String uniqueKey; 

            private Builder() {
            } 

            private Builder(AlertReason model) {
                this.alertReasonParamList = model.alertReasonParamList;
                this.bizDate = model.bizDate;
                this.type = model.type;
                this.uniqueKey = model.uniqueKey;
            } 

            /**
             * AlertReasonParamList.
             */
            public Builder alertReasonParamList(java.util.List<AlertReasonParamList> alertReasonParamList) {
                this.alertReasonParamList = alertReasonParamList;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UniqueKey.
             */
            public Builder uniqueKey(String uniqueKey) {
                this.uniqueKey = uniqueKey;
                return this;
            }

            public AlertReason build() {
                return new AlertReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UserList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class AlertReceiverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertChannelTypeList")
        private java.util.List<String> alertChannelTypeList;

        @com.aliyun.core.annotation.NameInMap("CustomAlertChannelIdList")
        private java.util.List<String> customAlertChannelIdList;

        @com.aliyun.core.annotation.NameInMap("OnCallTableName")
        private String onCallTableName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List<UserList> userList;

        private AlertReceiverList(Builder builder) {
            this.alertChannelTypeList = builder.alertChannelTypeList;
            this.customAlertChannelIdList = builder.customAlertChannelIdList;
            this.onCallTableName = builder.onCallTableName;
            this.type = builder.type;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertReceiverList create() {
            return builder().build();
        }

        /**
         * @return alertChannelTypeList
         */
        public java.util.List<String> getAlertChannelTypeList() {
            return this.alertChannelTypeList;
        }

        /**
         * @return customAlertChannelIdList
         */
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        /**
         * @return onCallTableName
         */
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userList
         */
        public java.util.List<UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private java.util.List<String> alertChannelTypeList; 
            private java.util.List<String> customAlertChannelIdList; 
            private String onCallTableName; 
            private String type; 
            private java.util.List<UserList> userList; 

            private Builder() {
            } 

            private Builder(AlertReceiverList model) {
                this.alertChannelTypeList = model.alertChannelTypeList;
                this.customAlertChannelIdList = model.customAlertChannelIdList;
                this.onCallTableName = model.onCallTableName;
                this.type = model.type;
                this.userList = model.userList;
            } 

            /**
             * AlertChannelTypeList.
             */
            public Builder alertChannelTypeList(java.util.List<String> alertChannelTypeList) {
                this.alertChannelTypeList = alertChannelTypeList;
                return this;
            }

            /**
             * CustomAlertChannelIdList.
             */
            public Builder customAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
                this.customAlertChannelIdList = customAlertChannelIdList;
                return this;
            }

            /**
             * OnCallTableName.
             */
            public Builder onCallTableName(String onCallTableName) {
                this.onCallTableName = onCallTableName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserList.
             */
            public Builder userList(java.util.List<UserList> userList) {
                this.userList = userList;
                return this;
            }

            public AlertReceiverList build() {
                return new AlertReceiverList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class BelongProject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private BelongProject(Builder builder) {
            this.bizName = builder.bizName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BelongProject create() {
            return builder().build();
        }

        /**
         * @return bizName
         */
        public String getBizName() {
            return this.bizName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String bizName; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(BelongProject model) {
                this.bizName = model.bizName;
                this.projectName = model.projectName;
            } 

            /**
             * BizName.
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public BelongProject build() {
                return new BelongProject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class UrlConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfigUrl")
        private String alertConfigUrl;

        @com.aliyun.core.annotation.NameInMap("LogUrl")
        private String logUrl;

        @com.aliyun.core.annotation.NameInMap("ObjectUrl")
        private String objectUrl;

        private UrlConfig(Builder builder) {
            this.alertConfigUrl = builder.alertConfigUrl;
            this.logUrl = builder.logUrl;
            this.objectUrl = builder.objectUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfigUrl
         */
        public String getAlertConfigUrl() {
            return this.alertConfigUrl;
        }

        /**
         * @return logUrl
         */
        public String getLogUrl() {
            return this.logUrl;
        }

        /**
         * @return objectUrl
         */
        public String getObjectUrl() {
            return this.objectUrl;
        }

        public static final class Builder {
            private String alertConfigUrl; 
            private String logUrl; 
            private String objectUrl; 

            private Builder() {
            } 

            private Builder(UrlConfig model) {
                this.alertConfigUrl = model.alertConfigUrl;
                this.logUrl = model.logUrl;
                this.objectUrl = model.objectUrl;
            } 

            /**
             * AlertConfigUrl.
             */
            public Builder alertConfigUrl(String alertConfigUrl) {
                this.alertConfigUrl = alertConfigUrl;
                return this;
            }

            /**
             * LogUrl.
             */
            public Builder logUrl(String logUrl) {
                this.logUrl = logUrl;
                return this;
            }

            /**
             * ObjectUrl.
             */
            public Builder objectUrl(String objectUrl) {
                this.objectUrl = objectUrl;
                return this;
            }

            public UrlConfig build() {
                return new UrlConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertEventResponseBody</p>
     */
    public static class AlertEventInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertFrequency")
        private String alertFrequency;

        @com.aliyun.core.annotation.NameInMap("AlertObject")
        private AlertObject alertObject;

        @com.aliyun.core.annotation.NameInMap("AlertReason")
        private AlertReason alertReason;

        @com.aliyun.core.annotation.NameInMap("AlertReceiverList")
        private java.util.List<AlertReceiverList> alertReceiverList;

        @com.aliyun.core.annotation.NameInMap("BelongProject")
        private BelongProject belongProject;

        @com.aliyun.core.annotation.NameInMap("DoNotDisturbEndTime")
        private String doNotDisturbEndTime;

        @com.aliyun.core.annotation.NameInMap("FirstAlertTime")
        private String firstAlertTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LatestAlertTime")
        private String latestAlertTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalAlertTimes")
        private Long totalAlertTimes;

        @com.aliyun.core.annotation.NameInMap("UrlConfig")
        private UrlConfig urlConfig;

        private AlertEventInfo(Builder builder) {
            this.alertFrequency = builder.alertFrequency;
            this.alertObject = builder.alertObject;
            this.alertReason = builder.alertReason;
            this.alertReceiverList = builder.alertReceiverList;
            this.belongProject = builder.belongProject;
            this.doNotDisturbEndTime = builder.doNotDisturbEndTime;
            this.firstAlertTime = builder.firstAlertTime;
            this.id = builder.id;
            this.latestAlertTime = builder.latestAlertTime;
            this.status = builder.status;
            this.totalAlertTimes = builder.totalAlertTimes;
            this.urlConfig = builder.urlConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertEventInfo create() {
            return builder().build();
        }

        /**
         * @return alertFrequency
         */
        public String getAlertFrequency() {
            return this.alertFrequency;
        }

        /**
         * @return alertObject
         */
        public AlertObject getAlertObject() {
            return this.alertObject;
        }

        /**
         * @return alertReason
         */
        public AlertReason getAlertReason() {
            return this.alertReason;
        }

        /**
         * @return alertReceiverList
         */
        public java.util.List<AlertReceiverList> getAlertReceiverList() {
            return this.alertReceiverList;
        }

        /**
         * @return belongProject
         */
        public BelongProject getBelongProject() {
            return this.belongProject;
        }

        /**
         * @return doNotDisturbEndTime
         */
        public String getDoNotDisturbEndTime() {
            return this.doNotDisturbEndTime;
        }

        /**
         * @return firstAlertTime
         */
        public String getFirstAlertTime() {
            return this.firstAlertTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return latestAlertTime
         */
        public String getLatestAlertTime() {
            return this.latestAlertTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalAlertTimes
         */
        public Long getTotalAlertTimes() {
            return this.totalAlertTimes;
        }

        /**
         * @return urlConfig
         */
        public UrlConfig getUrlConfig() {
            return this.urlConfig;
        }

        public static final class Builder {
            private String alertFrequency; 
            private AlertObject alertObject; 
            private AlertReason alertReason; 
            private java.util.List<AlertReceiverList> alertReceiverList; 
            private BelongProject belongProject; 
            private String doNotDisturbEndTime; 
            private String firstAlertTime; 
            private Long id; 
            private String latestAlertTime; 
            private String status; 
            private Long totalAlertTimes; 
            private UrlConfig urlConfig; 

            private Builder() {
            } 

            private Builder(AlertEventInfo model) {
                this.alertFrequency = model.alertFrequency;
                this.alertObject = model.alertObject;
                this.alertReason = model.alertReason;
                this.alertReceiverList = model.alertReceiverList;
                this.belongProject = model.belongProject;
                this.doNotDisturbEndTime = model.doNotDisturbEndTime;
                this.firstAlertTime = model.firstAlertTime;
                this.id = model.id;
                this.latestAlertTime = model.latestAlertTime;
                this.status = model.status;
                this.totalAlertTimes = model.totalAlertTimes;
                this.urlConfig = model.urlConfig;
            } 

            /**
             * AlertFrequency.
             */
            public Builder alertFrequency(String alertFrequency) {
                this.alertFrequency = alertFrequency;
                return this;
            }

            /**
             * AlertObject.
             */
            public Builder alertObject(AlertObject alertObject) {
                this.alertObject = alertObject;
                return this;
            }

            /**
             * AlertReason.
             */
            public Builder alertReason(AlertReason alertReason) {
                this.alertReason = alertReason;
                return this;
            }

            /**
             * AlertReceiverList.
             */
            public Builder alertReceiverList(java.util.List<AlertReceiverList> alertReceiverList) {
                this.alertReceiverList = alertReceiverList;
                return this;
            }

            /**
             * BelongProject.
             */
            public Builder belongProject(BelongProject belongProject) {
                this.belongProject = belongProject;
                return this;
            }

            /**
             * DoNotDisturbEndTime.
             */
            public Builder doNotDisturbEndTime(String doNotDisturbEndTime) {
                this.doNotDisturbEndTime = doNotDisturbEndTime;
                return this;
            }

            /**
             * FirstAlertTime.
             */
            public Builder firstAlertTime(String firstAlertTime) {
                this.firstAlertTime = firstAlertTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LatestAlertTime.
             */
            public Builder latestAlertTime(String latestAlertTime) {
                this.latestAlertTime = latestAlertTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalAlertTimes.
             */
            public Builder totalAlertTimes(Long totalAlertTimes) {
                this.totalAlertTimes = totalAlertTimes;
                return this;
            }

            /**
             * UrlConfig.
             */
            public Builder urlConfig(UrlConfig urlConfig) {
                this.urlConfig = urlConfig;
                return this;
            }

            public AlertEventInfo build() {
                return new AlertEventInfo(this);
            } 

        } 

    }
}
