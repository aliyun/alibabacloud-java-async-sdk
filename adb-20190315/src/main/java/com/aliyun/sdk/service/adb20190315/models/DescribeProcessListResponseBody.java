// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessListResponseBody</p>
 */
public class DescribeProcessListResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * Details of the queries.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProcessListResponseBody build() {
            return new DescribeProcessListResponseBody(this);
        } 

    } 

    public static class Process extends TeaModel {
        @NameInMap("Command")
        private String command;

        @NameInMap("DB")
        private String db;

        @NameInMap("Host")
        private String host;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Info")
        private String info;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Time")
        private Integer time;

        @NameInMap("User")
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

            /**
             * The type of the statement. Only SELECT can be returned.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * The IP address from which the query was initiated.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The ID of the worker thread.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The SQL statement that is being executed. By default, the first 100 characters of the SQL statement are returned. If the ShowFull parameter is set to True, the complete SQL statement is returned.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * The unique ID of the query. You must specify this parameter when you use the KILL PROCESS statement.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The amount of time that has elapsed from the start time of the query. Unit: seconds.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * The username.
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
    public static class Items extends TeaModel {
        @NameInMap("Process")
        private java.util.List < Process> process;

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
        public java.util.List < Process> getProcess() {
            return this.process;
        }

        public static final class Builder {
            private java.util.List < Process> process; 

            /**
             * Process.
             */
            public Builder process(java.util.List < Process> process) {
                this.process = process;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
