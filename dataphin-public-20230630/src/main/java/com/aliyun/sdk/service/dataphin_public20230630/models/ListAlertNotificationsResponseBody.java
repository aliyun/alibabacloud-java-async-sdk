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
 * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertNotificationsResponseBody</p>
 */
public class ListAlertNotificationsResponseBody extends TeaModel {
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

    private ListAlertNotificationsResponseBody(Builder builder) {
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

    public static ListAlertNotificationsResponseBody create() {
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

        private Builder(ListAlertNotificationsResponseBody model) {
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

        public ListAlertNotificationsResponseBody build() {
            return new ListAlertNotificationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
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
             * <p>The object name.</p>
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
             * <li>ALL: all.</li>
             * <li>DQE: data quality.</li>
             * <li>OS: data service.</li>
             * <li>STREAM: real-time computing.</li>
             * <li>VDM_BATCH: offline computing.</li>
             * <li>SOP: O&amp;M platform.</li>
             * <li>REAL_TIME_PIPELINE: real-time integration.</li>
             * <li>KGB: baseline monitoring.</li>
             * </ul>
             * <p>And more.</p>
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
             * <li>OS_API: API operation.</li>
             * <li>OS_APPLICATION_SERVICE: service application.</li>
             * <li>STREAM_TASK: real-time computing.</li>
             * <li>REAL_TIME_PIPELINE_TASK: real-time integration.</li>
             * <li>VDM_BATCH_SHELL: SHELL.</li>
             * <li>VDM_BATCH_PYTHON: PYTHON.</li>
             * <li>VDM_BATCH_DATAX: DATAX.</li>
             * <li>VDM_BATCH_DLINK: DLINK.</li>
             * <li>VDM_BATCH_VIRTUAL: VIRTUAL.</li>
             * <li>VDM_BATCH_PYTHON37: PYTHON37.</li>
             * <li>VDM_BATCH_PYTHON311: PYTHON311.</li>
             * <li>VDM_BATCH_MAX_COMPUTE_SQL: MAXCOMPUTE_SQL.</li>
             * <li>VDM_BATCH_MAX_COMPUTE_MR: MAXCOMPUTE_MR.</li>
             * <li>VDM_BATCH_SPARK_JAR_ON_MAX_COMPUTE: SPARK_JAR_ON_MAX_COMPUTE.</li>
             * <li>VDM_BATCH_HIVE_SQL: HIVE_SQL.</li>
             * <li>VDM_BATCH_HADOOP_MR: HADOOP_MR.</li>
             * <li>VDM_BATCH_SPARK_JAR_ON_HIVE: SPARK_JAR_ON_HIVE.</li>
             * <li>VDM_BATCH_SPARK_SQL_ON_HIVE: SPARK_SQL_ON_HIVE.</li>
             * <li>VDM_BATCH_SPARK_SQL: VDM_BATCH_SPARK_SQL.</li>
             * <li>DQE_LOGICAL_TABLE: logical table.</li>
             * <li>DQE_PHYSICAL_TABLE: physical table.</li>
             * <li>DQE_REALTIME_TABLE: real-time meta table.</li>
             * <li>DQE_DATA_SOURCE: data source.</li>
             * <li>DQE_INDEX: metric.</li>
             * <li>QD_DECISION_INVOKE: QD decision invocation.</li>
             * <li>BASELINE: baseline.</li>
             * </ul>
             * <p>And more.</p>
             * 
             * <strong>example:</strong>
             * <p>VDM_BATCH_SHELL</p>
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
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
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
             * <p>The alert parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>biz_date</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The alert parameter value.</p>
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
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
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
             * <p>The list of alert parameters.</p>
             */
            public Builder alertReasonParamList(java.util.List<AlertReasonParamList> alertReasonParamList) {
                this.alertReasonParamList = alertReasonParamList;
                return this;
            }

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>20241125</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The alert reason type. Valid values:</p>
             * <ul>
             * <li>DQE_COLUMN: field rule exception.</li>
             * <li>DQE_DATA_SOURCE: data source rule exception.</li>
             * <li>DQE_CUSTOMIZE: custom rule exception.</li>
             * <li>DQE_TABLE: table rule exception.</li>
             * <li>DQE_REALTIME_TABLE: real-time table rule exception.</li>
             * <li>DQE_INDEX: metric rule exception.</li>
             * <li>OS_AVG_RESPONSE: average response time exception.</li>
             * <li>OS_CALL_TIMES: call count exception.</li>
             * <li>OS_ERROR_RATE: error rate exception.</li>
             * <li>OS_OFFLINE: Offline percentage exception.</li>
             * <li>STREAM_BIZ_DELAY: business delay too high.</li>
             * <li>STREAM_DATA_RETENTION: data retention exceeds configuration.</li>
             * <li>STREAM_MORE_THAN_FAILURE: failure frequency exceeds configuration.</li>
             * <li>STREAM_TPS_OUT_RANGE: TPS out of range.</li>
             * <li>STREAM_CHECKPOINT_FAILURE: checkpoint failures exceed configuration.</li>
             * <li>STREAM_BACKPRESSURE: backpressure duration exceeds configuration.</li>
             * <li>STREAM_JOB_FAILURE: job execution failed.</li>
             * <li>VDM_BATCH_ERROR: error.</li>
             * <li>VDM_BATCH_FINISH: completed.</li>
             * <li>VDM_BATCH_TIME_OUT: execution timed out.</li>
             * <li>VDM_BATCH_UNDONE: not completed.</li>
             * <li>VDM_BATCH_LOGIC_DATA_DELAY: data delay.</li>
             * <li>QD_DECISION_CALL_TIMES: decision call count exception.</li>
             * <li>QD_DECISION_MAX_RESPONSE: maximum response time exception.</li>
             * <li>QD_DECISION_ERROR_RATE: error rate exception.</li>
             * <li>QD_DECISION_PARAM_COUNT: decision parameter count exception.</li>
             * <li>QD_DECISION_PARAM_PERCENTAGE: decision parameter percentage exception.</li>
             * <li>QD_DECISION_PARAM_SUM: decision parameter sum exception.</li>
             * <li>QD_DECISION_PARAM_AVG: decision parameter average exception.</li>
             * <li>LOGICAL_INSTANCE_GENERATION: logical instance generation monitoring.</li>
             * <li>KGB_TASK_ERROR: baseline task error.</li>
             * <li>KGB_TASK_SLOW_DOWN: baseline task slowdown.</li>
             * <li>KGB_EARLY_WARNING: baseline early warning.</li>
             * <li>KGB_BROKEN_LINE: baseline broken line.</li>
             * </ul>
             * <p>And more.</p>
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
             * <p>123456</p>
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
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private User(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
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

            private Builder(User model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the alert receiver.</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
     */
    public static class AlertReceiver extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertChannelType")
        private String alertChannelType;

        @com.aliyun.core.annotation.NameInMap("CustomAlertChannelId")
        private String customAlertChannelId;

        @com.aliyun.core.annotation.NameInMap("OnCallTableId")
        private String onCallTableId;

        @com.aliyun.core.annotation.NameInMap("OnCallTableName")
        private String onCallTableName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private User user;

        private AlertReceiver(Builder builder) {
            this.alertChannelType = builder.alertChannelType;
            this.customAlertChannelId = builder.customAlertChannelId;
            this.onCallTableId = builder.onCallTableId;
            this.onCallTableName = builder.onCallTableName;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertReceiver create() {
            return builder().build();
        }

        /**
         * @return alertChannelType
         */
        public String getAlertChannelType() {
            return this.alertChannelType;
        }

        /**
         * @return customAlertChannelId
         */
        public String getCustomAlertChannelId() {
            return this.customAlertChannelId;
        }

        /**
         * @return onCallTableId
         */
        public String getOnCallTableId() {
            return this.onCallTableId;
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
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private String alertChannelType; 
            private String customAlertChannelId; 
            private String onCallTableId; 
            private String onCallTableName; 
            private String type; 
            private User user; 

            private Builder() {
            } 

            private Builder(AlertReceiver model) {
                this.alertChannelType = model.alertChannelType;
                this.customAlertChannelId = model.customAlertChannelId;
                this.onCallTableId = model.onCallTableId;
                this.onCallTableName = model.onCallTableName;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * <p>The push channel type. Valid values:</p>
             * <ul>
             * <li>VOICE: phone call.</li>
             * <li>SMS: text message.</li>
             * <li>MAIL: email.</li>
             * <li>DINGTALK_ROBOT: DingTalk robot.</li>
             * <li>DINGDING: DingTalk work notification.</li>
             * <li>CUSTOM: custom message channel.</li>
             * <li>WECHAT: WeCom.</li>
             * <li>FEISHU: Lark.</li>
             * <li>SILENCE: do not send.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SMS</p>
             */
            public Builder alertChannelType(String alertChannelType) {
                this.alertChannelType = alertChannelType;
                return this;
            }

            /**
             * <p>The custom message channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder customAlertChannelId(String customAlertChannelId) {
                this.customAlertChannelId = customAlertChannelId;
                return this;
            }

            /**
             * <p>The on-call schedule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder onCallTableId(String onCallTableId) {
                this.onCallTableId = onCallTableId;
                return this;
            }

            /**
             * <p>The on-call schedule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder onCallTableName(String onCallTableName) {
                this.onCallTableName = onCallTableName;
                return this;
            }

            /**
             * <p>The alert receiver type. Valid values:</p>
             * <ul>
             * <li>ON_CALL_TABLE: on-call schedule.</li>
             * <li>USER_DEFINED: custom user.</li>
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
             * <p>The user information.</p>
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public AlertReceiver build() {
                return new AlertReceiver(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
     */
    public static class AlertSend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("SendContent")
        private String sendContent;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private String sendTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AlertSend(Builder builder) {
            this.failReason = builder.failReason;
            this.sendContent = builder.sendContent;
            this.sendTime = builder.sendTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertSend create() {
            return builder().build();
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return sendContent
         */
        public String getSendContent() {
            return this.sendContent;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failReason; 
            private String sendContent; 
            private String sendTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(AlertSend model) {
                this.failReason = model.failReason;
                this.sendContent = model.sendContent;
                this.sendTime = model.sendTime;
                this.status = model.status;
            } 

            /**
             * <p>The alert reason.</p>
             * 
             * <strong>example:</strong>
             * <p>不合法</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The push content.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sendContent(String sendContent) {
                this.sendContent = sendContent;
                return this;
            }

            /**
             * <p>The push time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-25 10:02:47</p>
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * <p>The push status. Valid values:</p>
             * <ul>
             * <li>SUCCESS: Sent successfully.</li>
             * <li>FAILE: Failed to send.</li>
             * <li>SENDING: Sending in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AlertSend build() {
                return new AlertSend(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertEventId")
        private String alertEventId;

        @com.aliyun.core.annotation.NameInMap("AlertObject")
        private AlertObject alertObject;

        @com.aliyun.core.annotation.NameInMap("AlertReason")
        private AlertReason alertReason;

        @com.aliyun.core.annotation.NameInMap("AlertReceiver")
        private AlertReceiver alertReceiver;

        @com.aliyun.core.annotation.NameInMap("AlertSend")
        private AlertSend alertSend;

        private Data(Builder builder) {
            this.alertEventId = builder.alertEventId;
            this.alertObject = builder.alertObject;
            this.alertReason = builder.alertReason;
            this.alertReceiver = builder.alertReceiver;
            this.alertSend = builder.alertSend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertEventId
         */
        public String getAlertEventId() {
            return this.alertEventId;
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
         * @return alertReceiver
         */
        public AlertReceiver getAlertReceiver() {
            return this.alertReceiver;
        }

        /**
         * @return alertSend
         */
        public AlertSend getAlertSend() {
            return this.alertSend;
        }

        public static final class Builder {
            private String alertEventId; 
            private AlertObject alertObject; 
            private AlertReason alertReason; 
            private AlertReceiver alertReceiver; 
            private AlertSend alertSend; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertEventId = model.alertEventId;
                this.alertObject = model.alertObject;
                this.alertReason = model.alertReason;
                this.alertReceiver = model.alertReceiver;
                this.alertSend = model.alertSend;
            } 

            /**
             * <p>The alert event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder alertEventId(String alertEventId) {
                this.alertEventId = alertEventId;
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
             * <p>The receiver information.</p>
             */
            public Builder alertReceiver(AlertReceiver alertReceiver) {
                this.alertReceiver = alertReceiver;
                return this;
            }

            /**
             * <p>The alert sending information.</p>
             */
            public Builder alertSend(AlertSend alertSend) {
                this.alertSend = alertSend;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsResponseBody</p>
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
             * <p>The list of push records.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of records.</p>
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
