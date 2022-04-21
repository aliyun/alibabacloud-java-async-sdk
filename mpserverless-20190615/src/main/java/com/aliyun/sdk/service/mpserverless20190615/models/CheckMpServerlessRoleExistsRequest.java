// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMpServerlessRoleExistsRequest} extends {@link RequestModel}
 *
 * <p>CheckMpServerlessRoleExistsRequest</p>
 */
public class CheckMpServerlessRoleExistsRequest extends Request {
    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    private CheckMpServerlessRoleExistsRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMpServerlessRoleExistsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<CheckMpServerlessRoleExistsRequest, Builder> {
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(CheckMpServerlessRoleExistsRequest request) {
            super(request);
            this.roleName = request.roleName;
        } 

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public CheckMpServerlessRoleExistsRequest build() {
            return new CheckMpServerlessRoleExistsRequest(this);
        } 

    } 

}
