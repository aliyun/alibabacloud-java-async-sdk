// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAliwsDictResponse} extends {@link TeaModel}
 *
 * <p>UpdateAliwsDictResponse</p>
 */
public class UpdateAliwsDictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAliwsDictResponseBody body;

    private UpdateAliwsDictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAliwsDictResponse create() {
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
    public UpdateAliwsDictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAliwsDictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAliwsDictResponseBody body);

        @Override
        UpdateAliwsDictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAliwsDictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAliwsDictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAliwsDictResponse response) {
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
        public Builder body(UpdateAliwsDictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAliwsDictResponse build() {
            return new UpdateAliwsDictResponse(this);
        } 

    } 

}
