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
         * <p>频道组描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>代表资源一级ID的资源属性字段</p>
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
