// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotProbeRequest</p>
 */
public class DeleteHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("ProbeId")
    @Validation(required = true)
    private String probeId;

    private DeleteHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotProbeRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHoneypotProbeRequest, Builder> {
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotProbeRequest request) {
            super(request);
            this.probeId = request.probeId;
        } 

        /**
         * 探针id
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public DeleteHoneypotProbeRequest build() {
            return new DeleteHoneypotProbeRequest(this);
        } 

    } 

}
