// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForUserRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesForUserRequest</p>
 */
public class ListPoliciesForUserRequest extends Request {
    @Query
    @NameInMap("UserName")
    private String userName;

    private ListPoliciesForUserRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListPoliciesForUserRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesForUserRequest response) {
            super(response);
            this.userName = response.userName;
        } 

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListPoliciesForUserRequest build() {
            return new ListPoliciesForUserRequest(this);
        } 

    } 

}
