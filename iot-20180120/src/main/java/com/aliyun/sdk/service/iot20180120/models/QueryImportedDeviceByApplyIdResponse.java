// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryImportedDeviceByApplyIdResponse} extends {@link TeaModel}
 *
 * <p>QueryImportedDeviceByApplyIdResponse</p>
 */
public class QueryImportedDeviceByApplyIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryImportedDeviceByApplyIdResponseBody body;

    private QueryImportedDeviceByApplyIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryImportedDeviceByApplyIdResponse create() {
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
    public QueryImportedDeviceByApplyIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryImportedDeviceByApplyIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryImportedDeviceByApplyIdResponseBody body);

        @Override
        QueryImportedDeviceByApplyIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryImportedDeviceByApplyIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryImportedDeviceByApplyIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryImportedDeviceByApplyIdResponse response) {
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
        public Builder body(QueryImportedDeviceByApplyIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryImportedDeviceByApplyIdResponse build() {
            return new QueryImportedDeviceByApplyIdResponse(this);
        } 

    } 

}
