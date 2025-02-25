// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDeductResourceRequest} extends {@link RequestModel}
 *
 * <p>DirectDeductResourceRequest</p>
 */
public class DirectDeductResourceRequest extends Request {
    @Body
    @NameInMap("body")
    private DirectDeductResourceCmd body;

    private DirectDeductResourceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectDeductResourceRequest create() {
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

    public static final class Builder extends Request.Builder<DirectDeductResourceRequest, Builder> {
        private DirectDeductResourceCmd body; 

        private Builder() {
            super();
        } 

        private Builder(DirectDeductResourceRequest request) {
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
        public DirectDeductResourceRequest build() {
            return new DirectDeductResourceRequest(this);
        } 

    } 

}
