// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogListResponseBody</p>
 */
public class DescribeAlertLogListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertLogList")
    private java.util.List < AlertLogList> alertLogList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The queried alert logs.</p>
         */
        public Builder alertLogList(java.util.List < AlertLogList> alertLogList) {
            this.alertLogList = alertLogList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1C4A3709-BF52-42EE-87B5-7435F0929585</p>
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

        public DescribeAlertLogListResponseBody build() {
            return new DescribeAlertLogListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e1qg6uo38rztr4****</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class Escalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Times")
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
             * <p>The description of the alert rule.</p>
             * <blockquote>
             * <p> The content of the alert rule. This parameter indicates the conditions that trigger an alert.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$Average&lt;90</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The alert level and the methods that are used to send alert notifications. Valid values:</p>
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
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class ExtendedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("notifyTargetList")
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
             * <p>The HTTP status code.</p>
             * <ul>
             * <li>If the value of the <code>Channel</code> parameter is <code>WEBHOOK</code>, the status code is 200 or 500.</li>
             * <li>If the value of the <code>Channel</code> parameter is <code>MAIL</code>, <code>SMS</code>, <code>SLS</code>, <code>ONCALL</code>, <code>FC</code>, or <code>MNS</code>, this parameter is empty or not returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The details of the returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>{ }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The request ID returned when CloudMonitor calls another cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>0BDAF8A8-04DC-5F0C-90E4-724D42C4****</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class ChannelResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ResultList")
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
             * <p>The method that is used to send alert notifications. Valid values:</p>
             * <ul>
             * <li>MAIL: email</li>
             * <li>SMS: text message</li>
             * <li>WEBHOOK: alert callback</li>
             * <li>SLS: Simple Log Service</li>
             * <li>ONCALL: phone call</li>
             * <li>FC: Function Compute</li>
             * <li>MNS: Message Service queue</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MAIL</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The sending results of alert notifications.</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class SendDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelResultList")
        private java.util.List < ChannelResultList> channelResultList;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
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
             * <p>The list of sending results that are categorized by notification method.</p>
             */
            public Builder channelResultList(java.util.List < ChannelResultList> channelResultList) {
                this.channelResultList = channelResultList;
                return this;
            }

            /**
             * <p>Indicates whether the alert notifications are sent.</p>
             * <ul>
             * <li>If the alert notifications are sent, the value &quot;success&quot; is returned.</li>
             * <li>If the configuration is invalid, no alert notification is sent and an error code is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class SendResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The category of the alert notification method. Valid values:</p>
             * <ul>
             * <li>MAIL: email</li>
             * <li>ALIIM: TradeManager</li>
             * <li>SMS: text message</li>
             * <li>CALL: phone call</li>
             * <li>DING: DingTalk chatbot</li>
             * <li>Merged: alert merging</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Mail</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The notification object corresponding to the alert notification method.</p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class WebhookList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("url")
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
             * <p>The status code of the alert callback.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The message returned for the alert callback.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/webhook.html">https://www.aliyun.com/webhook.html</a></p>
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
    /**
     * 
     * {@link DescribeAlertLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogListResponseBody</p>
     */
    public static class AlertLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private String alertTime;

        @com.aliyun.core.annotation.NameInMap("BlackListDetail")
        private String blackListDetail;

        @com.aliyun.core.annotation.NameInMap("BlackListName")
        private String blackListName;

        @com.aliyun.core.annotation.NameInMap("BlackListUUID")
        private String blackListUUID;

        @com.aliyun.core.annotation.NameInMap("ContactALIIWWList")
        private java.util.List < String > contactALIIWWList;

        @com.aliyun.core.annotation.NameInMap("ContactDingList")
        private java.util.List < String > contactDingList;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private java.util.List < String > contactGroups;

        @com.aliyun.core.annotation.NameInMap("ContactMailList")
        private java.util.List < String > contactMailList;

        @com.aliyun.core.annotation.NameInMap("ContactOnCallList")
        private java.util.List < String > contactOnCallList;

        @com.aliyun.core.annotation.NameInMap("ContactSMSList")
        private java.util.List < String > contactSMSList;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("DingdingWebhookList")
        private java.util.List < String > dingdingWebhookList;

        @com.aliyun.core.annotation.NameInMap("Escalation")
        private Escalation escalation;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("ExtendedInfo")
        private java.util.List < ExtendedInfo> extendedInfo;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LevelChange")
        private String levelChange;

        @com.aliyun.core.annotation.NameInMap("LogId")
        private String logId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SendDetail")
        private SendDetail sendDetail;

        @com.aliyun.core.annotation.NameInMap("SendResultList")
        private java.util.List < SendResultList> sendResultList;

        @com.aliyun.core.annotation.NameInMap("SendStatus")
        private String sendStatus;

        @com.aliyun.core.annotation.NameInMap("WebhookList")
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
             * <p>The timestamp that was generated when the alert was triggered.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610043776621</p>
             */
            public Builder alertTime(String alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>The details of the blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>BlackListDetail</p>
             */
            public Builder blackListDetail(String blackListDetail) {
                this.blackListDetail = blackListDetail;
                return this;
            }

            /**
             * <p>The name of the blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;id&quot;:123,&quot;metricProject&quot;:&quot;acs_ecs_dashboard&quot;,&quot;userId&quot;:1736511134389110,&quot;uuid&quot;:&quot;8410dbbd-7d30-41c5-94cb-<em><strong>&quot;,&quot;name&quot;:&quot;alert-</strong></em>&quot;,&quot;productCategory&quot;:&quot;ecs&quot;,&quot;instances&quot;:[{&quot;instanceId&quot;:&quot;host-***&quot;}],&quot;metrics&quot;:null,&quot;scopeType&quot;:&quot;USER&quot;,&quot;scopeValue&quot;:&quot;&quot;,&quot;startTime&quot;:&quot;0001-01-01T00:00:00Z&quot;,&quot;endTime&quot;:&quot;9999-12-31T23:59:59.999999999+08:00&quot;,&quot;effectiveTime&quot;:null,&quot;isEnable&quot;:true,&quot;status&quot;:1,&quot;gmtCreate&quot;:&quot;2021-11-02T16:35:59+08:00&quot;,&quot;gmtModified&quot;:&quot;2021-11-02T16:35:59+08:00&quot;,&quot;loadTime&quot;:&quot;2021-11-02T16:36:15.213072177+08:00&quot;}</p>
             */
            public Builder blackListName(String blackListName) {
                this.blackListName = blackListName;
                return this;
            }

            /**
             * <p>The ID of the blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>8410dbbd-7d30-41c5-94cb-*****</p>
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
             * <p>The dimensions of the resource that triggered alerts.</p>
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
             * <p>The alert rule based on which the alert is triggered.</p>
             */
            public Builder escalation(Escalation escalation) {
                this.escalation = escalation;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>IOHang</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The extended fields.</p>
             */
            public Builder extendedInfo(java.util.List < ExtendedInfo> extendedInfo) {
                this.extendedInfo = extendedInfo;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>7301****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Instances</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e1qg6uo38rztr4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>portalHost</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The alert level and the methods that are used to send alert notifications. Valid values:</p>
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
             * <p>Indicates whether the alert level was changed. Valid values:</p>
             * <ul>
             * <li><code>P4-&gt;OK</code>: The alert level was changed from P4 to OK.</li>
             * <li><code>P4-&gt;P4</code>: The alert level was still P4.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>P4-&gt;OK</p>
             */
            public Builder levelChange(String levelChange) {
                this.levelChange = levelChange;
                return this;
            }

            /**
             * <p>The log ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7818361[1523]@1671593992[1]</p>
             */
            public Builder logId(String logId) {
                this.logId = logId;
                return this;
            }

            /**
             * <p>The alert information in a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;alertName&quot;:&quot;e47aa0ac-4076-44db-a47d-d1083968****_Availability&quot;}</p>
             */
            public Builder message(String message) {
                this.message = message;
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
             * <p>The identifier of the cloud service. Valid values:</p>
             * <ul>
             * <li>If the cloud service is provided by Alibaba Cloud, the abbreviation of the service name is returned. Example: ECS.</li>
             * <li>If the cloud service is not provided by Alibaba Cloud, a value in the <code>acs_Service keyword</code> format is returned. Example: acs_networkmonitor.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>d582b9e9-b1c1-4f17-9279-0fe7333a****_ResponseTime</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The details about the sending results of alert notifications.</p>
             */
            public Builder sendDetail(SendDetail sendDetail) {
                this.sendDetail = sendDetail;
                return this;
            }

            /**
             * <p>The sending results of alert notifications.</p>
             */
            public Builder sendResultList(java.util.List < SendResultList> sendResultList) {
                this.sendResultList = sendResultList;
                return this;
            }

            /**
             * <p>The status of the alert. Valid values:</p>
             * <ul>
             * <li>0: The alert is triggered or cleared.</li>
             * <li>1: The alert is ineffective.</li>
             * <li>2: The alert is muted.</li>
             * <li>3: The host is restarting.</li>
             * <li>4: No alert notification is sent.</li>
             * </ul>
             * <p>If the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sendStatus(String sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * <p>The callback URLs.</p>
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
