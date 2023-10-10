// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceGroupRequest</p>
 */
public class DeleteServiceGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private DeleteServiceGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceGroupRequest, Builder> {
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * The ID of the service group that you want to delete.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteServiceGroupRequest build() {
            return new DeleteServiceGroupRequest(this);
        } 

    } 

}
