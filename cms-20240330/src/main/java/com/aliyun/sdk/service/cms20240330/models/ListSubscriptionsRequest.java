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
 * {@link ListSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionsRequest</p>
 */
public class ListSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentUuid")
    private String agentUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("notifyStrategyUuid")
    private String notifyStrategyUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subscriptionType")
    private String subscriptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("unbound")
    private Boolean unbound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListSubscriptionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentUuid = builder.agentUuid;
        this.direction = builder.direction;
        this.enable = builder.enable;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.notifyStrategyUuid = builder.notifyStrategyUuid;
        this.orderBy = builder.orderBy;
        this.subscriptionId = builder.subscriptionId;
        this.subscriptionName = builder.subscriptionName;
        this.subscriptionType = builder.subscriptionType;
        this.unbound = builder.unbound;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionsRequest create() {
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
     * @return agentUuid
     */
    public String getAgentUuid() {
        return this.agentUuid;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
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
     * @return notifyStrategyUuid
     */
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return unbound
     */
    public Boolean getUnbound() {
        return this.unbound;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListSubscriptionsRequest, Builder> {
        private String regionId; 
        private String agentUuid; 
        private String direction; 
        private Boolean enable; 
        private Integer maxResults; 
        private String nextToken; 
        private String notifyStrategyUuid; 
        private String orderBy; 
        private String subscriptionId; 
        private String subscriptionName; 
        private String subscriptionType; 
        private Boolean unbound; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscriptionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentUuid = request.agentUuid;
            this.direction = request.direction;
            this.enable = request.enable;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.notifyStrategyUuid = request.notifyStrategyUuid;
            this.orderBy = request.orderBy;
            this.subscriptionId = request.subscriptionId;
            this.subscriptionName = request.subscriptionName;
            this.subscriptionType = request.subscriptionType;
            this.unbound = request.unbound;
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
         * agentUuid.
         */
        public Builder agentUuid(String agentUuid) {
            this.putQueryParameter("agentUuid", agentUuid);
            this.agentUuid = agentUuid;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
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
         * notifyStrategyUuid.
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.putQueryParameter("notifyStrategyUuid", notifyStrategyUuid);
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
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
         * subscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("subscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * unbound.
         */
        public Builder unbound(Boolean unbound) {
            this.putQueryParameter("unbound", unbound);
            this.unbound = unbound;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListSubscriptionsRequest build() {
            return new ListSubscriptionsRequest(this);
        } 

    } 

}
