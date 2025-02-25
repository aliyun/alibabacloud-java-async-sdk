// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainCustomLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainCustomLogConfigRequest</p>
 */
public class DescribeDomainCustomLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private DescribeDomainCustomLogConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCustomLogConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainCustomLogConfigRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainCustomLogConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * <p>The domain name. You can specify only one domain name.</p>
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
        public DescribeDomainCustomLogConfigRequest build() {
            return new DescribeDomainCustomLogConfigRequest(this);
        } 

    } 

}
