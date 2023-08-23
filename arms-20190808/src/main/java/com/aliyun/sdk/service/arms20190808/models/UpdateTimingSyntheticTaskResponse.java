// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTimingSyntheticTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateTimingSyntheticTaskResponse</p>
 */
public class UpdateTimingSyntheticTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTimingSyntheticTaskResponseBody body;

    private UpdateTimingSyntheticTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTimingSyntheticTaskResponse create() {
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
    public UpdateTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTimingSyntheticTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTimingSyntheticTaskResponseBody body);

        @Override
        UpdateTimingSyntheticTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTimingSyntheticTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTimingSyntheticTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTimingSyntheticTaskResponse response) {
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
        public Builder body(UpdateTimingSyntheticTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTimingSyntheticTaskResponse build() {
            return new UpdateTimingSyntheticTaskResponse(this);
        } 

    } 

}
