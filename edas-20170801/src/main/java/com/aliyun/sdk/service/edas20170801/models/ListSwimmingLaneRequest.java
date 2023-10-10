// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>ListSwimmingLaneRequest</p>
 */
public class ListSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    private ListSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<ListSwimmingLaneRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(ListSwimmingLaneRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * The ID of the lane group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public ListSwimmingLaneRequest build() {
            return new ListSwimmingLaneRequest(this);
        } 

    } 

}
