// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeletePasskeyRequest} extends {@link RequestModel}
 *
 * <p>DeletePasskeyRequest</p>
 */
public class DeletePasskeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasskeyId")
    private String passkeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private DeletePasskeyRequest(Builder builder) {
        super(builder);
        this.passkeyId = builder.passkeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePasskeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passkeyId
     */
    public String getPasskeyId() {
        return this.passkeyId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<DeletePasskeyRequest, Builder> {
        private String passkeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePasskeyRequest request) {
            super(request);
            this.passkeyId = request.passkeyId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * PasskeyId.
         */
        public Builder passkeyId(String passkeyId) {
            this.putQueryParameter("PasskeyId", passkeyId);
            this.passkeyId = passkeyId;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public DeletePasskeyRequest build() {
            return new DeletePasskeyRequest(this);
        } 

    } 

}
