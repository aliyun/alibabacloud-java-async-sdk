// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableAddColumnResponse} extends {@link TeaModel}
 *
 * <p>UpdateTableAddColumnResponse</p>
 */
public class UpdateTableAddColumnResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTableAddColumnResponseBody body;

    private UpdateTableAddColumnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateTableAddColumnResponse create() {
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
    public UpdateTableAddColumnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTableAddColumnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateTableAddColumnResponseBody body);

        @Override
        UpdateTableAddColumnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTableAddColumnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateTableAddColumnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTableAddColumnResponse response) {
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
        public Builder body(UpdateTableAddColumnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTableAddColumnResponse build() {
            return new UpdateTableAddColumnResponse(this);
        } 

    } 

}
