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
 * {@link AttachDdosToAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>AttachDdosToAcceleratorResponseBody</p>
 */
public class AttachDdosToAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosId")
    @Deprecated
    private String ddosId;

    @com.aliyun.core.annotation.NameInMap("GaId")
    private String gaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachDdosToAcceleratorResponseBody(Builder builder) {
        this.ddosId = builder.ddosId;
        this.gaId = builder.gaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDdosToAcceleratorResponseBody create() {
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
     * @return gaId
     */
    public String getGaId() {
        return this.gaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ddosId; 
        private String gaId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AttachDdosToAcceleratorResponseBody model) {
            this.ddosId = model.ddosId;
            this.gaId = model.gaId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        public Builder ddosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }

        /**
         * <p>The ID of the GA instance that is associated with the Anti-DDoS Pro/Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder gaId(String gaId) {
            this.gaId = gaId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachDdosToAcceleratorResponseBody build() {
            return new AttachDdosToAcceleratorResponseBody(this);
        } 

    } 

}
