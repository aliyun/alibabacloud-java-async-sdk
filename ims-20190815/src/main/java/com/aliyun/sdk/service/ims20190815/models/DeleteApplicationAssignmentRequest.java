// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeleteApplicationAssignmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationAssignmentRequest</p>
 */
public class DeleteApplicationAssignmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalType;

    private DeleteApplicationAssignmentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.principalName = builder.principalName;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationAssignmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return principalName
     */
    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationAssignmentRequest, Builder> {
        private String appId; 
        private String principalName; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationAssignmentRequest request) {
            super(request);
            this.appId = request.appId;
            this.principalName = request.principalName;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>472457090344041****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The user principal name or role name.</p>
         * <ul>
         * <li>User principal name: The format is <code>&lt;username&gt;@&lt;account-id&gt;.onaliyun.com</code>. You can query it by calling the <code>GetUser</code> or <code>ListUsers</code> API operation.</li>
         * <li>Role name: You can query it by calling the <code>ListRoles</code> API operation of RAM.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.onaliyun.com">user@example.onaliyun.com</a></p>
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * <p>The type of the target principal for the application assignment. Valid values:</p>
         * <ul>
         * <li>user: The principal is a RAM user. In this case, PrincipalName must be a user principal name.</li>
         * <li>role: The principal is a RAM role. In this case, PrincipalName must be a role name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public DeleteApplicationAssignmentRequest build() {
            return new DeleteApplicationAssignmentRequest(this);
        } 

    } 

}
