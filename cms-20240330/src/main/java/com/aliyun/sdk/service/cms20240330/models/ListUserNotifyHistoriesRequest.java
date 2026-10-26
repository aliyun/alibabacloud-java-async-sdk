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
 * {@link ListUserNotifyHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListUserNotifyHistoriesRequest</p>
 */
public class ListUserNotifyHistoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchId")
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizSource")
    private String bizSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channelCategory")
    private String channelCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeNoChannel")
    private Boolean includeNoChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isDesc")
    private Boolean isDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("notifyStrategyName")
    private String notifyStrategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partitionKey")
    private String partitionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("receiver")
    private String receiver;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sendType")
    private String sendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    private Integer to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListUserNotifyHistoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.batchId = builder.batchId;
        this.bizSource = builder.bizSource;
        this.channel = builder.channel;
        this.channelCategory = builder.channelCategory;
        this.from = builder.from;
        this.group = builder.group;
        this.incidentId = builder.incidentId;
        this.includeNoChannel = builder.includeNoChannel;
        this.isDesc = builder.isDesc;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.notifyStrategyName = builder.notifyStrategyName;
        this.partitionKey = builder.partitionKey;
        this.receiver = builder.receiver;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.sendType = builder.sendType;
        this.severity = builder.severity;
        this.subscriptionId = builder.subscriptionId;
        this.subscriptionName = builder.subscriptionName;
        this.success = builder.success;
        this.to = builder.to;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserNotifyHistoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return bizSource
     */
    public String getBizSource() {
        return this.bizSource;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return channelCategory
     */
    public String getChannelCategory() {
        return this.channelCategory;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return includeNoChannel
     */
    public Boolean getIncludeNoChannel() {
        return this.includeNoChannel;
    }

    /**
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return this.isDesc;
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
     * @return partitionKey
     */
    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
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
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListUserNotifyHistoriesRequest, Builder> {
        private String regionId; 
        private String batchId; 
        private String bizSource; 
        private String channel; 
        private String channelCategory; 
        private Integer from; 
        private String group; 
        private String incidentId; 
        private Boolean includeNoChannel; 
        private Boolean isDesc; 
        private Integer maxResults; 
        private String nextToken; 
        private String notifyStrategyId; 
        private String notifyStrategyName; 
        private String partitionKey; 
        private String receiver; 
        private String ruleId; 
        private String ruleName; 
        private String sendType; 
        private String severity; 
        private String subscriptionId; 
        private String subscriptionName; 
        private Boolean success; 
        private Integer to; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListUserNotifyHistoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.batchId = request.batchId;
            this.bizSource = request.bizSource;
            this.channel = request.channel;
            this.channelCategory = request.channelCategory;
            this.from = request.from;
            this.group = request.group;
            this.incidentId = request.incidentId;
            this.includeNoChannel = request.includeNoChannel;
            this.isDesc = request.isDesc;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.notifyStrategyId = request.notifyStrategyId;
            this.notifyStrategyName = request.notifyStrategyName;
            this.partitionKey = request.partitionKey;
            this.receiver = request.receiver;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.sendType = request.sendType;
            this.severity = request.severity;
            this.subscriptionId = request.subscriptionId;
            this.subscriptionName = request.subscriptionName;
            this.success = request.success;
            this.to = request.to;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * batchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * bizSource.
         */
        public Builder bizSource(String bizSource) {
            this.putQueryParameter("bizSource", bizSource);
            this.bizSource = bizSource;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * channelCategory.
         */
        public Builder channelCategory(String channelCategory) {
            this.putQueryParameter("channelCategory", channelCategory);
            this.channelCategory = channelCategory;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * group.
         */
        public Builder group(String group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(String incidentId) {
            this.putQueryParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * includeNoChannel.
         */
        public Builder includeNoChannel(Boolean includeNoChannel) {
            this.putQueryParameter("includeNoChannel", includeNoChannel);
            this.includeNoChannel = includeNoChannel;
            return this;
        }

        /**
         * isDesc.
         */
        public Builder isDesc(Boolean isDesc) {
            this.putQueryParameter("isDesc", isDesc);
            this.isDesc = isDesc;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * notifyStrategyId.
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.putQueryParameter("notifyStrategyId", notifyStrategyId);
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * notifyStrategyName.
         */
        public Builder notifyStrategyName(String notifyStrategyName) {
            this.putQueryParameter("notifyStrategyName", notifyStrategyName);
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }

        /**
         * partitionKey.
         */
        public Builder partitionKey(String partitionKey) {
            this.putQueryParameter("partitionKey", partitionKey);
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * receiver.
         */
        public Builder receiver(String receiver) {
            this.putQueryParameter("receiver", receiver);
            this.receiver = receiver;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * sendType.
         */
        public Builder sendType(String sendType) {
            this.putQueryParameter("sendType", sendType);
            this.sendType = sendType;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * subscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.putQueryParameter("subscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * subscriptionName.
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("subscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("success", success);
            this.success = success;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-5884500827389836-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListUserNotifyHistoriesRequest build() {
            return new ListUserNotifyHistoriesRequest(this);
        } 

    } 

}
