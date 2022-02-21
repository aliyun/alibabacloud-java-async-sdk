// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDictResponse} extends {@link TeaModel}
 *
 * <p>UpdateDictResponse</p>
 */
public class UpdateDictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDictResponseBody body;

    private UpdateDictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDictResponse create() {
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
    public UpdateDictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDictResponseBody body);

        @Override
        UpdateDictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDictResponse response) {
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
        public Builder body(UpdateDictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDictResponse build() {
            return new UpdateDictResponse(this);
        } 

    } 

}
