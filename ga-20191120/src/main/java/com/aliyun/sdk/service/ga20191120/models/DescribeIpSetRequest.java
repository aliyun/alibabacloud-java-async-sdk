// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpSetRequest</p>
 */
public class DescribeIpSetRequest extends Request {
    @Query
    @NameInMap("IpSetId")
    @Validation(required = true)
    private String ipSetId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeIpSetRequest(Builder builder) {
        super(builder);
        this.ipSetId = builder.ipSetId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeIpSetRequest, Builder> {
        private String ipSetId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpSetRequest request) {
            super(request);
            this.ipSetId = request.ipSetId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the acceleration region.
         * <p>
         * 
         * You can call the [ListIpSets](~~2253273~~) operation to query the IDs of acceleration regions of a specific GA instance.
         */
        public Builder ipSetId(String ipSetId) {
            this.putQueryParameter("IpSetId", ipSetId);
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeIpSetRequest build() {
            return new DescribeIpSetRequest(this);
        } 

    } 

}
