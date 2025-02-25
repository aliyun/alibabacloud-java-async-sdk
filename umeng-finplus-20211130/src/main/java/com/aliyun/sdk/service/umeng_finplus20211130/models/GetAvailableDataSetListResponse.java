// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailableDataSetListResponse} extends {@link TeaModel}
 *
 * <p>GetAvailableDataSetListResponse</p>
 */
public class GetAvailableDataSetListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetAvailableDataSetListResponseBody body;

    private GetAvailableDataSetListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAvailableDataSetListResponse create() {
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
    public GetAvailableDataSetListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAvailableDataSetListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAvailableDataSetListResponseBody body);

        @Override
        GetAvailableDataSetListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAvailableDataSetListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAvailableDataSetListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAvailableDataSetListResponse response) {
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
        public Builder body(GetAvailableDataSetListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAvailableDataSetListResponse build() {
            return new GetAvailableDataSetListResponse(this);
        } 

    } 

}
