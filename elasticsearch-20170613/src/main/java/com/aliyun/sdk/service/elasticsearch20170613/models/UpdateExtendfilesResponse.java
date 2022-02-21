// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtendfilesResponse} extends {@link TeaModel}
 *
 * <p>UpdateExtendfilesResponse</p>
 */
public class UpdateExtendfilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateExtendfilesResponseBody body;

    private UpdateExtendfilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateExtendfilesResponse create() {
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
    public UpdateExtendfilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateExtendfilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateExtendfilesResponseBody body);

        @Override
        UpdateExtendfilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateExtendfilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateExtendfilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateExtendfilesResponse response) {
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
        public Builder body(UpdateExtendfilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateExtendfilesResponse build() {
            return new UpdateExtendfilesResponse(this);
        } 

    } 

}
