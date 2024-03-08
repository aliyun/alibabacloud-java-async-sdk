// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopywritingQAV1Request} extends {@link RequestModel}
 *
 * <p>CopywritingQAV1Request</p>
 */
public class CopywritingQAV1Request extends Request {
    @Body
    @NameInMap("body")
    private DigitalHumanLiveBroadcastQACmd body;

    private CopywritingQAV1Request(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopywritingQAV1Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DigitalHumanLiveBroadcastQACmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CopywritingQAV1Request, Builder> {
        private DigitalHumanLiveBroadcastQACmd body; 

        private Builder() {
            super();
        } 

        private Builder(CopywritingQAV1Request request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DigitalHumanLiveBroadcastQACmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CopywritingQAV1Request build() {
            return new CopywritingQAV1Request(this);
        } 

    } 

}
