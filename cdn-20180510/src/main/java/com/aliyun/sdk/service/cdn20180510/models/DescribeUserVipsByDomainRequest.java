// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeUserVipsByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserVipsByDomainRequest</p>
 */
public class DescribeUserVipsByDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Available")
    private String available;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to query the virtual IP addresses of only healthy CDN POPs. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: healthy CDN edge nodes.</li>
         * <li><strong>off</strong>: all CDN edge nodes.</li>
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
        public DescribeUserVipsByDomainRequest build() {
            return new DescribeUserVipsByDomainRequest(this);
        } 

    } 

}
