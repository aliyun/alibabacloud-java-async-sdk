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
 * {@link DeleteServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceGroupRequest</p>
 */
public class DeleteServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the service group that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>789d9cda-74b1-<strong><strong>-</strong></strong>-05e21a0a7661</p>
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
