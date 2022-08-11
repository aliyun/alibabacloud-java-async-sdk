// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TopTenElapsedTimeInstanceResponse} extends {@link TeaModel}
 *
 * <p>TopTenElapsedTimeInstanceResponse</p>
 */
public class TopTenElapsedTimeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TopTenElapsedTimeInstanceResponseBody body;

    private TopTenElapsedTimeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TopTenElapsedTimeInstanceResponse create() {
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
    public TopTenElapsedTimeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TopTenElapsedTimeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TopTenElapsedTimeInstanceResponseBody body);

        @Override
        TopTenElapsedTimeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TopTenElapsedTimeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TopTenElapsedTimeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TopTenElapsedTimeInstanceResponse response) {
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
        public Builder body(TopTenElapsedTimeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TopTenElapsedTimeInstanceResponse build() {
            return new TopTenElapsedTimeInstanceResponse(this);
        } 

    } 

}
