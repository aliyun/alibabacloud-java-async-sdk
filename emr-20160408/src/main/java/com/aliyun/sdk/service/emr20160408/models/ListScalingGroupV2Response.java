// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScalingGroupV2Response} extends {@link TeaModel}
 *
 * <p>ListScalingGroupV2Response</p>
 */
public class ListScalingGroupV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScalingGroupV2ResponseBody body;

    private ListScalingGroupV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScalingGroupV2Response create() {
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
    public ListScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScalingGroupV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScalingGroupV2ResponseBody body);

        @Override
        ListScalingGroupV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScalingGroupV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScalingGroupV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScalingGroupV2Response response) {
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
        public Builder body(ListScalingGroupV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScalingGroupV2Response build() {
            return new ListScalingGroupV2Response(this);
        } 

    } 

}
