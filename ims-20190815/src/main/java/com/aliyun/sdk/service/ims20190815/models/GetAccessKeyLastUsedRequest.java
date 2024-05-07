// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedRequest</p>
 */
public class GetAccessKeyLastUsedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private GetAccessKeyLastUsedRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedRequest create() {
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

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedRequest, Builder> {
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * The ID of the AccessKey pair that you want to query.
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * The logon name of the RAM user.
         * <p>
         * 
         * If you do not specify this parameter, the AccessKey pair of the current user is queried.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedRequest build() {
            return new GetAccessKeyLastUsedRequest(this);
        } 

    } 

}
