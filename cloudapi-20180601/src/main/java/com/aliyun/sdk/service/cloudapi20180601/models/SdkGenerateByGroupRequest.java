// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateByGroupRequest} extends {@link RequestModel}
 *
 * <p>SdkGenerateByGroupRequest</p>
 */
public class SdkGenerateByGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SdkGenerateByGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.language = builder.language;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGenerateByGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SdkGenerateByGroupRequest, Builder> {
        private String groupId; 
        private String language; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SdkGenerateByGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.language = request.language;
            this.securityToken = request.securityToken;
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
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
        public SdkGenerateByGroupRequest build() {
            return new SdkGenerateByGroupRequest(this);
        } 

    } 

}
