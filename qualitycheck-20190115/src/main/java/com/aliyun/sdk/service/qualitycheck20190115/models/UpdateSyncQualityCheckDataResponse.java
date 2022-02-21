// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSyncQualityCheckDataResponse} extends {@link TeaModel}
 *
 * <p>UpdateSyncQualityCheckDataResponse</p>
 */
public class UpdateSyncQualityCheckDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSyncQualityCheckDataResponseBody body;

    private UpdateSyncQualityCheckDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSyncQualityCheckDataResponse create() {
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
    public UpdateSyncQualityCheckDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSyncQualityCheckDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSyncQualityCheckDataResponseBody body);

        @Override
        UpdateSyncQualityCheckDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSyncQualityCheckDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSyncQualityCheckDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSyncQualityCheckDataResponse response) {
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
        public Builder body(UpdateSyncQualityCheckDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSyncQualityCheckDataResponse build() {
            return new UpdateSyncQualityCheckDataResponse(this);
        } 

    } 

}
