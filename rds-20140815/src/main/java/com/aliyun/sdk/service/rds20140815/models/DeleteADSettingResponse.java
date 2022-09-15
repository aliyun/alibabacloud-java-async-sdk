// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteADSettingResponse} extends {@link TeaModel}
 *
 * <p>DeleteADSettingResponse</p>
 */
public class DeleteADSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteADSettingResponseBody body;

    private DeleteADSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteADSettingResponse create() {
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
    public DeleteADSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteADSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteADSettingResponseBody body);

        @Override
        DeleteADSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteADSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteADSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteADSettingResponse response) {
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
        public Builder body(DeleteADSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteADSettingResponse build() {
            return new DeleteADSettingResponse(this);
        } 

    } 

}
