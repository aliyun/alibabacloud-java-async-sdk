// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHBaseSlbServerResponse} extends {@link TeaModel}
 *
 * <p>CreateHBaseSlbServerResponse</p>
 */
public class CreateHBaseSlbServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHBaseSlbServerResponseBody body;

    private CreateHBaseSlbServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHBaseSlbServerResponse create() {
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
    public CreateHBaseSlbServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHBaseSlbServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHBaseSlbServerResponseBody body);

        @Override
        CreateHBaseSlbServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHBaseSlbServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHBaseSlbServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHBaseSlbServerResponse response) {
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
        public Builder body(CreateHBaseSlbServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHBaseSlbServerResponse build() {
            return new CreateHBaseSlbServerResponse(this);
        } 

    } 

}
