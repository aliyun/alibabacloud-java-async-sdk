// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupAuthAppCodeForBackendRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupAuthAppCodeForBackendRequest</p>
 */
public class ModifyGroupAuthAppCodeForBackendRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AuthAppCode")
    @Validation(required = true)
    private String authAppCode;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyGroupAuthAppCodeForBackendRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.authAppCode = builder.authAppCode;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupAuthAppCodeForBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
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

    public static final class Builder extends Request.Builder<ModifyGroupAuthAppCodeForBackendRequest, Builder> {
        private Long aliUid; 
        private String authAppCode; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupAuthAppCodeForBackendRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.authAppCode = request.authAppCode;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AuthAppCode.
         */
        public Builder authAppCode(String authAppCode) {
            this.putQueryParameter("AuthAppCode", authAppCode);
            this.authAppCode = authAppCode;
            return this;
        }

        /**
         * GroupId.
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
        public ModifyGroupAuthAppCodeForBackendRequest build() {
            return new ModifyGroupAuthAppCodeForBackendRequest(this);
        } 

    } 

}
