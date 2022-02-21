// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescTemplateResponse} extends {@link TeaModel}
 *
 * <p>DescTemplateResponse</p>
 */
public class DescTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescTemplateResponseBody body;

    private DescTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescTemplateResponse create() {
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
    public DescTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescTemplateResponseBody body);

        @Override
        DescTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescTemplateResponse response) {
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
        public Builder body(DescTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescTemplateResponse build() {
            return new DescTemplateResponse(this);
        } 

    } 

}
