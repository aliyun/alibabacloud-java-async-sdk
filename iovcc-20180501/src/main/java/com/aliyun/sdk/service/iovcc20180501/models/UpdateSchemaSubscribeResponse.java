// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSchemaSubscribeResponse} extends {@link TeaModel}
 *
 * <p>UpdateSchemaSubscribeResponse</p>
 */
public class UpdateSchemaSubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSchemaSubscribeResponseBody body;

    private UpdateSchemaSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSchemaSubscribeResponse create() {
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
    public UpdateSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSchemaSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSchemaSubscribeResponseBody body);

        @Override
        UpdateSchemaSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSchemaSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSchemaSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSchemaSubscribeResponse response) {
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
        public Builder body(UpdateSchemaSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSchemaSubscribeResponse build() {
            return new UpdateSchemaSubscribeResponse(this);
        } 

    } 

}
