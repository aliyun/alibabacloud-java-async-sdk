// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDrdsDbRdsRelationInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDrdsDbRdsRelationInfoResponse</p>
 */
public class GetDrdsDbRdsRelationInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDrdsDbRdsRelationInfoResponseBody body;

    private GetDrdsDbRdsRelationInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDrdsDbRdsRelationInfoResponse create() {
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
    public GetDrdsDbRdsRelationInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDrdsDbRdsRelationInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDrdsDbRdsRelationInfoResponseBody body);

        @Override
        GetDrdsDbRdsRelationInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDrdsDbRdsRelationInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDrdsDbRdsRelationInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDrdsDbRdsRelationInfoResponse response) {
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
        public Builder body(GetDrdsDbRdsRelationInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDrdsDbRdsRelationInfoResponse build() {
            return new GetDrdsDbRdsRelationInfoResponse(this);
        } 

    } 

}
