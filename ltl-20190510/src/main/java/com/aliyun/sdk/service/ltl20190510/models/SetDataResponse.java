// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataResponse} extends {@link TeaModel}
 *
 * <p>SetDataResponse</p>
 */
public class SetDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDataResponseBody body;

    private SetDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDataResponse create() {
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
    public SetDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDataResponseBody body);

        @Override
        SetDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDataResponse response) {
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
        public Builder body(SetDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDataResponse build() {
            return new SetDataResponse(this);
        } 

    } 

}
