// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClientUserDefineRuleResponse} extends {@link TeaModel}
 *
 * <p>AddClientUserDefineRuleResponse</p>
 */
public class AddClientUserDefineRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddClientUserDefineRuleResponseBody body;

    private AddClientUserDefineRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddClientUserDefineRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
    public AddClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddClientUserDefineRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddClientUserDefineRuleResponseBody body);

        @Override
        AddClientUserDefineRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddClientUserDefineRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddClientUserDefineRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddClientUserDefineRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AddClientUserDefineRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddClientUserDefineRuleResponse build() {
            return new AddClientUserDefineRuleResponse(this);
        } 

    } 

}
