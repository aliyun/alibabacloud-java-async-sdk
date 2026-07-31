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
 * {@link AccessTokenModel} extends {@link TeaModel}
 *
 * <p>AccessTokenModel</p>
 */
public class AccessTokenModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("ExpiredAt")
    private String expiredAt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AccessTokenModel(Builder builder) {
        this.accessToken = builder.accessToken;
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
        this.expiredAt = builder.expiredAt;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessTokenModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return expiredAt
     */
    public String getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String accessToken; 
        private String comment; 
        private String createdAt; 
        private String expiredAt; 
        private String status; 

        private Builder() {
        } 

        private Builder(AccessTokenModel model) {
            this.accessToken = model.accessToken;
            this.comment = model.comment;
            this.createdAt = model.createdAt;
            this.expiredAt = model.expiredAt;
            this.status = model.status;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * ExpiredAt.
         */
        public Builder expiredAt(String expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AccessTokenModel build() {
            return new AccessTokenModel(this);
        } 

    } 

}
