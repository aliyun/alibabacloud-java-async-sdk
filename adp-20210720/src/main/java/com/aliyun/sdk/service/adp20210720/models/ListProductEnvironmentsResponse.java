// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductEnvironmentsResponse} extends {@link TeaModel}
 *
 * <p>ListProductEnvironmentsResponse</p>
 */
public class ListProductEnvironmentsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListProductEnvironmentsResponseBody body;

    private ListProductEnvironmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListProductEnvironmentsResponse create() {
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
    public ListProductEnvironmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductEnvironmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListProductEnvironmentsResponseBody body);

        @Override
        ListProductEnvironmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductEnvironmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListProductEnvironmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductEnvironmentsResponse response) {
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
        public Builder body(ListProductEnvironmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductEnvironmentsResponse build() {
            return new ListProductEnvironmentsResponse(this);
        } 

    } 

}
