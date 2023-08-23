// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDemoInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDemoInstanceRequest</p>
 */
public class CreateDemoInstanceRequest extends Request {
    @Query
    @NameInMap("OutboundCallWhitelist")
    @Validation(required = true)
    private String outboundCallWhitelist;

    private CreateDemoInstanceRequest(Builder builder) {
        super(builder);
        this.outboundCallWhitelist = builder.outboundCallWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDemoInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outboundCallWhitelist
     */
    public String getOutboundCallWhitelist() {
        return this.outboundCallWhitelist;
    }

    public static final class Builder extends Request.Builder<CreateDemoInstanceRequest, Builder> {
        private String outboundCallWhitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateDemoInstanceRequest request) {
            super(request);
            this.outboundCallWhitelist = request.outboundCallWhitelist;
        } 

        /**
         * OutboundCallWhitelist.
         */
        public Builder outboundCallWhitelist(String outboundCallWhitelist) {
            this.putQueryParameter("OutboundCallWhitelist", outboundCallWhitelist);
            this.outboundCallWhitelist = outboundCallWhitelist;
            return this;
        }

        @Override
        public CreateDemoInstanceRequest build() {
            return new CreateDemoInstanceRequest(this);
        } 

    } 

}
