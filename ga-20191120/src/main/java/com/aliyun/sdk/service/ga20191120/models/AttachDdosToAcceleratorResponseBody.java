// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDdosToAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>AttachDdosToAcceleratorResponseBody</p>
 */
public class AttachDdosToAcceleratorResponseBody extends TeaModel {
    @NameInMap("DdosId")
    private String ddosId;

    @NameInMap("GaId")
    private String gaId;

    @NameInMap("RequestId")
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

        /**
         * DdosId.
         */
        public Builder ddosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }

        /**
         * GaId.
         */
        public Builder gaId(String gaId) {
            this.gaId = gaId;
            return this;
        }

        /**
         * RequestId.
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
