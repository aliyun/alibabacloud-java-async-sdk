// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowProjectClusterSettingResponse} extends {@link TeaModel}
 *
 * <p>ListFlowProjectClusterSettingResponse</p>
 */
public class ListFlowProjectClusterSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowProjectClusterSettingResponseBody body;

    private ListFlowProjectClusterSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowProjectClusterSettingResponse create() {
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
    public ListFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowProjectClusterSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowProjectClusterSettingResponseBody body);

        @Override
        ListFlowProjectClusterSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowProjectClusterSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowProjectClusterSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowProjectClusterSettingResponse response) {
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
        public Builder body(ListFlowProjectClusterSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowProjectClusterSettingResponse build() {
            return new ListFlowProjectClusterSettingResponse(this);
        } 

    } 

}
