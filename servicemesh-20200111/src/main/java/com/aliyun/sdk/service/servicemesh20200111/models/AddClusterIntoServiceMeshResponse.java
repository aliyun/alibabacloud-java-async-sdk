// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterIntoServiceMeshResponse} extends {@link TeaModel}
 *
 * <p>AddClusterIntoServiceMeshResponse</p>
 */
public class AddClusterIntoServiceMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private AddClusterIntoServiceMeshResponseBody body;

    private AddClusterIntoServiceMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddClusterIntoServiceMeshResponse create() {
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
    public AddClusterIntoServiceMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddClusterIntoServiceMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddClusterIntoServiceMeshResponseBody body);

        @Override
        AddClusterIntoServiceMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddClusterIntoServiceMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddClusterIntoServiceMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddClusterIntoServiceMeshResponse response) {
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
        public Builder body(AddClusterIntoServiceMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddClusterIntoServiceMeshResponse build() {
            return new AddClusterIntoServiceMeshResponse(this);
        } 

    } 

}
