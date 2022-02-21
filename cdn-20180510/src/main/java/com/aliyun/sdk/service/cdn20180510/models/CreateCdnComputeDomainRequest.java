// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnComputeDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnComputeDomainRequest</p>
 */
public class CreateCdnComputeDomainRequest extends Request {
    @Query
    @NameInMap("Coverage")
    private String coverage;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private CreateCdnComputeDomainRequest(Builder builder) {
        super(builder);
        this.coverage = builder.coverage;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnComputeDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<CreateCdnComputeDomainRequest, Builder> {
        private String coverage; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdnComputeDomainRequest response) {
            super(response);
            this.coverage = response.coverage;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
        } 

        /**
         * Coverage.
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
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

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public CreateCdnComputeDomainRequest build() {
            return new CreateCdnComputeDomainRequest(this);
        } 

    } 

}
