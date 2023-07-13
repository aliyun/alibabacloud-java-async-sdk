// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertHistoryListResponseBody</p>
 */
public class DescribeAlertHistoryListResponseBody extends TeaModel {
    @NameInMap("AlarmHistoryList")
    private AlarmHistoryList alarmHistoryList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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

        /**
         * The details of historical alerts.
         */
        public Builder alarmHistoryList(AlarmHistoryList alarmHistoryList) {
            this.alarmHistoryList = alarmHistoryList;
            return this;
        }

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeAlertHistoryListResponseBody build() {
            return new DescribeAlertHistoryListResponseBody(this);
        } 

    } 

    public static class ContactALIIMs extends TeaModel {
        @NameInMap("ContactALIIM")
        private java.util.List < String > contactALIIM;

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
        public java.util.List < String > getContactALIIM() {
            return this.contactALIIM;
        }

        public static final class Builder {
            private java.util.List < String > contactALIIM; 

            /**
             * ContactALIIM.
             */
            public Builder contactALIIM(java.util.List < String > contactALIIM) {
                this.contactALIIM = contactALIIM;
                return this;
            }

            public ContactALIIMs build() {
                return new ContactALIIMs(this);
            } 

        } 

    }
    public static class ContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        private java.util.List < String > contactGroup;

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
        public java.util.List < String > getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List < String > contactGroup; 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List < String > contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    public static class ContactMails extends TeaModel {
        @NameInMap("ContactMail")
        private java.util.List < String > contactMail;

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
        public java.util.List < String > getContactMail() {
            return this.contactMail;
        }

        public static final class Builder {
            private java.util.List < String > contactMail; 

            /**
             * ContactMail.
             */
            public Builder contactMail(java.util.List < String > contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            public ContactMails build() {
                return new ContactMails(this);
            } 

        } 

    }
    public static class ContactSmses extends TeaModel {
        @NameInMap("ContactSms")
        private java.util.List < String > contactSms;

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
        public java.util.List < String > getContactSms() {
            return this.contactSms;
        }

        public static final class Builder {
            private java.util.List < String > contactSms; 

            /**
             * ContactSms.
             */
            public Builder contactSms(java.util.List < String > contactSms) {
                this.contactSms = contactSms;
                return this;
            }

            public ContactSmses build() {
                return new ContactSmses(this);
            } 

        } 

    }
    public static class Contacts extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < String > contact;

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
        public java.util.List < String > getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < String > contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < String > contact) {
                this.contact = contact;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    public static class AlarmHistory extends TeaModel {
        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("ContactALIIMs")
        private ContactALIIMs contactALIIMs;

        @NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @NameInMap("ContactMails")
        private ContactMails contactMails;

        @NameInMap("ContactSmses")
        private ContactSmses contactSmses;

        @NameInMap("Contacts")
        private Contacts contacts;

        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Value")
        private String value;

        @NameInMap("Webhooks")
        private String webhooks;

        private AlarmHistory(Builder builder) {
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
            this.instanceName = builder.instanceName;
            this.lastTime = builder.lastTime;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.state = builder.state;
            this.status = builder.status;
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
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
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
            private String instanceName; 
            private Long lastTime; 
            private String level; 
            private String metricName; 
            private String namespace; 
            private String ruleId; 
            private String ruleName; 
            private String state; 
            private Integer status; 
            private String value; 
            private String webhooks; 

            /**
             * The timestamp when the alert was triggered. Unit: milliseconds.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * The TradeManager IDs of the alert contacts.
             * <p>
             * 
             * > This parameter is valid only on the China site (aliyun.com).
             */
            public Builder contactALIIMs(ContactALIIMs contactALIIMs) {
                this.contactALIIMs = contactALIIMs;
                return this;
            }

            /**
             * The alert contact groups.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The email addresses of the alert contacts.
             */
            public Builder contactMails(ContactMails contactMails) {
                this.contactMails = contactMails;
                return this;
            }

            /**
             * The mobile numbers of the alert contacts.
             * <p>
             * 
             * > This parameter is valid only on the China site (aliyun.com).
             */
            public Builder contactSmses(ContactSmses contactSmses) {
                this.contactSmses = contactSmses;
                return this;
            }

            /**
             * The alert contacts that receive alert notifications.
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The resources that are monitored.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The expression that is used to trigger alerts.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The duration of the alert. Unit: milliseconds.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The severity level and notification methods of the alert. Valid values:
             * <p>
             * 
             * *   P4: Alert notifications are sent by using emails and DingTalk chatbots.
             * *   OK: No alert is generated.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The metric name.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The namespace of the cloud service.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The alert status. Valid values:
             * <p>
             * 
             * *   ALARM: Alerts are triggered.
             * *   OK: No alerts are triggered.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Indicates whether alerts are muted. Valid values:
             * <p>
             * 
             * *   2 (default): Alerts are muted and are not triggered within the mute period, even if the condition specified in the alert rule is met.
             * *   0: Alerts are triggered or cleared.
             * *   1: The alert rule is ineffective.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The threshold of the metric value to trigger or clear an alert.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The callback URL.
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
    public static class AlarmHistoryList extends TeaModel {
        @NameInMap("AlarmHistory")
        private java.util.List < AlarmHistory> alarmHistory;

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
        public java.util.List < AlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

        public static final class Builder {
            private java.util.List < AlarmHistory> alarmHistory; 

            /**
             * AlarmHistory.
             */
            public Builder alarmHistory(java.util.List < AlarmHistory> alarmHistory) {
                this.alarmHistory = alarmHistory;
                return this;
            }

            public AlarmHistoryList build() {
                return new AlarmHistoryList(this);
            } 

        } 

    }
}
