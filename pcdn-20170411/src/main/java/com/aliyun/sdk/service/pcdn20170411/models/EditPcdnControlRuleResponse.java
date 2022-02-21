// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditPcdnControlRuleResponse} extends {@link TeaModel}
 *
 * <p>EditPcdnControlRuleResponse</p>
 */
public class EditPcdnControlRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditPcdnControlRuleResponseBody body;

    private EditPcdnControlRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditPcdnControlRuleResponse create() {
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
    public EditPcdnControlRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditPcdnControlRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditPcdnControlRuleResponseBody body);

        @Override
        EditPcdnControlRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditPcdnControlRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditPcdnControlRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditPcdnControlRuleResponse response) {
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
        public Builder body(EditPcdnControlRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditPcdnControlRuleResponse build() {
            return new EditPcdnControlRuleResponse(this);
        } 

    } 

}
