// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemMeasureResponse} extends {@link TeaModel}
 *
 * <p>CreateProblemMeasureResponse</p>
 */
public class CreateProblemMeasureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProblemMeasureResponseBody body;

    private CreateProblemMeasureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProblemMeasureResponse create() {
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
    public CreateProblemMeasureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProblemMeasureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProblemMeasureResponseBody body);

        @Override
        CreateProblemMeasureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProblemMeasureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProblemMeasureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProblemMeasureResponse response) {
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
        public Builder body(CreateProblemMeasureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProblemMeasureResponse build() {
            return new CreateProblemMeasureResponse(this);
        } 

    } 

}
