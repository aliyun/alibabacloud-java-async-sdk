// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReserveIntlDomainRequest} extends {@link RequestModel}
 *
 * <p>ReserveIntlDomainRequest</p>
 */
public class ReserveIntlDomainRequest extends Request {
    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private ReserveIntlDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveIntlDomainRequest create() {
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

    public static final class Builder extends Request.Builder<ReserveIntlDomainRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(ReserveIntlDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public ReserveIntlDomainRequest build() {
            return new ReserveIntlDomainRequest(this);
        } 

    } 

}
