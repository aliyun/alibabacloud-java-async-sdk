// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetQueryOptimizeExecErrorSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeExecErrorSampleResponseBody</p>
 */
public class GetQueryOptimizeExecErrorSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetQueryOptimizeExecErrorSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeExecErrorSampleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQueryOptimizeExecErrorSampleResponseBody build() {
            return new GetQueryOptimizeExecErrorSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQueryOptimizeExecErrorSampleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeExecErrorSampleResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dbname")
        private String dbname;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("OrigHost")
        private String origHost;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private List(Builder builder) {
            this.dbname = builder.dbname;
            this.errorCode = builder.errorCode;
            this.origHost = builder.origHost;
            this.sqlId = builder.sqlId;
            this.sqlText = builder.sqlText;
            this.timestamp = builder.timestamp;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return dbname
         */
        public String getDbname() {
            return this.dbname;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return origHost
         */
        public String getOrigHost() {
            return this.origHost;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String dbname; 
            private String errorCode; 
            private String origHost; 
            private String sqlId; 
            private String sqlText; 
            private Long timestamp; 
            private String user; 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb01</p>
             */
            public Builder dbname(String dbname) {
                this.dbname = dbname;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1146</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The IP address of the client that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX</p>
             */
            public Builder origHost(String origHost) {
                this.origHost = origHost;
                return this;
            }

            /**
             * <p>The SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The content of the SQL statement that failed to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test1</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The point in time when the failed SQL statement was executed. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1643020306739</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The username of the client that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueryOptimizeExecErrorSampleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeExecErrorSampleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private java.util.List<List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The queried data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
