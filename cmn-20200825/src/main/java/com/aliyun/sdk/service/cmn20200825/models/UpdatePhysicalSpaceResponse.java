// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhysicalSpaceResponse} extends {@link TeaModel}
 *
 * <p>UpdatePhysicalSpaceResponse</p>
 */
public class UpdatePhysicalSpaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePhysicalSpaceResponseBody body;

    private UpdatePhysicalSpaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePhysicalSpaceResponse create() {
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
    public UpdatePhysicalSpaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePhysicalSpaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePhysicalSpaceResponseBody body);

        @Override
        UpdatePhysicalSpaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePhysicalSpaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdatePhysicalSpaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePhysicalSpaceResponse response) {
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
        public Builder body(UpdatePhysicalSpaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePhysicalSpaceResponse build() {
            return new UpdatePhysicalSpaceResponse(this);
        } 

    } 

}
