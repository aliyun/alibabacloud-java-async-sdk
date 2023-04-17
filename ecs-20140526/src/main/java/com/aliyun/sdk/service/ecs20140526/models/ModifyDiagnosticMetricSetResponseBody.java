// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiagnosticMetricSetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiagnosticMetricSetResponseBody</p>
 */
public class ModifyDiagnosticMetricSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDiagnosticMetricSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiagnosticMetricSetResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDiagnosticMetricSetResponseBody build() {
            return new ModifyDiagnosticMetricSetResponseBody(this);
        } 

    } 

}
