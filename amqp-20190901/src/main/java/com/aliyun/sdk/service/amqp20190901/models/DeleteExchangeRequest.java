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
 * {@link DeleteExchangeRequest} extends {@link RequestModel}
 *
 * <p>DeleteExchangeRequest</p>
 */
public class DeleteExchangeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collina")
    private String collina;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeName")
    private String exchangeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeNames")
    private java.util.Map<String, ?> exchangeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UmidToken")
    private String umidToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private DeleteExchangeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collina = builder.collina;
        this.consoleSessionId = builder.consoleSessionId;
        this.exchangeName = builder.exchangeName;
        this.exchangeNames = builder.exchangeNames;
        this.instanceId = builder.instanceId;
        this.umidToken = builder.umidToken;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExchangeRequest create() {
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
     * @return collina
     */
    public String getCollina() {
        return this.collina;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return exchangeName
     */
    public String getExchangeName() {
        return this.exchangeName;
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
     * @return umidToken
     */
    public String getUmidToken() {
        return this.umidToken;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<DeleteExchangeRequest, Builder> {
        private String regionId; 
        private String collina; 
        private String consoleSessionId; 
        private String exchangeName; 
        private java.util.Map<String, ?> exchangeNames; 
        private String instanceId; 
        private String umidToken; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExchangeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collina = request.collina;
            this.consoleSessionId = request.consoleSessionId;
            this.exchangeName = request.exchangeName;
            this.exchangeNames = request.exchangeNames;
            this.instanceId = request.instanceId;
            this.umidToken = request.umidToken;
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
         * Collina.
         */
        public Builder collina(String collina) {
            this.putQueryParameter("Collina", collina);
            this.collina = collina;
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
         * ExchangeName.
         */
        public Builder exchangeName(String exchangeName) {
            this.putQueryParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * ExchangeNames.
         */
        public Builder exchangeNames(java.util.Map<String, ?> exchangeNames) {
            String exchangeNamesShrink = shrink(exchangeNames, "ExchangeNames", "json");
            this.putQueryParameter("ExchangeNames", exchangeNamesShrink);
            this.exchangeNames = exchangeNames;
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
         * UmidToken.
         */
        public Builder umidToken(String umidToken) {
            this.putQueryParameter("UmidToken", umidToken);
            this.umidToken = umidToken;
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
        public DeleteExchangeRequest build() {
            return new DeleteExchangeRequest(this);
        } 

    } 

}
