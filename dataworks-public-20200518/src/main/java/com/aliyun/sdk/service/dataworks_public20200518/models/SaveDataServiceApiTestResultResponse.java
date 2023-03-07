// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDataServiceApiTestResultResponse} extends {@link TeaModel}
 *
 * <p>SaveDataServiceApiTestResultResponse</p>
 */
public class SaveDataServiceApiTestResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveDataServiceApiTestResultResponseBody body;

    private SaveDataServiceApiTestResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveDataServiceApiTestResultResponse create() {
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
     * @return body
     */
    public SaveDataServiceApiTestResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveDataServiceApiTestResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveDataServiceApiTestResultResponseBody body);

        @Override
        SaveDataServiceApiTestResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveDataServiceApiTestResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveDataServiceApiTestResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveDataServiceApiTestResultResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(SaveDataServiceApiTestResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveDataServiceApiTestResultResponse build() {
            return new SaveDataServiceApiTestResultResponse(this);
        } 

    } 

}
