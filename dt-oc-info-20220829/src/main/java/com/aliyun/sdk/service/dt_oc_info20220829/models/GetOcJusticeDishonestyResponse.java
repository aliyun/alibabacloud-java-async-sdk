// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeDishonestyResponse} extends {@link TeaModel}
 *
 * <p>GetOcJusticeDishonestyResponse</p>
 */
public class GetOcJusticeDishonestyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcJusticeDishonestyResponseBody body;

    private GetOcJusticeDishonestyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcJusticeDishonestyResponse create() {
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
    public GetOcJusticeDishonestyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcJusticeDishonestyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcJusticeDishonestyResponseBody body);

        @Override
        GetOcJusticeDishonestyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcJusticeDishonestyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcJusticeDishonestyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcJusticeDishonestyResponse response) {
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
        public Builder body(GetOcJusticeDishonestyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcJusticeDishonestyResponse build() {
            return new GetOcJusticeDishonestyResponse(this);
        } 

    } 

}
