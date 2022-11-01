// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppInstanceGroupImageResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppInstanceGroupImageResponse</p>
 */
public class UpdateAppInstanceGroupImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppInstanceGroupImageResponseBody body;

    private UpdateAppInstanceGroupImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppInstanceGroupImageResponse create() {
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
    public UpdateAppInstanceGroupImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppInstanceGroupImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppInstanceGroupImageResponseBody body);

        @Override
        UpdateAppInstanceGroupImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppInstanceGroupImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppInstanceGroupImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppInstanceGroupImageResponse response) {
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
        public Builder body(UpdateAppInstanceGroupImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppInstanceGroupImageResponse build() {
            return new UpdateAppInstanceGroupImageResponse(this);
        } 

    } 

}
