// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelYydTaskByBcIdRequest} extends {@link RequestModel}
 *
 * <p>CancelYydTaskByBcIdRequest</p>
 */
public class CancelYydTaskByBcIdRequest extends Request {
    @Query
    @NameInMap("bcId")
    @Validation(required = true)
    private Long bcId;

    private CancelYydTaskByBcIdRequest(Builder builder) {
        super(builder);
        this.bcId = builder.bcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelYydTaskByBcIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bcId
     */
    public Long getBcId() {
        return this.bcId;
    }

    public static final class Builder extends Request.Builder<CancelYydTaskByBcIdRequest, Builder> {
        private Long bcId; 

        private Builder() {
            super();
        } 

        private Builder(CancelYydTaskByBcIdRequest request) {
            super(request);
            this.bcId = request.bcId;
        } 

        /**
         * bcId.
         */
        public Builder bcId(Long bcId) {
            this.putQueryParameter("bcId", bcId);
            this.bcId = bcId;
            return this;
        }

        @Override
        public CancelYydTaskByBcIdRequest build() {
            return new CancelYydTaskByBcIdRequest(this);
        } 

    } 

}
