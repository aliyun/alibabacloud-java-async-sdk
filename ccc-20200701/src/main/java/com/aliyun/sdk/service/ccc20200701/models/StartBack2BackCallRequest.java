// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link StartBack2BackCallRequest} extends {@link RequestModel}
 *
 * <p>StartBack2BackCallRequest</p>
 */
public class StartBack2BackCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalBroker")
    private String additionalBroker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Broker")
    @com.aliyun.core.annotation.Validation(required = true)
    private String broker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer timeoutSeconds;

    private StartBack2BackCallRequest(Builder builder) {
        super(builder);
        this.additionalBroker = builder.additionalBroker;
        this.broker = builder.broker;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.instanceId = builder.instanceId;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBack2BackCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalBroker
     */
    public String getAdditionalBroker() {
        return this.additionalBroker;
    }

    /**
     * @return broker
     */
    public String getBroker() {
        return this.broker;
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder extends Request.Builder<StartBack2BackCallRequest, Builder> {
        private String additionalBroker; 
        private String broker; 
        private String callee; 
        private String caller; 
        private String instanceId; 
        private String tags; 
        private Integer timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(StartBack2BackCallRequest request) {
            super(request);
            this.additionalBroker = request.additionalBroker;
            this.broker = request.broker;
            this.callee = request.callee;
            this.caller = request.caller;
            this.instanceId = request.instanceId;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
        } 

        /**
         * AdditionalBroker.
         */
        public Builder additionalBroker(String additionalBroker) {
            this.putQueryParameter("AdditionalBroker", additionalBroker);
            this.additionalBroker = additionalBroker;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0102157****</p>
         */
        public Builder broker(String broker) {
            this.putQueryParameter("Broker", broker);
            this.broker = broker;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1372168****</p>
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1391814****</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public StartBack2BackCallRequest build() {
            return new StartBack2BackCallRequest(this);
        } 

    } 

}
