// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogListResponseBody</p>
 */
public class DescribeAlertLogListResponseBody extends TeaModel {
    @NameInMap("AlertLogList")
    private java.util.List < AlertLogList> alertLogList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAlertLogListResponseBody(Builder builder) {
        this.alertLogList = builder.alertLogList;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertLogListResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertLogList
     */
    public java.util.List < AlertLogList> getAlertLogList() {
        return this.alertLogList;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < AlertLogList> alertLogList; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        /**
         * The queried alert logs.
         */
        public Builder alertLogList(java.util.List < AlertLogList> alertLogList) {
            this.alertLogList = alertLogList;
            return this;
        }

        /**
         * The HTTP status code.
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeAlertLogListResponseBody build() {
            return new DescribeAlertLogListResponseBody(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
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
             * The key of the dimension.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Escalation extends TeaModel {
        @NameInMap("Expression")
        private String expression;

        @NameInMap("Level")
        private String level;

        @NameInMap("Times")
        private Integer times;

        private Escalation(Builder builder) {
            this.expression = builder.expression;
            this.level = builder.level;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalation create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String expression; 
            private String level; 
            private Integer times; 

            /**
             * The description of the alert rule.
             * <p>
             * 
             * >  The content of the alert rule. This parameter indicates the conditions that trigger an alert.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The alert level and the methods that are used to send alert notifications. Valid values:
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
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Escalation build() {
                return new Escalation(this);
            } 

        } 

    }
    public static class ExtendedInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ExtendedInfo(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the extended field.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the extended field.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExtendedInfo build() {
                return new ExtendedInfo(this);
            } 

        } 

    }
    public static class ResultList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("notifyTargetList")
        private java.util.List < String > notifyTargetList;

        private ResultList(Builder builder) {
            this.code = builder.code;
            this.detail = builder.detail;
            this.requestId = builder.requestId;
            this.success = builder.success;
            this.notifyTargetList = builder.notifyTargetList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
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
         * @return notifyTargetList
         */
        public java.util.List < String > getNotifyTargetList() {
            return this.notifyTargetList;
        }

        public static final class Builder {
            private String code; 
            private String detail; 
            private String requestId; 
            private Boolean success; 
            private java.util.List < String > notifyTargetList; 

            /**
             * The HTTP status code.
             * <p>
             * 
             * *   If the value of the `Channel` parameter is `WEBHOOK`, the status code is 200 or 500.
             * *   If the value of the `Channel` parameter is `MAIL`, `SMS`, `SLS`, `ONCALL`, `FC`, or `MNS`, this parameter is empty or not returned.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The details of the returned results.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The request ID returned when CloudMonitor calls another cloud service.
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
             * notifyTargetList.
             */
            public Builder notifyTargetList(java.util.List < String > notifyTargetList) {
                this.notifyTargetList = notifyTargetList;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    public static class ChannelResultList extends TeaModel {
        @NameInMap("Channel")
        private String channel;

        @NameInMap("ResultList")
        private java.util.List < ResultList> resultList;

        private ChannelResultList(Builder builder) {
            this.channel = builder.channel;
            this.resultList = builder.resultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelResultList create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return resultList
         */
        public java.util.List < ResultList> getResultList() {
            return this.resultList;
        }

        public static final class Builder {
            private String channel; 
            private java.util.List < ResultList> resultList; 

            /**
             * The method that is used to send alert notifications. Valid values:
             * <p>
             * 
             * *   MAIL: email
             * *   SMS: text message
             * *   WEBHOOK: alert callback
             * *   SLS: Simple Log Service
             * *   ONCALL: phone call
             * *   FC: Function Compute
             * *   MNS: Message Service queue
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * The sending results of alert notifications.
             */
            public Builder resultList(java.util.List < ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            public ChannelResultList build() {
                return new ChannelResultList(this);
            } 

        } 

    }
    public static class SendDetail extends TeaModel {
        @NameInMap("ChannelResultList")
        private java.util.List < ChannelResultList> channelResultList;

        @NameInMap("ResultCode")
        private String resultCode;

        private SendDetail(Builder builder) {
            this.channelResultList = builder.channelResultList;
            this.resultCode = builder.resultCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendDetail create() {
            return builder().build();
        }

        /**
         * @return channelResultList
         */
        public java.util.List < ChannelResultList> getChannelResultList() {
            return this.channelResultList;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        public static final class Builder {
            private java.util.List < ChannelResultList> channelResultList; 
            private String resultCode; 

            /**
             * The list of sending results that are categorized by notification method.
             */
            public Builder channelResultList(java.util.List < ChannelResultList> channelResultList) {
                this.channelResultList = channelResultList;
                return this;
            }

            /**
             * Indicates whether the alert notifications are sent.
             * <p>
             * 
             * *   If the alert notifications are sent, the value "success" is returned.
             * *   If the configuration is invalid, no alert notification is sent and an error code is returned.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            public SendDetail build() {
                return new SendDetail(this);
            } 

        } 

    }
    public static class SendResultList extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private java.util.List < String > value;

        private SendResultList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendResultList create() {
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
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > value; 

            /**
             * The category of the alert notification method. Valid values:
             * <p>
             * 
             * *   MAIL: email
             * *   ALIIM: TradeManager
             * *   SMS: text message
             * *   CALL: phone call
             * *   DING: DingTalk chatbot
             * *   Merged: alert merging
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The notification object corresponding to the alert notification method.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public SendResultList build() {
                return new SendResultList(this);
            } 

        } 

    }
    public static class WebhookList extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("message")
        private String message;

        @NameInMap("url")
        private String url;

        private WebhookList(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookList create() {
            return builder().build();
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String url; 

            /**
             * The status code of the alert callback.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The message returned for the alert callback.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The callback URL.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebhookList build() {
                return new WebhookList(this);
            } 

        } 

    }
    public static class AlertLogList extends TeaModel {
        @NameInMap("AlertTime")
        private String alertTime;

        @NameInMap("BlackListDetail")
        private String blackListDetail;

        @NameInMap("BlackListName")
        private String blackListName;

        @NameInMap("BlackListUUID")
        private String blackListUUID;

        @NameInMap("ContactALIIWWList")
        private java.util.List < String > contactALIIWWList;

        @NameInMap("ContactDingList")
        private java.util.List < String > contactDingList;

        @NameInMap("ContactGroups")
        private java.util.List < String > contactGroups;

        @NameInMap("ContactMailList")
        private java.util.List < String > contactMailList;

        @NameInMap("ContactOnCallList")
        private java.util.List < String > contactOnCallList;

        @NameInMap("ContactSMSList")
        private java.util.List < String > contactSMSList;

        @NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @NameInMap("DingdingWebhookList")
        private java.util.List < String > dingdingWebhookList;

        @NameInMap("Escalation")
        private Escalation escalation;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("ExtendedInfo")
        private java.util.List < ExtendedInfo> extendedInfo;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Level")
        private String level;

        @NameInMap("LevelChange")
        private String levelChange;

        @NameInMap("LogId")
        private String logId;

        @NameInMap("Message")
        private String message;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Product")
        private String product;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SendDetail")
        private SendDetail sendDetail;

        @NameInMap("SendResultList")
        private java.util.List < SendResultList> sendResultList;

        @NameInMap("SendStatus")
        private String sendStatus;

        @NameInMap("WebhookList")
        private java.util.List < WebhookList> webhookList;

        private AlertLogList(Builder builder) {
            this.alertTime = builder.alertTime;
            this.blackListDetail = builder.blackListDetail;
            this.blackListName = builder.blackListName;
            this.blackListUUID = builder.blackListUUID;
            this.contactALIIWWList = builder.contactALIIWWList;
            this.contactDingList = builder.contactDingList;
            this.contactGroups = builder.contactGroups;
            this.contactMailList = builder.contactMailList;
            this.contactOnCallList = builder.contactOnCallList;
            this.contactSMSList = builder.contactSMSList;
            this.dimensions = builder.dimensions;
            this.dingdingWebhookList = builder.dingdingWebhookList;
            this.escalation = builder.escalation;
            this.eventName = builder.eventName;
            this.extendedInfo = builder.extendedInfo;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.level = builder.level;
            this.levelChange = builder.levelChange;
            this.logId = builder.logId;
            this.message = builder.message;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.product = builder.product;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sendDetail = builder.sendDetail;
            this.sendResultList = builder.sendResultList;
            this.sendStatus = builder.sendStatus;
            this.webhookList = builder.webhookList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertLogList create() {
            return builder().build();
        }

        /**
         * @return alertTime
         */
        public String getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return blackListDetail
         */
        public String getBlackListDetail() {
            return this.blackListDetail;
        }

        /**
         * @return blackListName
         */
        public String getBlackListName() {
            return this.blackListName;
        }

        /**
         * @return blackListUUID
         */
        public String getBlackListUUID() {
            return this.blackListUUID;
        }

        /**
         * @return contactALIIWWList
         */
        public java.util.List < String > getContactALIIWWList() {
            return this.contactALIIWWList;
        }

        /**
         * @return contactDingList
         */
        public java.util.List < String > getContactDingList() {
            return this.contactDingList;
        }

        /**
         * @return contactGroups
         */
        public java.util.List < String > getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return contactMailList
         */
        public java.util.List < String > getContactMailList() {
            return this.contactMailList;
        }

        /**
         * @return contactOnCallList
         */
        public java.util.List < String > getContactOnCallList() {
            return this.contactOnCallList;
        }

        /**
         * @return contactSMSList
         */
        public java.util.List < String > getContactSMSList() {
            return this.contactSMSList;
        }

        /**
         * @return dimensions
         */
        public java.util.List < Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return dingdingWebhookList
         */
        public java.util.List < String > getDingdingWebhookList() {
            return this.dingdingWebhookList;
        }

        /**
         * @return escalation
         */
        public Escalation getEscalation() {
            return this.escalation;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return extendedInfo
         */
        public java.util.List < ExtendedInfo> getExtendedInfo() {
            return this.extendedInfo;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return levelChange
         */
        public String getLevelChange() {
            return this.levelChange;
        }

        /**
         * @return logId
         */
        public String getLogId() {
            return this.logId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
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
         * @return product
         */
        public String getProduct() {
            return this.product;
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
         * @return sendDetail
         */
        public SendDetail getSendDetail() {
            return this.sendDetail;
        }

        /**
         * @return sendResultList
         */
        public java.util.List < SendResultList> getSendResultList() {
            return this.sendResultList;
        }

        /**
         * @return sendStatus
         */
        public String getSendStatus() {
            return this.sendStatus;
        }

        /**
         * @return webhookList
         */
        public java.util.List < WebhookList> getWebhookList() {
            return this.webhookList;
        }

        public static final class Builder {
            private String alertTime; 
            private String blackListDetail; 
            private String blackListName; 
            private String blackListUUID; 
            private java.util.List < String > contactALIIWWList; 
            private java.util.List < String > contactDingList; 
            private java.util.List < String > contactGroups; 
            private java.util.List < String > contactMailList; 
            private java.util.List < String > contactOnCallList; 
            private java.util.List < String > contactSMSList; 
            private java.util.List < Dimensions> dimensions; 
            private java.util.List < String > dingdingWebhookList; 
            private Escalation escalation; 
            private String eventName; 
            private java.util.List < ExtendedInfo> extendedInfo; 
            private String groupId; 
            private String groupName; 
            private String instanceId; 
            private String instanceName; 
            private String level; 
            private String levelChange; 
            private String logId; 
            private String message; 
            private String metricName; 
            private String namespace; 
            private String product; 
            private String ruleId; 
            private String ruleName; 
            private SendDetail sendDetail; 
            private java.util.List < SendResultList> sendResultList; 
            private String sendStatus; 
            private java.util.List < WebhookList> webhookList; 

            /**
             * The timestamp that was generated when the alert was triggered.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder alertTime(String alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * The details of the blacklist policy.
             */
            public Builder blackListDetail(String blackListDetail) {
                this.blackListDetail = blackListDetail;
                return this;
            }

            /**
             * The name of the blacklist policy.
             */
            public Builder blackListName(String blackListName) {
                this.blackListName = blackListName;
                return this;
            }

            /**
             * The ID of the blacklist policy.
             */
            public Builder blackListUUID(String blackListUUID) {
                this.blackListUUID = blackListUUID;
                return this;
            }

            /**
             * ContactALIIWWList.
             */
            public Builder contactALIIWWList(java.util.List < String > contactALIIWWList) {
                this.contactALIIWWList = contactALIIWWList;
                return this;
            }

            /**
             * ContactDingList.
             */
            public Builder contactDingList(java.util.List < String > contactDingList) {
                this.contactDingList = contactDingList;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(java.util.List < String > contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * ContactMailList.
             */
            public Builder contactMailList(java.util.List < String > contactMailList) {
                this.contactMailList = contactMailList;
                return this;
            }

            /**
             * ContactOnCallList.
             */
            public Builder contactOnCallList(java.util.List < String > contactOnCallList) {
                this.contactOnCallList = contactOnCallList;
                return this;
            }

            /**
             * ContactSMSList.
             */
            public Builder contactSMSList(java.util.List < String > contactSMSList) {
                this.contactSMSList = contactSMSList;
                return this;
            }

            /**
             * The dimensions of the resource that triggered alerts.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * DingdingWebhookList.
             */
            public Builder dingdingWebhookList(java.util.List < String > dingdingWebhookList) {
                this.dingdingWebhookList = dingdingWebhookList;
                return this;
            }

            /**
             * The alert rule based on which the alert is triggered.
             */
            public Builder escalation(Escalation escalation) {
                this.escalation = escalation;
                return this;
            }

            /**
             * The event name.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The extended fields.
             */
            public Builder extendedInfo(java.util.List < ExtendedInfo> extendedInfo) {
                this.extendedInfo = extendedInfo;
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
             * The name of the application group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The resource name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The alert level and the methods that are used to send alert notifications. Valid values:
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
             * Indicates whether the alert level was changed. Valid values:
             * <p>
             * 
             * *   `P4->OK`: The alert level was changed from P4 to OK.
             * *   `P4->P4`: The alert level was still P4.
             */
            public Builder levelChange(String levelChange) {
                this.levelChange = levelChange;
                return this;
            }

            /**
             * The log ID.
             */
            public Builder logId(String logId) {
                this.logId = logId;
                return this;
            }

            /**
             * The alert information in a JSON string.
             */
            public Builder message(String message) {
                this.message = message;
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
             * The identifier of the cloud service. Valid values:
             * <p>
             * 
             * *   If the cloud service is provided by Alibaba Cloud, the abbreviation of the service name is returned. Example: ECS.
             * *   If the cloud service is not provided by Alibaba Cloud, a value in the `acs_Service keyword` format is returned. Example: acs_networkmonitor.
             */
            public Builder product(String product) {
                this.product = product;
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
             * The details about the sending results of alert notifications.
             */
            public Builder sendDetail(SendDetail sendDetail) {
                this.sendDetail = sendDetail;
                return this;
            }

            /**
             * The sending results of alert notifications.
             */
            public Builder sendResultList(java.util.List < SendResultList> sendResultList) {
                this.sendResultList = sendResultList;
                return this;
            }

            /**
             * The status of the alert. Valid values:
             * <p>
             * 
             * *   0: The alert is triggered or cleared.
             * *   1: The alert is ineffective.
             * *   2: The alert is muted.
             * *   3: The host is restarting.
             * *   4: No alert notification is sent.
             * 
             * If the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.
             */
            public Builder sendStatus(String sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * The callback URLs.
             */
            public Builder webhookList(java.util.List < WebhookList> webhookList) {
                this.webhookList = webhookList;
                return this;
            }

            public AlertLogList build() {
                return new AlertLogList(this);
            } 

        } 

    }
}
