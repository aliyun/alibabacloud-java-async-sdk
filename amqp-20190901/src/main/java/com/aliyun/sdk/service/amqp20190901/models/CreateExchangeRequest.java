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
 * {@link CreateExchangeRequest} extends {@link RequestModel}
 *
 * <p>CreateExchangeRequest</p>
 */
public class CreateExchangeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlternateExchange")
    private String alternateExchange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDelete")
    private Boolean autoDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExchangeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer exchangeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Internal")
    private Boolean internal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XDelayedType")
    private String xDelayedType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XHashHeader")
    private String xHashHeader;

    private CreateExchangeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alternateExchange = builder.alternateExchange;
        this.autoDelete = builder.autoDelete;
        this.consoleSessionId = builder.consoleSessionId;
        this.exchangeName = builder.exchangeName;
        this.exchangeType = builder.exchangeType;
        this.instanceId = builder.instanceId;
        this.internal = builder.internal;
        this.vhostName = builder.vhostName;
        this.xDelayedType = builder.xDelayedType;
        this.xHashHeader = builder.xHashHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExchangeRequest create() {
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
     * @return alternateExchange
     */
    public String getAlternateExchange() {
        return this.alternateExchange;
    }

    /**
     * @return autoDelete
     */
    public Boolean getAutoDelete() {
        return this.autoDelete;
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
     * @return exchangeType
     */
    public Integer getExchangeType() {
        return this.exchangeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internal
     */
    public Boolean getInternal() {
        return this.internal;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    /**
     * @return xDelayedType
     */
    public String getXDelayedType() {
        return this.xDelayedType;
    }

    /**
     * @return xHashHeader
     */
    public String getXHashHeader() {
        return this.xHashHeader;
    }

    public static final class Builder extends Request.Builder<CreateExchangeRequest, Builder> {
        private String regionId; 
        private String alternateExchange; 
        private Boolean autoDelete; 
        private String consoleSessionId; 
        private String exchangeName; 
        private Integer exchangeType; 
        private String instanceId; 
        private Boolean internal; 
        private String vhostName; 
        private String xDelayedType; 
        private String xHashHeader; 

        private Builder() {
            super();
        } 

        private Builder(CreateExchangeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alternateExchange = request.alternateExchange;
            this.autoDelete = request.autoDelete;
            this.consoleSessionId = request.consoleSessionId;
            this.exchangeName = request.exchangeName;
            this.exchangeType = request.exchangeType;
            this.instanceId = request.instanceId;
            this.internal = request.internal;
            this.vhostName = request.vhostName;
            this.xDelayedType = request.xDelayedType;
            this.xHashHeader = request.xHashHeader;
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
         * AlternateExchange.
         */
        public Builder alternateExchange(String alternateExchange) {
            this.putQueryParameter("AlternateExchange", alternateExchange);
            this.alternateExchange = alternateExchange;
            return this;
        }

        /**
         * AutoDelete.
         */
        public Builder autoDelete(Boolean autoDelete) {
            this.putQueryParameter("AutoDelete", autoDelete);
            this.autoDelete = autoDelete;
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
        public Builder exchangeName(String exchangeName) {
            this.putQueryParameter("ExchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exchangeType(Integer exchangeType) {
            this.putQueryParameter("ExchangeType", exchangeType);
            this.exchangeType = exchangeType;
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
         * Internal.
         */
        public Builder internal(Boolean internal) {
            this.putQueryParameter("Internal", internal);
            this.internal = internal;
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

        /**
         * XDelayedType.
         */
        public Builder xDelayedType(String xDelayedType) {
            this.putQueryParameter("XDelayedType", xDelayedType);
            this.xDelayedType = xDelayedType;
            return this;
        }

        /**
         * XHashHeader.
         */
        public Builder xHashHeader(String xHashHeader) {
            this.putQueryParameter("XHashHeader", xHashHeader);
            this.xHashHeader = xHashHeader;
            return this;
        }

        @Override
        public CreateExchangeRequest build() {
            return new CreateExchangeRequest(this);
        } 

    } 

}
