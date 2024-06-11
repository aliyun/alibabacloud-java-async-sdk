// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageAccessorDomainRequest} extends {@link RequestModel}
 *
 * <p>ManageAccessorDomainRequest</p>
 */
public class ManageAccessorDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    private ManageAccessorDomainRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.domain = builder.domain;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAccessorDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<ManageAccessorDomainRequest, Builder> {
        private String caller; 
        private String domain; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(ManageAccessorDomainRequest request) {
            super(request);
            this.caller = request.caller;
            this.domain = request.domain;
            this.operation = request.operation;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
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
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public ManageAccessorDomainRequest build() {
            return new ManageAccessorDomainRequest(this);
        } 

    } 

}
