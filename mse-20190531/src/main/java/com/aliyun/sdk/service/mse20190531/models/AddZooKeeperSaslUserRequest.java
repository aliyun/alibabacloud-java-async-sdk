// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddZooKeeperSaslUserRequest} extends {@link RequestModel}
 *
 * <p>AddZooKeeperSaslUserRequest</p>
 */
public class AddZooKeeperSaslUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reload")
    private Boolean reload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaslUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SaslUser> saslUser;

    private AddZooKeeperSaslUserRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.instanceId = builder.instanceId;
        this.reload = builder.reload;
        this.saslUser = builder.saslUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZooKeeperSaslUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reload
     */
    public Boolean getReload() {
        return this.reload;
    }

    /**
     * @return saslUser
     */
    public java.util.List<SaslUser> getSaslUser() {
        return this.saslUser;
    }

    public static final class Builder extends Request.Builder<AddZooKeeperSaslUserRequest, Builder> {
        private String acceptLanguage; 
        private String instanceId; 
        private Boolean reload; 
        private java.util.List<SaslUser> saslUser; 

        private Builder() {
            super();
        } 

        private Builder(AddZooKeeperSaslUserRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.instanceId = request.instanceId;
            this.reload = request.reload;
            this.saslUser = request.saslUser;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Reload.
         */
        public Builder reload(Boolean reload) {
            this.putQueryParameter("Reload", reload);
            this.reload = reload;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder saslUser(java.util.List<SaslUser> saslUser) {
            String saslUserShrink = shrink(saslUser, "SaslUser", "json");
            this.putQueryParameter("SaslUser", saslUserShrink);
            this.saslUser = saslUser;
            return this;
        }

        @Override
        public AddZooKeeperSaslUserRequest build() {
            return new AddZooKeeperSaslUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddZooKeeperSaslUserRequest} extends {@link TeaModel}
     *
     * <p>AddZooKeeperSaslUserRequest</p>
     */
    public static class SaslUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SaslUser(Builder builder) {
            this.description = builder.description;
            this.password = builder.password;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaslUser create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String description; 
            private String password; 
            private String userName; 

            private Builder() {
            } 

            private Builder(SaslUser model) {
                this.description = model.description;
                this.password = model.password;
                this.userName = model.userName;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SaslUser build() {
                return new SaslUser(this);
            } 

        } 

    }
}
