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
         * ListResult.
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
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

            /**
             * Name.
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

            /**
             * AlertChannelType.
             */
            public Builder alertChannelType(String alertChannelType) {
                this.alertChannelType = alertChannelType;
                return this;
            }

            /**
             * CustomAlertChannelId.
             */
            public Builder customAlertChannelId(String customAlertChannelId) {
                this.customAlertChannelId = customAlertChannelId;
                return this;
            }

            /**
             * OnCallTableId.
             */
            public Builder onCallTableId(String onCallTableId) {
                this.onCallTableId = onCallTableId;
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
             * User.
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

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * SendContent.
             */
            public Builder sendContent(String sendContent) {
                this.sendContent = sendContent;
                return this;
            }

            /**
             * SendTime.
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * Status.
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

            /**
             * AlertEventId.
             */
            public Builder alertEventId(String alertEventId) {
                this.alertEventId = alertEventId;
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
             * AlertReceiver.
             */
            public Builder alertReceiver(AlertReceiver alertReceiver) {
                this.alertReceiver = alertReceiver;
                return this;
            }

            /**
             * AlertSend.
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

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
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
