// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupRequest</p>
 */
public class DeleteMonitorGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    private DeleteMonitorGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMonitorGroupRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteMonitorGroupRequest build() {
            return new DeleteMonitorGroupRequest(this);
        } 

    } 

}
