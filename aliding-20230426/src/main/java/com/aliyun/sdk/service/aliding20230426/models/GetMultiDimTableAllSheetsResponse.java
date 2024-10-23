// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMultiDimTableAllSheetsResponse} extends {@link TeaModel}
 *
 * <p>GetMultiDimTableAllSheetsResponse</p>
 */
public class GetMultiDimTableAllSheetsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetMultiDimTableAllSheetsResponseBody body;

    private GetMultiDimTableAllSheetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMultiDimTableAllSheetsResponse create() {
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
    public GetMultiDimTableAllSheetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiDimTableAllSheetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMultiDimTableAllSheetsResponseBody body);

        @Override
        GetMultiDimTableAllSheetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiDimTableAllSheetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetMultiDimTableAllSheetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiDimTableAllSheetsResponse response) {
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
        public Builder body(GetMultiDimTableAllSheetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiDimTableAllSheetsResponse build() {
            return new GetMultiDimTableAllSheetsResponse(this);
        } 

    } 

}
