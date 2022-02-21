// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityRuleResponse} extends {@link TeaModel}
 *
 * <p>EditQualityRuleResponse</p>
 */
public class EditQualityRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditQualityRuleResponseBody body;

    private EditQualityRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditQualityRuleResponse create() {
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
    public EditQualityRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditQualityRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditQualityRuleResponseBody body);

        @Override
        EditQualityRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditQualityRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditQualityRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditQualityRuleResponse response) {
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
        public Builder body(EditQualityRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditQualityRuleResponse build() {
            return new EditQualityRuleResponse(this);
        } 

    } 

}
