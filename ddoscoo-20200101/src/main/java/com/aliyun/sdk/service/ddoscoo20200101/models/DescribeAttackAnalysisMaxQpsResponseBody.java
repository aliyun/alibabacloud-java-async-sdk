// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisMaxQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisMaxQpsResponseBody</p>
 */
public class DescribeAttackAnalysisMaxQpsResponseBody extends TeaModel {
    @NameInMap("Qps")
    private Long qps;

    @NameInMap("RequestId")
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
         * Qps.
         */
        public Builder qps(Long qps) {
            this.qps = qps;
            return this;
        }

        /**
         * RequestId.
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
