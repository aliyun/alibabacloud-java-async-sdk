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
 * {@link UpdatePasskeyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePasskeyRequest</p>
 */
public class UpdatePasskeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasskeyId")
    private String passkeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasskeyName")
    private String passkeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private UpdatePasskeyRequest(Builder builder) {
        super(builder);
        this.passkeyId = builder.passkeyId;
        this.passkeyName = builder.passkeyName;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePasskeyRequest create() {
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
     * @return passkeyName
     */
    public String getPasskeyName() {
        return this.passkeyName;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<UpdatePasskeyRequest, Builder> {
        private String passkeyId; 
        private String passkeyName; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePasskeyRequest request) {
            super(request);
            this.passkeyId = request.passkeyId;
            this.passkeyName = request.passkeyName;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The ID of the passkey.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSKEY-CuZjEHhWcr7GIQOMGvkS</p>
         */
        public Builder passkeyId(String passkeyId) {
            this.putQueryParameter("PasskeyId", passkeyId);
            this.passkeyId = passkeyId;
            return this;
        }

        /**
         * <p>The name of the passkey.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder passkeyName(String passkeyName) {
            this.putQueryParameter("PasskeyName", passkeyName);
            this.passkeyName = passkeyName;
            return this;
        }

        /**
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public UpdatePasskeyRequest build() {
            return new UpdatePasskeyRequest(this);
        } 

    } 

}
