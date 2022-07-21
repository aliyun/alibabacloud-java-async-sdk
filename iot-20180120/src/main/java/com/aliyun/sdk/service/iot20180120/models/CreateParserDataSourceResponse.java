// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParserDataSourceResponse} extends {@link TeaModel}
 *
 * <p>CreateParserDataSourceResponse</p>
 */
public class CreateParserDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateParserDataSourceResponseBody body;

    private CreateParserDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateParserDataSourceResponse create() {
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
    public CreateParserDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateParserDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateParserDataSourceResponseBody body);

        @Override
        CreateParserDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateParserDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateParserDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateParserDataSourceResponse response) {
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
        public Builder body(CreateParserDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateParserDataSourceResponse build() {
            return new CreateParserDataSourceResponse(this);
        } 

    } 

}
