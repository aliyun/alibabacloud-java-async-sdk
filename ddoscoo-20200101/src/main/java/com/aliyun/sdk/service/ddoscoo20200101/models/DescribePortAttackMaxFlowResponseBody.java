// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortAttackMaxFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortAttackMaxFlowResponseBody</p>
 */
public class DescribePortAttackMaxFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bps")
    private Long bps;

    @com.aliyun.core.annotation.NameInMap("Pps")
    private Long pps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortAttackMaxFlowResponseBody(Builder builder) {
        this.bps = builder.bps;
        this.pps = builder.pps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortAttackMaxFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePortAttackMaxFlowResponseBody model) {
            this.bps = model.bps;
            this.pps = model.pps;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The peak bandwidth of attack traffic. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>149559</p>
         */
        public Builder bps(Long bps) {
            this.bps = bps;
            return this;
        }

        /**
         * <p>The peak packet rate of attack traffic . Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder pps(Long pps) {
            this.pps = pps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortAttackMaxFlowResponseBody build() {
            return new DescribePortAttackMaxFlowResponseBody(this);
        } 

    } 

}
