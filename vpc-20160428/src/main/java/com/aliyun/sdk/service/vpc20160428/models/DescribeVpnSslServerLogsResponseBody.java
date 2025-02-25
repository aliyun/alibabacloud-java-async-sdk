// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeVpnSslServerLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnSslServerLogsResponseBody</p>
 */
public class DescribeVpnSslServerLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("IsCompleted")
    private Boolean isCompleted;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVpnSslServerLogsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.isCompleted = builder.isCompleted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnSslServerLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return isCompleted
     */
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private Data data; 
        private Boolean isCompleted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * <p>The number of log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>Log information list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the log is accurate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: accurate</li>
         * <li><strong>false</strong>: inaccurate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isCompleted(Boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DEDAC5B1-9292-5BF7-BDDF-61BA58CFB2FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVpnSslServerLogsResponseBody build() {
            return new DescribeVpnSslServerLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnSslServerLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnSslServerLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<String> logs;

        private Data(Builder builder) {
            this.logs = builder.logs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logs
         */
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public static final class Builder {
            private java.util.List<String> logs; 

            /**
             * Logs.
             */
            public Builder logs(java.util.List<String> logs) {
                this.logs = logs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
