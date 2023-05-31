// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPreCheckDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPreCheckDatabaseResponseBody</p>
 */
public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    @NameInMap("CompletedTime")
    private Long completedTime;

    @NameInMap("CreatedTime")
    private Long createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("UpdatedTime")
    private Long updatedTime;

    private QueryPreCheckDatabaseResponseBody(Builder builder) {
        this.completedTime = builder.completedTime;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.updatedTime = builder.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPreCheckDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return completedTime
     */
    public Long getCompletedTime() {
        return this.completedTime;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public static final class Builder {
        private Long completedTime; 
        private Long createdTime; 
        private String description; 
        private Integer progress; 
        private String requestId; 
        private String result; 
        private Long updatedTime; 

        /**
         * The time when the precheck task was complete.
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * The time when the precheck task was started.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The status of the precheck task. Valid values:
         * <p>
         * 
         * *   **completed**: complete
         * *   **created**: started
         * *   **error**: failed
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The precheck progress in percentage. Valid values: 0 to 100.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the precheck task. The value is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **instanceId**: the ID of the server that hosts the database
         * 
         * *   **checkTime**: the precheck time
         * 
         * *   **sourceType**: the database type
         * 
         * *   **results**: the precheck item and result
         * 
         *     *   **item**: the precheck item
         *     *   **result**: the precheck result
         * 
         * > The following section describes the precheck items:
         * 
         * *   MSSQL
         * 
         *     *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check
         *     *   **SERVICE_CONNECTIVITY**: control network connectivity check
         *     *   **SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE**: recovery mode check
         *     *   **SQL_SERVER_DB_NOT_ONLINE**: SQL Server database status check
         * 
         * *   ORACLE
         * 
         *     *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check
         *     *   **SERVICE_CONNECTIVITY**: control network connectivity check
         *     *   **ORACLE_INSTANCE_STATUS**: Oracle instance status check
         *     *   **ORACLE_DB_STATUS**: Oracle database status check
         *     *   **ARCHIVELOG**: archive mode check
         * 
         * *   MYSQL
         * 
         *     *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check
         *     *   **SERVICE_CONNECTIVITY**: control network connectivity check
         *     *   **MYSQL_VERSION**: Supports full backup version checking
         *     *   **MYSQL_BINLOG**: BINLOG check
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * The time when the precheck task was last updated.
         */
        public Builder updatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public QueryPreCheckDatabaseResponseBody build() {
            return new QueryPreCheckDatabaseResponseBody(this);
        } 

    } 

}
