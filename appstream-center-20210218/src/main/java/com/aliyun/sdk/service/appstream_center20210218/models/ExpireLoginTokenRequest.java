// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpireLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>ExpireLoginTokenRequest</p>
 */
public class ExpireLoginTokenRequest extends Request {
    @Body
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Body
    @NameInMap("LoginToken")
    @Validation(required = true)
    private String loginToken;

    @Body
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Body
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    private ExpireLoginTokenRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.loginToken = builder.loginToken;
        this.officeSiteId = builder.officeSiteId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpireLoginTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ExpireLoginTokenRequest, Builder> {
        private String endUserId; 
        private String loginToken; 
        private String officeSiteId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ExpireLoginTokenRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.loginToken = request.loginToken;
            this.officeSiteId = request.officeSiteId;
            this.sessionId = request.sessionId;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putBodyParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ExpireLoginTokenRequest build() {
            return new ExpireLoginTokenRequest(this);
        } 

    } 

}
