// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditRoutineConfResponse} extends {@link TeaModel}
 *
 * <p>EditRoutineConfResponse</p>
 */
public class EditRoutineConfResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private EditRoutineConfResponseBody body;

    private EditRoutineConfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EditRoutineConfResponse create() {
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
    public EditRoutineConfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditRoutineConfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EditRoutineConfResponseBody body);

        @Override
        EditRoutineConfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditRoutineConfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EditRoutineConfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditRoutineConfResponse response) {
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
        public Builder body(EditRoutineConfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditRoutineConfResponse build() {
            return new EditRoutineConfResponse(this);
        } 

    } 

}
