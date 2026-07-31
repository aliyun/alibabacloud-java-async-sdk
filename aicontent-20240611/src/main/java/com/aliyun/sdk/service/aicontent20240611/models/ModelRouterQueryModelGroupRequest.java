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
 * {@link ModelRouterQueryModelGroupRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryModelGroupRequest</p>
 */
public class ModelRouterQueryModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    private ModelRouterQueryModelGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryModelGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ModelRouterQueryModelGroupRequest, Builder> {
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryModelGroupRequest request) {
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
        public ModelRouterQueryModelGroupRequest build() {
            return new ModelRouterQueryModelGroupRequest(this);
        } 

    } 

}
