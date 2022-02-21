// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPcdnControlRuleResponse} extends {@link TeaModel}
 *
 * <p>AddPcdnControlRuleResponse</p>
 */
public class AddPcdnControlRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPcdnControlRuleResponseBody body;

    private AddPcdnControlRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPcdnControlRuleResponse create() {
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
    public AddPcdnControlRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPcdnControlRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPcdnControlRuleResponseBody body);

        @Override
        AddPcdnControlRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPcdnControlRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPcdnControlRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPcdnControlRuleResponse response) {
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
        public Builder body(AddPcdnControlRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPcdnControlRuleResponse build() {
            return new AddPcdnControlRuleResponse(this);
        } 

    } 

}
