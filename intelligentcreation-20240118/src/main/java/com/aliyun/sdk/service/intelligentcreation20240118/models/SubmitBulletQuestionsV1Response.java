// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBulletQuestionsV1Response} extends {@link TeaModel}
 *
 * <p>SubmitBulletQuestionsV1Response</p>
 */
public class SubmitBulletQuestionsV1Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SubmitBulletQuestionsQAResult body;

    private SubmitBulletQuestionsV1Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitBulletQuestionsV1Response create() {
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
    public SubmitBulletQuestionsQAResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitBulletQuestionsV1Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitBulletQuestionsQAResult body);

        @Override
        SubmitBulletQuestionsV1Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitBulletQuestionsV1Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SubmitBulletQuestionsQAResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitBulletQuestionsV1Response response) {
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
        public Builder body(SubmitBulletQuestionsQAResult body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitBulletQuestionsV1Response build() {
            return new SubmitBulletQuestionsV1Response(this);
        } 

    } 

}
