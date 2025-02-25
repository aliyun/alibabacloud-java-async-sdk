// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTagDropListResponse} extends {@link TeaModel}
 *
 * <p>GetResourceTagDropListResponse</p>
 */
public class GetResourceTagDropListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetResourceTagDropListResponseBody body;

    private GetResourceTagDropListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetResourceTagDropListResponse create() {
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
    public GetResourceTagDropListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceTagDropListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetResourceTagDropListResponseBody body);

        @Override
        GetResourceTagDropListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceTagDropListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetResourceTagDropListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceTagDropListResponse response) {
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
        public Builder body(GetResourceTagDropListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceTagDropListResponse build() {
            return new GetResourceTagDropListResponse(this);
        } 

    } 

}
