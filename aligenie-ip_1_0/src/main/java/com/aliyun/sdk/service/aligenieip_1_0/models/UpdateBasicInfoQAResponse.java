// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicInfoQAResponse} extends {@link TeaModel}
 *
 * <p>UpdateBasicInfoQAResponse</p>
 */
public class UpdateBasicInfoQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBasicInfoQAResponseBody body;

    private UpdateBasicInfoQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBasicInfoQAResponse create() {
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
    public UpdateBasicInfoQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBasicInfoQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBasicInfoQAResponseBody body);

        @Override
        UpdateBasicInfoQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBasicInfoQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBasicInfoQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBasicInfoQAResponse response) {
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
        public Builder body(UpdateBasicInfoQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBasicInfoQAResponse build() {
            return new UpdateBasicInfoQAResponse(this);
        } 

    } 

}
