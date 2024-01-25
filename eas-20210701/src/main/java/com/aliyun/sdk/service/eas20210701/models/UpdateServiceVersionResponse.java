// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceVersionResponse</p>
 */
public class UpdateServiceVersionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateServiceVersionResponseBody body;

    private UpdateServiceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateServiceVersionResponse create() {
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
    public UpdateServiceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateServiceVersionResponseBody body);

        @Override
        UpdateServiceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateServiceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceVersionResponse response) {
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
        public Builder body(UpdateServiceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceVersionResponse build() {
            return new UpdateServiceVersionResponse(this);
        } 

    } 

}
