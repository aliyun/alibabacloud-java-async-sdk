// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMtConnectorRequest} extends {@link RequestModel}
 *
 * <p>ListMtConnectorRequest</p>
 */
public class ListMtConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private ListMtConnectorRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMtConnectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListMtConnectorRequest, Builder> {
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListMtConnectorRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListMtConnectorRequest build() {
            return new ListMtConnectorRequest(this);
        } 

    } 

}
