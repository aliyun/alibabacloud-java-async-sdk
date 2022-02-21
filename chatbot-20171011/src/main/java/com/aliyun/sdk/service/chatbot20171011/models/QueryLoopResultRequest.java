// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopResultRequest} extends {@link RequestModel}
 *
 * <p>QueryLoopResultRequest</p>
 */
public class QueryLoopResultRequest extends Request {
    @Query
    @NameInMap("LoopId")
    @Validation(required = true)
    private Long loopId;

    private QueryLoopResultRequest(Builder builder) {
        super(builder);
        this.loopId = builder.loopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLoopResultRequest create() {
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

    public static final class Builder extends Request.Builder<QueryLoopResultRequest, Builder> {
        private Long loopId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLoopResultRequest response) {
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
        public QueryLoopResultRequest build() {
            return new QueryLoopResultRequest(this);
        } 

    } 

}
