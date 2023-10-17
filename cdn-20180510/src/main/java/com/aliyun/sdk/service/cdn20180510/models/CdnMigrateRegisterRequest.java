// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CdnMigrateRegisterRequest} extends {@link RequestModel}
 *
 * <p>CdnMigrateRegisterRequest</p>
 */
public class CdnMigrateRegisterRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private CdnMigrateRegisterRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CdnMigrateRegisterRequest create() {
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

    public static final class Builder extends Request.Builder<CdnMigrateRegisterRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(CdnMigrateRegisterRequest request) {
            super(request);
            this.domainName = request.domainName;
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
        public CdnMigrateRegisterRequest build() {
            return new CdnMigrateRegisterRequest(this);
        } 

    } 

}
