// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVulWhitelistTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVulWhitelistTargetResponseBody</p>
 */
public class ModifyVulWhitelistTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyVulWhitelistTargetResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>896AC4F0-C881-502B-BFC7-4751C5E3DEAA</p>
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
