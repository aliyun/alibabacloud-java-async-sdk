// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link UpgradeKernelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeKernelVersionResponseBody</p>
 */
public class UpgradeKernelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpgradeKernelVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeKernelVersionResponseBody create() {
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

        private Builder(UpgradeKernelVersionResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request. You can use the ID to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpgradeKernelVersionResponseBody build() {
            return new UpgradeKernelVersionResponseBody(this);
        } 

    } 

}
