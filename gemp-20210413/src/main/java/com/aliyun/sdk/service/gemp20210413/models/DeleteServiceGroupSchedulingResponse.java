// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceGroupSchedulingResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceGroupSchedulingResponse</p>
 */
public class DeleteServiceGroupSchedulingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteServiceGroupSchedulingResponseBody body;

    private DeleteServiceGroupSchedulingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteServiceGroupSchedulingResponse create() {
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
    public DeleteServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceGroupSchedulingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteServiceGroupSchedulingResponseBody body);

        @Override
        DeleteServiceGroupSchedulingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceGroupSchedulingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteServiceGroupSchedulingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceGroupSchedulingResponse response) {
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
        public Builder body(DeleteServiceGroupSchedulingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceGroupSchedulingResponse build() {
            return new DeleteServiceGroupSchedulingResponse(this);
        } 

    } 

}
