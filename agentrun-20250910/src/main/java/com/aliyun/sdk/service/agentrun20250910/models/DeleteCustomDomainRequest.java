// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomDomainRequest</p>
 */
public class DeleteCustomDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    private DeleteCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomDomainRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCustomDomainRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * domainName.
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DeleteCustomDomainRequest build() {
            return new DeleteCustomDomainRequest(this);
        } 

    } 

}
