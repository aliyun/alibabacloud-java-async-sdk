// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DeleteGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteGreyTagRouteRequest</p>
 */
public class DeleteGreyTagRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GreyTagRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteGreyTagRouteRequest request) {
            super(request);
            this.greyTagRouteId = request.greyTagRouteId;
        } 

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
