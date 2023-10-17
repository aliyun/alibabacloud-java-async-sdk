// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserVipsByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserVipsByDomainRequest</p>
 */
public class DescribeDcdnUserVipsByDomainRequest extends Request {
    @Query
    @NameInMap("Available")
    private String available;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
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
         * Available.
         */
        public Builder available(String available) {
            this.putQueryParameter("Available", available);
            this.available = available;
            return this;
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
        public DescribeDcdnUserVipsByDomainRequest build() {
            return new DescribeDcdnUserVipsByDomainRequest(this);
        } 

    } 

}
