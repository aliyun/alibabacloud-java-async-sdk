// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopInstanceResponse</p>
 */
public class StopInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopInstanceResponseBody body;

    private StopInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopInstanceResponse create() {
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
    public StopInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopInstanceResponseBody body);

        @Override
        StopInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopInstanceResponse response) {
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
        public Builder body(StopInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopInstanceResponse build() {
            return new StopInstanceResponse(this);
        } 

    } 

}
