// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBootRequest} extends {@link RequestModel}
 *
 * <p>DescribeBootRequest</p>
 */
public class DescribeBootRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PropertyUuid")
    @Validation(required = true)
    private String propertyUuid;

    private DescribeBootRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.propertyUuid = builder.propertyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBootRequest create() {
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
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public static final class Builder extends Request.Builder<DescribeBootRequest, Builder> {
        private String regionId; 
        private String propertyUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBootRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.propertyUuid = request.propertyUuid;
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
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.putQueryParameter("PropertyUuid", propertyUuid);
            this.propertyUuid = propertyUuid;
            return this;
        }

        @Override
        public DescribeBootRequest build() {
            return new DescribeBootRequest(this);
        } 

    } 

}
