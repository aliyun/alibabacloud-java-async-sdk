// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLifecycleRetrieveJobResponse} extends {@link TeaModel}
 *
 * <p>CreateLifecycleRetrieveJobResponse</p>
 */
public class CreateLifecycleRetrieveJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateLifecycleRetrieveJobResponseBody body;

    private CreateLifecycleRetrieveJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateLifecycleRetrieveJobResponse create() {
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
    public CreateLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLifecycleRetrieveJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateLifecycleRetrieveJobResponseBody body);

        @Override
        CreateLifecycleRetrieveJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLifecycleRetrieveJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateLifecycleRetrieveJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLifecycleRetrieveJobResponse response) {
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
        public Builder body(CreateLifecycleRetrieveJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLifecycleRetrieveJobResponse build() {
            return new CreateLifecycleRetrieveJobResponse(this);
        } 

    } 

}
