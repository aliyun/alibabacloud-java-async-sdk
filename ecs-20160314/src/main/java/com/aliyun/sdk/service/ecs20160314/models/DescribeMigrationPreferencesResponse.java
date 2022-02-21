// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationPreferencesResponse} extends {@link TeaModel}
 *
 * <p>DescribeMigrationPreferencesResponse</p>
 */
public class DescribeMigrationPreferencesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMigrationPreferencesResponseBody body;

    private DescribeMigrationPreferencesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMigrationPreferencesResponse create() {
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
    public DescribeMigrationPreferencesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMigrationPreferencesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMigrationPreferencesResponseBody body);

        @Override
        DescribeMigrationPreferencesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMigrationPreferencesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMigrationPreferencesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMigrationPreferencesResponse response) {
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
        public Builder body(DescribeMigrationPreferencesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMigrationPreferencesResponse build() {
            return new DescribeMigrationPreferencesResponse(this);
        } 

    } 

}
