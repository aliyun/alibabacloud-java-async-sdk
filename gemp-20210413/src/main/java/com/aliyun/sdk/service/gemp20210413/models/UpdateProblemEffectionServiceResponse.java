// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemEffectionServiceResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemEffectionServiceResponse</p>
 */
public class UpdateProblemEffectionServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateProblemEffectionServiceResponseBody body;

    private UpdateProblemEffectionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateProblemEffectionServiceResponse create() {
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
    public UpdateProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemEffectionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateProblemEffectionServiceResponseBody body);

        @Override
        UpdateProblemEffectionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemEffectionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateProblemEffectionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemEffectionServiceResponse response) {
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
        public Builder body(UpdateProblemEffectionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemEffectionServiceResponse build() {
            return new UpdateProblemEffectionServiceResponse(this);
        } 

    } 

}
