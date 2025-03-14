// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAndroidInstanceGroupRequest</p>
 */
public class DeleteAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    private DeleteAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.instanceGroupIds = builder.instanceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAndroidInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public static final class Builder extends Request.Builder<DeleteAndroidInstanceGroupRequest, Builder> {
        private java.util.List<String> instanceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAndroidInstanceGroupRequest request) {
            super(request);
            this.instanceGroupIds = request.instanceGroupIds;
        } 

        /**
         * <p>The IDs of the instance groups.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.putQueryParameter("InstanceGroupIds", instanceGroupIds);
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        @Override
        public DeleteAndroidInstanceGroupRequest build() {
            return new DeleteAndroidInstanceGroupRequest(this);
        } 

    } 

}
