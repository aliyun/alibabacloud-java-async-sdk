// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCrossBoarderStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateCrossBoarderStatusResponse</p>
 */
public class UpdateCrossBoarderStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCrossBoarderStatusResponseBody body;

    private UpdateCrossBoarderStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCrossBoarderStatusResponse create() {
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
    public UpdateCrossBoarderStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCrossBoarderStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCrossBoarderStatusResponseBody body);

        @Override
        UpdateCrossBoarderStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCrossBoarderStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCrossBoarderStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCrossBoarderStatusResponse response) {
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
        public Builder body(UpdateCrossBoarderStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCrossBoarderStatusResponse build() {
            return new UpdateCrossBoarderStatusResponse(this);
        } 

    } 

}
