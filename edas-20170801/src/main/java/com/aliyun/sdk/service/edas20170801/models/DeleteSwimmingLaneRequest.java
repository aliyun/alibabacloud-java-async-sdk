// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimmingLaneRequest</p>
 */
public class DeleteSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("LaneId")
    @Validation(required = true)
    private Long laneId;

    private DeleteSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.laneId = builder.laneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimmingLaneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    public static final class Builder extends Request.Builder<DeleteSwimmingLaneRequest, Builder> {
        private Long laneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimmingLaneRequest request) {
            super(request);
            this.laneId = request.laneId;
        } 

        /**
         * The ID of the lane.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        @Override
        public DeleteSwimmingLaneRequest build() {
            return new DeleteSwimmingLaneRequest(this);
        } 

    } 

}
