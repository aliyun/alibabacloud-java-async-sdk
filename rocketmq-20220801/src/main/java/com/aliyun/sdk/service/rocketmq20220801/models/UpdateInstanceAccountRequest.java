// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAccountRequest</p>
 */
public class UpdateInstanceAccountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    private UpdateInstanceAccountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.username = builder.username;
        this.accountStatus = builder.accountStatus;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceAccountRequest, Builder> {
        private String instanceId; 
        private String username; 
        private String accountStatus; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAccountRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.username = request.username;
            this.accountStatus = request.accountStatus;
            this.password = request.password;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putPathParameter("username", username);
            this.username = username;
            return this;
        }

        /**
         * accountStatus.
         */
        public Builder accountStatus(String accountStatus) {
            this.putQueryParameter("accountStatus", accountStatus);
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        @Override
        public UpdateInstanceAccountRequest build() {
            return new UpdateInstanceAccountRequest(this);
        } 

    } 

}
