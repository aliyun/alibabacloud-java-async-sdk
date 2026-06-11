// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link DescribeZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeZonesRequest</p>
 */
public class DescribeZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRegion")
    private Boolean crossRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRegionSide")
    private String crossRegionSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceResourceType")
    private String serviceResourceType;

    private DescribeZonesRequest(Builder builder) {
        super(builder);
        this.crossRegion = builder.crossRegion;
        this.crossRegionSide = builder.crossRegionSide;
        this.regionId = builder.regionId;
        this.serviceResourceType = builder.serviceResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossRegion
     */
    public Boolean getCrossRegion() {
        return this.crossRegion;
    }

    /**
     * @return crossRegionSide
     */
    public String getCrossRegionSide() {
        return this.crossRegionSide;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceResourceType
     */
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    public static final class Builder extends Request.Builder<DescribeZonesRequest, Builder> {
        private Boolean crossRegion; 
        private String crossRegionSide; 
        private String regionId; 
        private String serviceResourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZonesRequest request) {
            super(request);
            this.crossRegion = request.crossRegion;
            this.crossRegionSide = request.crossRegionSide;
            this.regionId = request.regionId;
            this.serviceResourceType = request.serviceResourceType;
        } 

        /**
         * CrossRegion.
         */
        public Builder crossRegion(Boolean crossRegion) {
            this.putQueryParameter("CrossRegion", crossRegion);
            this.crossRegion = crossRegion;
            return this;
        }

        /**
         * CrossRegionSide.
         */
        public Builder crossRegionSide(String crossRegionSide) {
            this.putQueryParameter("CrossRegionSide", crossRegionSide);
            this.crossRegionSide = crossRegionSide;
            return this;
        }

        /**
         * <p>The region ID of the zone. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceResourceType.
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        @Override
        public DescribeZonesRequest build() {
            return new DescribeZonesRequest(this);
        } 

    } 

}
