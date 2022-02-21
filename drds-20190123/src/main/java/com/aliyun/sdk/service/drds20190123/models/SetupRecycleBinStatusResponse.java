// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupRecycleBinStatusResponse} extends {@link TeaModel}
 *
 * <p>SetupRecycleBinStatusResponse</p>
 */
public class SetupRecycleBinStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetupRecycleBinStatusResponseBody body;

    private SetupRecycleBinStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetupRecycleBinStatusResponse create() {
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
    public SetupRecycleBinStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupRecycleBinStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetupRecycleBinStatusResponseBody body);

        @Override
        SetupRecycleBinStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupRecycleBinStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetupRecycleBinStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupRecycleBinStatusResponse response) {
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
        public Builder body(SetupRecycleBinStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupRecycleBinStatusResponse build() {
            return new SetupRecycleBinStatusResponse(this);
        } 

    } 

}
