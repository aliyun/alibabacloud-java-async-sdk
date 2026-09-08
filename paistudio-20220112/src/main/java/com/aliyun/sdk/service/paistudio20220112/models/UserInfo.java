// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UserInfo} extends {@link TeaModel}
 *
 * <p>UserInfo</p>
 */
public class UserInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UserInfo(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String userId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(UserInfo model) {
            this.userId = model.userId;
            this.userName = model.userName;
        } 

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>161222222222</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>username</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserInfo build() {
            return new UserInfo(this);
        } 

    } 

}
