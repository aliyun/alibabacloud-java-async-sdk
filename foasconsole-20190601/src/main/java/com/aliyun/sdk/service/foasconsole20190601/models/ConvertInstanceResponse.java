// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertInstanceResponse} extends {@link TeaModel}
 *
 * <p>ConvertInstanceResponse</p>
 */
public class ConvertInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConvertInstanceResponseBody body;

    private ConvertInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConvertInstanceResponse create() {
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
    public ConvertInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConvertInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConvertInstanceResponseBody body);

        @Override
        ConvertInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConvertInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConvertInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConvertInstanceResponse response) {
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
        public Builder body(ConvertInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConvertInstanceResponse build() {
            return new ConvertInstanceResponse(this);
        } 

    } 

}
