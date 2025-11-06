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
 * {@link GetExchangeRateRequest} extends {@link RequestModel}
 *
 * <p>GetExchangeRateRequest</p>
 */
public class GetExchangeRateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> exchangeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private GetExchangeRateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.exchangeNames = builder.exchangeNames;
        this.instanceId = builder.instanceId;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExchangeRateRequest create() {
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
     * @return exchangeNames
     */
    public java.util.Map<String, ?> getExchangeNames() {
        return this.exchangeNames;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<GetExchangeRateRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private java.util.Map<String, ?> exchangeNames; 
        private String instanceId; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(GetExchangeRateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.exchangeNames = request.exchangeNames;
            this.instanceId = request.instanceId;
            this.vhostName = request.vhostName;
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
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exchangeNames(java.util.Map<String, ?> exchangeNames) {
            String exchangeNamesShrink = shrink(exchangeNames, "ExchangeNames", "json");
            this.putQueryParameter("ExchangeNames", exchangeNamesShrink);
            this.exchangeNames = exchangeNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public GetExchangeRateRequest build() {
            return new GetExchangeRateRequest(this);
        } 

    } 

}
