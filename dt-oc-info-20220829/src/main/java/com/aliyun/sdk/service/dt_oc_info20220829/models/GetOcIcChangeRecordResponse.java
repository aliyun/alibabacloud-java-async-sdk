// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcChangeRecordResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcChangeRecordResponse</p>
 */
public class GetOcIcChangeRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcChangeRecordResponseBody body;

    private GetOcIcChangeRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcChangeRecordResponse create() {
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
    public GetOcIcChangeRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcChangeRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcChangeRecordResponseBody body);

        @Override
        GetOcIcChangeRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcChangeRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcChangeRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcChangeRecordResponse response) {
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
        public Builder body(GetOcIcChangeRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcChangeRecordResponse build() {
            return new GetOcIcChangeRecordResponse(this);
        } 

    } 

}
