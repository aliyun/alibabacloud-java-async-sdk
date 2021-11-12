// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyCreateVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCreateVulWhitelistResponseBody</p>
 */
public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyCreateVulWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCreateVulWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCreateVulWhitelistResponseBody build() {
            return new ModifyCreateVulWhitelistResponseBody(this);
        } 

    } 

}
