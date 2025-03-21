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
 * {@link ModifyClusterCnnfStatusUserConfirmResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterCnnfStatusUserConfirmResponseBody</p>
 */
public class ModifyClusterCnnfStatusUserConfirmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyClusterCnnfStatusUserConfirmResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterCnnfStatusUserConfirmResponseBody create() {
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4FFBEDBD-FA63-5213-9103-306519EE4857</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyClusterCnnfStatusUserConfirmResponseBody build() {
            return new ModifyClusterCnnfStatusUserConfirmResponseBody(this);
        } 

    } 

}
