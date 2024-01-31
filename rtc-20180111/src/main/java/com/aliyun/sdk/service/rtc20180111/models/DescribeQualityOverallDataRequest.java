// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQualityOverallDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeQualityOverallDataRequest</p>
 */
public class DescribeQualityOverallDataRequest extends Request {
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
    @NameInMap("Types")
    @Validation(required = true)
    private String types;

    private DescribeQualityOverallDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityOverallDataRequest create() {
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
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<DescribeQualityOverallDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private Long startDate; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQualityOverallDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.types = request.types;
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
         * Types.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public DescribeQualityOverallDataRequest build() {
            return new DescribeQualityOverallDataRequest(this);
        } 

    } 

}
