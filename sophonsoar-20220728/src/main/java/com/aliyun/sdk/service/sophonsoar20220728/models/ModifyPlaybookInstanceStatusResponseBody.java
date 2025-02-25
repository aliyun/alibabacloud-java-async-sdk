// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPlaybookInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPlaybookInstanceStatusResponseBody</p>
 */
public class ModifyPlaybookInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyPlaybookInstanceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookInstanceStatusResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C2A32830-2842-5F8F-B4ED-E4783E400BBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPlaybookInstanceStatusResponseBody build() {
            return new ModifyPlaybookInstanceStatusResponseBody(this);
        } 

    } 

}
