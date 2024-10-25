// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
         * <p>The details of historical alerts.</p>
         */
        public Builder alarmHistoryList(AlarmHistoryList alarmHistoryList) {
            this.alarmHistoryList = alarmHistoryList;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3C69FBE-2262-541F-A409-C52F380BAE63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
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
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactMails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactMail")
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
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class ContactSmses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactSms")
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
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contact")
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
    /**
     * 
     * {@link DescribeAlertHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertHistoryListResponseBody</p>
     */
    public static class AlarmHistory extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
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
             * <p>The timestamp when the alert was triggered. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640586600000</p>
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>The TradeManager IDs of the alert contacts.</p>
             * <blockquote>
             * <p>This parameter is valid only on the China site (aliyun.com).</p>
             * </blockquote>
             */
            public Builder contactALIIMs(ContactALIIMs contactALIIMs) {
                this.contactALIIMs = contactALIIMs;
                return this;
            }

            /**
             * <p>The alert contact groups.</p>
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The email addresses of the alert contacts.</p>
             */
            public Builder contactMails(ContactMails contactMails) {
                this.contactMails = contactMails;
                return this;
            }

            /**
             * <p>The mobile numbers of the alert contacts.</p>
             * <blockquote>
             * <p>This parameter is valid only on the China site (aliyun.com).</p>
             * </blockquote>
             */
            public Builder contactSmses(ContactSmses contactSmses) {
                this.contactSmses = contactSmses;
                return this;
            }

            /**
             * <p>The alert contacts that receive alert notifications.</p>
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The resources that are monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;instanceId&quot;:&quot;i-bp1cqhiw1za2****&quot;}</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>The expression that is used to trigger alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>$Average&gt;=10</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>7671****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1cqhiw1za2****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The duration of the alert. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>360133</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The severity level and notification methods of the alert. Valid values:</p>
             * <ul>
             * <li>P4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
             * <li>OK: No alert is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>P4</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>applyTemplate61dc81b5-d357-4cf6-a9b7-9f83c1d5****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The alert status. Valid values:</p>
             * <ul>
             * <li>ALARM: Alerts are triggered.</li>
             * <li>OK: No alerts are triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALARM</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Indicates whether alerts are muted. Valid values:</p>
             * <ul>
             * <li>2 (default): Alerts are muted and are not triggered within the mute period, even if the condition specified in the alert rule is met.</li>
             * <li>0: Alerts are triggered or cleared.</li>
             * <li>1: The alert rule is ineffective.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The threshold of the metric value to trigger or clear an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>10.58</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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
