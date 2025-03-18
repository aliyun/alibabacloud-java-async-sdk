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
 * {@link UnassociateHaVipRequest} extends {@link RequestModel}
 *
 * <p>UnassociateHaVipRequest</p>
 */
public class UnassociateHaVipRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haVipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UnassociateHaVipRequest(Builder builder) {
        super(builder);
        this.haVipId = builder.haVipId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateHaVipRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UnassociateHaVipRequest, Builder> {
        private String haVipId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateHaVipRequest request) {
            super(request);
            this.haVipId = request.haVipId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the HAVIP that you want to disassociate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-5p14t****</p>
         */
        public Builder haVipId(String haVipId) {
            this.putQueryParameter("HaVipId", haVipId);
            this.haVipId = haVipId;
            return this;
        }

        /**
         * <p>The ID of the ENS instance or ENI that you want to disassociate from the HAVIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5ecpqvk****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UnassociateHaVipRequest build() {
            return new UnassociateHaVipRequest(this);
        } 

    } 

}
