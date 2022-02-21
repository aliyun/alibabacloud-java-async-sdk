// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDDoSTrafficInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeScdnDDoSTrafficInfoResponse</p>
 */
public class DescribeScdnDDoSTrafficInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScdnDDoSTrafficInfoResponseBody body;

    private DescribeScdnDDoSTrafficInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScdnDDoSTrafficInfoResponse create() {
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
    public DescribeScdnDDoSTrafficInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScdnDDoSTrafficInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScdnDDoSTrafficInfoResponseBody body);

        @Override
        DescribeScdnDDoSTrafficInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScdnDDoSTrafficInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScdnDDoSTrafficInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScdnDDoSTrafficInfoResponse response) {
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
        public Builder body(DescribeScdnDDoSTrafficInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScdnDDoSTrafficInfoResponse build() {
            return new DescribeScdnDDoSTrafficInfoResponse(this);
        } 

    } 

}
