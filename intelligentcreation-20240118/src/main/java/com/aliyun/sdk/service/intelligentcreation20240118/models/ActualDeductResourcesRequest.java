// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActualDeductResourcesRequest} extends {@link RequestModel}
 *
 * <p>ActualDeductResourcesRequest</p>
 */
public class ActualDeductResourcesRequest extends Request {
    @Body
    @NameInMap("body")
    private ActualDeductResourceCmd body;

    private ActualDeductResourcesRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActualDeductResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ActualDeductResourceCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ActualDeductResourcesRequest, Builder> {
        private ActualDeductResourceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ActualDeductResourcesRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ActualDeductResourceCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ActualDeductResourcesRequest build() {
            return new ActualDeductResourcesRequest(this);
        } 

    } 

}
