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

        private Builder(EnableSqlConcurrencyControlRequest response) {
            super(response);
            this.concurrencyControlTime = response.concurrencyControlTime;
            this.consoleContext = response.consoleContext;
            this.instanceId = response.instanceId;
            this.maxConcurrency = response.maxConcurrency;
            this.sqlKeywords = response.sqlKeywords;
            this.sqlType = response.sqlType;
        } 

        /**
         * ConcurrencyControlTime.
         */
        public Builder concurrencyControlTime(Long concurrencyControlTime) {
            this.putQueryParameter("ConcurrencyControlTime", concurrencyControlTime);
            this.concurrencyControlTime = concurrencyControlTime;
            return this;
        }

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * SqlKeywords.
         */
        public Builder sqlKeywords(String sqlKeywords) {
            this.putQueryParameter("SqlKeywords", sqlKeywords);
            this.sqlKeywords = sqlKeywords;
            return this;
        }

        /**
         * SqlType.
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
