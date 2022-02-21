// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbscInstanceStatusRequest</p>
 */
public class DescribeDbscInstanceStatusRequest extends Request {
    @Query
    @NameInMap("DbscId")
    @Validation(required = true)
    private String dbscId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDbscInstanceStatusRequest(Builder builder) {
        super(builder);
        this.dbscId = builder.dbscId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbscInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDbscInstanceStatusRequest, Builder> {
        private String dbscId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDbscInstanceStatusRequest response) {
            super(response);
            this.dbscId = response.dbscId;
            this.regionId = response.regionId;
        } 

        /**
         * DbscId.
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDbscInstanceStatusRequest build() {
            return new DescribeDbscInstanceStatusRequest(this);
        } 

    } 

}
