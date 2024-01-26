// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaInfoJobsResponse} extends {@link TeaModel}
 *
 * <p>ListMediaInfoJobsResponse</p>
 */
public class ListMediaInfoJobsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListMediaInfoJobsResponseBody body;

    private ListMediaInfoJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListMediaInfoJobsResponse create() {
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
    public ListMediaInfoJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMediaInfoJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListMediaInfoJobsResponseBody body);

        @Override
        ListMediaInfoJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMediaInfoJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListMediaInfoJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMediaInfoJobsResponse response) {
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
        public Builder body(ListMediaInfoJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMediaInfoJobsResponse build() {
            return new ListMediaInfoJobsResponse(this);
        } 

    } 

}
