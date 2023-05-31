// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenSensitiveFileScanRequest} extends {@link RequestModel}
 *
 * <p>OpenSensitiveFileScanRequest</p>
 */
public class OpenSensitiveFileScanRequest extends Request {
    @Query
    @NameInMap("SwitchOn")
    private String switchOn;

    private OpenSensitiveFileScanRequest(Builder builder) {
        super(builder);
        this.switchOn = builder.switchOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenSensitiveFileScanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return switchOn
     */
    public String getSwitchOn() {
        return this.switchOn;
    }

    public static final class Builder extends Request.Builder<OpenSensitiveFileScanRequest, Builder> {
        private String switchOn; 

        private Builder() {
            super();
        } 

        private Builder(OpenSensitiveFileScanRequest request) {
            super(request);
            this.switchOn = request.switchOn;
        } 

        /**
         * Specifies whether to enable or disable sensitive file scan. Valid values:
         * <p>
         * 
         * *   **on**: enables sensitive file scan
         * *   **off**: disables sensitive file scan
         */
        public Builder switchOn(String switchOn) {
            this.putQueryParameter("SwitchOn", switchOn);
            this.switchOn = switchOn;
            return this;
        }

        @Override
        public OpenSensitiveFileScanRequest build() {
            return new OpenSensitiveFileScanRequest(this);
        } 

    } 

}
