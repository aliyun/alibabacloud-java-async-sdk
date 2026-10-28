// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListUserNotifyHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserNotifyHistoriesResponseBody</p>
 */
public class ListUserNotifyHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("historyList")
    private java.util.List<HistoryList> historyList;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListUserNotifyHistoriesResponseBody(Builder builder) {
        this.historyList = builder.historyList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserNotifyHistoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return historyList
     */
    public java.util.List<HistoryList> getHistoryList() {
        return this.historyList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<HistoryList> historyList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListUserNotifyHistoriesResponseBody model) {
            this.historyList = model.historyList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The notification history list.</p>
         */
        public Builder historyList(java.util.List<HistoryList> historyList) {
            this.historyList = historyList;
            return this;
        }

        /**
         * <p>The maximum number of entries returned by this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. It is an opaque string generated and encrypted by the server. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2f8aKz3mNq9p****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of notification history entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListUserNotifyHistoriesResponseBody build() {
            return new ListUserNotifyHistoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserNotifyHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserNotifyHistoriesResponseBody</p>
     */
    public static class HistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("contacts")
        private String contacts;

        @com.aliyun.core.annotation.NameInMap("groups")
        private String groups;

        @com.aliyun.core.annotation.NameInMap("incidentId")
        private String incidentId;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("noChannel")
        private Boolean noChannel;

        @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
        private String notifyStrategyId;

        @com.aliyun.core.annotation.NameInMap("notifyStrategyName")
        private String notifyStrategyName;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("sendType")
        private String sendType;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subscriptionId")
        private String subscriptionId;

        @com.aliyun.core.annotation.NameInMap("subscriptionName")
        private String subscriptionName;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Integer timestamp;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private HistoryList(Builder builder) {
            this.channel = builder.channel;
            this.contacts = builder.contacts;
            this.groups = builder.groups;
            this.incidentId = builder.incidentId;
            this.jobId = builder.jobId;
            this.noChannel = builder.noChannel;
            this.notifyStrategyId = builder.notifyStrategyId;
            this.notifyStrategyName = builder.notifyStrategyName;
            this.receiver = builder.receiver;
            this.result = builder.result;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sendType = builder.sendType;
            this.severity = builder.severity;
            this.status = builder.status;
            this.subscriptionId = builder.subscriptionId;
            this.subscriptionName = builder.subscriptionName;
            this.success = builder.success;
            this.timestamp = builder.timestamp;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryList create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return contacts
         */
        public String getContacts() {
            return this.contacts;
        }

        /**
         * @return groups
         */
        public String getGroups() {
            return this.groups;
        }

        /**
         * @return incidentId
         */
        public String getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return noChannel
         */
        public Boolean getNoChannel() {
            return this.noChannel;
        }

        /**
         * @return notifyStrategyId
         */
        public String getNotifyStrategyId() {
            return this.notifyStrategyId;
        }

        /**
         * @return notifyStrategyName
         */
        public String getNotifyStrategyName() {
            return this.notifyStrategyName;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
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
         * @return sendType
         */
        public String getSendType() {
            return this.sendType;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subscriptionId
         */
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return subscriptionName
         */
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return timestamp
         */
        public Integer getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String channel; 
            private String contacts; 
            private String groups; 
            private String incidentId; 
            private String jobId; 
            private Boolean noChannel; 
            private String notifyStrategyId; 
            private String notifyStrategyName; 
            private String receiver; 
            private String result; 
            private String ruleId; 
            private String ruleName; 
            private String sendType; 
            private String severity; 
            private String status; 
            private String subscriptionId; 
            private String subscriptionName; 
            private Boolean success; 
            private Integer timestamp; 
            private String userId; 

            private Builder() {
            } 

            private Builder(HistoryList model) {
                this.channel = model.channel;
                this.contacts = model.contacts;
                this.groups = model.groups;
                this.incidentId = model.incidentId;
                this.jobId = model.jobId;
                this.noChannel = model.noChannel;
                this.notifyStrategyId = model.notifyStrategyId;
                this.notifyStrategyName = model.notifyStrategyName;
                this.receiver = model.receiver;
                this.result = model.result;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sendType = model.sendType;
                this.severity = model.severity;
                this.status = model.status;
                this.subscriptionId = model.subscriptionId;
                this.subscriptionName = model.subscriptionName;
                this.success = model.success;
                this.timestamp = model.timestamp;
                this.userId = model.userId;
            } 

            /**
             * <p>The notification channel. The valid values are the same as those of the <code>channel</code> request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DING</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The list of contacts. Multiple contacts are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San, Li Si</p>
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The list of contact groups. Multiple contact groups are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>O&amp;M group, on-call group</p>
             */
            public Builder groups(String groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The incident ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5d41402abc4b2a76b9719d911017c592</p>
             */
            public Builder incidentId(String incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * <p>The notification job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3fa85f64-5717-4562-b3fc-2c963f66afa8</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Indicates whether the notification record has no actual delivery channel. Valid values:</p>
             * <ul>
             * <li>true: The notification record has no actual delivery channel, and the notifyResult is NO_CHANNEL.</li>
             * <li>false: The notification record has an actual delivery channel.</li>
             * </ul>
             */
            public Builder noChannel(Boolean noChannel) {
                this.noChannel = noChannel;
                return this;
            }

            /**
             * <p>The notification policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d7e</p>
             */
            public Builder notifyStrategyId(String notifyStrategyId) {
                this.notifyStrategyId = notifyStrategyId;
                return this;
            }

            /**
             * <p>The notification policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default notification policy</p>
             */
            public Builder notifyStrategyName(String notifyStrategyName) {
                this.notifyStrategyName = notifyStrategyName;
                return this;
            }

            /**
             * <p>The recipient address, such as a phone number, email address, or webhook URL, depending on the notification channel.</p>
             * 
             * <strong>example:</strong>
             * <p>13800138000</p>
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * <p>The notification delivery result details. This is the raw response content returned by the channel, such as the API response from a DingTalk or Lark bot.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;errcode&quot;:0,&quot;errmsg&quot;:&quot;ok&quot;}</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3fa85f64-5717-4562-b3fc-2c963f66afa6</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The alert rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU usage alert</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The notification delivery type. Valid values:</p>
             * <ul>
             * <li>SUBSCRIBE: subscription notifications</li>
             * <li>DIRECT: direct event notifications</li>
             * <li>ITSM: ticket or action notifications</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUBSCRIBE</p>
             */
            public Builder sendType(String sendType) {
                this.sendType = sendType;
                return this;
            }

            /**
             * <p>The alert severity. Valid values:</p>
             * <ul>
             * <li>CRITICAL: critical</li>
             * <li>ERROR: error</li>
             * <li>WARNING: warning</li>
             * <li>INFO: information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The incident status. Valid values:</p>
             * <ul>
             * <li>TRIGGERED: triggered</li>
             * <li>RESOLVED: resolved</li>
             * <li>ACK: acknowledged</li>
             * <li>ESCALATED: escalated</li>
             * <li>MANUAL_RESOLVED: manually resolved</li>
             * <li>TIMEOUT: automatically resolved due to timeout</li>
             * <li>RETRIGGERED: retriggered</li>
             * <li>PARTIAL_RESOLVED: partially resolved</li>
             * <li>INVALID: invalid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TRIGGERED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subscription ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * <p>The subscription name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default subscription</p>
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * <p>Indicates whether the notification was delivered successfully. Valid values:</p>
             * <ul>
             * <li>true: The notification was delivered successfully.</li>
             * <li>false: The notification delivery failed.</li>
             * </ul>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The time when the notification record was generated. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1729400000</p>
             */
            public Builder timestamp(Integer timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID to which the notification record belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>5884500827389836</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public HistoryList build() {
                return new HistoryList(this);
            } 

        } 

    }
}
