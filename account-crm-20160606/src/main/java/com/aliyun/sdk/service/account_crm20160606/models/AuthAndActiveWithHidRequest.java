// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link AuthAndActiveWithHidRequest} extends {@link RequestModel}
 *
 * <p>AuthAndActiveWithHidRequest</p>
 */
public class AuthAndActiveWithHidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String havanaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private AuthAndActiveWithHidRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.havanaId = builder.havanaId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthAndActiveWithHidRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return havanaId
     */
    public String getHavanaId() {
        return this.havanaId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<AuthAndActiveWithHidRequest, Builder> {
        private String appName; 
        private String havanaId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthAndActiveWithHidRequest request) {
            super(request);
            this.appName = request.appName;
            this.havanaId = request.havanaId;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder havanaId(String havanaId) {
            this.putQueryParameter("HavanaId", havanaId);
            this.havanaId = havanaId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public AuthAndActiveWithHidRequest build() {
            return new AuthAndActiveWithHidRequest(this);
        } 

    } 

}
