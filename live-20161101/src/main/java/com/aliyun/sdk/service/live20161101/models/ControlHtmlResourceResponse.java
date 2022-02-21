// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlHtmlResourceResponse} extends {@link TeaModel}
 *
 * <p>ControlHtmlResourceResponse</p>
 */
public class ControlHtmlResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ControlHtmlResourceResponseBody body;

    private ControlHtmlResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ControlHtmlResourceResponse create() {
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
    public ControlHtmlResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ControlHtmlResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ControlHtmlResourceResponseBody body);

        @Override
        ControlHtmlResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ControlHtmlResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ControlHtmlResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ControlHtmlResourceResponse response) {
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
        public Builder body(ControlHtmlResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ControlHtmlResourceResponse build() {
            return new ControlHtmlResourceResponse(this);
        } 

    } 

}
