// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiearth_meteorology20210928.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GridQueryResponse} extends {@link TeaModel}
 *
 * <p>GridQueryResponse</p>
 */
public class GridQueryResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GridQueryResponseBody body;

    private GridQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GridQueryResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GridQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GridQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GridQueryResponseBody body);

        @Override
        GridQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GridQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GridQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GridQueryResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GridQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GridQueryResponse build() {
            return new GridQueryResponse(this);
        } 

    } 

}
