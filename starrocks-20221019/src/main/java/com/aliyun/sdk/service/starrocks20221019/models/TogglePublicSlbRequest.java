// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link TogglePublicSlbRequest} extends {@link RequestModel}
 *
 * <p>TogglePublicSlbRequest</p>
 */
public class TogglePublicSlbRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePublicSlb")
    private Boolean enablePublicSlb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private TogglePublicSlbRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enablePublicSlb = builder.enablePublicSlb;
        this.gatewayId = builder.gatewayId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TogglePublicSlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return enablePublicSlb
     */
    public Boolean getEnablePublicSlb() {
        return this.enablePublicSlb;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<TogglePublicSlbRequest, Builder> {
        private String regionId; 
        private Boolean enablePublicSlb; 
        private String gatewayId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(TogglePublicSlbRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enablePublicSlb = request.enablePublicSlb;
            this.gatewayId = request.gatewayId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EnablePublicSlb.
         */
        public Builder enablePublicSlb(Boolean enablePublicSlb) {
            this.putQueryParameter("EnablePublicSlb", enablePublicSlb);
            this.enablePublicSlb = enablePublicSlb;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
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
        public TogglePublicSlbRequest build() {
            return new TogglePublicSlbRequest(this);
        } 

    } 

}
