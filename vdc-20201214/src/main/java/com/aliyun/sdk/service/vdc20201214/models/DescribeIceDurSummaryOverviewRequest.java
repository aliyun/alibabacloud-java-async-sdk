// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurSummaryOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribeIceDurSummaryOverviewRequest</p>
 */
public class DescribeIceDurSummaryOverviewRequest extends Request {
    @Query
    @NameInMap("CurTs")
    @Validation(required = true)
    private Long curTs;

    @Query
    @NameInMap("TimeZone")
    @Validation(required = true)
    private String timeZone;

    private DescribeIceDurSummaryOverviewRequest(Builder builder) {
        super(builder);
        this.curTs = builder.curTs;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIceDurSummaryOverviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return curTs
     */
    public Long getCurTs() {
        return this.curTs;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<DescribeIceDurSummaryOverviewRequest, Builder> {
        private Long curTs; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIceDurSummaryOverviewRequest request) {
            super(request);
            this.curTs = request.curTs;
            this.timeZone = request.timeZone;
        } 

        /**
         * CurTs.
         */
        public Builder curTs(Long curTs) {
            this.putQueryParameter("CurTs", curTs);
            this.curTs = curTs;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public DescribeIceDurSummaryOverviewRequest build() {
            return new DescribeIceDurSummaryOverviewRequest(this);
        } 

    } 

}
