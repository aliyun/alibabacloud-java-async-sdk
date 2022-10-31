// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKVvDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeRTSNativeSDKVvDataRequest</p>
 */
public class DescribeRTSNativeSDKVvDataRequest extends Request {
    @Query
    @NameInMap("DataInterval")
    private String dataInterval;

    @Query
    @NameInMap("DomainNameList")
    private java.util.List < String > domainNameList;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKVvDataRequest(Builder builder) {
        super(builder);
        this.dataInterval = builder.dataInterval;
        this.domainNameList = builder.domainNameList;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKVvDataRequest create() {
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
    public java.util.List < String > getDomainNameList() {
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

    public static final class Builder extends Request.Builder<DescribeRTSNativeSDKVvDataRequest, Builder> {
        private String dataInterval; 
        private java.util.List < String > domainNameList; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRTSNativeSDKVvDataRequest request) {
            super(request);
            this.dataInterval = request.dataInterval;
            this.domainNameList = request.domainNameList;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.putQueryParameter("DataInterval", dataInterval);
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainNameList.
         */
        public Builder domainNameList(java.util.List < String > domainNameList) {
            String domainNameListShrink = shrink(domainNameList, "DomainNameList", "json");
            this.putQueryParameter("DomainNameList", domainNameListShrink);
            this.domainNameList = domainNameList;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRTSNativeSDKVvDataRequest build() {
            return new DescribeRTSNativeSDKVvDataRequest(this);
        } 

    } 

}
