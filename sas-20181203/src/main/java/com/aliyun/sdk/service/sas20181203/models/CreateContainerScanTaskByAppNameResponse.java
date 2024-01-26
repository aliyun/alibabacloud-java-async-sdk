// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerScanTaskByAppNameResponse} extends {@link TeaModel}
 *
 * <p>CreateContainerScanTaskByAppNameResponse</p>
 */
public class CreateContainerScanTaskByAppNameResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateContainerScanTaskByAppNameResponseBody body;

    private CreateContainerScanTaskByAppNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateContainerScanTaskByAppNameResponse create() {
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
    public CreateContainerScanTaskByAppNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateContainerScanTaskByAppNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateContainerScanTaskByAppNameResponseBody body);

        @Override
        CreateContainerScanTaskByAppNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateContainerScanTaskByAppNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateContainerScanTaskByAppNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateContainerScanTaskByAppNameResponse response) {
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
        public Builder body(CreateContainerScanTaskByAppNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateContainerScanTaskByAppNameResponse build() {
            return new CreateContainerScanTaskByAppNameResponse(this);
        } 

    } 

}
