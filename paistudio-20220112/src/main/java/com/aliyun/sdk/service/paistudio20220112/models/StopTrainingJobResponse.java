// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTrainingJobResponse} extends {@link TeaModel}
 *
 * <p>StopTrainingJobResponse</p>
 */
public class StopTrainingJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTrainingJobResponseBody body;

    private StopTrainingJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTrainingJobResponse create() {
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
    public StopTrainingJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTrainingJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTrainingJobResponseBody body);

        @Override
        StopTrainingJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTrainingJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTrainingJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTrainingJobResponse response) {
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
        public Builder body(StopTrainingJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTrainingJobResponse build() {
            return new StopTrainingJobResponse(this);
        } 

    } 

}
