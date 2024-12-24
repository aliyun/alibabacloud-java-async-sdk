// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

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
 * {@link ApplyCoordinationWithCodeRequest} extends {@link RequestModel}
 *
 * <p>ApplyCoordinationWithCodeRequest</p>
 */
public class ApplyCoordinationWithCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoordinationCode")
    private String coordinationCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ApplyCoordinationWithCodeRequest(Builder builder) {
        super(builder);
        this.coordinationCode = builder.coordinationCode;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.sessionId = builder.sessionId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationWithCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinationCode
     */
    public String getCoordinationCode() {
        return this.coordinationCode;
    }

    /**
     * @return loginRegionId
     */
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ApplyCoordinationWithCodeRequest, Builder> {
        private String coordinationCode; 
        private String loginRegionId; 
        private String loginToken; 
        private String sessionId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ApplyCoordinationWithCodeRequest request) {
            super(request);
            this.coordinationCode = request.coordinationCode;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.sessionId = request.sessionId;
            this.uuid = request.uuid;
        } 

        /**
         * CoordinationCode.
         */
        public Builder coordinationCode(String coordinationCode) {
            this.putBodyParameter("CoordinationCode", coordinationCode);
            this.coordinationCode = coordinationCode;
            return this;
        }

        /**
         * LoginRegionId.
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putBodyParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ApplyCoordinationWithCodeRequest build() {
            return new ApplyCoordinationWithCodeRequest(this);
        } 

    } 

}
