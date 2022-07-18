// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLogResponseBody</p>
 */
public class DescribeServiceLogResponseBody extends TeaModel {
    @NameInMap("Logs")
    private java.util.List < String > logs;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("TotalPageNum")
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
         * 返回的日志信息
         */
        public Builder logs(java.util.List < String > logs) {
            this.logs = logs;
            return this;
        }

        /**
         * 当前页码
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总计数量
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * 总计页码
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
