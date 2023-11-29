// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableSpecRequest</p>
 */
public class DescribeAvailableSpecRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Spec")
    private String spec;

    @Body
    @NameInMap("UpgradeType")
    @Validation(required = true)
    private String upgradeType;

    private DescribeAvailableSpecRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.spec = builder.spec;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableSpecRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableSpecRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String spec; 
        private String upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableSpecRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.spec = request.spec;
            this.upgradeType = request.upgradeType;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * UpgradeType.
         */
        public Builder upgradeType(String upgradeType) {
            this.putBodyParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public DescribeAvailableSpecRequest build() {
            return new DescribeAvailableSpecRequest(this);
        } 

    } 

}
