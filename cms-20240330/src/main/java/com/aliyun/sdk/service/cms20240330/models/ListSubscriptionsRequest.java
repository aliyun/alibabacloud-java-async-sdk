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
    @Deprecated
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
         * <p>The UUID of the AI agent. This parameter is used to filter subscriptions of a specified AI agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-rca-001</p>
         */
        public Builder agentUuid(String agentUuid) {
            this.putQueryParameter("agentUuid", agentUuid);
            this.agentUuid = agentUuid;
            return this;
        }

        /**
         * <p>The sort order of the returned versions. Valid values:</p>
         * <ul>
         * <li>asc: Ascending order. </li>
         * <li>desc: Descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Specifies whether the subscription is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The maximum number of results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>2-3408-4595-9d80-****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The UUID of the notification policy. This parameter is used to filter subscriptions that are bound to a specified notification policy. The value is a 32-character string.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.putQueryParameter("notifyStrategyUuid", notifyStrategyUuid);
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The ID of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123123</p>
         */
        public Builder subscriptionId(String subscriptionId) {
            this.putQueryParameter("subscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * <p>The name of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Test subscription</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("subscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * <p>The type of the subscription. Valid values:</p>
         * <ul>
         * <li>NORMAL: Standard subscription.</li>
         * <li>AI_AGENT: AI agent subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("subscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This is an internal reserved parameter. Do not use it.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder unbound(Boolean unbound) {
            this.putQueryParameter("unbound", unbound);
            this.unbound = unbound;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
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
