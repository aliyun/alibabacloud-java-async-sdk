// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RetryInstallProbeRequest} extends {@link RequestModel}
 *
 * <p>RetryInstallProbeRequest</p>
 */
public class RetryInstallProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    private String probeId;

    private RetryInstallProbeRequest(Builder builder) {
        super(builder);
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryInstallProbeRequest create() {
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

    public static final class Builder extends Request.Builder<RetryInstallProbeRequest, Builder> {
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(RetryInstallProbeRequest request) {
            super(request);
            this.probeId = request.probeId;
        } 

        /**
         * <p>The probe ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c4c47cc1-f60a-4b2f-bcdb-9aed6644****</p>
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public RetryInstallProbeRequest build() {
            return new RetryInstallProbeRequest(this);
        } 

    } 

}
