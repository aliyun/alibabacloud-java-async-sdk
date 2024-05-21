// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WithdrawAllUserGroupsRequest} extends {@link RequestModel}
 *
 * <p>WithdrawAllUserGroupsRequest</p>
 */
public class WithdrawAllUserGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private WithdrawAllUserGroupsRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawAllUserGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<WithdrawAllUserGroupsRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(WithdrawAllUserGroupsRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * The ID of the user. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public WithdrawAllUserGroupsRequest build() {
            return new WithdrawAllUserGroupsRequest(this);
        } 

    } 

}
