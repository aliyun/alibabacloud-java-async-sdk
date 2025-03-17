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
 * {@link AddDataLevelPermissionRuleUsersRequest} extends {@link RequestModel}
 *
 * <p>AddDataLevelPermissionRuleUsersRequest</p>
 */
public class AddDataLevelPermissionRuleUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddUserModel")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;addModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
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
