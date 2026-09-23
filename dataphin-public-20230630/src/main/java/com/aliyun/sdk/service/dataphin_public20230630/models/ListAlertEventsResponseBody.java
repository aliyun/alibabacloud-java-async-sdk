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
 * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertEventsResponseBody</p>
 */
public class ListAlertEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ListResult")
    private ListResult listResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAlertEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.listResult = builder.listResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return listResult
     */
    public ListResult getListResult() {
        return this.listResult;
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
        private String code; 
        private Integer httpStatusCode; 
        private ListResult listResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAlertEventsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.listResult = model.listResult;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAlertEventsResponseBody build() {
            return new ListAlertEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The name of the alert object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source system. Valid values:</p>
             * <ul>
             * <li>ALL: all</li>
             * <li>DQE: data quality</li>
             * <li>OS: data service</li>
             * <li>STREAM: real-time computing</li>
             * <li>VDM_BATCH: offline computing</li>
             * <li>SOP: O&amp;M platform</li>
             * <li>REAL_TIME_PIPELINE: real-time integration</li>
             * <li>KGB: baseline monitoring</li>
             * </ul>
             * <p>and more.</p>
             * 
             * <strong>example:</strong>
             * <p>VDM_BATCH</p>
             */
            public Builder sourceSystemType(String sourceSystemType) {
                this.sourceSystemType = sourceSystemType;
                return this;
            }

            /**
             * <p>The alert object type. Valid values:</p>
             * <ul>
             * <li>OS_API: API operation</li>
             * <li>OS_APPLICATION_SERVICE: service application</li>
             * <li>STREAM_TASK: real-time computing</li>
             * <li>REAL_TIME_PIPELINE_TASK: real-time integration</li>
             * <li>VDM_BATCH_SHELL: SHELL</li>
             * <li>VDM_BATCH_PYTHON: PYTHON</li>
             * <li>VDM_BATCH_DATAX: DATAX</li>
             * <li>VDM_BATCH_DLINK: DLINK</li>
             * <li>VDM_BATCH_VIRTUAL: VIRTUAL</li>
             * <li>VDM_BATCH_PYTHON37: PYTHON37</li>
             * <li>VDM_BATCH_PYTHON311: PYTHON311</li>
             * <li>VDM_BATCH_MAX_COMPUTE_SQL: MAXCOMPUTE_SQL</li>
             * <li>VDM_BATCH_MAX_COMPUTE_MR: MAXCOMPUTE_MR</li>
             * <li>VDM_BATCH_SPARK_JAR_ON_MAX_COMPUTE: SPARK_JAR_ON_MAX_COMPUTE</li>
             * <li>VDM_BATCH_HIVE_SQL: HIVE_SQL</li>
             * <li>VDM_BATCH_HADOOP_MR: HADOOP_MR</li>
             * <li>VDM_BATCH_SPARK_JAR_ON_HIVE: SPARK_JAR_ON_HIVE</li>
             * <li>VDM_BATCH_SPARK_SQL_ON_HIVE: SPARK_SQL_ON_HIVE</li>
             * <li>VDM_BATCH_SPARK_SQL: VDM_BATCH_SPARK_SQL</li>
             * <li>DQE_LOGICAL_TABLE: logical table</li>
             * <li>DQE_PHYSICAL_TABLE: physical table</li>
             * <li>DQE_REALTIME_TABLE: real-time metadata table</li>
             * <li>DQE_DATA_SOURCE: data source</li>
             * <li>DQE_INDEX: metric</li>
             * <li>QD_DECISION_INVOKE: QD decision invocation</li>
             * <li>BASELINE: baseline</li>
             * </ul>
             * <p>and more.</p>
             * 
             * <strong>example:</strong>
             * <p>STREAM_TASK</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The name of the alert reason parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>biz_date</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the alert reason parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-24 00:00:00</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The list of alert reason parameters.</p>
             */
            public Builder alertReasonParamList(java.util.List<AlertReasonParamList> alertReasonParamList) {
                this.alertReasonParamList = alertReasonParamList;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-25 10:02:47</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The alert reason type. Valid values:</p>
             * <ul>
             * <li>DQE_COLUMN: field rule exception</li>
             * <li>DQE_DATA_SOURCE: data source rule exception</li>
             * <li>DQE_CUSTOMIZE: custom rule exception</li>
             * <li>DQE_TABLE: table rule exception</li>
             * <li>DQE_REALTIME_TABLE: real-time table rule exception</li>
             * <li>DQE_INDEX: metric rule exception</li>
             * <li>OS_AVG_RESPONSE: average response time exception</li>
             * <li>OS_CALL_TIMES: call count exception</li>
             * <li>OS_ERROR_RATE: error rate exception</li>
             * <li>OS_OFFLINE: Offline percentage exception</li>
             * <li>STREAM_BIZ_DELAY: business delay too high</li>
             * <li>STREAM_DATA_RETENTION: data retention exceeds configuration</li>
             * <li>STREAM_MORE_THAN_FAILURE: failure frequency exceeds configuration</li>
             * <li>STREAM_TPS_OUT_RANGE: TPS out of range</li>
             * <li>STREAM_CHECKPOINT_FAILURE: checkpoint failures exceed configuration</li>
             * <li>STREAM_BACKPRESSURE: backpressure duration exceeds configuration</li>
             * <li>STREAM_JOB_FAILURE: job failure</li>
             * <li>VDM_BATCH_ERROR: error</li>
             * <li>VDM_BATCH_FINISH: completed</li>
             * <li>VDM_BATCH_TIME_OUT: execution timeout</li>
             * <li>VDM_BATCH_UNDONE: incomplete</li>
             * <li>VDM_BATCH_LOGIC_DATA_DELAY: data delay</li>
             * <li>QD_DECISION_CALL_TIMES: decision call count exception</li>
             * <li>QD_DECISION_MAX_RESPONSE: maximum response time exception</li>
             * <li>QD_DECISION_ERROR_RATE: error rate exception</li>
             * <li>QD_DECISION_PARAM_COUNT: decision parameter count exception</li>
             * <li>QD_DECISION_PARAM_PERCENTAGE: decision parameter percentage exception</li>
             * <li>QD_DECISION_PARAM_SUM: decision parameter sum exception</li>
             * <li>QD_DECISION_PARAM_AVG: decision parameter average exception</li>
             * <li>LOGICAL_INSTANCE_GENERATION: logical instance generation monitoring</li>
             * <li>KGB_TASK_ERROR: baseline task error</li>
             * <li>KGB_TASK_SLOW_DOWN: baseline task slowdown</li>
             * <li>KGB_EARLY_WARNING: baseline early warning</li>
             * <li>KGB_BROKEN_LINE: baseline breach</li>
             * </ul>
             * <p>and more.</p>
             * 
             * <strong>example:</strong>
             * <p>VDM_BATCH_FINISH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>t_6340134343289405440_20241124_639873707610</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The list of alert channel types.</p>
             */
            public Builder alertChannelTypeList(java.util.List<String> alertChannelTypeList) {
                this.alertChannelTypeList = alertChannelTypeList;
                return this;
            }

            /**
             * <p>The list of custom alert channel IDs.</p>
             */
            public Builder customAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
                this.customAlertChannelIdList = customAlertChannelIdList;
                return this;
            }

            /**
             * <p>The name of the on-call schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder onCallTableName(String onCallTableName) {
                this.onCallTableName = onCallTableName;
                return this;
            }

            /**
             * <p>The type of the alert receiver. Valid values:</p>
             * <ul>
             * <li>ON_CALL_TABLE: on-call schedule</li>
             * <li>USER_DEFINED: custom user</li>
             * <li>OWNER: owner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The list of alert users.</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The business unit name.</p>
             * 
             * <strong>example:</strong>
             * <p>biz_1</p>
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_1</p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
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
             * <p>The URL of the alert configuration page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dataphin.com/ops/test3">https://dataphin.com/ops/test3</a></p>
             */
            public Builder alertConfigUrl(String alertConfigUrl) {
                this.alertConfigUrl = alertConfigUrl;
                return this;
            }

            /**
             * <p>The URL of the log page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dataphin.com/ops/test2">https://dataphin.com/ops/test2</a></p>
             */
            public Builder logUrl(String logUrl) {
                this.logUrl = logUrl;
                return this;
            }

            /**
             * <p>The URL of the alert object page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dataphin.com/ops/test1">https://dataphin.com/ops/test1</a></p>
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
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
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
        private String id;

        @com.aliyun.core.annotation.NameInMap("LatestAlertTime")
        private String latestAlertTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalAlertTimes")
        private Long totalAlertTimes;

        @com.aliyun.core.annotation.NameInMap("UrlConfig")
        private UrlConfig urlConfig;

        private Data(Builder builder) {
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

        public static Data create() {
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
        public String getId() {
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
            private String id; 
            private String latestAlertTime; 
            private String status; 
            private Long totalAlertTimes; 
            private UrlConfig urlConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
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
             * <p>The alert frequency. Valid values:</p>
             * <ul>
             * <li>ONCE: instant alert</li>
             * <li>PERIOD: periodic alert. Format: 1HOUR, 1MINUTE, 1SECOND.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder alertFrequency(String alertFrequency) {
                this.alertFrequency = alertFrequency;
                return this;
            }

            /**
             * <p>The alert object.</p>
             */
            public Builder alertObject(AlertObject alertObject) {
                this.alertObject = alertObject;
                return this;
            }

            /**
             * <p>The alert reason.</p>
             */
            public Builder alertReason(AlertReason alertReason) {
                this.alertReason = alertReason;
                return this;
            }

            /**
             * <p>The list of alert receivers.</p>
             */
            public Builder alertReceiverList(java.util.List<AlertReceiverList> alertReceiverList) {
                this.alertReceiverList = alertReceiverList;
                return this;
            }

            /**
             * <p>The project to which the alert belongs.</p>
             */
            public Builder belongProject(BelongProject belongProject) {
                this.belongProject = belongProject;
                return this;
            }

            /**
             * <p>The expiration time of the do-not-disturb period.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-25 00:00:00</p>
             */
            public Builder doNotDisturbEndTime(String doNotDisturbEndTime) {
                this.doNotDisturbEndTime = doNotDisturbEndTime;
                return this;
            }

            /**
             * <p>The time of the first alert.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-25 10:02:47</p>
             */
            public Builder firstAlertTime(String firstAlertTime) {
                this.firstAlertTime = firstAlertTime;
                return this;
            }

            /**
             * <p>The alert event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time of the latest alert.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-25 10:02:47</p>
             */
            public Builder latestAlertTime(String latestAlertTime) {
                this.latestAlertTime = latestAlertTime;
                return this;
            }

            /**
             * <p>The alert status. Valid values:</p>
             * <ul>
             * <li>ALERTING: alerting</li>
             * <li>DO_NOT_DISTURB: do not disturb</li>
             * <li>SILENCING: alerting (cool-down period)</li>
             * <li>FINISH: completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISH</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of alert occurrences.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalAlertTimes(Long totalAlertTimes) {
                this.totalAlertTimes = totalAlertTimes;
                return this;
            }

            /**
             * <p>The URL information.</p>
             */
            public Builder urlConfig(UrlConfig urlConfig) {
                this.urlConfig = urlConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class ListResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ListResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ListResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The alert event query results.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListResult build() {
                return new ListResult(this);
            } 

        } 

    }
}
