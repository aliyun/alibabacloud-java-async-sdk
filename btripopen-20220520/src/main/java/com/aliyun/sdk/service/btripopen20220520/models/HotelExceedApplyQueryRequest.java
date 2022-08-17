// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>HotelExceedApplyQueryRequest</p>
 */
public class HotelExceedApplyQueryRequest extends Request {
    @Query
    @NameInMap("apply_id")
    @Validation(required = true)
    private Long applyId;

    private HotelExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelExceedApplyQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    public static final class Builder extends Request.Builder<HotelExceedApplyQueryRequest, Builder> {
        private Long applyId; 

        private Builder() {
            super();
        } 

        private Builder(HotelExceedApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        @Override
        public HotelExceedApplyQueryRequest build() {
            return new HotelExceedApplyQueryRequest(this);
        } 

    } 

}
