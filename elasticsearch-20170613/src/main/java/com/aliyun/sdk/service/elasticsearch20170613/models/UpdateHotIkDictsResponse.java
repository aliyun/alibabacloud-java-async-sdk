// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHotIkDictsResponse} extends {@link TeaModel}
 *
 * <p>UpdateHotIkDictsResponse</p>
 */
public class UpdateHotIkDictsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHotIkDictsResponseBody body;

    private UpdateHotIkDictsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHotIkDictsResponse create() {
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
    public UpdateHotIkDictsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHotIkDictsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHotIkDictsResponseBody body);

        @Override
        UpdateHotIkDictsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHotIkDictsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHotIkDictsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHotIkDictsResponse response) {
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
        public Builder body(UpdateHotIkDictsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHotIkDictsResponse build() {
            return new UpdateHotIkDictsResponse(this);
        } 

    } 

}
