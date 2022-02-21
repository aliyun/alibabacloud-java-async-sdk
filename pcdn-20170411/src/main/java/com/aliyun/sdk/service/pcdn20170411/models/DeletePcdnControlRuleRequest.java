// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePcdnControlRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePcdnControlRuleRequest</p>
 */
public class DeletePcdnControlRuleRequest extends Request {
    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DeletePcdnControlRuleRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.securityToken = builder.securityToken;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePcdnControlRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DeletePcdnControlRuleRequest, Builder> {
        private String resourceId; 
        private String securityToken; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DeletePcdnControlRuleRequest response) {
            super(response);
            this.resourceId = response.resourceId;
            this.securityToken = response.securityToken;
            this.version = response.version;
        } 

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DeletePcdnControlRuleRequest build() {
            return new DeletePcdnControlRuleRequest(this);
        } 

    } 

}
