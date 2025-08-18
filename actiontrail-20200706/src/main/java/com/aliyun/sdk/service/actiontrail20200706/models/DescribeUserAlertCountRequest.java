// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeUserAlertCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserAlertCountRequest</p>
 */
public class DescribeUserAlertCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private DescribeUserAlertCountRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAlertCountRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUserAlertCountRequest, Builder> {
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserAlertCountRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeUserAlertCountRequest build() {
            return new DescribeUserAlertCountRequest(this);
        } 

    } 

}
