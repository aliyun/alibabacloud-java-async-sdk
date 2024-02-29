// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataSourceShareResponse} extends {@link TeaModel}
 *
 * <p>SetDataSourceShareResponse</p>
 */
public class SetDataSourceShareResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SetDataSourceShareResponseBody body;

    private SetDataSourceShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetDataSourceShareResponse create() {
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
    public SetDataSourceShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDataSourceShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetDataSourceShareResponseBody body);

        @Override
        SetDataSourceShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDataSourceShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SetDataSourceShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDataSourceShareResponse response) {
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
        public Builder body(SetDataSourceShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDataSourceShareResponse build() {
            return new SetDataSourceShareResponse(this);
        } 

    } 

}
