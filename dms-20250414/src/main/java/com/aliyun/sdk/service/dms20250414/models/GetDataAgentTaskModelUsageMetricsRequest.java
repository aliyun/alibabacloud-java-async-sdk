// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentTaskModelUsageMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetDataAgentTaskModelUsageMetricsRequest</p>
 */
public class GetDataAgentTaskModelUsageMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private String beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayLevel")
    private String payLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetDataAgentTaskModelUsageMetricsRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.DMSUnit = builder.DMSUnit;
        this.endTime = builder.endTime;
        this.payLevel = builder.payLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentTaskModelUsageMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return payLevel
     */
    public String getPayLevel() {
        return this.payLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDataAgentTaskModelUsageMetricsRequest, Builder> {
        private String beginTime; 
        private String DMSUnit; 
        private String endTime; 
        private String payLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAgentTaskModelUsageMetricsRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.DMSUnit = request.DMSUnit;
            this.endTime = request.endTime;
            this.payLevel = request.payLevel;
            this.regionId = request.regionId;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PayLevel.
         */
        public Builder payLevel(String payLevel) {
            this.putQueryParameter("PayLevel", payLevel);
            this.payLevel = payLevel;
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
        public GetDataAgentTaskModelUsageMetricsRequest build() {
            return new GetDataAgentTaskModelUsageMetricsRequest(this);
        } 

    } 

}
