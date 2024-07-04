// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateParameterSetResponse} extends {@link TeaModel}
 *
 * <p>AssociateParameterSetResponse</p>
 */
public class AssociateParameterSetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AssociateParameterSetResponseBody body;

    private AssociateParameterSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AssociateParameterSetResponse create() {
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
    public AssociateParameterSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateParameterSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AssociateParameterSetResponseBody body);

        @Override
        AssociateParameterSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateParameterSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AssociateParameterSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateParameterSetResponse response) {
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
        public Builder body(AssociateParameterSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateParameterSetResponse build() {
            return new AssociateParameterSetResponse(this);
        } 

    } 

}
