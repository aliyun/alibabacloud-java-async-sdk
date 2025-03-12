// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link CreateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscriptionRequest</p>
 */
public class CreateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraContext")
    private String extraContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbServer")
    private String slbServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDescription")
    private String subscriptionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateSubscriptionRequest(Builder builder) {
        super(builder);
        this.destinationInstanceId = builder.destinationInstanceId;
        this.destinationInstanceRegionId = builder.destinationInstanceRegionId;
        this.extraContext = builder.extraContext;
        this.mapping = builder.mapping;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.slbServer = builder.slbServer;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
        this.subscriptionDescription = builder.subscriptionDescription;
        this.subscriptionType = builder.subscriptionType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationInstanceId
     */
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    /**
     * @return destinationInstanceRegionId
     */
    public String getDestinationInstanceRegionId() {
        return this.destinationInstanceRegionId;
    }

    /**
     * @return extraContext
     */
    public String getExtraContext() {
        return this.extraContext;
    }

    /**
     * @return mapping
     */
    public String getMapping() {
        return this.mapping;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return slbServer
     */
    public String getSlbServer() {
        return this.slbServer;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourceInstanceRegionId
     */
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

    /**
     * @return subscriptionDescription
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateSubscriptionRequest, Builder> {
        private String destinationInstanceId; 
        private String destinationInstanceRegionId; 
        private String extraContext; 
        private String mapping; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String slbServer; 
        private String sourceInstanceId; 
        private String sourceInstanceRegionId; 
        private String subscriptionDescription; 
        private String subscriptionType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscriptionRequest request) {
            super(request);
            this.destinationInstanceId = request.destinationInstanceId;
            this.destinationInstanceRegionId = request.destinationInstanceRegionId;
            this.extraContext = request.extraContext;
            this.mapping = request.mapping;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.slbServer = request.slbServer;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceRegionId = request.sourceInstanceRegionId;
            this.subscriptionDescription = request.subscriptionDescription;
            this.subscriptionType = request.subscriptionType;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder destinationInstanceId(String destinationInstanceId) {
            this.putQueryParameter("DestinationInstanceId", destinationInstanceId);
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder destinationInstanceRegionId(String destinationInstanceRegionId) {
            this.putQueryParameter("DestinationInstanceRegionId", destinationInstanceRegionId);
            this.destinationInstanceRegionId = destinationInstanceRegionId;
            return this;
        }

        /**
         * ExtraContext.
         */
        public Builder extraContext(String extraContext) {
            this.putQueryParameter("ExtraContext", extraContext);
            this.extraContext = extraContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mapping(String mapping) {
            this.putQueryParameter("Mapping", mapping);
            this.mapping = mapping;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SlbServer.
         */
        public Builder slbServer(String slbServer) {
            this.putQueryParameter("SlbServer", slbServer);
            this.slbServer = slbServer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
            this.putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }

        /**
         * SubscriptionDescription.
         */
        public Builder subscriptionDescription(String subscriptionDescription) {
            this.putQueryParameter("SubscriptionDescription", subscriptionDescription);
            this.subscriptionDescription = subscriptionDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(this);
        } 

    } 

}
