// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link CreateCallCenterProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateCallCenterProviderRequest</p>
 */
public class CreateCallCenterProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extras")
    private String extras;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Originator")
    private String originator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferTo")
    private String referTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrunkId")
    private String trunkId;

    private CreateCallCenterProviderRequest(Builder builder) {
        super(builder);
        this.destination = builder.destination;
        this.displayName = builder.displayName;
        this.extras = builder.extras;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.originator = builder.originator;
        this.providerType = builder.providerType;
        this.referTo = builder.referTo;
        this.trunkId = builder.trunkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallCenterProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return extras
     */
    public String getExtras() {
        return this.extras;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return originator
     */
    public String getOriginator() {
        return this.originator;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return referTo
     */
    public String getReferTo() {
        return this.referTo;
    }

    /**
     * @return trunkId
     */
    public String getTrunkId() {
        return this.trunkId;
    }

    public static final class Builder extends Request.Builder<CreateCallCenterProviderRequest, Builder> {
        private String destination; 
        private String displayName; 
        private String extras; 
        private String instanceId; 
        private String name; 
        private String originator; 
        private String providerType; 
        private String referTo; 
        private String trunkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallCenterProviderRequest request) {
            super(request);
            this.destination = request.destination;
            this.displayName = request.displayName;
            this.extras = request.extras;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.originator = request.originator;
            this.providerType = request.providerType;
            this.referTo = request.referTo;
            this.trunkId = request.trunkId;
        } 

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.putBodyParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Extras.
         */
        public Builder extras(String extras) {
            this.putBodyParameter("Extras", extras);
            this.extras = extras;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Originator.
         */
        public Builder originator(String originator) {
            this.putBodyParameter("Originator", originator);
            this.originator = originator;
            return this;
        }

        /**
         * ProviderType.
         */
        public Builder providerType(String providerType) {
            this.putBodyParameter("ProviderType", providerType);
            this.providerType = providerType;
            return this;
        }

        /**
         * ReferTo.
         */
        public Builder referTo(String referTo) {
            this.putBodyParameter("ReferTo", referTo);
            this.referTo = referTo;
            return this;
        }

        /**
         * TrunkId.
         */
        public Builder trunkId(String trunkId) {
            this.putBodyParameter("TrunkId", trunkId);
            this.trunkId = trunkId;
            return this;
        }

        @Override
        public CreateCallCenterProviderRequest build() {
            return new CreateCallCenterProviderRequest(this);
        } 

    } 

}
