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
 * {@link RemoveInstanceSDGRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstanceSDGRequest</p>
 */
public class RemoveInstanceSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    private RemoveInstanceSDGRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstanceSDGRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveInstanceSDGRequest, Builder> {
        private java.util.List<String> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstanceSDGRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public RemoveInstanceSDGRequest build() {
            return new RemoveInstanceSDGRequest(this);
        } 

    } 

}
