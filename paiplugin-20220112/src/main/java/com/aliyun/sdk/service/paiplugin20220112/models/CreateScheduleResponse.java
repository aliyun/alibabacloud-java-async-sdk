// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduleResponse} extends {@link TeaModel}
 *
 * <p>CreateScheduleResponse</p>
 */
public class CreateScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScheduleResponseBody body;

    private CreateScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScheduleResponse create() {
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
    public CreateScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScheduleResponseBody body);

        @Override
        CreateScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScheduleResponse response) {
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
        public Builder body(CreateScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScheduleResponse build() {
            return new CreateScheduleResponse(this);
        } 

    } 

}
