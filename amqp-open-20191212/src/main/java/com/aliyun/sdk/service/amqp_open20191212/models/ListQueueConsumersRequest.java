// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueueConsumersRequest} extends {@link RequestModel}
 *
 * <p>ListQueueConsumersRequest</p>
 */
public class ListQueueConsumersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("QueryCount")
    @Validation(maximum = 100, minimum = 1)
    private Integer queryCount;

    @Query
    @NameInMap("Queue")
    @Validation(required = true)
    private String queue;

    @Query
    @NameInMap("VirtualHost")
    @Validation(required = true)
    private String virtualHost;

    private ListQueueConsumersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.nextToken = builder.nextToken;
        this.queryCount = builder.queryCount;
        this.queue = builder.queue;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueConsumersRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return queryCount
     */
    public Integer getQueryCount() {
        return this.queryCount;
    }

    /**
     * @return queue
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<ListQueueConsumersRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String nextToken; 
        private Integer queryCount; 
        private String queue; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(ListQueueConsumersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.nextToken = request.nextToken;
            this.queryCount = request.queryCount;
            this.queue = request.queue;
            this.virtualHost = request.virtualHost;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * QueryCount.
         */
        public Builder queryCount(Integer queryCount) {
            this.putQueryParameter("QueryCount", queryCount);
            this.queryCount = queryCount;
            return this;
        }

        /**
         * Queue.
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * VirtualHost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putQueryParameter("VirtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public ListQueueConsumersRequest build() {
            return new ListQueueConsumersRequest(this);
        } 

    } 

}
