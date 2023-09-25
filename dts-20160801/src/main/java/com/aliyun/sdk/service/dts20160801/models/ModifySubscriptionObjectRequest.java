// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionObjectRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionObjectRequest</p>
 */
public class ModifySubscriptionObjectRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    @Query
    @NameInMap("SubscriptionObject")
    @Validation(required = true)
    private String subscriptionObject;

    private ModifySubscriptionObjectRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.subscriptionObject = builder.subscriptionObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySubscriptionObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return subscriptionObject
     */
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static final class Builder extends Request.Builder<ModifySubscriptionObjectRequest, Builder> {
        private String ownerId; 
        private String subscriptionInstanceId; 
        private String subscriptionObject; 

        private Builder() {
            super();
        } 

        private Builder(ModifySubscriptionObjectRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.subscriptionObject = request.subscriptionObject;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SubscriptionInstanceId.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * SubscriptionObject.
         */
        public Builder subscriptionObject(String subscriptionObject) {
            this.putQueryParameter("SubscriptionObject", subscriptionObject);
            this.subscriptionObject = subscriptionObject;
            return this;
        }

        @Override
        public ModifySubscriptionObjectRequest build() {
            return new ModifySubscriptionObjectRequest(this);
        } 

    } 

}
