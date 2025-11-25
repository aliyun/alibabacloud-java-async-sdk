// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrivateDnsStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribePrivateDnsStatisticsRequest</p>
 */
public class DescribePrivateDnsStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameCreatedEndTime")
    private Long domainNameCreatedEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameCreatedStartTime")
    private Long domainNameCreatedStartTime;

    private DescribePrivateDnsStatisticsRequest(Builder builder) {
        super(builder);
        this.domainNameCreatedEndTime = builder.domainNameCreatedEndTime;
        this.domainNameCreatedStartTime = builder.domainNameCreatedStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNameCreatedEndTime
     */
    public Long getDomainNameCreatedEndTime() {
        return this.domainNameCreatedEndTime;
    }

    /**
     * @return domainNameCreatedStartTime
     */
    public Long getDomainNameCreatedStartTime() {
        return this.domainNameCreatedStartTime;
    }

    public static final class Builder extends Request.Builder<DescribePrivateDnsStatisticsRequest, Builder> {
        private Long domainNameCreatedEndTime; 
        private Long domainNameCreatedStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrivateDnsStatisticsRequest request) {
            super(request);
            this.domainNameCreatedEndTime = request.domainNameCreatedEndTime;
            this.domainNameCreatedStartTime = request.domainNameCreatedStartTime;
        } 

        /**
         * DomainNameCreatedEndTime.
         */
        public Builder domainNameCreatedEndTime(Long domainNameCreatedEndTime) {
            this.putQueryParameter("DomainNameCreatedEndTime", domainNameCreatedEndTime);
            this.domainNameCreatedEndTime = domainNameCreatedEndTime;
            return this;
        }

        /**
         * DomainNameCreatedStartTime.
         */
        public Builder domainNameCreatedStartTime(Long domainNameCreatedStartTime) {
            this.putQueryParameter("DomainNameCreatedStartTime", domainNameCreatedStartTime);
            this.domainNameCreatedStartTime = domainNameCreatedStartTime;
            return this;
        }

        @Override
        public DescribePrivateDnsStatisticsRequest build() {
            return new DescribePrivateDnsStatisticsRequest(this);
        } 

    } 

}
