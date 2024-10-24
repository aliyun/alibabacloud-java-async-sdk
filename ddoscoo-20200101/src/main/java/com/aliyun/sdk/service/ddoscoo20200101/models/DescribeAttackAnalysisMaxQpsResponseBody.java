// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAttackAnalysisMaxQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisMaxQpsResponseBody</p>
 */
public class DescribeAttackAnalysisMaxQpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Qps")
    private Long qps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAttackAnalysisMaxQpsResponseBody(Builder builder) {
        this.qps = builder.qps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAnalysisMaxQpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return qps
     */
    public Long getQps() {
        return this.qps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long qps; 
        private String requestId; 

        /**
         * <p>The peak queries per second (QPS) of DDoS attacks. Units: QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>41652</p>
         */
        public Builder qps(Long qps) {
            this.qps = qps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8DFB602D-1AAC-46C4-90F2-C84086E7A6E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttackAnalysisMaxQpsResponseBody build() {
            return new DescribeAttackAnalysisMaxQpsResponseBody(this);
        } 

    } 

}
