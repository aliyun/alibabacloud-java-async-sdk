// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * HaVipId.
         */
        public Builder haVipId(String haVipId) {
            this.putQueryParameter("HaVipId", haVipId);
            this.haVipId = haVipId;
            return this;
        }

        /**
         * InstanceId.
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
