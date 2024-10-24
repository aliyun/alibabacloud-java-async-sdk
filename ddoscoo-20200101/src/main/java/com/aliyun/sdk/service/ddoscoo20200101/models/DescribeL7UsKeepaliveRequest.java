// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeL7UsKeepaliveRequest} extends {@link RequestModel}
 *
 * <p>DescribeL7UsKeepaliveRequest</p>
 */
public class DescribeL7UsKeepaliveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    private DescribeL7UsKeepaliveRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7UsKeepaliveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<DescribeL7UsKeepaliveRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(DescribeL7UsKeepaliveRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public DescribeL7UsKeepaliveRequest build() {
            return new DescribeL7UsKeepaliveRequest(this);
        } 

    } 

}
