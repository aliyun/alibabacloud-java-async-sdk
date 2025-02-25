// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSCIMSynchronizationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetSCIMSynchronizationStatusResponseBody</p>
 */
public class SetSCIMSynchronizationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetSCIMSynchronizationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSCIMSynchronizationStatusResponseBody create() {
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
         * <p>3BF1FC78-5D20-54CC-BAEB-8CC33AE21D01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetSCIMSynchronizationStatusResponseBody build() {
            return new SetSCIMSynchronizationStatusResponseBody(this);
        } 

    } 

}
