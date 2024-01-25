// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComputeResultRequest} extends {@link RequestModel}
 *
 * <p>GetComputeResultRequest</p>
 */
public class GetComputeResultRequest extends Request {
    @Query
    @NameInMap("bcId")
    private Long bcId;

    private GetComputeResultRequest(Builder builder) {
        super(builder);
        this.bcId = builder.bcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetComputeResultRequest, Builder> {
        private Long bcId; 

        private Builder() {
            super();
        } 

        private Builder(GetComputeResultRequest request) {
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
        public GetComputeResultRequest build() {
            return new GetComputeResultRequest(this);
        } 

    } 

}
