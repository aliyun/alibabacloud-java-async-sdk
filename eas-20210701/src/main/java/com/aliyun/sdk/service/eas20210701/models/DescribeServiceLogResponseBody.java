// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLogResponseBody</p>
 */
public class DescribeServiceLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List < String > logs;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Long totalPageNum;

    private DescribeServiceLogResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < String > getLogs() {
        return this.logs;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPageNum
     */
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private java.util.List < String > logs; 
        private Long pageNum; 
        private String requestId; 
        private Long totalCount; 
        private Long totalPageNum; 

        /**
         * <p>The returned logs.</p>
         */
        public Builder logs(java.util.List < String > logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder totalPageNum(Long totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public DescribeServiceLogResponseBody build() {
            return new DescribeServiceLogResponseBody(this);
        } 

    } 

}
