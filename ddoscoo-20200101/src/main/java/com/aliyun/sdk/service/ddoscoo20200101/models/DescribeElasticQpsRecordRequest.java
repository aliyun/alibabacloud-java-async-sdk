// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeElasticQpsRecordRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticQpsRecordRequest</p>
 */
public class DescribeElasticQpsRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeElasticQpsRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.ip = builder.ip;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticQpsRecordRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeElasticQpsRecordRequest, Builder> {
        private String regionId; 
        private Long endTime; 
        private String ip; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticQpsRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.ip = request.ip;
            this.startTime = request.startTime;
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
         * <p>The end of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1688140799999</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The IP address of the Anti-DDoS Proxy instance to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeElasticQpsRecordRequest build() {
            return new DescribeElasticQpsRecordRequest(this);
        } 

    } 

}
