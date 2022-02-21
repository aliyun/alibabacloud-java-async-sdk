// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupAttributeRequest</p>
 */
public class ModifySecurityGroupAttributeRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256, minLength = 2)
    private String description;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupName")
    @Validation(maxLength = 128, minLength = 2)
    private String securityGroupName;

    private ModifySecurityGroupAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupAttributeRequest create() {
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<ModifySecurityGroupAttributeRequest, Builder> {
        private String description; 
        private String securityGroupId; 
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityGroupAttributeRequest response) {
            super(response);
            this.description = response.description;
            this.securityGroupId = response.securityGroupId;
            this.securityGroupName = response.securityGroupName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        @Override
        public ModifySecurityGroupAttributeRequest build() {
            return new ModifySecurityGroupAttributeRequest(this);
        } 

    } 

}
