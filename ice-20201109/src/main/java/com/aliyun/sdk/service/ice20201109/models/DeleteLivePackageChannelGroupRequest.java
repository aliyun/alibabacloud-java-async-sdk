// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteLivePackageChannelGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteLivePackageChannelGroupRequest</p>
 */
public class DeleteLivePackageChannelGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private DeleteLivePackageChannelGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLivePackageChannelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<DeleteLivePackageChannelGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLivePackageChannelGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * <p>The channel group name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public DeleteLivePackageChannelGroupRequest build() {
            return new DeleteLivePackageChannelGroupRequest(this);
        } 

    } 

}
