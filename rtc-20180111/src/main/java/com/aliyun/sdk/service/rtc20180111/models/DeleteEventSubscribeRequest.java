// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DeleteEventSubscribeRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventSubscribeRequest</p>
 */
public class DeleteEventSubscribeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeId;

    private DeleteEventSubscribeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.subscribeId = builder.subscribeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventSubscribeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return subscribeId
     */
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public static final class Builder extends Request.Builder<DeleteEventSubscribeRequest, Builder> {
        private String appId; 
        private Long ownerId; 
        private String subscribeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventSubscribeRequest request) {
            super(request);
            this.appId = request.appId;
            this.ownerId = request.ownerId;
            this.subscribeId = request.subscribeId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ad53276431c****</p>
         */
        public Builder subscribeId(String subscribeId) {
            this.putQueryParameter("SubscribeId", subscribeId);
            this.subscribeId = subscribeId;
            return this;
        }

        @Override
        public DeleteEventSubscribeRequest build() {
            return new DeleteEventSubscribeRequest(this);
        } 

    } 

}
