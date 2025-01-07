// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryPreCheckDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPreCheckDatabaseResponseBody</p>
 */
public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompletedTime")
    private Long completedTime;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("UpdatedTime")
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
         * <p>The time when the precheck task was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1657524396</p>
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * <p>The time when the precheck task was started.</p>
         * 
         * <strong>example:</strong>
         * <p>1660448660</p>
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The status of the precheck task. Valid values:</p>
         * <ul>
         * <li><strong>completed</strong>: complete</li>
         * <li><strong>created</strong>: started</li>
         * <li><strong>error</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The precheck progress in percentage. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the precheck task. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>instanceId</strong>: the ID of the server that hosts the database</p>
         * </li>
         * <li><p><strong>checkTime</strong>: the precheck time</p>
         * </li>
         * <li><p><strong>sourceType</strong>: the database type</p>
         * </li>
         * <li><p><strong>results</strong>: the precheck item and result</p>
         * <ul>
         * <li><strong>item</strong>: the precheck item</li>
         * <li><strong>result</strong>: the precheck result</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The following section describes the precheck items:</p>
         * </blockquote>
         * <ul>
         * <li><p>MSSQL</p>
         * <ul>
         * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
         * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
         * <li><strong>SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE</strong>: recovery mode check</li>
         * <li><strong>SQL_SERVER_DB_NOT_ONLINE</strong>: SQL Server database status check</li>
         * </ul>
         * </li>
         * <li><p>ORACLE</p>
         * <ul>
         * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
         * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
         * <li><strong>ORACLE_INSTANCE_STATUS</strong>: Oracle instance status check</li>
         * <li><strong>ORACLE_DB_STATUS</strong>: Oracle database status check</li>
         * <li><strong>ARCHIVELOG</strong>: archive mode check</li>
         * </ul>
         * </li>
         * <li><p>MYSQL</p>
         * <ul>
         * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
         * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
         * <li><strong>MYSQL_VERSION</strong>: Supports full backup version checking</li>
         * <li><strong>MYSQL_BINLOG</strong>: BINLOG check</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;instanceId&quot;: &quot;i-wz91if83t97xgtn2****&quot;,
         *         &quot;checkTime&quot;: 1671245753,
         *         &quot;sourceType&quot;: &quot;MSSQL&quot;,
         *         &quot;results&quot;:
         *         [
         *             {
         *                 &quot;item&quot;: &quot;OSS_INTERNAL_ENDPOINT_CONNECTIVITY&quot;,
         *                 &quot;result&quot;: &quot;PASSED&quot;
         *             },
         *             {
         *                 &quot;item&quot;: &quot;SERVICE_CONNECTIVITY&quot;,
         *                 &quot;result&quot;: &quot;PASSED&quot;
         *             },
         *             {
         *                 &quot;item&quot;: &quot;SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE&quot;,
         *                 &quot;result&quot;: &quot;WARNING&quot;
         *             },
         *             {
         *                 &quot;item&quot;: &quot;SQL_SERVER_DB_NOT_ONLINE&quot;,
         *                 &quot;result&quot;: &quot;PASSED&quot;
         *             }
         *         ]
         *     }
         * ]</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The time when the precheck task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1671084106</p>
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
