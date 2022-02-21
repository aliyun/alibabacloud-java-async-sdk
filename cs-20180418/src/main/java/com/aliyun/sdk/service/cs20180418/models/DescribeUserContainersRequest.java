// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserContainersRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserContainersRequest</p>
 */
public class DescribeUserContainersRequest extends Request {
    @Path
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    private DescribeUserContainersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserContainersRequest create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DescribeUserContainersRequest, Builder> {
        private String regionId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserContainersRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.serviceId = response.serviceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putPathParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DescribeUserContainersRequest build() {
            return new DescribeUserContainersRequest(this);
        } 

    } 

}
