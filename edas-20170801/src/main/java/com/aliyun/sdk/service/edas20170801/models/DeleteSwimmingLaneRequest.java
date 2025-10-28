// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DeleteSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimmingLaneRequest</p>
 */
public class DeleteSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the lane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>241</p>
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
