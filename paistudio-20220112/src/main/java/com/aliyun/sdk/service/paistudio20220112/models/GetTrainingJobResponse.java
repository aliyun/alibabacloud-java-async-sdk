// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrainingJobResponse} extends {@link TeaModel}
 *
 * <p>GetTrainingJobResponse</p>
 */
public class GetTrainingJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrainingJobResponseBody body;

    private GetTrainingJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrainingJobResponse create() {
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
    public GetTrainingJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrainingJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrainingJobResponseBody body);

        @Override
        GetTrainingJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrainingJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrainingJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrainingJobResponse response) {
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
        public Builder body(GetTrainingJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrainingJobResponse build() {
            return new GetTrainingJobResponse(this);
        } 

    } 

}
