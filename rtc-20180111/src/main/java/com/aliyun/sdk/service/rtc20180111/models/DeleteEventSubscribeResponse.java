// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventSubscribeResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventSubscribeResponse</p>
 */
public class DeleteEventSubscribeResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteEventSubscribeResponseBody body;

    private DeleteEventSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteEventSubscribeResponse create() {
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
    public DeleteEventSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteEventSubscribeResponseBody body);

        @Override
        DeleteEventSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteEventSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventSubscribeResponse response) {
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
        public Builder body(DeleteEventSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventSubscribeResponse build() {
            return new DeleteEventSubscribeResponse(this);
        } 

    } 

}
