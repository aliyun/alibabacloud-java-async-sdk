// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayWebsocketEventsRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayWebsocketEventsRequest</p>
 */
public class ListGatewayWebsocketEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("connectionId")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("model")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 4096)
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("turnId")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String turnId;

    private ListGatewayWebsocketEventsRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.connectionId = builder.connectionId;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.provider = builder.provider;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.turnId = builder.turnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayWebsocketEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return turnId
     */
    public String getTurnId() {
        return this.turnId;
    }

    public static final class Builder extends Request.Builder<ListGatewayWebsocketEventsRequest, Builder> {
        private String gatewayId; 
        private String connectionId; 
        private Long endTime; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
        private String provider; 
        private String source; 
        private Long startTime; 
        private String turnId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayWebsocketEventsRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.connectionId = request.connectionId;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.provider = request.provider;
            this.source = request.source;
            this.startTime = request.startTime;
            this.turnId = request.turnId;
        } 

        /**
         * <p>The gateway ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-example123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The connection identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-example</p>
         */
        public Builder connectionId(String connectionId) {
            this.putQueryParameter("connectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp in seconds (since the UTC epoch), such as 1793919600.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1793919600</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of results per page for cursor-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-token-from-previous-page</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The provider.</p>
         * 
         * <strong>example:</strong>
         * <p>dashscope</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The log source.</p>
         * 
         * <strong>example:</strong>
         * <p>access.log</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp in seconds (since the UTC epoch), such as 1793916000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1793916000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The turn identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>turn-example</p>
         */
        public Builder turnId(String turnId) {
            this.putQueryParameter("turnId", turnId);
            this.turnId = turnId;
            return this;
        }

        @Override
        public ListGatewayWebsocketEventsRequest build() {
            return new ListGatewayWebsocketEventsRequest(this);
        } 

    } 

}
