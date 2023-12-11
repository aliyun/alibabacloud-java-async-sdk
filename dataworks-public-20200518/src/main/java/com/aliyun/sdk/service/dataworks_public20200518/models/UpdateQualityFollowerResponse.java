// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityFollowerResponse} extends {@link TeaModel}
 *
 * <p>UpdateQualityFollowerResponse</p>
 */
public class UpdateQualityFollowerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQualityFollowerResponseBody body;

    private UpdateQualityFollowerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQualityFollowerResponse create() {
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
    public UpdateQualityFollowerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQualityFollowerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQualityFollowerResponseBody body);

        @Override
        UpdateQualityFollowerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQualityFollowerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQualityFollowerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQualityFollowerResponse response) {
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
        public Builder body(UpdateQualityFollowerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQualityFollowerResponse build() {
            return new UpdateQualityFollowerResponse(this);
        } 

    } 

}
