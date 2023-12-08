// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoadSampleDataSetResponse} extends {@link TeaModel}
 *
 * <p>LoadSampleDataSetResponse</p>
 */
public class LoadSampleDataSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LoadSampleDataSetResponseBody body;

    private LoadSampleDataSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LoadSampleDataSetResponse create() {
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
    public LoadSampleDataSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LoadSampleDataSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LoadSampleDataSetResponseBody body);

        @Override
        LoadSampleDataSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LoadSampleDataSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LoadSampleDataSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LoadSampleDataSetResponse response) {
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
        public Builder body(LoadSampleDataSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LoadSampleDataSetResponse build() {
            return new LoadSampleDataSetResponse(this);
        } 

    } 

}
