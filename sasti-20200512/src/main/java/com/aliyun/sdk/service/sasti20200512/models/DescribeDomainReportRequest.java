// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainReportRequest</p>
 */
public class DescribeDomainReportRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Field")
    private String field;

    private DescribeDomainReportRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.field = builder.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainReportRequest create() {
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

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    public static final class Builder extends Request.Builder<DescribeDomainReportRequest, Builder> {
        private String domain; 
        private String field; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainReportRequest request) {
            super(request);
            this.domain = request.domain;
            this.field = request.field;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        @Override
        public DescribeDomainReportRequest build() {
            return new DescribeDomainReportRequest(this);
        } 

    } 

}
