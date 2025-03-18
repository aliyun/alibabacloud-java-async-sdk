// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeUserBandWidthDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBandWidthDataRequest</p>
 */
public class DescribeUserBandWidthDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeUserBandWidthDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.instanceId = builder.instanceId;
        this.isp = builder.isp;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBandWidthDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeUserBandWidthDataRequest, Builder> {
        private String endTime; 
        private String ensRegionId; 
        private String instanceId; 
        private String isp; 
        private String period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBandWidthDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ensRegionId = request.ensRegionId;
            this.instanceId = request.instanceId;
            this.isp = request.isp;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query.</p>
         * <ul>
         * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
         * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-21T12:22:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the node. You can specify only one node ID. By default, all nodes are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-taiyuan-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the instance for which you want to query the data. You can specify only one instance ID. By default, all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5inkeimcipxk26yqtzm4q****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Internet service provider (ISP). Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile</li>
         * <li>telecom: China Telecom</li>
         * <li>unicom: China Unicom</li>
         * <li>multiCarrier: multi-line ISP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The precision of the monitoring data that you want to obtain. Valid values: 300, 1200, 3600, and 14400. Default value: 300. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <ul>
         * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
         * <li>If the value of the seconds place is not 00, the start time is automatically set to the next minute.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-21T10:22:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeUserBandWidthDataRequest build() {
            return new DescribeUserBandWidthDataRequest(this);
        } 

    } 

}
