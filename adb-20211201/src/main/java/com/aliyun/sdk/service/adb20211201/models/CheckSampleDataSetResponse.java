// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSampleDataSetResponse} extends {@link TeaModel}
 *
 * <p>CheckSampleDataSetResponse</p>
 */
public class CheckSampleDataSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckSampleDataSetResponseBody body;

    private CheckSampleDataSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckSampleDataSetResponse create() {
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
    public CheckSampleDataSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckSampleDataSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckSampleDataSetResponseBody body);

        @Override
        CheckSampleDataSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckSampleDataSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckSampleDataSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckSampleDataSetResponse response) {
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
        public Builder body(CheckSampleDataSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckSampleDataSetResponse build() {
            return new CheckSampleDataSetResponse(this);
        } 

    } 

}
