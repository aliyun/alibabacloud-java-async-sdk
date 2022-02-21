// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnDataResponse} extends {@link TeaModel}
 *
 * <p>UpdateConnDataResponse</p>
 */
public class UpdateConnDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConnDataResponseBody body;

    private UpdateConnDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConnDataResponse create() {
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
    public UpdateConnDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConnDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConnDataResponseBody body);

        @Override
        UpdateConnDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConnDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConnDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConnDataResponse response) {
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
        public Builder body(UpdateConnDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConnDataResponse build() {
            return new UpdateConnDataResponse(this);
        } 

    } 

}
