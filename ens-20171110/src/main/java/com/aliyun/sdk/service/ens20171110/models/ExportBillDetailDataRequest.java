// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportBillDetailDataRequest} extends {@link RequestModel}
 *
 * <p>ExportBillDetailDataRequest</p>
 */
public class ExportBillDetailDataRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private ExportBillDetailDataRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportBillDetailDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ExportBillDetailDataRequest, Builder> {
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ExportBillDetailDataRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ExportBillDetailDataRequest build() {
            return new ExportBillDetailDataRequest(this);
        } 

    } 

}
