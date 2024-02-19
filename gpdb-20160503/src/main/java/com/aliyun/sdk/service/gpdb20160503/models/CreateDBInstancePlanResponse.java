// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstancePlanResponse} extends {@link TeaModel}
 *
 * <p>CreateDBInstancePlanResponse</p>
 */
public class CreateDBInstancePlanResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateDBInstancePlanResponseBody body;

    private CreateDBInstancePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDBInstancePlanResponse create() {
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
    public CreateDBInstancePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBInstancePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDBInstancePlanResponseBody body);

        @Override
        CreateDBInstancePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBInstancePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateDBInstancePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBInstancePlanResponse response) {
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
        public Builder body(CreateDBInstancePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBInstancePlanResponse build() {
            return new CreateDBInstancePlanResponse(this);
        } 

    } 

}
