// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppVulScanCycleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppVulScanCycleRequest</p>
 */
public class ModifyAppVulScanCycleRequest extends Request {
    @Query
    @NameInMap("Cycle")
    private String cycle;

    private ModifyAppVulScanCycleRequest(Builder builder) {
        super(builder);
        this.cycle = builder.cycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppVulScanCycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    public static final class Builder extends Request.Builder<ModifyAppVulScanCycleRequest, Builder> {
        private String cycle; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppVulScanCycleRequest request) {
            super(request);
            this.cycle = request.cycle;
        } 

        /**
         * Cycle.
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        @Override
        public ModifyAppVulScanCycleRequest build() {
            return new ModifyAppVulScanCycleRequest(this);
        } 

    } 

}
