// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetJobUserRequest} extends {@link RequestModel}
 *
 * <p>SetJobUserRequest</p>
 */
public class SetJobUserRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RunasUser")
    @Validation(required = true)
    private String runasUser;

    @Query
    @NameInMap("RunasUserPassword")
    @Validation(required = true)
    private String runasUserPassword;

    private SetJobUserRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetJobUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return runasUser
     */
    public String getRunasUser() {
        return this.runasUser;
    }

    /**
     * @return runasUserPassword
     */
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    public static final class Builder extends Request.Builder<SetJobUserRequest, Builder> {
        private String clusterId; 
        private String runasUser; 
        private String runasUserPassword; 

        private Builder() {
            super();
        } 

        private Builder(SetJobUserRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.runasUser = request.runasUser;
            this.runasUserPassword = request.runasUserPassword;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RunasUser.
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * RunasUserPassword.
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        @Override
        public SetJobUserRequest build() {
            return new SetJobUserRequest(this);
        } 

    } 

}
