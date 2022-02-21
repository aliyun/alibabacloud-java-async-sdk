// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLayoutDataResponse} extends {@link TeaModel}
 *
 * <p>UpdateLayoutDataResponse</p>
 */
public class UpdateLayoutDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLayoutDataResponseBody body;

    private UpdateLayoutDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLayoutDataResponse create() {
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
    public UpdateLayoutDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLayoutDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLayoutDataResponseBody body);

        @Override
        UpdateLayoutDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLayoutDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLayoutDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLayoutDataResponse response) {
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
        public Builder body(UpdateLayoutDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLayoutDataResponse build() {
            return new UpdateLayoutDataResponse(this);
        } 

    } 

}
