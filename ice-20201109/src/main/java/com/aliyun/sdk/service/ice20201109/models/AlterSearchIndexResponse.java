// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlterSearchIndexResponse} extends {@link TeaModel}
 *
 * <p>AlterSearchIndexResponse</p>
 */
public class AlterSearchIndexResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AlterSearchIndexResponseBody body;

    private AlterSearchIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AlterSearchIndexResponse create() {
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
    public AlterSearchIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AlterSearchIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AlterSearchIndexResponseBody body);

        @Override
        AlterSearchIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AlterSearchIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AlterSearchIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AlterSearchIndexResponse response) {
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
        public Builder body(AlterSearchIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AlterSearchIndexResponse build() {
            return new AlterSearchIndexResponse(this);
        } 

    } 

}
