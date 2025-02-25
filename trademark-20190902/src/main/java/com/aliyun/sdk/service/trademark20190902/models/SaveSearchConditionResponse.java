// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSearchConditionResponse} extends {@link TeaModel}
 *
 * <p>SaveSearchConditionResponse</p>
 */
public class SaveSearchConditionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SaveSearchConditionResponseBody body;

    private SaveSearchConditionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveSearchConditionResponse create() {
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
    public SaveSearchConditionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSearchConditionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveSearchConditionResponseBody body);

        @Override
        SaveSearchConditionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSearchConditionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveSearchConditionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSearchConditionResponse response) {
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
        public Builder body(SaveSearchConditionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSearchConditionResponse build() {
            return new SaveSearchConditionResponse(this);
        } 

    } 

}
