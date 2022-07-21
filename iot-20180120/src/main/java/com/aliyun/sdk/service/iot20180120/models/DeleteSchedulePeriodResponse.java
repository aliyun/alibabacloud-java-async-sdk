// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchedulePeriodResponse} extends {@link TeaModel}
 *
 * <p>DeleteSchedulePeriodResponse</p>
 */
public class DeleteSchedulePeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSchedulePeriodResponseBody body;

    private DeleteSchedulePeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSchedulePeriodResponse create() {
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
    public DeleteSchedulePeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSchedulePeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSchedulePeriodResponseBody body);

        @Override
        DeleteSchedulePeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSchedulePeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSchedulePeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSchedulePeriodResponse response) {
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
        public Builder body(DeleteSchedulePeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSchedulePeriodResponse build() {
            return new DeleteSchedulePeriodResponse(this);
        } 

    } 

}
