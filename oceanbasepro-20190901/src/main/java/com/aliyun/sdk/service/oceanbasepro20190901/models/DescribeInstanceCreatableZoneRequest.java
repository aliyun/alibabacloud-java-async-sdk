// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceCreatableZoneRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceCreatableZoneRequest</p>
 */
public class DescribeInstanceCreatableZoneRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeInstanceCreatableZoneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceCreatableZoneRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceCreatableZoneRequest, Builder> {
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceCreatableZoneRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeInstanceCreatableZoneRequest build() {
            return new DescribeInstanceCreatableZoneRequest(this);
        } 

    } 

}
