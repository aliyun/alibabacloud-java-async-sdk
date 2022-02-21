// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoginProfileResponse} extends {@link TeaModel}
 *
 * <p>UpdateLoginProfileResponse</p>
 */
public class UpdateLoginProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLoginProfileResponseBody body;

    private UpdateLoginProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLoginProfileResponse create() {
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
    public UpdateLoginProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLoginProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLoginProfileResponseBody body);

        @Override
        UpdateLoginProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLoginProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLoginProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLoginProfileResponse response) {
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
        public Builder body(UpdateLoginProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLoginProfileResponse build() {
            return new UpdateLoginProfileResponse(this);
        } 

    } 

}
