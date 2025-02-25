// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceEntityResponse} extends {@link TeaModel}
 *
 * <p>AddFaceEntityResponse</p>
 */
public class AddFaceEntityResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddFaceEntityResponseBody body;

    private AddFaceEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddFaceEntityResponse create() {
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
    public AddFaceEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddFaceEntityResponseBody body);

        @Override
        AddFaceEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddFaceEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceEntityResponse response) {
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
        public Builder body(AddFaceEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceEntityResponse build() {
            return new AddFaceEntityResponse(this);
        } 

    } 

}
