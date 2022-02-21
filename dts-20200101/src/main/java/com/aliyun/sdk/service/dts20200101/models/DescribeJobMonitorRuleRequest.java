// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobMonitorRuleRequest</p>
 */
public class DescribeJobMonitorRuleRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeJobMonitorRuleRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMonitorRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeJobMonitorRuleRequest, Builder> {
        private String dtsJobId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobMonitorRuleRequest response) {
            super(response);
            this.dtsJobId = response.dtsJobId;
            this.regionId = response.regionId;
        } 

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
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
        public DescribeJobMonitorRuleRequest build() {
            return new DescribeJobMonitorRuleRequest(this);
        } 

    } 

}
