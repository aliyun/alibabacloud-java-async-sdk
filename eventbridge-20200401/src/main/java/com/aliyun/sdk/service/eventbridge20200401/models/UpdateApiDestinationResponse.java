// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateApiDestinationResponse} extends {@link TeaModel}
 *
 * <p>UpdateApiDestinationResponse</p>
 */
public class UpdateApiDestinationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateApiDestinationResponseBody body;

    private UpdateApiDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateApiDestinationResponse create() {
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
    public UpdateApiDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateApiDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateApiDestinationResponseBody body);

        @Override
        UpdateApiDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateApiDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateApiDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateApiDestinationResponse response) {
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
        public Builder body(UpdateApiDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateApiDestinationResponse build() {
            return new UpdateApiDestinationResponse(this);
        } 

    } 

}
