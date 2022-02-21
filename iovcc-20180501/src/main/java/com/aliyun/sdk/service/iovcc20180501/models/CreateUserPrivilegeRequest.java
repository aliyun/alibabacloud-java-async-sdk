// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserPrivilegeRequest} extends {@link RequestModel}
 *
 * <p>CreateUserPrivilegeRequest</p>
 */
public class CreateUserPrivilegeRequest extends Request {
    @Query
    @NameInMap("Privileges")
    @Validation(required = true)
    private String privileges;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private CreateUserPrivilegeRequest(Builder builder) {
        super(builder);
        this.privileges = builder.privileges;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPrivilegeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privileges
     */
    public String getPrivileges() {
        return this.privileges;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateUserPrivilegeRequest, Builder> {
        private String privileges; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserPrivilegeRequest response) {
            super(response);
            this.privileges = response.privileges;
            this.regionId = response.regionId;
            this.userId = response.userId;
        } 

        /**
         * Privileges.
         */
        public Builder privileges(String privileges) {
            this.putQueryParameter("Privileges", privileges);
            this.privileges = privileges;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public CreateUserPrivilegeRequest build() {
            return new CreateUserPrivilegeRequest(this);
        } 

    } 

}
