// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVisualServicePasswdRequest} extends {@link RequestModel}
 *
 * <p>ModifyVisualServicePasswdRequest</p>
 */
public class ModifyVisualServicePasswdRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Passwd")
    @Validation(required = true)
    private String passwd;

    @Query
    @NameInMap("RunasUser")
    @Validation(required = true)
    private String runasUser;

    @Query
    @NameInMap("RunasUserPassword")
    @Validation(required = true)
    private String runasUserPassword;

    private ModifyVisualServicePasswdRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.passwd = builder.passwd;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVisualServicePasswdRequest create() {
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
     * @return passwd
     */
    public String getPasswd() {
        return this.passwd;
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

    public static final class Builder extends Request.Builder<ModifyVisualServicePasswdRequest, Builder> {
        private String clusterId; 
        private String passwd; 
        private String runasUser; 
        private String runasUserPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVisualServicePasswdRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.passwd = request.passwd;
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
         * Passwd.
         */
        public Builder passwd(String passwd) {
            this.putQueryParameter("Passwd", passwd);
            this.passwd = passwd;
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
        public ModifyVisualServicePasswdRequest build() {
            return new ModifyVisualServicePasswdRequest(this);
        } 

    } 

}
