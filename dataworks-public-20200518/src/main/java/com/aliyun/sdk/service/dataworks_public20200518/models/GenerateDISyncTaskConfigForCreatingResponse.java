// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateDISyncTaskConfigForCreatingResponse} extends {@link TeaModel}
 *
 * <p>GenerateDISyncTaskConfigForCreatingResponse</p>
 */
public class GenerateDISyncTaskConfigForCreatingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GenerateDISyncTaskConfigForCreatingResponseBody body;

    private GenerateDISyncTaskConfigForCreatingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateDISyncTaskConfigForCreatingResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public GenerateDISyncTaskConfigForCreatingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDISyncTaskConfigForCreatingResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateDISyncTaskConfigForCreatingResponseBody body);

        @Override
        GenerateDISyncTaskConfigForCreatingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDISyncTaskConfigForCreatingResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GenerateDISyncTaskConfigForCreatingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDISyncTaskConfigForCreatingResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(GenerateDISyncTaskConfigForCreatingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDISyncTaskConfigForCreatingResponse build() {
            return new GenerateDISyncTaskConfigForCreatingResponse(this);
        } 

    } 

}
