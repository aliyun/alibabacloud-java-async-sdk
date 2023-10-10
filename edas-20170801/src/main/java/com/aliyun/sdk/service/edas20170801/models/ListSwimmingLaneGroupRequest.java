// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>ListSwimmingLaneGroupRequest</p>
 */
public class ListSwimmingLaneGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("LogicalRegionId")
    @Validation(required = true)
    private String logicalRegionId;

    private ListSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneGroupRequest create() {
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

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public static final class Builder extends Request.Builder<ListSwimmingLaneGroupRequest, Builder> {
        private Long groupId; 
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSwimmingLaneGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * The ID of the lane group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the namespace.
         * <p>
         * 
         * The ID of a custom namespace is in the region ID:namespace identifier format. Example: cn-beijing:test.\
         * The ID of the default namespace is in the region ID format. Example: cn-beijing.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public ListSwimmingLaneGroupRequest build() {
            return new ListSwimmingLaneGroupRequest(this);
        } 

    } 

}
