// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRDSToClickhouseDbResponse} extends {@link TeaModel}
 *
 * <p>CreateRDSToClickhouseDbResponse</p>
 */
public class CreateRDSToClickhouseDbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRDSToClickhouseDbResponseBody body;

    private CreateRDSToClickhouseDbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRDSToClickhouseDbResponse create() {
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
    public CreateRDSToClickhouseDbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRDSToClickhouseDbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRDSToClickhouseDbResponseBody body);

        @Override
        CreateRDSToClickhouseDbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRDSToClickhouseDbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRDSToClickhouseDbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRDSToClickhouseDbResponse response) {
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
        public Builder body(CreateRDSToClickhouseDbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRDSToClickhouseDbResponse build() {
            return new CreateRDSToClickhouseDbResponse(this);
        } 

    } 

}
