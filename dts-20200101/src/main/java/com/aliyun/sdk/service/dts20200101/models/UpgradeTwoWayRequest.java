// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeTwoWayRequest} extends {@link RequestModel}
 *
 * <p>UpgradeTwoWayRequest</p>
 */
public class UpgradeTwoWayRequest extends Request {
    @Query
    @NameInMap("InstanceClass")
    @Validation(required = true)
    private String instanceClass;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpgradeTwoWayRequest(Builder builder) {
        super(builder);
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeTwoWayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpgradeTwoWayRequest, Builder> {
        private String instanceClass; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeTwoWayRequest request) {
            super(request);
            this.instanceClass = request.instanceClass;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The instance class of the two-way synchronization task. Valid values: **large**, **medium**, **micro**, and **small**.
         * <p>
         * 
         * >  For more information, see [Specifications of data synchronization instances](~~26605~~).
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The ID of the data synchronization instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpgradeTwoWayRequest build() {
            return new UpgradeTwoWayRequest(this);
        } 

    } 

}
