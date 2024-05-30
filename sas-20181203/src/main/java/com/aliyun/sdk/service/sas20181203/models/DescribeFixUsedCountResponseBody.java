// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFixUsedCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFixUsedCountResponseBody</p>
 */
public class DescribeFixUsedCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsedCount")
    private Integer usedCount;

    @com.aliyun.core.annotation.NameInMap("UsedCountCn")
    private Integer usedCountCn;

    @com.aliyun.core.annotation.NameInMap("UsedCountSg")
    private Integer usedCountSg;

    private DescribeFixUsedCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usedCount = builder.usedCount;
        this.usedCountCn = builder.usedCountCn;
        this.usedCountSg = builder.usedCountSg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFixUsedCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usedCount
     */
    public Integer getUsedCount() {
        return this.usedCount;
    }

    /**
     * @return usedCountCn
     */
    public Integer getUsedCountCn() {
        return this.usedCountCn;
    }

    /**
     * @return usedCountSg
     */
    public Integer getUsedCountSg() {
        return this.usedCountSg;
    }

    public static final class Builder {
        private String requestId; 
        private Integer usedCount; 
        private Integer usedCountCn; 
        private Integer usedCountSg; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of vulnerabilities that are fixed by the vulnerability fixing feature.
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        /**
         * The number of vulnerabilities that are fixed by the vulnerability fixing feature in China.
         */
        public Builder usedCountCn(Integer usedCountCn) {
            this.usedCountCn = usedCountCn;
            return this;
        }

        /**
         * The number of vulnerabilities that are fixed by the vulnerability fixing feature outside China.
         */
        public Builder usedCountSg(Integer usedCountSg) {
            this.usedCountSg = usedCountSg;
            return this;
        }

        public DescribeFixUsedCountResponseBody build() {
            return new DescribeFixUsedCountResponseBody(this);
        } 

    } 

}
