// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSortScriptResponse} extends {@link TeaModel}
 *
 * <p>UpdateSortScriptResponse</p>
 */
public class UpdateSortScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSortScriptResponseBody body;

    private UpdateSortScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSortScriptResponse create() {
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
    public UpdateSortScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSortScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSortScriptResponseBody body);

        @Override
        UpdateSortScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSortScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSortScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSortScriptResponse response) {
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
        public Builder body(UpdateSortScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSortScriptResponse build() {
            return new UpdateSortScriptResponse(this);
        } 

    } 

}
