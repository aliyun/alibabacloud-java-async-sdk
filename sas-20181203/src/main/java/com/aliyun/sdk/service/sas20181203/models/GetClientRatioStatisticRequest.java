// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientRatioStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetClientRatioStatisticRequest</p>
 */
public class GetClientRatioStatisticRequest extends Request {
    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @Query
    @NameInMap("StatisticTypes")
    private java.util.List < String > statisticTypes;

    @Query
    @NameInMap("TimeEnd")
    @Validation(required = true)
    private Long timeEnd;

    @Query
    @NameInMap("TimeStart")
    @Validation(required = true)
    private Long timeStart;

    private GetClientRatioStatisticRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.statisticTypes = builder.statisticTypes;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRatioStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return statisticTypes
     */
    public java.util.List < String > getStatisticTypes() {
        return this.statisticTypes;
    }

    /**
     * @return timeEnd
     */
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public Long getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<GetClientRatioStatisticRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private java.util.List < String > statisticTypes; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(GetClientRatioStatisticRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statisticTypes = request.statisticTypes;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * The ID of the primary account of the Resource Directory member account.
         * <p>
         * > call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) interface to obtain this parameter.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * An array that consists of the details of a statistical type.
         */
        public Builder statisticTypes(java.util.List < String > statisticTypes) {
            this.putQueryParameter("StatisticTypes", statisticTypes);
            this.statisticTypes = statisticTypes;
            return this;
        }

        /**
         * The timestamp that specifies the end of the time range to collect statistics. Unit: milliseconds.
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The timestamp that specifies the beginning of the time range to collect statistics. Unit: milliseconds.
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public GetClientRatioStatisticRequest build() {
            return new GetClientRatioStatisticRequest(this);
        } 

    } 

}
