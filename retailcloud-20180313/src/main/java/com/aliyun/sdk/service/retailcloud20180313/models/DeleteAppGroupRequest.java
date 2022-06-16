// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppGroupRequest</p>
 */
public class DeleteAppGroupRequest extends Request {
    @Query
    @NameInMap("Force")
    @Validation(required = true)
    private Boolean force;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    private DeleteAppGroupRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<DeleteAppGroupRequest, Builder> {
        private Boolean force; 
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppGroupRequest request) {
            super(request);
            this.force = request.force;
            this.groupId = request.groupId;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteAppGroupRequest build() {
            return new DeleteAppGroupRequest(this);
        } 

    } 

}
