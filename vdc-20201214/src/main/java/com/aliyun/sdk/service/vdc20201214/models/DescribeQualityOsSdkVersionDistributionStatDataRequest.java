// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQualityOsSdkVersionDistributionStatDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeQualityOsSdkVersionDistributionStatDataRequest</p>
 */
public class DescribeQualityOsSdkVersionDistributionStatDataRequest extends Request {
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

    private DescribeQualityOsSdkVersionDistributionStatDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityOsSdkVersionDistributionStatDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeQualityOsSdkVersionDistributionStatDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQualityOsSdkVersionDistributionStatDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * AppId.
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
        public DescribeQualityOsSdkVersionDistributionStatDataRequest build() {
            return new DescribeQualityOsSdkVersionDistributionStatDataRequest(this);
        } 

    } 

}
