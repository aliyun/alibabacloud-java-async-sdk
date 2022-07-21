// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateParserDataSourceResponse} extends {@link TeaModel}
 *
 * <p>UpdateParserDataSourceResponse</p>
 */
public class UpdateParserDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateParserDataSourceResponseBody body;

    private UpdateParserDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateParserDataSourceResponse create() {
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
    public UpdateParserDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateParserDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateParserDataSourceResponseBody body);

        @Override
        UpdateParserDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateParserDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateParserDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateParserDataSourceResponse response) {
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
        public Builder body(UpdateParserDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateParserDataSourceResponse build() {
            return new UpdateParserDataSourceResponse(this);
        } 

    } 

}
