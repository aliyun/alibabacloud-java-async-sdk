// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotProbeRequest</p>
 */
public class GetHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("ProbeId")
    @Validation(required = true)
    private String probeId;

    private GetHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return probeId
     */
    public String getProbeId() {
        return this.probeId;
    }

    public static final class Builder extends Request.Builder<GetHoneypotProbeRequest, Builder> {
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotProbeRequest request) {
            super(request);
            this.probeId = request.probeId;
        } 

        /**
         * The ID of the probe.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public GetHoneypotProbeRequest build() {
            return new GetHoneypotProbeRequest(this);
        } 

    } 

}
