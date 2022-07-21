// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedulePeriodResponse} extends {@link TeaModel}
 *
 * <p>CreateSchedulePeriodResponse</p>
 */
public class CreateSchedulePeriodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSchedulePeriodResponseBody body;

    private CreateSchedulePeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSchedulePeriodResponse create() {
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
    public CreateSchedulePeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSchedulePeriodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSchedulePeriodResponseBody body);

        @Override
        CreateSchedulePeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSchedulePeriodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSchedulePeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSchedulePeriodResponse response) {
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
        public Builder body(CreateSchedulePeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSchedulePeriodResponse build() {
            return new CreateSchedulePeriodResponse(this);
        } 

    } 

}
