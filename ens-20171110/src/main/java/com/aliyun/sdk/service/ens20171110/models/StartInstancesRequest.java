// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstancesRequest} extends {@link RequestModel}
 *
 * <p>StartInstancesRequest</p>
 */
public class StartInstancesRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private StartInstancesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<StartInstancesRequest, Builder> {
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(StartInstancesRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "simple");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public StartInstancesRequest build() {
            return new StartInstancesRequest(this);
        } 

    } 

}
