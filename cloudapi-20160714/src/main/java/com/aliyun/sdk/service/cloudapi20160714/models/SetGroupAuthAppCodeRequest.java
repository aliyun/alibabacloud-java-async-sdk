// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetGroupAuthAppCodeRequest} extends {@link RequestModel}
 *
 * <p>SetGroupAuthAppCodeRequest</p>
 */
public class SetGroupAuthAppCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authAppCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private SetGroupAuthAppCodeRequest(Builder builder) {
        super(builder);
        this.authAppCode = builder.authAppCode;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGroupAuthAppCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authAppCode
     */
    public String getAuthAppCode() {
        return this.authAppCode;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetGroupAuthAppCodeRequest, Builder> {
        private String authAppCode; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetGroupAuthAppCodeRequest request) {
            super(request);
            this.authAppCode = request.authAppCode;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authAppCode(String authAppCode) {
            this.putQueryParameter("AuthAppCode", authAppCode);
            this.authAppCode = authAppCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetGroupAuthAppCodeRequest build() {
            return new SetGroupAuthAppCodeRequest(this);
        } 

    } 

}
