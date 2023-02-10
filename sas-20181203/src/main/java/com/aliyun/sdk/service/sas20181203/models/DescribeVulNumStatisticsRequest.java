// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulNumStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulNumStatisticsRequest</p>
 */
public class DescribeVulNumStatisticsRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    private DescribeVulNumStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulNumStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<DescribeVulNumStatisticsRequest, Builder> {
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulNumStatisticsRequest request) {
            super(request);
            this.from = request.from;
        } 

        /**
         * The source of the request. Set the value to sas.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public DescribeVulNumStatisticsRequest build() {
            return new DescribeVulNumStatisticsRequest(this);
        } 

    } 

}
