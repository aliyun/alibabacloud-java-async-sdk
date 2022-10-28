// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDesensitizationRuleResponse} extends {@link TeaModel}
 *
 * <p>AddDesensitizationRuleResponse</p>
 */
public class AddDesensitizationRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDesensitizationRuleResponseBody body;

    private AddDesensitizationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDesensitizationRuleResponse create() {
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
    public AddDesensitizationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDesensitizationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDesensitizationRuleResponseBody body);

        @Override
        AddDesensitizationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDesensitizationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDesensitizationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDesensitizationRuleResponse response) {
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
        public Builder body(AddDesensitizationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDesensitizationRuleResponse build() {
            return new AddDesensitizationRuleResponse(this);
        } 

    } 

}
