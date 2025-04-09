// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListSchedulerInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListSchedulerInstancesRequest</p>
 */
public class ListSchedulerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    private ListSchedulerInstancesRequest(Builder builder) {
        super(builder);
        this.instanceOwnerId = builder.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulerInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListSchedulerInstancesRequest, Builder> {
        private Long instanceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListSchedulerInstancesRequest request) {
            super(request);
            this.instanceOwnerId = request.instanceOwnerId;
        } 

        /**
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        @Override
        public ListSchedulerInstancesRequest build() {
            return new ListSchedulerInstancesRequest(this);
        } 

    } 

}
