// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse} extends {@link TeaModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body;

    private SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse create() {
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
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body);

        @Override
        SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse response) {
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
        public Builder body(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse build() {
            return new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse(this);
        } 

    } 

}
