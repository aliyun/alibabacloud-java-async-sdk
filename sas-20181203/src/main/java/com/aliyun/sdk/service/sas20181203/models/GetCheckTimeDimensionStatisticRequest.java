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
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
        private Long startTimeStamp; 
        private String statisticType; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckTimeDimensionStatisticRequest request) {
            super(request);
            this.endTimeStamp = request.endTimeStamp;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.startTimeStamp = request.startTimeStamp;
            this.statisticType = request.statisticType;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The end time in UNIX timestamp format.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the member accounts in the resource folder belong.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The start time in UNIX timestamp format.</p>
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
         * <p>The data statistics type. Valid values:</p>
         * <ul>
         * <li><strong>CheckPassRate</strong>: The pass rate of check items.</li>
         * <li><strong>AssetPassRate</strong>: The pass rate of assets.</li>
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
         * <p>The list of cloud providers.</p>
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
