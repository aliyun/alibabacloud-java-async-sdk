// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserMFAInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserMFAInfoRequest</p>
 */
public class GetUserMFAInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private GetUserMFAInfoRequest(Builder builder) {
        super(builder);
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMFAInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<GetUserMFAInfoRequest, Builder> {
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserMFAInfoRequest request) {
            super(request);
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * The logon name of the RAM user. This parameter is differently set in the following scenarios:
         * <p>
         * 
         * *   If you use a RAM user to call this operation, this parameter can be left empty. If you do not specify this parameter, the information of the MFA device that is bound to the RAM user is queried.
         * *   If you use an Alibaba Cloud account to call this operation, you must set this parameter to the logon name of the RAM user that you want to query.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public GetUserMFAInfoRequest build() {
            return new GetUserMFAInfoRequest(this);
        } 

    } 

}
