// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetUserTmpIdentityForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetUserTmpIdentityForPartnerRequest</p>
 */
public class GetUserTmpIdentityForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPurpose")
    private String authPurpose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRole")
    private String serviceLinkedRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetUserTmpIdentityForPartnerRequest(Builder builder) {
        super(builder);
        this.authPurpose = builder.authPurpose;
        this.bizId = builder.bizId;
        this.extend = builder.extend;
        this.serviceLinkedRole = builder.serviceLinkedRole;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserTmpIdentityForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authPurpose
     */
    public String getAuthPurpose() {
        return this.authPurpose;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return serviceLinkedRole
     */
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUserTmpIdentityForPartnerRequest, Builder> {
        private String authPurpose; 
        private String bizId; 
        private String extend; 
        private String serviceLinkedRole; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserTmpIdentityForPartnerRequest request) {
            super(request);
            this.authPurpose = request.authPurpose;
            this.bizId = request.bizId;
            this.extend = request.extend;
            this.serviceLinkedRole = request.serviceLinkedRole;
            this.userId = request.userId;
        } 

        /**
         * AuthPurpose.
         */
        public Builder authPurpose(String authPurpose) {
            this.putQueryParameter("AuthPurpose", authPurpose);
            this.authPurpose = authPurpose;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * ServiceLinkedRole.
         */
        public Builder serviceLinkedRole(String serviceLinkedRole) {
            this.putQueryParameter("ServiceLinkedRole", serviceLinkedRole);
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUserTmpIdentityForPartnerRequest build() {
            return new GetUserTmpIdentityForPartnerRequest(this);
        } 

    } 

}
