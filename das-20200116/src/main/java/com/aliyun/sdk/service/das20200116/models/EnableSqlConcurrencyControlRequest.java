// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSqlConcurrencyControlRequest} extends {@link RequestModel}
 *
 * <p>EnableSqlConcurrencyControlRequest</p>
 */
public class EnableSqlConcurrencyControlRequest extends Request {
    @Query
    @NameInMap("ConcurrencyControlTime")
    @Validation(required = true)
    private Long concurrencyControlTime;

    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxConcurrency")
    @Validation(required = true)
    private Long maxConcurrency;

    @Query
    @NameInMap("SqlKeywords")
    @Validation(required = true)
    private String sqlKeywords;

    @Query
    @NameInMap("SqlType")
    @Validation(required = true)
    private String sqlType;

    private EnableSqlConcurrencyControlRequest(Builder builder) {
        super(builder);
        this.concurrencyControlTime = builder.concurrencyControlTime;
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.maxConcurrency = builder.maxConcurrency;
        this.sqlKeywords = builder.sqlKeywords;
        this.sqlType = builder.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSqlConcurrencyControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrencyControlTime
     */
    public Long getConcurrencyControlTime() {
        return this.concurrencyControlTime;
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxConcurrency
     */
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return sqlKeywords
     */
    public String getSqlKeywords() {
        return this.sqlKeywords;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    public static final class Builder extends Request.Builder<EnableSqlConcurrencyControlRequest, Builder> {
        private Long concurrencyControlTime; 
        private String consoleContext; 
        private String instanceId; 
        private Long maxConcurrency; 
        private String sqlKeywords; 
        private String sqlType; 

        private Builder() {
            super();
        } 

        private Builder(EnableSqlConcurrencyControlRequest request) {
            super(request);
            this.concurrencyControlTime = request.concurrencyControlTime;
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.maxConcurrency = request.maxConcurrency;
            this.sqlKeywords = request.sqlKeywords;
            this.sqlType = request.sqlType;
        } 

        /**
         * The duration within which the SQL throttling rule takes effect. Unit: seconds.
         * <p>
         * 
         * >  The throttling rule takes effect only within this duration.
         */
        public Builder concurrencyControlTime(Long concurrencyControlTime) {
            this.putQueryParameter("ConcurrencyControlTime", concurrencyControlTime);
            this.concurrencyControlTime = concurrencyControlTime;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum number of concurrent SQL statements. Set this parameter to a positive integer.
         * <p>
         * 
         * >  When the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * The keywords that are used to identify the SQL statements that need to be throttled.
         * <p>
         * 
         * >  If you specify multiple SQL keywords, separate them with tildes (~). If the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.
         */
        public Builder sqlKeywords(String sqlKeywords) {
            this.putQueryParameter("SqlKeywords", sqlKeywords);
            this.sqlKeywords = sqlKeywords;
            return this;
        }

        /**
         * The type of the SQL statements. Valid values:
         * <p>
         * 
         * *   **SELECT**
         * *   **UPDATE**
         * *   **DELETE**
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        @Override
        public EnableSqlConcurrencyControlRequest build() {
            return new EnableSqlConcurrencyControlRequest(this);
        } 

    } 

}
