// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppVulScanCycleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppVulScanCycleRequest</p>
 */
public class ModifyAppVulScanCycleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cycle")
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
         * The scan cycle for application vulnerabilities.
         * <p>
         * 
         * *   1week
         * *   2weeks
         * *   3days
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
