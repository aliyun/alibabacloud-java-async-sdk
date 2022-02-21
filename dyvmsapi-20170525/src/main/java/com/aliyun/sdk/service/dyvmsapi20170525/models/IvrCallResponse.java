// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IvrCallResponse} extends {@link TeaModel}
 *
 * <p>IvrCallResponse</p>
 */
public class IvrCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IvrCallResponseBody body;

    private IvrCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IvrCallResponse create() {
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
    public IvrCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IvrCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IvrCallResponseBody body);

        @Override
        IvrCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IvrCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IvrCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IvrCallResponse response) {
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
        public Builder body(IvrCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IvrCallResponse build() {
            return new IvrCallResponse(this);
        } 

    } 

}
