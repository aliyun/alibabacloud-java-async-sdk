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
 * {@link EnableSqlConcurrencyControlRequest} extends {@link RequestModel}
 *
 * <p>EnableSqlConcurrencyControlRequest</p>
 */
public class EnableSqlConcurrencyControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcurrencyControlTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long concurrencyControlTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlKeywords")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The duration within which the SQL throttling rule takes effect. Unit: seconds.</p>
         * <blockquote>
         * <p> The throttling rule takes effect only within this duration.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder concurrencyControlTime(Long concurrencyControlTime) {
            this.putQueryParameter("ConcurrencyControlTime", concurrencyControlTime);
            this.concurrencyControlTime = concurrencyControlTime;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of concurrent SQL statements. Set this parameter to a positive integer.</p>
         * <blockquote>
         * <p> When the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>The keywords that are used to identify the SQL statements that need to be throttled.</p>
         * <blockquote>
         * <p> If you specify multiple SQL keywords, separate them with tildes (~). If the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>call<del>open</del>api<del>test</del>4<del>from</del>POP</p>
         */
        public Builder sqlKeywords(String sqlKeywords) {
            this.putQueryParameter("SqlKeywords", sqlKeywords);
            this.sqlKeywords = sqlKeywords;
            return this;
        }

        /**
         * <p>The type of the SQL statements. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>DELETE</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
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
