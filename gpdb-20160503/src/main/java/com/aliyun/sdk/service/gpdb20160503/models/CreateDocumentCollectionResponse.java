// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDocumentCollectionResponse} extends {@link TeaModel}
 *
 * <p>CreateDocumentCollectionResponse</p>
 */
public class CreateDocumentCollectionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateDocumentCollectionResponseBody body;

    private CreateDocumentCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDocumentCollectionResponse create() {
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
    public CreateDocumentCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDocumentCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDocumentCollectionResponseBody body);

        @Override
        CreateDocumentCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDocumentCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateDocumentCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDocumentCollectionResponse response) {
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
        public Builder body(CreateDocumentCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDocumentCollectionResponse build() {
            return new CreateDocumentCollectionResponse(this);
        } 

    } 

}
