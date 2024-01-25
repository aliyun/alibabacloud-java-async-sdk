// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaDatabasesResponseBody</p>
 */
public class DescribeHanaDatabasesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HanaDatabases")
    private HanaDatabases hanaDatabases;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeHanaDatabasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaDatabases = builder.hanaDatabases;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaDatabases
     */
    public HanaDatabases getHanaDatabases() {
        return this.hanaDatabases;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private HanaDatabases hanaDatabases; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about SAP HANA databases.
         */
        public Builder hanaDatabases(HanaDatabases hanaDatabases) {
            this.hanaDatabases = hanaDatabases;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
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
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaDatabasesResponseBody build() {
            return new DescribeHanaDatabasesResponseBody(this);
        } 

    } 

    public static class HanaDatabase extends TeaModel {
        @NameInMap("ActiveStatus")
        private String activeStatus;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Host")
        private String host;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SqlPort")
        private Integer sqlPort;

        private HanaDatabase(Builder builder) {
            this.activeStatus = builder.activeStatus;
            this.databaseName = builder.databaseName;
            this.detail = builder.detail;
            this.host = builder.host;
            this.serviceName = builder.serviceName;
            this.sqlPort = builder.sqlPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaDatabase create() {
            return builder().build();
        }

        /**
         * @return activeStatus
         */
        public String getActiveStatus() {
            return this.activeStatus;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return sqlPort
         */
        public Integer getSqlPort() {
            return this.sqlPort;
        }

        public static final class Builder {
            private String activeStatus; 
            private String databaseName; 
            private String detail; 
            private String host; 
            private String serviceName; 
            private Integer sqlPort; 

            /**
             * Indicates whether the database is started. Valid values:
             * <p>
             * 
             * *   **YES**: The database is started.
             * *   **NO**: The database is not started.
             */
            public Builder activeStatus(String activeStatus) {
                this.activeStatus = activeStatus;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The detailed information.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The hostname.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The port number.
             */
            public Builder sqlPort(Integer sqlPort) {
                this.sqlPort = sqlPort;
                return this;
            }

            public HanaDatabase build() {
                return new HanaDatabase(this);
            } 

        } 

    }
    public static class HanaDatabases extends TeaModel {
        @NameInMap("HanaDatabase")
        private java.util.List < HanaDatabase> hanaDatabase;

        private HanaDatabases(Builder builder) {
            this.hanaDatabase = builder.hanaDatabase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaDatabases create() {
            return builder().build();
        }

        /**
         * @return hanaDatabase
         */
        public java.util.List < HanaDatabase> getHanaDatabase() {
            return this.hanaDatabase;
        }

        public static final class Builder {
            private java.util.List < HanaDatabase> hanaDatabase; 

            /**
             * HanaDatabase.
             */
            public Builder hanaDatabase(java.util.List < HanaDatabase> hanaDatabase) {
                this.hanaDatabase = hanaDatabase;
                return this;
            }

            public HanaDatabases build() {
                return new HanaDatabases(this);
            } 

        } 

    }
}
