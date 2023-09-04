// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSerivceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListUserSerivceGroupsRequest</p>
 */
public class ListUserSerivceGroupsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("userId")
    @Validation(required = true)
    private Long userId;

    private ListUserSerivceGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSerivceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListUserSerivceGroupsRequest, Builder> {
        private String clientToken; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserSerivceGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.userId = request.userId;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListUserSerivceGroupsRequest build() {
            return new ListUserSerivceGroupsRequest(this);
        } 

    } 

}
