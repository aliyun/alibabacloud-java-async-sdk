// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRoutineSubdomainRequest} extends {@link RequestModel}
 *
 * <p>SetRoutineSubdomainRequest</p>
 */
public class SetRoutineSubdomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Subdomains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > subdomains;

    private SetRoutineSubdomainRequest(Builder builder) {
        super(builder);
        this.subdomains = builder.subdomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRoutineSubdomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subdomains
     */
    public java.util.Map < String, ? > getSubdomains() {
        return this.subdomains;
    }

    public static final class Builder extends Request.Builder<SetRoutineSubdomainRequest, Builder> {
        private java.util.Map < String, ? > subdomains; 

        private Builder() {
            super();
        } 

        private Builder(SetRoutineSubdomainRequest request) {
            super(request);
            this.subdomains = request.subdomains;
        } 

        /**
         * The parameters of the subdomain.
         * <p>
         * 
         * The parameters are in the following format:
         * 
         *     Subdomains: [
         *         "subdomain-test"
         *     ]
         */
        public Builder subdomains(java.util.Map < String, ? > subdomains) {
            String subdomainsShrink = shrink(subdomains, "Subdomains", "json");
            this.putBodyParameter("Subdomains", subdomainsShrink);
            this.subdomains = subdomains;
            return this;
        }

        @Override
        public SetRoutineSubdomainRequest build() {
            return new SetRoutineSubdomainRequest(this);
        } 

    } 

}
