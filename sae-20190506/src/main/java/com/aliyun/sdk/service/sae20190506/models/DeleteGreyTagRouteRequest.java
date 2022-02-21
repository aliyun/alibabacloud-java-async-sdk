// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteGreyTagRouteRequest</p>
 */
public class DeleteGreyTagRouteRequest extends Request {
    @Query
    @NameInMap("GreyTagRouteId")
    @Validation(required = true)
    private Long greyTagRouteId;

    private DeleteGreyTagRouteRequest(Builder builder) {
        super(builder);
        this.greyTagRouteId = builder.greyTagRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGreyTagRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return greyTagRouteId
     */
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

    public static final class Builder extends Request.Builder<DeleteGreyTagRouteRequest, Builder> {
        private Long greyTagRouteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGreyTagRouteRequest response) {
            super(response);
            this.greyTagRouteId = response.greyTagRouteId;
        } 

        /**
         * 规则ID
         */
        public Builder greyTagRouteId(Long greyTagRouteId) {
            this.putQueryParameter("GreyTagRouteId", greyTagRouteId);
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }

        @Override
        public DeleteGreyTagRouteRequest build() {
            return new DeleteGreyTagRouteRequest(this);
        } 

    } 

}
