// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link UpdateInstanceRetryStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRetryStrategyRequest</p>
 */
public class UpdateInstanceRetryStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private Integer retryTimes;

    private UpdateInstanceRetryStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.retryInterval = builder.retryInterval;
        this.retryTimes = builder.retryTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRetryStrategyRequest create() {
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
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRetryStrategyRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private String instanceId; 
        private Integer retryInterval; 
        private Integer retryTimes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRetryStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.retryInterval = request.retryInterval;
            this.retryTimes = request.retryTimes;
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
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
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
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(Integer retryTimes) {
            this.putQueryParameter("RetryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        @Override
        public UpdateInstanceRetryStrategyRequest build() {
            return new UpdateInstanceRetryStrategyRequest(this);
        } 

    } 

}
