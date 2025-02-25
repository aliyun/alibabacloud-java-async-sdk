// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link ListDownStreamBindingsRequest} extends {@link RequestModel}
 *
 * <p>ListDownStreamBindingsRequest</p>
 */
public class ListDownStreamBindingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualHost;

    private ListDownStreamBindingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.exchangeName = builder.exchangeName;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownStreamBindingsRequest create() {
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
     * @return exchangeName
     */
    public String getExchangeName() {
        return this.exchangeName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<ListDownStreamBindingsRequest, Builder> {
        private String regionId; 
        private String exchangeName; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(ListDownStreamBindingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.exchangeName = request.exchangeName;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.virtualHost = request.virtualHost;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The exchange name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder exchangeName(String exchangeName) {
            this.putQueryParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the exchange belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1880770869023***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the vhost to which the exchange belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder virtualHost(String virtualHost) {
            this.putQueryParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public ListDownStreamBindingsRequest build() {
            return new ListDownStreamBindingsRequest(this);
        } 

    } 

}
