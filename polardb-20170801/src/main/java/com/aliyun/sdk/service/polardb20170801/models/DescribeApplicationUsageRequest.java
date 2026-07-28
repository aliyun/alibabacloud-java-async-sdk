// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationUsageRequest</p>
 */
public class DescribeApplicationUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    @com.aliyun.core.annotation.Validation(maximum = 365, minimum = 1)
    private Integer days;

    private DescribeApplicationUsageRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.days = builder.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationUsageRequest, Builder> {
        private String applicationId; 
        private Integer days; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationUsageRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.days = request.days;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-123456</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Days.
         */
        public Builder days(Integer days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        @Override
        public DescribeApplicationUsageRequest build() {
            return new DescribeApplicationUsageRequest(this);
        } 

    } 

}
