// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryLoopStatusRequest</p>
 */
public class QueryLoopStatusRequest extends Request {
    @Query
    @NameInMap("LoopId")
    @Validation(required = true)
    private Long loopId;

    private QueryLoopStatusRequest(Builder builder) {
        super(builder);
        this.loopId = builder.loopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLoopStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loopId
     */
    public Long getLoopId() {
        return this.loopId;
    }

    public static final class Builder extends Request.Builder<QueryLoopStatusRequest, Builder> {
        private Long loopId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLoopStatusRequest response) {
            super(response);
            this.loopId = response.loopId;
        } 

        /**
         * LoopId.
         */
        public Builder loopId(Long loopId) {
            this.putQueryParameter("LoopId", loopId);
            this.loopId = loopId;
            return this;
        }

        @Override
        public QueryLoopStatusRequest build() {
            return new QueryLoopStatusRequest(this);
        } 

    } 

}
