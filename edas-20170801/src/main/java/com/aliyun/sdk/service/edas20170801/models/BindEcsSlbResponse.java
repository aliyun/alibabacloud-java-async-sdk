// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEcsSlbResponse} extends {@link TeaModel}
 *
 * <p>BindEcsSlbResponse</p>
 */
public class BindEcsSlbResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private BindEcsSlbResponseBody body;

    private BindEcsSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BindEcsSlbResponse create() {
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
    public BindEcsSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindEcsSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BindEcsSlbResponseBody body);

        @Override
        BindEcsSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindEcsSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BindEcsSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindEcsSlbResponse response) {
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
        public Builder body(BindEcsSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindEcsSlbResponse build() {
            return new BindEcsSlbResponse(this);
        } 

    } 

}
