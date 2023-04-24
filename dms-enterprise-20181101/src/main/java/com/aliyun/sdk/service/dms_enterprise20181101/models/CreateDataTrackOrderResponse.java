// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataTrackOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateDataTrackOrderResponse</p>
 */
public class CreateDataTrackOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataTrackOrderResponseBody body;

    private CreateDataTrackOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataTrackOrderResponse create() {
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
    public CreateDataTrackOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataTrackOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataTrackOrderResponseBody body);

        @Override
        CreateDataTrackOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataTrackOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataTrackOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataTrackOrderResponse response) {
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
        public Builder body(CreateDataTrackOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataTrackOrderResponse build() {
            return new CreateDataTrackOrderResponse(this);
        } 

    } 

}
