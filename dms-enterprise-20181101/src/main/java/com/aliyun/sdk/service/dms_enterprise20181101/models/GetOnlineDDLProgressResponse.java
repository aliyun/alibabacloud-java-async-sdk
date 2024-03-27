// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnlineDDLProgressResponse} extends {@link TeaModel}
 *
 * <p>GetOnlineDDLProgressResponse</p>
 */
public class GetOnlineDDLProgressResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetOnlineDDLProgressResponseBody body;

    private GetOnlineDDLProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOnlineDDLProgressResponse create() {
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
    public GetOnlineDDLProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOnlineDDLProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOnlineDDLProgressResponseBody body);

        @Override
        GetOnlineDDLProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOnlineDDLProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetOnlineDDLProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOnlineDDLProgressResponse response) {
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
        public Builder body(GetOnlineDDLProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOnlineDDLProgressResponse build() {
            return new GetOnlineDDLProgressResponse(this);
        } 

    } 

}
