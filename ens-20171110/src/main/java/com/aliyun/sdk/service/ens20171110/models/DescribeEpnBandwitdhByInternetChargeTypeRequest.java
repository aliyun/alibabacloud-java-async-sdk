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
 * {@link DescribeEpnBandwitdhByInternetChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnBandwitdhByInternetChargeTypeRequest</p>
 */
public class DescribeEpnBandwitdhByInternetChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkingModel")
    private String networkingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeEpnBandwitdhByInternetChargeTypeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.networkingModel = builder.networkingModel;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnBandwitdhByInternetChargeTypeRequest create() {
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
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return networkingModel
     */
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEpnBandwitdhByInternetChargeTypeRequest, Builder> {
        private String endTime; 
        private String ensRegionId; 
        private String isp; 
        private String networkingModel; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnBandwitdhByInternetChargeTypeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ensRegionId = request.ensRegionId;
            this.isp = request.isp;
            this.networkingModel = request.networkingModel;
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
         * <p>2021-12-06T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-changsha-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
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
         * <p>telecom</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The networking mode. Valid values:</p>
         * <ul>
         * <li><strong>SpeedUp</strong>: intelligent acceleration network (Internet)</li>
         * <li><strong>Connection</strong>: internal network</li>
         * <li><strong>SpeedUpAndConnection</strong>: intelligent acceleration network and internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connection</p>
         */
        public Builder networkingModel(String networkingModel) {
            this.putQueryParameter("NetworkingModel", networkingModel);
            this.networkingModel = networkingModel;
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
         * <p>2021-12-02T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEpnBandwitdhByInternetChargeTypeRequest build() {
            return new DescribeEpnBandwitdhByInternetChargeTypeRequest(this);
        } 

    } 

}
