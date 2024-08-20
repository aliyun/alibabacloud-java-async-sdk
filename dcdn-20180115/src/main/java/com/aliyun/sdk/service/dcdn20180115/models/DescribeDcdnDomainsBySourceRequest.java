// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainsBySourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainsBySourceRequest</p>
 */
public class DescribeDcdnDomainsBySourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sources;

    private DescribeDcdnDomainsBySourceRequest(Builder builder) {
        super(builder);
        this.sources = builder.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainsBySourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sources
     */
    public String getSources() {
        return this.sources;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainsBySourceRequest, Builder> {
        private String sources; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainsBySourceRequest request) {
            super(request);
            this.sources = request.sources;
        } 

        /**
         * The list of origin servers. Separate origin servers with commas (,). You can specify a maximum of 20 origin servers. Fuzzy match is not supported.
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        @Override
        public DescribeDcdnDomainsBySourceRequest build() {
            return new DescribeDcdnDomainsBySourceRequest(this);
        } 

    } 

}
