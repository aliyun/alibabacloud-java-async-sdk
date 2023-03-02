// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInsResponse} extends {@link TeaModel}
 *
 * <p>UpdateInsResponse</p>
 */
public class UpdateInsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateInsResponseBody body;

    private UpdateInsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateInsResponse create() {
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
    public UpdateInsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateInsResponseBody body);

        @Override
        UpdateInsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateInsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInsResponse response) {
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
        public Builder body(UpdateInsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInsResponse build() {
            return new UpdateInsResponse(this);
        } 

    } 

}
