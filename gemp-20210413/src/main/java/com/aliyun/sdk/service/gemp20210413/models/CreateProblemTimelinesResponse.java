// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemTimelinesResponse} extends {@link TeaModel}
 *
 * <p>CreateProblemTimelinesResponse</p>
 */
public class CreateProblemTimelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProblemTimelinesResponseBody body;

    private CreateProblemTimelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProblemTimelinesResponse create() {
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
    public CreateProblemTimelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProblemTimelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProblemTimelinesResponseBody body);

        @Override
        CreateProblemTimelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProblemTimelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProblemTimelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProblemTimelinesResponse response) {
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
        public Builder body(CreateProblemTimelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProblemTimelinesResponse build() {
            return new CreateProblemTimelinesResponse(this);
        } 

    } 

}
