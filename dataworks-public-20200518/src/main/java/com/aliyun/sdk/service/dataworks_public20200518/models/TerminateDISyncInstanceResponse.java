// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateDISyncInstanceResponse} extends {@link TeaModel}
 *
 * <p>TerminateDISyncInstanceResponse</p>
 */
public class TerminateDISyncInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateDISyncInstanceResponseBody body;

    private TerminateDISyncInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateDISyncInstanceResponse create() {
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
    public TerminateDISyncInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateDISyncInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateDISyncInstanceResponseBody body);

        @Override
        TerminateDISyncInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateDISyncInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateDISyncInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateDISyncInstanceResponse response) {
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
        public Builder body(TerminateDISyncInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateDISyncInstanceResponse build() {
            return new TerminateDISyncInstanceResponse(this);
        } 

    } 

}
