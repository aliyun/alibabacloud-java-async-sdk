// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppSecurityGroupRequest</p>
 */
public class UpdateAppSecurityGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    private UpdateAppSecurityGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateAppSecurityGroupRequest, Builder> {
        private String appId; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppSecurityGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * sg-wz969ngg2e49q5i4\*\*\*\*
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public UpdateAppSecurityGroupRequest build() {
            return new UpdateAppSecurityGroupRequest(this);
        } 

    } 

}
