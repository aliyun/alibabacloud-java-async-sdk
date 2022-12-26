// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterCnnfStatusDetailResponse} extends {@link TeaModel}
 *
 * <p>ListClusterCnnfStatusDetailResponse</p>
 */
public class ListClusterCnnfStatusDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterCnnfStatusDetailResponseBody body;

    private ListClusterCnnfStatusDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterCnnfStatusDetailResponse create() {
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
    public ListClusterCnnfStatusDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterCnnfStatusDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterCnnfStatusDetailResponseBody body);

        @Override
        ListClusterCnnfStatusDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterCnnfStatusDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterCnnfStatusDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterCnnfStatusDetailResponse response) {
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
        public Builder body(ListClusterCnnfStatusDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterCnnfStatusDetailResponse build() {
            return new ListClusterCnnfStatusDetailResponse(this);
        } 

    } 

}
