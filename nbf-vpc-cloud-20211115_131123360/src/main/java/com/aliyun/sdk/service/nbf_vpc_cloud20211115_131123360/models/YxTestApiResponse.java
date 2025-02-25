// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link YxTestApiResponse} extends {@link TeaModel}
 *
 * <p>YxTestApiResponse</p>
 */
public class YxTestApiResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private YxTestApiResponseBody body;

    private YxTestApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static YxTestApiResponse create() {
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
    public YxTestApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<YxTestApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(YxTestApiResponseBody body);

        @Override
        YxTestApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<YxTestApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private YxTestApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(YxTestApiResponse response) {
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
        public Builder body(YxTestApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public YxTestApiResponse build() {
            return new YxTestApiResponse(this);
        } 

    } 

}
