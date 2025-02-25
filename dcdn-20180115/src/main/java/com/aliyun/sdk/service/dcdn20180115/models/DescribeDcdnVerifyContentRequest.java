// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnVerifyContentRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnVerifyContentRequest</p>
 */
public class DescribeDcdnVerifyContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private DescribeDcdnVerifyContentRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnVerifyContentRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnVerifyContentRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnVerifyContentRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * <p>The domain name for which you want to query the ownership verification content. You can specify only one domain name in one request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>example</strong>.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDcdnVerifyContentRequest build() {
            return new DescribeDcdnVerifyContentRequest(this);
        } 

    } 

}
