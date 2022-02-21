// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventOperationsRequest</p>
 */
public class DescribeSecurityEventOperationsRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityEventId")
    @Validation(required = true)
    private Long securityEventId;

    private DescribeSecurityEventOperationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.securityEventId = builder.securityEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationsRequest create() {
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
     * @return securityEventId
     */
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventOperationsRequest, Builder> {
        private String regionId; 
        private Long securityEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventOperationsRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.securityEventId = response.securityEventId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityEventId.
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public DescribeSecurityEventOperationsRequest build() {
            return new DescribeSecurityEventOperationsRequest(this);
        } 

    } 

}
