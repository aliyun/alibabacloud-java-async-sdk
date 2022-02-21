// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityRuleTagResponse} extends {@link TeaModel}
 *
 * <p>EditQualityRuleTagResponse</p>
 */
public class EditQualityRuleTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditQualityRuleTagResponseBody body;

    private EditQualityRuleTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditQualityRuleTagResponse create() {
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
    public EditQualityRuleTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditQualityRuleTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditQualityRuleTagResponseBody body);

        @Override
        EditQualityRuleTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditQualityRuleTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditQualityRuleTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditQualityRuleTagResponse response) {
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
        public Builder body(EditQualityRuleTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditQualityRuleTagResponse build() {
            return new EditQualityRuleTagResponse(this);
        } 

    } 

}
