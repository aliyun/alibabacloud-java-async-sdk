// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeHanaDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaDatabasesResponseBody</p>
 */
public class DescribeHanaDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HanaDatabases")
    private HanaDatabases hanaDatabases;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHanaDatabasesResponseBody model) {
            this.code = model.code;
            this.hanaDatabases = model.hanaDatabases;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about SAP HANA databases.</p>
         */
        public Builder hanaDatabases(HanaDatabases hanaDatabases) {
            this.hanaDatabases = hanaDatabases;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DAAB6A29-34EB-5F56-962F-D5BDBFE8A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaDatabasesResponseBody build() {
            return new DescribeHanaDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHanaDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaDatabasesResponseBody</p>
     */
    public static class HanaDatabase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveStatus")
        private String activeStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SqlPort")
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

            private Builder() {
            } 

            private Builder(HanaDatabase model) {
                this.activeStatus = model.activeStatus;
                this.databaseName = model.databaseName;
                this.detail = model.detail;
                this.host = model.host;
                this.serviceName = model.serviceName;
                this.sqlPort = model.sqlPort;
            } 

            /**
             * <p>Indicates whether the database is started. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong>: The database is started.</li>
             * <li><strong>NO</strong>: The database is not started.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder activeStatus(String activeStatus) {
                this.activeStatus = activeStatus;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEMDB</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The detailed information.</p>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>izbp1jbf3zy******antqmz</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>indexserver</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>30013</p>
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
    /**
     * 
     * {@link DescribeHanaDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaDatabasesResponseBody</p>
     */
    public static class HanaDatabases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HanaDatabase")
        private java.util.List<HanaDatabase> hanaDatabase;

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
        public java.util.List<HanaDatabase> getHanaDatabase() {
            return this.hanaDatabase;
        }

        public static final class Builder {
            private java.util.List<HanaDatabase> hanaDatabase; 

            private Builder() {
            } 

            private Builder(HanaDatabases model) {
                this.hanaDatabase = model.hanaDatabase;
            } 

            /**
             * HanaDatabase.
             */
            public Builder hanaDatabase(java.util.List<HanaDatabase> hanaDatabase) {
                this.hanaDatabase = hanaDatabase;
                return this;
            }

            public HanaDatabases build() {
                return new HanaDatabases(this);
            } 

        } 

    }
}
