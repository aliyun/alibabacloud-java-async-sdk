// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpsResponse} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpsResponse</p>
 */
public class ListBasicAccelerateIpsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListBasicAccelerateIpsResponseBody body;

    private ListBasicAccelerateIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListBasicAccelerateIpsResponse create() {
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
    public ListBasicAccelerateIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBasicAccelerateIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListBasicAccelerateIpsResponseBody body);

        @Override
        ListBasicAccelerateIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBasicAccelerateIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListBasicAccelerateIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBasicAccelerateIpsResponse response) {
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
        public Builder body(ListBasicAccelerateIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBasicAccelerateIpsResponse build() {
            return new ListBasicAccelerateIpsResponse(this);
        } 

    } 

}
