// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeInternetDnsLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetDnsLogsResponseBody</p>
 */
public class DescribeInternetDnsLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Complete")
    private Boolean complete;

    @com.aliyun.core.annotation.NameInMap("CurPage")
    private Integer curPage;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private Logs logs;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private DescribeInternetDnsLogsResponseBody(Builder builder) {
        this.complete = builder.complete;
        this.curPage = builder.curPage;
        this.logs = builder.logs;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPage = builder.totalPage;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetDnsLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complete
     */
    public Boolean getComplete() {
        return this.complete;
    }

    /**
     * @return curPage
     */
    public Integer getCurPage() {
        return this.curPage;
    }

    /**
     * @return logs
     */
    public Logs getLogs() {
        return this.logs;
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

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private Boolean complete; 
        private Integer curPage; 
        private Logs logs; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalPage; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(DescribeInternetDnsLogsResponseBody model) {
            this.complete = model.complete;
            this.curPage = model.curPage;
            this.logs = model.logs;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalPage = model.totalPage;
            this.totalSize = model.totalSize;
        } 

        /**
         * <p>Indicates whether the log query is precise.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder complete(Boolean complete) {
            this.complete = complete;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder curPage(Integer curPage) {
            this.curPage = curPage;
            return this;
        }

        /**
         * <p>The queried logs.</p>
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>Page size for query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Unique request identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * <p>Total quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribeInternetDnsLogsResponseBody build() {
            return new DescribeInternetDnsLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetDnsLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetDnsLogsResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Value(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.value = model.value;
            } 

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInternetDnsLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetDnsLogsResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsMsgId")
        private String dnsMsgId;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private Long logTime;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("QueryName")
        private String queryName;

        @com.aliyun.core.annotation.NameInMap("QueryType")
        private String queryType;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Integer rt;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetIp")
        private String subnetIp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Value value;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Log(Builder builder) {
            this.dnsMsgId = builder.dnsMsgId;
            this.logTime = builder.logTime;
            this.protocol = builder.protocol;
            this.queryName = builder.queryName;
            this.queryType = builder.queryType;
            this.rt = builder.rt;
            this.serverIp = builder.serverIp;
            this.sourceIp = builder.sourceIp;
            this.status = builder.status;
            this.subnetIp = builder.subnetIp;
            this.value = builder.value;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return dnsMsgId
         */
        public String getDnsMsgId() {
            return this.dnsMsgId;
        }

        /**
         * @return logTime
         */
        public Long getLogTime() {
            return this.logTime;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return queryName
         */
        public String getQueryName() {
            return this.queryName;
        }

        /**
         * @return queryType
         */
        public String getQueryType() {
            return this.queryType;
        }

        /**
         * @return rt
         */
        public Integer getRt() {
            return this.rt;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetIp
         */
        public String getSubnetIp() {
            return this.subnetIp;
        }

        /**
         * @return value
         */
        public Value getValue() {
            return this.value;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String dnsMsgId; 
            private Long logTime; 
            private String protocol; 
            private String queryName; 
            private String queryType; 
            private Integer rt; 
            private String serverIp; 
            private String sourceIp; 
            private String status; 
            private String subnetIp; 
            private Value value; 
            private String zoneName; 

            private Builder() {
            } 

            private Builder(Log model) {
                this.dnsMsgId = model.dnsMsgId;
                this.logTime = model.logTime;
                this.protocol = model.protocol;
                this.queryName = model.queryName;
                this.queryType = model.queryType;
                this.rt = model.rt;
                this.serverIp = model.serverIp;
                this.sourceIp = model.sourceIp;
                this.status = model.status;
                this.subnetIp = model.subnetIp;
                this.value = model.value;
                this.zoneName = model.zoneName;
            } 

            /**
             * <p>Parse log ID (can be duplicated).</p>
             * 
             * <strong>example:</strong>
             * <p>3583</p>
             */
            public Builder dnsMsgId(String dnsMsgId) {
                this.dnsMsgId = dnsMsgId;
                return this;
            }

            /**
             * <p>Parse timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1709196249000</p>
             */
            public Builder logTime(Long logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The protocol type of the domain name resolution query request:</p>
             * <ul>
             * <li>UDP</li>
             * <li>TCP</li>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * <li>DOH</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The domain name for which you want to query Domain Name System (DNS) records.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder queryName(String queryName) {
                this.queryName = queryName;
                return this;
            }

            /**
             * <p>Record type.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * <p>Parse response time.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rt(Integer rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>Parse server IP.</p>
             * 
             * <strong>example:</strong>
             * <p>140.205.XX.XX</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>Source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>59.82.XX.XX</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>Response status.</p>
             * 
             * <strong>example:</strong>
             * <p>NOERROR</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The value set for the edns-client-subnet option.</p>
             * 
             * <strong>example:</strong>
             * <p>170.33.XX.XX</p>
             */
            public Builder subnetIp(String subnetIp) {
                this.subnetIp = subnetIp;
                return this;
            }

            /**
             * <p>Array of parsing results.</p>
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The zone name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInternetDnsLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetDnsLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Log")
        private java.util.List<Log> log;

        private Logs(Builder builder) {
            this.log = builder.log;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return log
         */
        public java.util.List<Log> getLog() {
            return this.log;
        }

        public static final class Builder {
            private java.util.List<Log> log; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.log = model.log;
            } 

            /**
             * Log.
             */
            public Builder log(java.util.List<Log> log) {
                this.log = log;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
