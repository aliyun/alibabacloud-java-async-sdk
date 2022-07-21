// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachParserDataSourceResponse} extends {@link TeaModel}
 *
 * <p>DetachParserDataSourceResponse</p>
 */
public class DetachParserDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachParserDataSourceResponseBody body;

    private DetachParserDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachParserDataSourceResponse create() {
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
    public DetachParserDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachParserDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachParserDataSourceResponseBody body);

        @Override
        DetachParserDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachParserDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachParserDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachParserDataSourceResponse response) {
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
        public Builder body(DetachParserDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachParserDataSourceResponse build() {
            return new DetachParserDataSourceResponse(this);
        } 

    } 

}
