// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserReport4AlinlpResponse} extends {@link TeaModel}
 *
 * <p>FindUserReport4AlinlpResponse</p>
 */
public class FindUserReport4AlinlpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindUserReport4AlinlpResponseBody body;

    private FindUserReport4AlinlpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindUserReport4AlinlpResponse create() {
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
    public FindUserReport4AlinlpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindUserReport4AlinlpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindUserReport4AlinlpResponseBody body);

        @Override
        FindUserReport4AlinlpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindUserReport4AlinlpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindUserReport4AlinlpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindUserReport4AlinlpResponse response) {
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
        public Builder body(FindUserReport4AlinlpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindUserReport4AlinlpResponse build() {
            return new FindUserReport4AlinlpResponse(this);
        } 

    } 

}
