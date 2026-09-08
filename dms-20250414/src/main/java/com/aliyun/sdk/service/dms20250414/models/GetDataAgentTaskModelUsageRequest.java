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
 * {@link GetDataAgentTaskModelUsageRequest} extends {@link RequestModel}
 *
 * <p>GetDataAgentTaskModelUsageRequest</p>
 */
public class GetDataAgentTaskModelUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayLevel")
    private String payLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetDataAgentTaskModelUsageRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.DMSUnit = builder.DMSUnit;
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.payLevel = builder.payLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentTaskModelUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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

    public static final class Builder extends Request.Builder<GetDataAgentTaskModelUsageRequest, Builder> {
        private Long beginTime; 
        private String DMSUnit; 
        private Long endTime; 
        private java.util.List<String> instanceIds; 
        private String payLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAgentTaskModelUsageRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.DMSUnit = request.DMSUnit;
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.payLevel = request.payLevel;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The start time of the query time range. The value is a UNIX timestamp in seconds. The recommended interval length is no longer than one month.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The current Data Management unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The end time of the query time range. The value is a UNIX timestamp in seconds. The recommended interval length is no longer than one month.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDataAgentTaskModelUsageRequest build() {
            return new GetDataAgentTaskModelUsageRequest(this);
        } 

    } 

}
