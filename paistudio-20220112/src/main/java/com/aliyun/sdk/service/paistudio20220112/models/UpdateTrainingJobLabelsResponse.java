// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTrainingJobLabelsResponse} extends {@link TeaModel}
 *
 * <p>UpdateTrainingJobLabelsResponse</p>
 */
public class UpdateTrainingJobLabelsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTrainingJobLabelsResponseBody body;

    private UpdateTrainingJobLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateTrainingJobLabelsResponse create() {
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
    public UpdateTrainingJobLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTrainingJobLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateTrainingJobLabelsResponseBody body);

        @Override
        UpdateTrainingJobLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTrainingJobLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateTrainingJobLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTrainingJobLabelsResponse response) {
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
        public Builder body(UpdateTrainingJobLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTrainingJobLabelsResponse build() {
            return new UpdateTrainingJobLabelsResponse(this);
        } 

    } 

}
