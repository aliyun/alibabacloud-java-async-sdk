// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDeductResourcesRequest} extends {@link RequestModel}
 *
 * <p>DirectDeductResourcesRequest</p>
 */
public class DirectDeductResourcesRequest extends Request {
    @Body
    @NameInMap("body")
    private DirectDeductResourceCmd body;

    private DirectDeductResourcesRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectDeductResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DirectDeductResourceCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DirectDeductResourcesRequest, Builder> {
        private DirectDeductResourceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(DirectDeductResourcesRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DirectDeductResourceCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DirectDeductResourcesRequest build() {
            return new DirectDeductResourcesRequest(this);
        } 

    } 

}
