// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuaraFileIdResponse} extends {@link TeaModel}
 *
 * <p>CheckQuaraFileIdResponse</p>
 */
public class CheckQuaraFileIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckQuaraFileIdResponseBody body;

    private CheckQuaraFileIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckQuaraFileIdResponse create() {
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
    public CheckQuaraFileIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckQuaraFileIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckQuaraFileIdResponseBody body);

        @Override
        CheckQuaraFileIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckQuaraFileIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckQuaraFileIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckQuaraFileIdResponse response) {
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
        public Builder body(CheckQuaraFileIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckQuaraFileIdResponse build() {
            return new CheckQuaraFileIdResponse(this);
        } 

    } 

}
