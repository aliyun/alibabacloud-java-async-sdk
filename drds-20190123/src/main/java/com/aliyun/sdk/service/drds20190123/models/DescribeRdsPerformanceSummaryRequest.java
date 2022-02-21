// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsPerformanceSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsPerformanceSummaryRequest</p>
 */
public class DescribeRdsPerformanceSummaryRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RdsInstanceId")
    @Validation(required = true)
    private java.util.List < String > rdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeRdsPerformanceSummaryRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.rdsInstanceId = builder.rdsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsPerformanceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return rdsInstanceId
     */
    public java.util.List < String > getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRdsPerformanceSummaryRequest, Builder> {
        private String drdsInstanceId; 
        private java.util.List < String > rdsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsPerformanceSummaryRequest response) {
            super(response);
            this.drdsInstanceId = response.drdsInstanceId;
            this.rdsInstanceId = response.rdsInstanceId;
            this.regionId = response.regionId;
        } 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * RdsInstanceId.
         */
        public Builder rdsInstanceId(java.util.List < String > rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
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
        public DescribeRdsPerformanceSummaryRequest build() {
            return new DescribeRdsPerformanceSummaryRequest(this);
        } 

    } 

}
