// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLakeHouseSpaceResponse} extends {@link TeaModel}
 *
 * <p>CreateLakeHouseSpaceResponse</p>
 */
public class CreateLakeHouseSpaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLakeHouseSpaceResponseBody body;

    private CreateLakeHouseSpaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLakeHouseSpaceResponse create() {
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
    public CreateLakeHouseSpaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLakeHouseSpaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLakeHouseSpaceResponseBody body);

        @Override
        CreateLakeHouseSpaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLakeHouseSpaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLakeHouseSpaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLakeHouseSpaceResponse response) {
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
        public Builder body(CreateLakeHouseSpaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLakeHouseSpaceResponse build() {
            return new CreateLakeHouseSpaceResponse(this);
        } 

    } 

}
