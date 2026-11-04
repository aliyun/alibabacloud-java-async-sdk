// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListCallMeasureSummaryReportsRequest} extends {@link RequestModel}
 *
 * <p>ListCallMeasureSummaryReportsRequest</p>
 */
public class ListCallMeasureSummaryReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intervalType;

    private ListCallMeasureSummaryReportsRequest(Builder builder) {
        super(builder);
        this.intervalType = builder.intervalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallMeasureSummaryReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intervalType
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    public static final class Builder extends Request.Builder<ListCallMeasureSummaryReportsRequest, Builder> {
        private String intervalType; 

        private Builder() {
            super();
        } 

        private Builder(ListCallMeasureSummaryReportsRequest request) {
            super(request);
            this.intervalType = request.intervalType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("IntervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        @Override
        public ListCallMeasureSummaryReportsRequest build() {
            return new ListCallMeasureSummaryReportsRequest(this);
        } 

    } 

}
