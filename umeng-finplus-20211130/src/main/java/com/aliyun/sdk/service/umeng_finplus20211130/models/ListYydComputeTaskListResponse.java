// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListYydComputeTaskListResponse} extends {@link TeaModel}
 *
 * <p>ListYydComputeTaskListResponse</p>
 */
public class ListYydComputeTaskListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListYydComputeTaskListResponseBody body;

    private ListYydComputeTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListYydComputeTaskListResponse create() {
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
    public ListYydComputeTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListYydComputeTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListYydComputeTaskListResponseBody body);

        @Override
        ListYydComputeTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListYydComputeTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListYydComputeTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListYydComputeTaskListResponse response) {
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
        public Builder body(ListYydComputeTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListYydComputeTaskListResponse build() {
            return new ListYydComputeTaskListResponse(this);
        } 

    } 

}
