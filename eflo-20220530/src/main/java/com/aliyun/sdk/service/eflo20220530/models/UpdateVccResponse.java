// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVccResponse} extends {@link TeaModel}
 *
 * <p>UpdateVccResponse</p>
 */
public class UpdateVccResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVccResponseBody body;

    private UpdateVccResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVccResponse create() {
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
    public UpdateVccResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVccResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVccResponseBody body);

        @Override
        UpdateVccResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVccResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVccResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVccResponse response) {
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
        public Builder body(UpdateVccResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVccResponse build() {
            return new UpdateVccResponse(this);
        } 

    } 

}
