// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link AuthorizeAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeAndroidInstanceRequest</p>
 */
public class AuthorizeAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeUserId")
    private String authorizeUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnAuthorizeUserId")
    private String unAuthorizeUserId;

    private AuthorizeAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.authorizeUserId = builder.authorizeUserId;
        this.unAuthorizeUserId = builder.unAuthorizeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeAndroidInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return authorizeUserId
     */
    public String getAuthorizeUserId() {
        return this.authorizeUserId;
    }

    /**
     * @return unAuthorizeUserId
     */
    public String getUnAuthorizeUserId() {
        return this.unAuthorizeUserId;
    }

    public static final class Builder extends Request.Builder<AuthorizeAndroidInstanceRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String authorizeUserId; 
        private String unAuthorizeUserId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.authorizeUserId = request.authorizeUserId;
            this.unAuthorizeUserId = request.unAuthorizeUserId;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * AuthorizeUserId.
         */
        public Builder authorizeUserId(String authorizeUserId) {
            this.putQueryParameter("AuthorizeUserId", authorizeUserId);
            this.authorizeUserId = authorizeUserId;
            return this;
        }

        /**
         * UnAuthorizeUserId.
         */
        public Builder unAuthorizeUserId(String unAuthorizeUserId) {
            this.putQueryParameter("UnAuthorizeUserId", unAuthorizeUserId);
            this.unAuthorizeUserId = unAuthorizeUserId;
            return this;
        }

        @Override
        public AuthorizeAndroidInstanceRequest build() {
            return new AuthorizeAndroidInstanceRequest(this);
        } 

    } 

}
