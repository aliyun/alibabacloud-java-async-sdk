// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertHistoryListResponseBody</p>
 */
public class DescribeAlertHistoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmHistoryList")
    private AlarmHistoryList alarmHistoryList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeAlertHistoryListResponseBody(Builder builder) {
        this.alarmHistoryList = builder.alarmHistoryList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertHistoryListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmHistoryList
     */
    public AlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private AlarmHistoryList alarmHistoryList; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        private Builder() {
        } 

        private Builder(DescribeAlertHistoryListResponseBody model) {
            this.alarmHistoryList = model.alarmHistoryList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AlarmHistoryList.
         */
        public Builder alarmHistoryList(AlarmHistoryList alarmHistoryList) {
            this.alarmHistoryList = alarmHistoryList;
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

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeAlertHistoryListResponseBody build() {
            return new DescribeAlertHistoryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactALIIMs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactALIIM")
        private java.util.List<String> contactALIIM;

        private ContactALIIMs(Builder builder) {
            this.contactALIIM = builder.contactALIIM;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactALIIMs create() {
            return builder().build();
        }

        /**
         * @return contactALIIM
         */
        public java.util.List<String> getContactALIIM() {
            return this.contactALIIM;
        }

        public static final class Builder {
            private java.util.List<String> contactALIIM; 

            private Builder() {
            } 

            private Builder(ContactALIIMs model) {
                this.contactALIIM = model.contactALIIM;
            } 

            /**
             * ContactALIIM.
             */
            public Builder contactALIIM(java.util.List<String> contactALIIM) {
                this.contactALIIM = contactALIIM;
                return this;
            }

            public ContactALIIMs build() {
                return new ContactALIIMs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
        private java.util.List<String> contactGroup;

        private ContactGroups(Builder builder) {
            this.contactGroup = builder.contactGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroup
         */
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List<String> contactGroup; 

            private Builder() {
            } 

            private Builder(ContactGroups model) {
                this.contactGroup = model.contactGroup;
            } 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List<String> contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactMails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactMail")
        private java.util.List<String> contactMail;

        private ContactMails(Builder builder) {
            this.contactMail = builder.contactMail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactMails create() {
            return builder().build();
        }

        /**
         * @return contactMail
         */
        public java.util.List<String> getContactMail() {
            return this.contactMail;
        }

        public static final class Builder {
            private java.util.List<String> contactMail; 

            private Builder() {
            } 

            private Builder(ContactMails model) {
                this.contactMail = model.contactMail;
            } 

            /**
             * ContactMail.
             */
            public Builder contactMail(java.util.List<String> contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            public ContactMails build() {
                return new ContactMails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactSmses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactSms")
        private java.util.List<String> contactSms;

        private ContactSmses(Builder builder) {
            this.contactSms = builder.contactSms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactSmses create() {
            return builder().build();
        }

        /**
         * @return contactSms
         */
        public java.util.List<String> getContactSms() {
            return this.contactSms;
        }

        public static final class Builder {
            private java.util.List<String> contactSms; 

            private Builder() {
            } 

            private Builder(ContactSmses model) {
                this.contactSms = model.contactSms;
            } 

            /**
             * ContactSms.
             */
            public Builder contactSms(java.util.List<String> contactSms) {
                this.contactSms = contactSms;
                return this;
            }

            public ContactSmses build() {
                return new ContactSmses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contact")
        private java.util.List<String> contact;

        private Contacts(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List<String> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List<String> contact; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.contact = model.contact;
            } 

            /**
             * Contact.
             */
            public Builder contact(java.util.List<String> contact) {
                this.contact = contact;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class AlarmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private Long alertTime;

        @com.aliyun.core.annotation.NameInMap("ContactALIIMs")
        private ContactALIIMs contactALIIMs;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @com.aliyun.core.annotation.NameInMap("ContactMails")
        private ContactMails contactMails;

        @com.aliyun.core.annotation.NameInMap("ContactSmses")
        private ContactSmses contactSmses;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private Contacts contacts;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PreLevel")
        private String preLevel;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
        private String webhooks;

        private AlarmHistory(Builder builder) {
            this.alertName = builder.alertName;
            this.alertTime = builder.alertTime;
            this.contactALIIMs = builder.contactALIIMs;
            this.contactGroups = builder.contactGroups;
            this.contactMails = builder.contactMails;
            this.contactSmses = builder.contactSmses;
            this.contacts = builder.contacts;
            this.dimensions = builder.dimensions;
            this.evaluationCount = builder.evaluationCount;
            this.expression = builder.expression;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.lastTime = builder.lastTime;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.preLevel = builder.preLevel;
            this.ruleName = builder.ruleName;
            this.state = builder.state;
            this.status = builder.status;
            this.userId = builder.userId;
            this.value = builder.value;
            this.webhooks = builder.webhooks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistory create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return contactALIIMs
         */
        public ContactALIIMs getContactALIIMs() {
            return this.contactALIIMs;
        }

        /**
         * @return contactGroups
         */
        public ContactGroups getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return contactMails
         */
        public ContactMails getContactMails() {
            return this.contactMails;
        }

        /**
         * @return contactSmses
         */
        public ContactSmses getContactSmses() {
            return this.contactSmses;
        }

        /**
         * @return contacts
         */
        public Contacts getContacts() {
            return this.contacts;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return preLevel
         */
        public String getPreLevel() {
            return this.preLevel;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return webhooks
         */
        public String getWebhooks() {
            return this.webhooks;
        }

        public static final class Builder {
            private String alertName; 
            private Long alertTime; 
            private ContactALIIMs contactALIIMs; 
            private ContactGroups contactGroups; 
            private ContactMails contactMails; 
            private ContactSmses contactSmses; 
            private Contacts contacts; 
            private String dimensions; 
            private Integer evaluationCount; 
            private String expression; 
            private String groupId; 
            private String id; 
            private String instanceName; 
            private Long lastTime; 
            private String level; 
            private String metricName; 
            private String namespace; 
            private String preLevel; 
            private String ruleName; 
            private String state; 
            private Integer status; 
            private String userId; 
            private String value; 
            private String webhooks; 

            private Builder() {
            } 

            private Builder(AlarmHistory model) {
                this.alertName = model.alertName;
                this.alertTime = model.alertTime;
                this.contactALIIMs = model.contactALIIMs;
                this.contactGroups = model.contactGroups;
                this.contactMails = model.contactMails;
                this.contactSmses = model.contactSmses;
                this.contacts = model.contacts;
                this.dimensions = model.dimensions;
                this.evaluationCount = model.evaluationCount;
                this.expression = model.expression;
                this.groupId = model.groupId;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.lastTime = model.lastTime;
                this.level = model.level;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.preLevel = model.preLevel;
                this.ruleName = model.ruleName;
                this.state = model.state;
                this.status = model.status;
                this.userId = model.userId;
                this.value = model.value;
                this.webhooks = model.webhooks;
            } 

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * AlertTime.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * ContactALIIMs.
             */
            public Builder contactALIIMs(ContactALIIMs contactALIIMs) {
                this.contactALIIMs = contactALIIMs;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * ContactMails.
             */
            public Builder contactMails(ContactMails contactMails) {
                this.contactMails = contactMails;
                return this;
            }

            /**
             * ContactSmses.
             */
            public Builder contactSmses(ContactSmses contactSmses) {
                this.contactSmses = contactSmses;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PreLevel.
             */
            public Builder preLevel(String preLevel) {
                this.preLevel = preLevel;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Webhooks.
             */
            public Builder webhooks(String webhooks) {
                this.webhooks = webhooks;
                return this;
            }

            public AlarmHistory build() {
                return new AlarmHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class AlarmHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmHistory")
        private java.util.List<AlarmHistory> alarmHistory;

        private AlarmHistoryList(Builder builder) {
            this.alarmHistory = builder.alarmHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistoryList create() {
            return builder().build();
        }

        /**
         * @return alarmHistory
         */
        public java.util.List<AlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

        public static final class Builder {
            private java.util.List<AlarmHistory> alarmHistory; 

            private Builder() {
            } 

            private Builder(AlarmHistoryList model) {
                this.alarmHistory = model.alarmHistory;
            } 

            /**
             * AlarmHistory.
             */
            public Builder alarmHistory(java.util.List<AlarmHistory> alarmHistory) {
                this.alarmHistory = alarmHistory;
                return this;
            }

            public AlarmHistoryList build() {
                return new AlarmHistoryList(this);
            } 

        } 

    }
}
