// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessListResponseBody</p>
 */
public class DescribeProcessListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeProcessListResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeProcessListResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details of the queries.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProcessListResponseBody build() {
            return new DescribeProcessListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class Process extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("DB")
        private String db;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Process(Builder builder) {
            this.command = builder.command;
            this.db = builder.db;
            this.host = builder.host;
            this.id = builder.id;
            this.info = builder.info;
            this.processId = builder.processId;
            this.startTime = builder.startTime;
            this.time = builder.time;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Process create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String command; 
            private String db; 
            private String host; 
            private Integer id; 
            private String info; 
            private String processId; 
            private String startTime; 
            private Integer time; 
            private String user; 

            private Builder() {
            } 

            private Builder(Process model) {
                this.command = model.command;
                this.db = model.db;
                this.host = model.host;
                this.id = model.id;
                this.info = model.info;
                this.processId = model.processId;
                this.startTime = model.startTime;
                this.time = model.time;
                this.user = model.user;
            } 

            /**
             * <p>The type of the statement. Only SELECT can be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The IP address from which the query was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX:12308</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the worker thread.</p>
             * 
             * <strong>example:</strong>
             * <p>49104</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The SQL statement that is being executed. By default, the first 100 characters of the SQL statement are returned. If the ShowFull parameter is set to True, the complete SQL statement is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from sbtest1,sbtest2,sbtest3,sbtest4</p>
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The unique ID of the query. You must specify this parameter when you use the KILL PROCESS statement.</p>
             * 
             * <strong>example:</strong>
             * <p>202011191048151921681492420315100****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-19T02:48:15Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The amount of time that has elapsed from the start time of the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Process build() {
                return new Process(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Process")
        private java.util.List<Process> process;

        private Items(Builder builder) {
            this.process = builder.process;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return process
         */
        public java.util.List<Process> getProcess() {
            return this.process;
        }

        public static final class Builder {
            private java.util.List<Process> process; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.process = model.process;
            } 

            /**
             * Process.
             */
            public Builder process(java.util.List<Process> process) {
                this.process = process;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
