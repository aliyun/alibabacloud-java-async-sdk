// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCronClearConfigResponse} extends {@link TeaModel}
 *
 * <p>GetDataCronClearConfigResponse</p>
 */
public class GetDataCronClearConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCronClearConfigResponseBody body;

    private GetDataCronClearConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCronClearConfigResponse create() {
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
    public GetDataCronClearConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCronClearConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCronClearConfigResponseBody body);

        @Override
        GetDataCronClearConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCronClearConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCronClearConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCronClearConfigResponse response) {
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
        public Builder body(GetDataCronClearConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCronClearConfigResponse build() {
            return new GetDataCronClearConfigResponse(this);
        } 

    } 

}
