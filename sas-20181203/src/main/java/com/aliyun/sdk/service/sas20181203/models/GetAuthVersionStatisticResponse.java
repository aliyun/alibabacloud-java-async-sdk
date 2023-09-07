// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthVersionStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetAuthVersionStatisticResponse</p>
 */
public class GetAuthVersionStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthVersionStatisticResponseBody body;

    private GetAuthVersionStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthVersionStatisticResponse create() {
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
    public GetAuthVersionStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthVersionStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthVersionStatisticResponseBody body);

        @Override
        GetAuthVersionStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthVersionStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthVersionStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthVersionStatisticResponse response) {
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
        public Builder body(GetAuthVersionStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthVersionStatisticResponse build() {
            return new GetAuthVersionStatisticResponse(this);
        } 

    } 

}
