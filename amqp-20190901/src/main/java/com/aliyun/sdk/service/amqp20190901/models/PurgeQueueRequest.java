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
 * {@link PurgeQueueRequest} extends {@link RequestModel}
 *
 * <p>PurgeQueueRequest</p>
 */
public class PurgeQueueRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNames")
    private java.util.Map<String, ?> queueNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UmidToken")
    private String umidToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private PurgeQueueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collina = builder.collina;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.queueName = builder.queueName;
        this.queueNames = builder.queueNames;
        this.umidToken = builder.umidToken;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurgeQueueRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return queueNames
     */
    public java.util.Map<String, ?> getQueueNames() {
        return this.queueNames;
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

    public static final class Builder extends Request.Builder<PurgeQueueRequest, Builder> {
        private String regionId; 
        private String collina; 
        private String consoleSessionId; 
        private String instanceId; 
        private String queueName; 
        private java.util.Map<String, ?> queueNames; 
        private String umidToken; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(PurgeQueueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collina = request.collina;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.queueName = request.queueName;
            this.queueNames = request.queueNames;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * QueueNames.
         */
        public Builder queueNames(java.util.Map<String, ?> queueNames) {
            String queueNamesShrink = shrink(queueNames, "QueueNames", "json");
            this.putQueryParameter("QueueNames", queueNamesShrink);
            this.queueNames = queueNames;
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
        public PurgeQueueRequest build() {
            return new PurgeQueueRequest(this);
        } 

    } 

}
