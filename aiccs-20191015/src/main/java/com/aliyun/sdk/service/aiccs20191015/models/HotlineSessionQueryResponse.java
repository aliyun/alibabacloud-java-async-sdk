// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotlineSessionQueryResponse} extends {@link TeaModel}
 *
 * <p>HotlineSessionQueryResponse</p>
 */
public class HotlineSessionQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotlineSessionQueryResponseBody body;

    private HotlineSessionQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotlineSessionQueryResponse create() {
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
    public HotlineSessionQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotlineSessionQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotlineSessionQueryResponseBody body);

        @Override
        HotlineSessionQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotlineSessionQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotlineSessionQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotlineSessionQueryResponse response) {
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
        public Builder body(HotlineSessionQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotlineSessionQueryResponse build() {
            return new HotlineSessionQueryResponse(this);
        } 

    } 

}
