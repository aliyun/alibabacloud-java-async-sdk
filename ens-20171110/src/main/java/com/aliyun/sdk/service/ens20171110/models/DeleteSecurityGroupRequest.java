// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityGroupRequest</p>
 */
public class DeleteSecurityGroupRequest extends Request {
    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DeleteSecurityGroupRequest(Builder builder) {
        super(builder);
        this.securityGroupId = builder.securityGroupId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityGroupRequest, Builder> {
        private String securityGroupId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityGroupRequest response) {
            super(response);
            this.securityGroupId = response.securityGroupId;
            this.version = response.version;
        } 

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
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
        public DeleteSecurityGroupRequest build() {
            return new DeleteSecurityGroupRequest(this);
        } 

    } 

}
