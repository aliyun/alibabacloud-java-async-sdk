// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UserSummaryModel} extends {@link TeaModel}
 *
 * <p>UserSummaryModel</p>
 */
public class UserSummaryModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessTokens")
    private java.util.List<AccessTokenModel> accessTokens;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("RamUser")
    private String ramUser;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UserSummaryModel(Builder builder) {
        this.accessTokens = builder.accessTokens;
        this.host = builder.host;
        this.ramUser = builder.ramUser;
        this.status = builder.status;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserSummaryModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokens
     */
    public java.util.List<AccessTokenModel> getAccessTokens() {
        return this.accessTokens;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return ramUser
     */
    public String getRamUser() {
        return this.ramUser;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private java.util.List<AccessTokenModel> accessTokens; 
        private String host; 
        private String ramUser; 
        private String status; 
        private String userName; 

        private Builder() {
        } 

        private Builder(UserSummaryModel model) {
            this.accessTokens = model.accessTokens;
            this.host = model.host;
            this.ramUser = model.ramUser;
            this.status = model.status;
            this.userName = model.userName;
        } 

        /**
         * <p>The list of access tokens for the user.</p>
         */
        public Builder accessTokens(java.util.List<AccessTokenModel> accessTokens) {
            this.accessTokens = accessTokens;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The ID of the associated Alibaba Cloud RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>1444832459****</p>
         */
        public Builder ramUser(String ramUser) {
            this.ramUser = ramUser;
            return this;
        }

        /**
         * <p>The user status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserSummaryModel build() {
            return new UserSummaryModel(this);
        } 

    } 

}
