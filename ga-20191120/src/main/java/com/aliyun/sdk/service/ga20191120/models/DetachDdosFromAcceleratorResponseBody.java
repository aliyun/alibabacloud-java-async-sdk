// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DetachDdosFromAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>DetachDdosFromAcceleratorResponseBody</p>
 */
public class DetachDdosFromAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosId")
    @Deprecated
    private String ddosId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachDdosFromAcceleratorResponseBody(Builder builder) {
        this.ddosId = builder.ddosId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDdosFromAcceleratorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosId
     */
    public String getDdosId() {
        return this.ddosId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ddosId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetachDdosFromAcceleratorResponseBody model) {
            this.ddosId = model.ddosId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the Anti-DDoS Pro/Premium instance that was disassociated from the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        public Builder ddosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachDdosFromAcceleratorResponseBody build() {
            return new DetachDdosFromAcceleratorResponseBody(this);
        } 

    } 

}
