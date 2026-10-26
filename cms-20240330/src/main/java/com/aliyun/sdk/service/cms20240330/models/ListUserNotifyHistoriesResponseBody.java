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
         * historyList.
         */
        public Builder historyList(java.util.List<HistoryList> historyList) {
            this.historyList = historyList;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
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
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * contacts.
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * groups.
             */
            public Builder groups(String groups) {
                this.groups = groups;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(String incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * noChannel.
             */
            public Builder noChannel(Boolean noChannel) {
                this.noChannel = noChannel;
                return this;
            }

            /**
             * notifyStrategyId.
             */
            public Builder notifyStrategyId(String notifyStrategyId) {
                this.notifyStrategyId = notifyStrategyId;
                return this;
            }

            /**
             * notifyStrategyName.
             */
            public Builder notifyStrategyName(String notifyStrategyName) {
                this.notifyStrategyName = notifyStrategyName;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * sendType.
             */
            public Builder sendType(String sendType) {
                this.sendType = sendType;
                return this;
            }

            /**
             * severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subscriptionId.
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * subscriptionName.
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Integer timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * userId.
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
