// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainDetailRequest</p>
 */
public class DescribeDomainDetailRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeDomainDetailRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailRequest create() {
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeDomainDetailRequest, Builder> {
        private String domainName; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainDetailRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeDomainDetailRequest build() {
            return new DescribeDomainDetailRequest(this);
        } 

    } 

}
