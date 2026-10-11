// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link UpdateEgressProxyIpPoolAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEgressProxyIpPoolAttributeRequest</p>
 */
public class UpdateEgressProxyIpPoolAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolName")
    private String egressProxyIpPoolName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HashFactor")
    private String hashFactor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HashHeaderName")
    private String hashHeaderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    private UpdateEgressProxyIpPoolAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.egressProxyIpPoolName = builder.egressProxyIpPoolName;
        this.hashFactor = builder.hashFactor;
        this.hashHeaderName = builder.hashHeaderName;
        this.scheduler = builder.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEgressProxyIpPoolAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return egressProxyIpPoolName
     */
    public String getEgressProxyIpPoolName() {
        return this.egressProxyIpPoolName;
    }

    /**
     * @return hashFactor
     */
    public String getHashFactor() {
        return this.hashFactor;
    }

    /**
     * @return hashHeaderName
     */
    public String getHashHeaderName() {
        return this.hashHeaderName;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    public static final class Builder extends Request.Builder<UpdateEgressProxyIpPoolAttributeRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyIpPoolId; 
        private String egressProxyIpPoolName; 
        private String hashFactor; 
        private String hashHeaderName; 
        private String scheduler; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEgressProxyIpPoolAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyIpPoolId = request.egressProxyIpPoolId;
            this.egressProxyIpPoolName = request.egressProxyIpPoolName;
            this.hashFactor = request.hashFactor;
            this.hashHeaderName = request.hashHeaderName;
            this.scheduler = request.scheduler;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eppool-gw80606a59ecc101****</p>
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.putBodyParameter("EgressProxyIpPoolId", egressProxyIpPoolId);
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        /**
         * EgressProxyIpPoolName.
         */
        public Builder egressProxyIpPoolName(String egressProxyIpPoolName) {
            this.putBodyParameter("EgressProxyIpPoolName", egressProxyIpPoolName);
            this.egressProxyIpPoolName = egressProxyIpPoolName;
            return this;
        }

        /**
         * HashFactor.
         */
        public Builder hashFactor(String hashFactor) {
            this.putBodyParameter("HashFactor", hashFactor);
            this.hashFactor = hashFactor;
            return this;
        }

        /**
         * HashHeaderName.
         */
        public Builder hashHeaderName(String hashHeaderName) {
            this.putBodyParameter("HashHeaderName", hashHeaderName);
            this.hashHeaderName = hashHeaderName;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.putBodyParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        @Override
        public UpdateEgressProxyIpPoolAttributeRequest build() {
            return new UpdateEgressProxyIpPoolAttributeRequest(this);
        } 

    } 

}
