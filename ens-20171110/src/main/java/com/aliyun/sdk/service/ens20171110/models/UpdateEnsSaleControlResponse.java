// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnsSaleControlResponse} extends {@link TeaModel}
 *
 * <p>UpdateEnsSaleControlResponse</p>
 */
public class UpdateEnsSaleControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEnsSaleControlResponseBody body;

    private UpdateEnsSaleControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEnsSaleControlResponse create() {
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
    public UpdateEnsSaleControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEnsSaleControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEnsSaleControlResponseBody body);

        @Override
        UpdateEnsSaleControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEnsSaleControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEnsSaleControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEnsSaleControlResponse response) {
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
        public Builder body(UpdateEnsSaleControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEnsSaleControlResponse build() {
            return new UpdateEnsSaleControlResponse(this);
        } 

    } 

}
