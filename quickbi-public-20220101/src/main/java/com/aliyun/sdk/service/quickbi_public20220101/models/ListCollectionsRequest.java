// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCollectionsRequest} extends {@link RequestModel}
 *
 * <p>ListCollectionsRequest</p>
 */
public class ListCollectionsRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListCollectionsRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListCollectionsRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListCollectionsRequest request) {
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
        public ListCollectionsRequest build() {
            return new ListCollectionsRequest(this);
        } 

    } 

}
