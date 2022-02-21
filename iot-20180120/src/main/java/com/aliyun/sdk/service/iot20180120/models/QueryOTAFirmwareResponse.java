// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOTAFirmwareResponse} extends {@link TeaModel}
 *
 * <p>QueryOTAFirmwareResponse</p>
 */
public class QueryOTAFirmwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOTAFirmwareResponseBody body;

    private QueryOTAFirmwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOTAFirmwareResponse create() {
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
    public QueryOTAFirmwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOTAFirmwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOTAFirmwareResponseBody body);

        @Override
        QueryOTAFirmwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOTAFirmwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOTAFirmwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOTAFirmwareResponse response) {
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
        public Builder body(QueryOTAFirmwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOTAFirmwareResponse build() {
            return new QueryOTAFirmwareResponse(this);
        } 

    } 

}
