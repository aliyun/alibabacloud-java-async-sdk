// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSmarttagTemplateResponse} extends {@link TeaModel}
 *
 * <p>AddSmarttagTemplateResponse</p>
 */
public class AddSmarttagTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSmarttagTemplateResponseBody body;

    private AddSmarttagTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSmarttagTemplateResponse create() {
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
    public AddSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSmarttagTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSmarttagTemplateResponseBody body);

        @Override
        AddSmarttagTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSmarttagTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSmarttagTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSmarttagTemplateResponse response) {
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
        public Builder body(AddSmarttagTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSmarttagTemplateResponse build() {
            return new AddSmarttagTemplateResponse(this);
        } 

    } 

}
