// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsageOsSdkVersionDistributionStatDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsageOsSdkVersionDistributionStatDataRequest</p>
 */
public class DescribeUsageOsSdkVersionDistributionStatDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private Long endDate;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private Long startDate;

    private DescribeUsageOsSdkVersionDistributionStatDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageOsSdkVersionDistributionStatDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeUsageOsSdkVersionDistributionStatDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsageOsSdkVersionDistributionStatDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * APP ID
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeUsageOsSdkVersionDistributionStatDataRequest build() {
            return new DescribeUsageOsSdkVersionDistributionStatDataRequest(this);
        } 

    } 

}
