// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>GetMonitorDataRequest</p>
 */
public class GetMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private GetMonitorDataRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetMonitorDataRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetMonitorDataRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetMonitorDataRequest build() {
            return new GetMonitorDataRequest(this);
        } 

    } 

}
