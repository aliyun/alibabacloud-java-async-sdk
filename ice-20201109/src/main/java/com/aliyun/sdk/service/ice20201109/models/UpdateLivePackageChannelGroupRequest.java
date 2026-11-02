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
 * {@link UpdateLivePackageChannelGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePackageChannelGroupRequest</p>
 */
public class UpdateLivePackageChannelGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private UpdateLivePackageChannelGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageChannelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<UpdateLivePackageChannelGroupRequest, Builder> {
        private String description; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePackageChannelGroupRequest request) {
            super(request);
            this.description = request.description;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The description of the channel group. The description can be up to 1,000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a channel group</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the channel group. The name must be 1 to 200 characters in length and can contain only uppercase and lowercase letters, digits, hyphens, and underscores. Format: [A-Za-z0-9_-]+.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public UpdateLivePackageChannelGroupRequest build() {
            return new UpdateLivePackageChannelGroupRequest(this);
        } 

    } 

}
