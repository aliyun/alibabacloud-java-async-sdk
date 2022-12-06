// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectionalGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDirectionalGroupRequest</p>
 */
public class DeleteDirectionalGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private DeleteDirectionalGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDirectionalGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDirectionalGroupRequest, Builder> {
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDirectionalGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteDirectionalGroupRequest build() {
            return new DeleteDirectionalGroupRequest(this);
        } 

    } 

}
