// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetDomainRuleGroupResponse} extends {@link TeaModel}
 *
 * <p>SetDomainRuleGroupResponse</p>
 */
public class SetDomainRuleGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDomainRuleGroupResponseBody body;


    private SetDomainRuleGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRuleGroupResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public SetDomainRuleGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private SetDomainRuleGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRuleGroupResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(SetDomainRuleGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public SetDomainRuleGroupResponse build() {
            return new SetDomainRuleGroupResponse(this);
        } 

    } 

}
