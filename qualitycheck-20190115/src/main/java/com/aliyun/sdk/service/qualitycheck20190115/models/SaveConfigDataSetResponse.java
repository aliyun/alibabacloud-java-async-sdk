// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveConfigDataSetResponse} extends {@link TeaModel}
 *
 * <p>SaveConfigDataSetResponse</p>
 */
public class SaveConfigDataSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveConfigDataSetResponseBody body;

    private SaveConfigDataSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveConfigDataSetResponse create() {
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
    public SaveConfigDataSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveConfigDataSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveConfigDataSetResponseBody body);

        @Override
        SaveConfigDataSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveConfigDataSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveConfigDataSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveConfigDataSetResponse response) {
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
        public Builder body(SaveConfigDataSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveConfigDataSetResponse build() {
            return new SaveConfigDataSetResponse(this);
        } 

    } 

}
