// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainNoInfoSearchResponse} extends {@link TeaModel}
 *
 * <p>TrainNoInfoSearchResponse</p>
 */
public class TrainNoInfoSearchResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TrainNoInfoSearchResponseBody body;

    private TrainNoInfoSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TrainNoInfoSearchResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public TrainNoInfoSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainNoInfoSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TrainNoInfoSearchResponseBody body);

        @Override
        TrainNoInfoSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainNoInfoSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TrainNoInfoSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainNoInfoSearchResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(TrainNoInfoSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainNoInfoSearchResponse build() {
            return new TrainNoInfoSearchResponse(this);
        } 

    } 

}
