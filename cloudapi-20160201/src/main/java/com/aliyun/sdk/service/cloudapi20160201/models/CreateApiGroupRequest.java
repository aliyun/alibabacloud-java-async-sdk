// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateApiGroupRequest</p>
 */
public class CreateApiGroupRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateApiGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateApiGroupRequest, Builder> {
        private String description; 
        private String groupName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiGroupRequest request) {
            super(request);
            this.description = request.description;
            this.groupName = request.groupName;
            this.securityToken = request.securityToken;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
        public CreateApiGroupRequest build() {
            return new CreateApiGroupRequest(this);
        } 

    } 

}
