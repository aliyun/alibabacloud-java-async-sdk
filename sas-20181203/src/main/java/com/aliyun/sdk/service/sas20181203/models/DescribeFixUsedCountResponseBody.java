// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1CE824-7F80-546D-8AF8-4A5209F9B698</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature in China.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder usedCountCn(Integer usedCountCn) {
            this.usedCountCn = usedCountCn;
            return this;
        }

        /**
         * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature outside China.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
