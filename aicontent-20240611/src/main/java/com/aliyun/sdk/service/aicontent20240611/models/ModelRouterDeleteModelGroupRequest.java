// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterDeleteModelGroupRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterDeleteModelGroupRequest</p>
 */
public class ModelRouterDeleteModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    private ModelRouterDeleteModelGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterDeleteModelGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ModelRouterDeleteModelGroupRequest, Builder> {
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterDeleteModelGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public ModelRouterDeleteModelGroupRequest build() {
            return new ModelRouterDeleteModelGroupRequest(this);
        } 

    } 

}
