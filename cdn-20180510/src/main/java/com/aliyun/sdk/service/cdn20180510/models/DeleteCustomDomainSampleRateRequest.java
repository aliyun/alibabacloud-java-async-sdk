// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCustomDomainSampleRateRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomDomainSampleRateRequest</p>
 */
public class DeleteCustomDomainSampleRateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    private DeleteCustomDomainSampleRateRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomDomainSampleRateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    public static final class Builder extends Request.Builder<DeleteCustomDomainSampleRateRequest, Builder> {
        private String domainNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomDomainSampleRateRequest request) {
            super(request);
            this.domainNames = request.domainNames;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainNames(String domainNames) {
            this.putBodyParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        @Override
        public DeleteCustomDomainSampleRateRequest build() {
            return new DeleteCustomDomainSampleRateRequest(this);
        } 

    } 

}
