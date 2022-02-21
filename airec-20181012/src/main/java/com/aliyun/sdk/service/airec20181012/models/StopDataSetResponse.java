// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDataSetResponse} extends {@link TeaModel}
 *
 * <p>StopDataSetResponse</p>
 */
public class StopDataSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDataSetResponseBody body;

    private StopDataSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDataSetResponse create() {
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
    public StopDataSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDataSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDataSetResponseBody body);

        @Override
        StopDataSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDataSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDataSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDataSetResponse response) {
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
        public Builder body(StopDataSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDataSetResponse build() {
            return new StopDataSetResponse(this);
        } 

    } 

}
