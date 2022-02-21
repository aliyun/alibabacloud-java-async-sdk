// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseLindormInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReleaseLindormInstanceResponse</p>
 */
public class ReleaseLindormInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseLindormInstanceResponseBody body;

    private ReleaseLindormInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseLindormInstanceResponse create() {
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
    public ReleaseLindormInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseLindormInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseLindormInstanceResponseBody body);

        @Override
        ReleaseLindormInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseLindormInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseLindormInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseLindormInstanceResponse response) {
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
        public Builder body(ReleaseLindormInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseLindormInstanceResponse build() {
            return new ReleaseLindormInstanceResponse(this);
        } 

    } 

}
