// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteMessageCallbackRequest} extends {@link RequestModel}
 *
 * <p>DeleteMessageCallbackRequest</p>
 */
public class DeleteMessageCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    private DeleteMessageCallbackRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMessageCallbackRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<DeleteMessageCallbackRequest, Builder> {
        private String appId; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMessageCallbackRequest request) {
            super(request);
            this.appId = request.appId;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * <p>The ID of the application. If you do not set this parameter, the default value <strong>app-1000000</strong> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public DeleteMessageCallbackRequest build() {
            return new DeleteMessageCallbackRequest(this);
        } 

    } 

}
