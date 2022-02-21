// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveHotspotTagResponse} extends {@link TeaModel}
 *
 * <p>SaveHotspotTagResponse</p>
 */
public class SaveHotspotTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveHotspotTagResponseBody body;

    private SaveHotspotTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveHotspotTagResponse create() {
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
    public SaveHotspotTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveHotspotTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveHotspotTagResponseBody body);

        @Override
        SaveHotspotTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveHotspotTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveHotspotTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveHotspotTagResponse response) {
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
        public Builder body(SaveHotspotTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveHotspotTagResponse build() {
            return new SaveHotspotTagResponse(this);
        } 

    } 

}
