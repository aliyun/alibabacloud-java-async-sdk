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
 * {@link ModifyAppVulScanCycleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAppVulScanCycleResponseBody</p>
 */
public class ModifyAppVulScanCycleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAppVulScanCycleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppVulScanCycleResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AFEDC54D-70A2-5E56-A69B-E3D8AA8A5197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAppVulScanCycleResponseBody build() {
            return new ModifyAppVulScanCycleResponseBody(this);
        } 

    } 

}
