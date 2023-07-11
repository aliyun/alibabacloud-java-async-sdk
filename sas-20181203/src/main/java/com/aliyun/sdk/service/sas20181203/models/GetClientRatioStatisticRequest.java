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
        private java.util.List < String > statisticTypes; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(GetClientRatioStatisticRequest request) {
            super(request);
            this.statisticTypes = request.statisticTypes;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * StatisticTypes.
         */
        public Builder statisticTypes(java.util.List < String > statisticTypes) {
            this.putQueryParameter("StatisticTypes", statisticTypes);
            this.statisticTypes = statisticTypes;
            return this;
        }

        /**
         * TimeEnd.
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * TimeStart.
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
