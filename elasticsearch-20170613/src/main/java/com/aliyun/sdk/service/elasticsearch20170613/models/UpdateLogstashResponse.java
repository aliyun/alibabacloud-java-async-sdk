// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLogstashResponse} extends {@link TeaModel}
 *
 * <p>UpdateLogstashResponse</p>
 */
public class UpdateLogstashResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLogstashResponseBody body;

    private UpdateLogstashResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLogstashResponse create() {
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
    public UpdateLogstashResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLogstashResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLogstashResponseBody body);

        @Override
        UpdateLogstashResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLogstashResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLogstashResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLogstashResponse response) {
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
        public Builder body(UpdateLogstashResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLogstashResponse build() {
            return new UpdateLogstashResponse(this);
        } 

    } 

}
