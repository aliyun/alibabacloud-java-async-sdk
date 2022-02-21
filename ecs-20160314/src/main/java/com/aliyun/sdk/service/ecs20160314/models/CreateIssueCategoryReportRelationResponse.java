// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIssueCategoryReportRelationResponse} extends {@link TeaModel}
 *
 * <p>CreateIssueCategoryReportRelationResponse</p>
 */
public class CreateIssueCategoryReportRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIssueCategoryReportRelationResponseBody body;

    private CreateIssueCategoryReportRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIssueCategoryReportRelationResponse create() {
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
    public CreateIssueCategoryReportRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIssueCategoryReportRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIssueCategoryReportRelationResponseBody body);

        @Override
        CreateIssueCategoryReportRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIssueCategoryReportRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIssueCategoryReportRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIssueCategoryReportRelationResponse response) {
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
        public Builder body(CreateIssueCategoryReportRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIssueCategoryReportRelationResponse build() {
            return new CreateIssueCategoryReportRelationResponse(this);
        } 

    } 

}
