// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataLevelPermissionRuleUsersRequest} extends {@link RequestModel}
 *
 * <p>AddDataLevelPermissionRuleUsersRequest</p>
 */
public class AddDataLevelPermissionRuleUsersRequest extends Request {
    @Query
    @NameInMap("AddUserModel")
    @Validation(required = true)
    private String addUserModel;

    private AddDataLevelPermissionRuleUsersRequest(Builder builder) {
        super(builder);
        this.addUserModel = builder.addUserModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataLevelPermissionRuleUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addUserModel
     */
    public String getAddUserModel() {
        return this.addUserModel;
    }

    public static final class Builder extends Request.Builder<AddDataLevelPermissionRuleUsersRequest, Builder> {
        private String addUserModel; 

        private Builder() {
            super();
        } 

        private Builder(AddDataLevelPermissionRuleUsersRequest request) {
            super(request);
            this.addUserModel = request.addUserModel;
        } 

        /**
         * AddUserModel.
         */
        public Builder addUserModel(String addUserModel) {
            this.putQueryParameter("AddUserModel", addUserModel);
            this.addUserModel = addUserModel;
            return this;
        }

        @Override
        public AddDataLevelPermissionRuleUsersRequest build() {
            return new AddDataLevelPermissionRuleUsersRequest(this);
        } 

    } 

}
