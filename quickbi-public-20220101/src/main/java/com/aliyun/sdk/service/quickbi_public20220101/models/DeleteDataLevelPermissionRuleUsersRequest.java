// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDataLevelPermissionRuleUsersRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataLevelPermissionRuleUsersRequest</p>
 */
public class DeleteDataLevelPermissionRuleUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteUserModel")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;delModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
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
