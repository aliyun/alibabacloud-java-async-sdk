// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVipsByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserVipsByDomainRequest</p>
 */
public class DescribeUserVipsByDomainRequest extends Request {
    @Query
    @NameInMap("Available")
    private String available;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private DescribeUserVipsByDomainRequest(Builder builder) {
        super(builder);
        this.available = builder.available;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserVipsByDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return available
     */
    public String getAvailable() {
        return this.available;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<DescribeUserVipsByDomainRequest, Builder> {
        private String available; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserVipsByDomainRequest request) {
            super(request);
            this.available = request.available;
            this.domainName = request.domainName;
        } 

        /**
         * Specifies whether to query the virtual IP addresses of only healthy CDN POPs. Valid values:
         * <p>
         * 
         * *   **on**: healthy CDN edge nodes.
         * *   **off**: all CDN edge nodes.
         */
        public Builder available(String available) {
            this.putQueryParameter("Available", available);
            this.available = available;
            return this;
        }

        /**
         * The accelerated domain name. You can specify only one domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeUserVipsByDomainRequest build() {
            return new DescribeUserVipsByDomainRequest(this);
        } 

    } 

}
