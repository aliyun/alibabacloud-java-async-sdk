// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactDeletionStatusResponse} extends {@link TeaModel}
 *
 * <p>GetMessageContactDeletionStatusResponse</p>
 */
public class GetMessageContactDeletionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageContactDeletionStatusResponseBody body;

    private GetMessageContactDeletionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageContactDeletionStatusResponse create() {
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
    public GetMessageContactDeletionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageContactDeletionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageContactDeletionStatusResponseBody body);

        @Override
        GetMessageContactDeletionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageContactDeletionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageContactDeletionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageContactDeletionStatusResponse response) {
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
        public Builder body(GetMessageContactDeletionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageContactDeletionStatusResponse build() {
            return new GetMessageContactDeletionStatusResponse(this);
        } 

    } 

}
