// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQualityDistributionStatDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeQualityDistributionStatDataRequest</p>
 */
public class DescribeQualityDistributionStatDataRequest extends Request {
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

    @Query
    @NameInMap("StatDim")
    @Validation(required = true)
    private String statDim;

    private DescribeQualityDistributionStatDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.statDim = builder.statDim;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityDistributionStatDataRequest create() {
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

    /**
     * @return statDim
     */
    public String getStatDim() {
        return this.statDim;
    }

    public static final class Builder extends Request.Builder<DescribeQualityDistributionStatDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 
        private String statDim; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQualityDistributionStatDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.statDim = request.statDim;
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

        /**
         * StatDim.
         */
        public Builder statDim(String statDim) {
            this.putQueryParameter("StatDim", statDim);
            this.statDim = statDim;
            return this;
        }

        @Override
        public DescribeQualityDistributionStatDataRequest build() {
            return new DescribeQualityDistributionStatDataRequest(this);
        } 

    } 

}
