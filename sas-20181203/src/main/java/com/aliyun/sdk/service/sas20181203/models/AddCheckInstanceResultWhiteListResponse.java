// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckInstanceResultWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddCheckInstanceResultWhiteListResponse</p>
 */
public class AddCheckInstanceResultWhiteListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddCheckInstanceResultWhiteListResponseBody body;

    private AddCheckInstanceResultWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddCheckInstanceResultWhiteListResponse create() {
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
    public AddCheckInstanceResultWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCheckInstanceResultWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddCheckInstanceResultWhiteListResponseBody body);

        @Override
        AddCheckInstanceResultWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCheckInstanceResultWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddCheckInstanceResultWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCheckInstanceResultWhiteListResponse response) {
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
        public Builder body(AddCheckInstanceResultWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCheckInstanceResultWhiteListResponse build() {
            return new AddCheckInstanceResultWhiteListResponse(this);
        } 

    } 

}
