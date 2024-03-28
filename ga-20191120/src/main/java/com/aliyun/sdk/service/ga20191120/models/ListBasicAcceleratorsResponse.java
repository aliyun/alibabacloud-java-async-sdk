// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAcceleratorsResponse} extends {@link TeaModel}
 *
 * <p>ListBasicAcceleratorsResponse</p>
 */
public class ListBasicAcceleratorsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListBasicAcceleratorsResponseBody body;

    private ListBasicAcceleratorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListBasicAcceleratorsResponse create() {
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
    public ListBasicAcceleratorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBasicAcceleratorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListBasicAcceleratorsResponseBody body);

        @Override
        ListBasicAcceleratorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBasicAcceleratorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListBasicAcceleratorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBasicAcceleratorsResponse response) {
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
        public Builder body(ListBasicAcceleratorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBasicAcceleratorsResponse build() {
            return new ListBasicAcceleratorsResponse(this);
        } 

    } 

}
