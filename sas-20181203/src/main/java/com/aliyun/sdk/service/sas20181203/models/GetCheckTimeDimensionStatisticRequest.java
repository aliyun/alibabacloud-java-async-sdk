// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckTimeDimensionStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetCheckTimeDimensionStatisticRequest</p>
 */
public class GetCheckTimeDimensionStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticType")
    private String statisticType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<String> vendors;

    private GetCheckTimeDimensionStatisticRequest(Builder builder) {
        super(builder);
        this.endTimeStamp = builder.endTimeStamp;
        this.startTimeStamp = builder.startTimeStamp;
        this.statisticType = builder.statisticType;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckTimeDimensionStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    /**
     * @return statisticType
     */
    public String getStatisticType() {
        return this.statisticType;
    }

    /**
     * @return vendors
     */
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCheckTimeDimensionStatisticRequest, Builder> {
        private Long endTimeStamp; 
        private Long startTimeStamp; 
        private String statisticType; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckTimeDimensionStatisticRequest request) {
            super(request);
            this.endTimeStamp = request.endTimeStamp;
            this.startTimeStamp = request.startTimeStamp;
            this.statisticType = request.statisticType;
            this.vendors = request.vendors;
        } 

        /**
         * <p>End time, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1672285044000</p>
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * <p>Start time, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1672385044000</p>
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        /**
         * <p>Type of statistical data. Values:</p>
         * <ul>
         * <li><strong>CheckPassRate</strong>: Check item pass rate.</li>
         * <li><strong>AssetPassRate</strong>: Asset pass rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AssetPassRate</p>
         */
        public Builder statisticType(String statisticType) {
            this.putQueryParameter("StatisticType", statisticType);
            this.statisticType = statisticType;
            return this;
        }

        /**
         * <p>List of cloud vendors.</p>
         */
        public Builder vendors(java.util.List<String> vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCheckTimeDimensionStatisticRequest build() {
            return new GetCheckTimeDimensionStatisticRequest(this);
        } 

    } 

}
