// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CloseSessionRequest} extends {@link RequestModel}
 *
 * <p>CloseSessionRequest</p>
 */
public class CloseSessionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionToken")
    private String sessionToken;

    private CloseSessionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.sessionToken = builder.sessionToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionToken
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    public static final class Builder extends Request.Builder<CloseSessionRequest, Builder> {
        private String regionId; 
        private String sessionId; 
        private String sessionToken; 

        private Builder() {
            super();
        } 

        private Builder(CloseSessionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.sessionToken = request.sessionToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * SessionToken.
         */
        public Builder sessionToken(String sessionToken) {
            this.putBodyParameter("SessionToken", sessionToken);
            this.sessionToken = sessionToken;
            return this;
        }

        @Override
        public CloseSessionRequest build() {
            return new CloseSessionRequest(this);
        } 

    } 

}
