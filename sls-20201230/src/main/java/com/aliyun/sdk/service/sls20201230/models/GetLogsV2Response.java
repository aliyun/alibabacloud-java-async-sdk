// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogsV2Response} extends {@link TeaModel}
 *
 * <p>GetLogsV2Response</p>
 */
public class GetLogsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLogsV2ResponseBody body;

    private GetLogsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogsV2Response create() {
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
    public GetLogsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLogsV2ResponseBody body);

        @Override
        GetLogsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLogsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogsV2Response response) {
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
        public Builder body(GetLogsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogsV2Response build() {
            return new GetLogsV2Response(this);
        } 

    } 

}
