// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeRTSNativeSDKFirstFrameDelayRequest} extends {@link RequestModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameDelayRequest</p>
 */
public class DescribeRTSNativeSDKFirstFrameDelayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameList")
    private java.util.List<String> domainNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKFirstFrameDelayRequest(Builder builder) {
        super(builder);
        this.dataInterval = builder.dataInterval;
        this.domainNameList = builder.domainNameList;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKFirstFrameDelayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainNameList
     */
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRTSNativeSDKFirstFrameDelayRequest, Builder> {
        private String dataInterval; 
        private java.util.List<String> domainNameList; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRTSNativeSDKFirstFrameDelayRequest request) {
            super(request);
            this.dataInterval = request.dataInterval;
            this.domainNameList = request.domainNameList;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The time granularity. Valid values: 300, 3600, 14400, 28800, and 86400. Unit: seconds. The default value is 300. If you specify an invalid value or do not specify this parameter, the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.putQueryParameter("DataInterval", dataInterval);
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>From V2.1.0, all domain names are queried by default. You can also specify specific domain names that you want to query. In this case, separate the domain names with commas (,). You can specify up to 500 domain names in each call.</p>
         */
        public Builder domainNameList(java.util.List<String> domainNameList) {
            String domainNameListShrink = shrink(domainNameList, "DomainNameList", "json");
            this.putQueryParameter("DomainNameList", domainNameListShrink);
            this.domainNameList = domainNameList;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRTSNativeSDKFirstFrameDelayRequest build() {
            return new DescribeRTSNativeSDKFirstFrameDelayRequest(this);
        } 

    } 

}
