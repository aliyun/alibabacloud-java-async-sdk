// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeRatePlanInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeRatePlanInstanceStatusRequest</p>
 */
public class DescribeRatePlanInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private Long resourceOwner;

    private DescribeRatePlanInstanceStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceOwner = builder.resourceOwner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanInstanceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceOwner
     */
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    public static final class Builder extends Request.Builder<DescribeRatePlanInstanceStatusRequest, Builder> {
        private String instanceId; 
        private Long resourceOwner; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRatePlanInstanceStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceOwner = request.resourceOwner;
        } 

        /**
         * <p>The instance ID, which can be obtained by calling the <a href="~~ListUserRatePlanInstances~~">ListUserRatePlanInstances</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>xcdn-91fknmb80f0g***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceOwner.
         */
        public Builder resourceOwner(Long resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        @Override
        public DescribeRatePlanInstanceStatusRequest build() {
            return new DescribeRatePlanInstanceStatusRequest(this);
        } 

    } 

}
