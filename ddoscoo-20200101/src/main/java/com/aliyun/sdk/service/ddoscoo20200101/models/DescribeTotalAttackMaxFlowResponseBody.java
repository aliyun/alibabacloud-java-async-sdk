// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTotalAttackMaxFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTotalAttackMaxFlowResponseBody</p>
 */
public class DescribeTotalAttackMaxFlowResponseBody extends TeaModel {
    @NameInMap("Bps")
    private Long bps;

    @NameInMap("Pps")
    private Long pps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTotalAttackMaxFlowResponseBody(Builder builder) {
        this.bps = builder.bps;
        this.pps = builder.pps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTotalAttackMaxFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return bps
     */
    public Long getBps() {
        return this.bps;
    }

    /**
     * @return pps
     */
    public Long getPps() {
        return this.pps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long bps; 
        private Long pps; 
        private String requestId; 

        /**
         * Bps.
         */
        public Builder bps(Long bps) {
            this.bps = bps;
            return this;
        }

        /**
         * Pps.
         */
        public Builder pps(Long pps) {
            this.pps = pps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTotalAttackMaxFlowResponseBody build() {
            return new DescribeTotalAttackMaxFlowResponseBody(this);
        } 

    } 

}
