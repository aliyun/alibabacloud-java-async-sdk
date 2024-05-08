// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpControlRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpControlRequest</p>
 */
public class ModifyIpControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlName")
    private String ipControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyIpControlRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.ipControlId = builder.ipControlId;
        this.ipControlName = builder.ipControlName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return ipControlName
     */
    public String getIpControlName() {
        return this.ipControlName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyIpControlRequest, Builder> {
        private String description; 
        private String ipControlId; 
        private String ipControlName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpControlRequest request) {
            super(request);
            this.description = request.description;
            this.ipControlId = request.ipControlId;
            this.ipControlName = request.ipControlName;
            this.securityToken = request.securityToken;
        } 

        /**
         * The description. The description can be up to 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the ACL. The ID is unique.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * The name of the ACL. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (\_). The name cannot start with an underscore (\_).
         */
        public Builder ipControlName(String ipControlName) {
            this.putQueryParameter("IpControlName", ipControlName);
            this.ipControlName = ipControlName;
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
        public ModifyIpControlRequest build() {
            return new ModifyIpControlRequest(this);
        } 

    } 

}
