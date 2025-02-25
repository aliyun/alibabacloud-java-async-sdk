// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthRequest} extends {@link RequestModel}
 *
 * <p>ListAuthRequest</p>
 */
public class ListAuthRequest extends Request {
    @Query
    @NameInMap("UserId")
    private String userId;

    private ListAuthRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthRequest create() {
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

    public static final class Builder extends Request.Builder<ListAuthRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListAuthRequest build() {
            return new ListAuthRequest(this);
        } 

    } 

}
