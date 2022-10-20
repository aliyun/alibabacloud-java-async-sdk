// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityCheckDataResponse} extends {@link TeaModel}
 *
 * <p>UpdateQualityCheckDataResponse</p>
 */
public class UpdateQualityCheckDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQualityCheckDataResponseBody body;

    private UpdateQualityCheckDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQualityCheckDataResponse create() {
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
    public UpdateQualityCheckDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQualityCheckDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQualityCheckDataResponseBody body);

        @Override
        UpdateQualityCheckDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQualityCheckDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQualityCheckDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQualityCheckDataResponse response) {
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
        public Builder body(UpdateQualityCheckDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQualityCheckDataResponse build() {
            return new UpdateQualityCheckDataResponse(this);
        } 

    } 

}
