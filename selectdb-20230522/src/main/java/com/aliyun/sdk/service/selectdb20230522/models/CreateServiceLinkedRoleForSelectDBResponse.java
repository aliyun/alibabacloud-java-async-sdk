// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceLinkedRoleForSelectDBResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleForSelectDBResponse</p>
 */
public class CreateServiceLinkedRoleForSelectDBResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateServiceLinkedRoleForSelectDBResponseBody body;

    private CreateServiceLinkedRoleForSelectDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateServiceLinkedRoleForSelectDBResponse create() {
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
    public CreateServiceLinkedRoleForSelectDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceLinkedRoleForSelectDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateServiceLinkedRoleForSelectDBResponseBody body);

        @Override
        CreateServiceLinkedRoleForSelectDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceLinkedRoleForSelectDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateServiceLinkedRoleForSelectDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceLinkedRoleForSelectDBResponse response) {
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
        public Builder body(CreateServiceLinkedRoleForSelectDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleForSelectDBResponse build() {
            return new CreateServiceLinkedRoleForSelectDBResponse(this);
        } 

    } 

}
