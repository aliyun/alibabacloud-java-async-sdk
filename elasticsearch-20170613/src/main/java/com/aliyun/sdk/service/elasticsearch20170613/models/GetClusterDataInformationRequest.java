// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDataInformationRequest} extends {@link RequestModel}
 *
 * <p>GetClusterDataInformationRequest</p>
 */
public class GetClusterDataInformationRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    private GetClusterDataInformationRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDataInformationRequest create() {
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

    public static final class Builder extends Request.Builder<GetClusterDataInformationRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterDataInformationRequest request) {
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
        public GetClusterDataInformationRequest build() {
            return new GetClusterDataInformationRequest(this);
        } 

    } 

}
