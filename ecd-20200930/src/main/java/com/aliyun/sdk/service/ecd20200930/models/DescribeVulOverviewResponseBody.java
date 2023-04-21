// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulOverviewResponseBody</p>
 */
public class DescribeVulOverviewResponseBody extends TeaModel {
    @NameInMap("AsapCount")
    private Integer asapCount;

    @NameInMap("LaterCount")
    private Integer laterCount;

    @NameInMap("NntfCount")
    private Integer nntfCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVulOverviewResponseBody(Builder builder) {
        this.asapCount = builder.asapCount;
        this.laterCount = builder.laterCount;
        this.nntfCount = builder.nntfCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return asapCount
     */
    public Integer getAsapCount() {
        return this.asapCount;
    }

    /**
     * @return laterCount
     */
    public Integer getLaterCount() {
        return this.laterCount;
    }

    /**
     * @return nntfCount
     */
    public Integer getNntfCount() {
        return this.nntfCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer asapCount; 
        private Integer laterCount; 
        private Integer nntfCount; 
        private String requestId; 

        /**
         * The number of high-risk vulnerabilities.
         */
        public Builder asapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }

        /**
         * The number of medium-risk vulnerabilities.
         */
        public Builder laterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }

        /**
         * The number of low-risk vulnerabilities.
         */
        public Builder nntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulOverviewResponseBody build() {
            return new DescribeVulOverviewResponseBody(this);
        } 

    } 

}
