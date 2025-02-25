// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDataSourceDetailResponse</p>
 */
public class GetDataSourceDetailResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetDataSourceDetailResponseBody body;

    private GetDataSourceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDataSourceDetailResponse create() {
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
    public GetDataSourceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataSourceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDataSourceDetailResponseBody body);

        @Override
        GetDataSourceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataSourceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDataSourceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataSourceDetailResponse response) {
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
        public Builder body(GetDataSourceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataSourceDetailResponse build() {
            return new GetDataSourceDetailResponse(this);
        } 

    } 

}
