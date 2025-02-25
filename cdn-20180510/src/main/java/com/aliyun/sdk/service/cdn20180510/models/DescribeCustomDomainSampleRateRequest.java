// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomDomainSampleRateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomDomainSampleRateRequest</p>
 */
public class DescribeCustomDomainSampleRateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    private DescribeCustomDomainSampleRateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomDomainSampleRateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<DescribeCustomDomainSampleRateRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomDomainSampleRateRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeCustomDomainSampleRateRequest build() {
            return new DescribeCustomDomainSampleRateRequest(this);
        } 

    } 

}
