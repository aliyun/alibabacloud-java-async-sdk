// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PmsEventReportRequest} extends {@link RequestModel}
 *
 * <p>PmsEventReportRequest</p>
 */
public class PmsEventReportRequest extends Request {
    @Body
    @NameInMap("Payload")
    @Validation(required = true)
    private String payload;

    private PmsEventReportRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PmsEventReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    public static final class Builder extends Request.Builder<PmsEventReportRequest, Builder> {
        private String payload; 

        private Builder() {
            super();
        } 

        private Builder(PmsEventReportRequest request) {
            super(request);
            this.payload = request.payload;
        } 

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        @Override
        public PmsEventReportRequest build() {
            return new PmsEventReportRequest(this);
        } 

    } 

}
