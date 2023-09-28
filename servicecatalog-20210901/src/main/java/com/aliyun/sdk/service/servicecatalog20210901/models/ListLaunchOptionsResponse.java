// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLaunchOptionsResponse} extends {@link TeaModel}
 *
 * <p>ListLaunchOptionsResponse</p>
 */
public class ListLaunchOptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListLaunchOptionsResponseBody body;

    private ListLaunchOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListLaunchOptionsResponse create() {
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
    public ListLaunchOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLaunchOptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListLaunchOptionsResponseBody body);

        @Override
        ListLaunchOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLaunchOptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListLaunchOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLaunchOptionsResponse response) {
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
        public Builder body(ListLaunchOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLaunchOptionsResponse build() {
            return new ListLaunchOptionsResponse(this);
        } 

    } 

}
