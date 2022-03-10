// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLevelPermissionRuleUsersRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataLevelPermissionRuleUsersRequest</p>
 */
public class DeleteDataLevelPermissionRuleUsersRequest extends Request {
    @Query
    @NameInMap("DeleteUserModel")
    @Validation(required = true)
    private String deleteUserModel;

    private DeleteDataLevelPermissionRuleUsersRequest(Builder builder) {
        super(builder);
        this.deleteUserModel = builder.deleteUserModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataLevelPermissionRuleUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteUserModel
     */
    public String getDeleteUserModel() {
        return this.deleteUserModel;
    }

    public static final class Builder extends Request.Builder<DeleteDataLevelPermissionRuleUsersRequest, Builder> {
        private String deleteUserModel; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataLevelPermissionRuleUsersRequest request) {
            super(request);
            this.deleteUserModel = request.deleteUserModel;
        } 

        /**
         * DeleteUserModel.
         */
        public Builder deleteUserModel(String deleteUserModel) {
            this.putQueryParameter("DeleteUserModel", deleteUserModel);
            this.deleteUserModel = deleteUserModel;
            return this;
        }

        @Override
        public DeleteDataLevelPermissionRuleUsersRequest build() {
            return new DeleteDataLevelPermissionRuleUsersRequest(this);
        } 

    } 

}
