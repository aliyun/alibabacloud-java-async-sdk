// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RemoveSDGRequest} extends {@link RequestModel}
 *
 * <p>RemoveSDGRequest</p>
 */
public class RemoveSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    private RemoveSDGRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<RemoveSDGRequest, Builder> {
        private java.util.List<String> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSDGRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>IDs of Android in Container (AIC) instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public RemoveSDGRequest build() {
            return new RemoveSDGRequest(this);
        } 

    } 

}
