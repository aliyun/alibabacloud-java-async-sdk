// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemResponse</p>
 */
public class UpdateProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProblemResponseBody body;

    private UpdateProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProblemResponse create() {
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
    public UpdateProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProblemResponseBody body);

        @Override
        UpdateProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemResponse response) {
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
        public Builder body(UpdateProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemResponse build() {
            return new UpdateProblemResponse(this);
        } 

    } 

}
