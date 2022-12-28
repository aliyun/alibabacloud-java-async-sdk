// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulWhitelistTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVulWhitelistTargetResponseBody</p>
 */
public class ModifyVulWhitelistTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyVulWhitelistTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulWhitelistTargetResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVulWhitelistTargetResponseBody build() {
            return new ModifyVulWhitelistTargetResponseBody(this);
        } 

    } 

}
