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
 * {@link GetAccessKeyPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyPolicyRequest</p>
 */
public class GetAccessKeyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private GetAccessKeyPolicyRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyPolicyRequest, Builder> {
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyPolicyRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI*******************</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public GetAccessKeyPolicyRequest build() {
            return new GetAccessKeyPolicyRequest(this);
        } 

    } 

}
