// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveMinimapResponse} extends {@link TeaModel}
 *
 * <p>SaveMinimapResponse</p>
 */
public class SaveMinimapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveMinimapResponseBody body;

    private SaveMinimapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveMinimapResponse create() {
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
    public SaveMinimapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveMinimapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveMinimapResponseBody body);

        @Override
        SaveMinimapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveMinimapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveMinimapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveMinimapResponse response) {
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
        public Builder body(SaveMinimapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveMinimapResponse build() {
            return new SaveMinimapResponse(this);
        } 

    } 

}
