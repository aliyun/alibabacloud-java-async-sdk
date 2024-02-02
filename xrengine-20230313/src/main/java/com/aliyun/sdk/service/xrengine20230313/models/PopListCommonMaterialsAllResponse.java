// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListCommonMaterialsAllResponse} extends {@link TeaModel}
 *
 * <p>PopListCommonMaterialsAllResponse</p>
 */
public class PopListCommonMaterialsAllResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PopListCommonMaterialsAllResponseBody body;

    private PopListCommonMaterialsAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopListCommonMaterialsAllResponse create() {
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
    public PopListCommonMaterialsAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopListCommonMaterialsAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopListCommonMaterialsAllResponseBody body);

        @Override
        PopListCommonMaterialsAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopListCommonMaterialsAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopListCommonMaterialsAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopListCommonMaterialsAllResponse response) {
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
        public Builder body(PopListCommonMaterialsAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopListCommonMaterialsAllResponse build() {
            return new PopListCommonMaterialsAllResponse(this);
        } 

    } 

}
