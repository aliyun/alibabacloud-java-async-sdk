// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrainingJobLabelsResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrainingJobLabelsResponse</p>
 */
public class UpdateTrainingJobLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTrainingJobLabelsResponseBody body;

    private UpdateTrainingJobLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTrainingJobLabelsResponse create() {
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
    public UpdateTrainingJobLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrainingJobLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTrainingJobLabelsResponseBody body);

        @Override
        UpdateTrainingJobLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrainingJobLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTrainingJobLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrainingJobLabelsResponse response) {
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
        public Builder body(UpdateTrainingJobLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrainingJobLabelsResponse build() {
            return new UpdateTrainingJobLabelsResponse(this);
        } 

    } 

}
