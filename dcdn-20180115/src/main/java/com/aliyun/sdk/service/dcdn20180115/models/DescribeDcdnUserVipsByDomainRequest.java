// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserVipsByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserVipsByDomainRequest</p>
 */
public class DescribeDcdnUserVipsByDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Available")
    private String available;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private DescribeDcdnUserVipsByDomainRequest(Builder builder) {
        super(builder);
        this.available = builder.available;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserVipsByDomainRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnUserVipsByDomainRequest, Builder> {
        private String available; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserVipsByDomainRequest request) {
            super(request);
            this.available = request.available;
            this.domainName = request.domainName;
        } 

        /**
         * <p>Specifies whether to query the virtual IP addresses of only healthy POPs. Valid value:</p>
         * <ul>
         * <li><strong>on</strong>: queries healthy VIPs.</li>
         * <li><strong>off</strong>: queries all VIPs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder available(String available) {
            this.putQueryParameter("Available", available);
            this.available = available;
            return this;
        }

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
         * <p>Enumeration values: example.com</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDcdnUserVipsByDomainRequest build() {
            return new DescribeDcdnUserVipsByDomainRequest(this);
        } 

    } 

}
