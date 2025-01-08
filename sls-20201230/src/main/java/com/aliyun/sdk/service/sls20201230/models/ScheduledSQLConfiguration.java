// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ScheduledSQLConfiguration} extends {@link TeaModel}
 *
 * <p>ScheduledSQLConfiguration</p>
 */
public class ScheduledSQLConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFormat;

    @com.aliyun.core.annotation.NameInMap("destEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destEndpoint;

    @com.aliyun.core.annotation.NameInMap("destLogstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destLogstore;

    @com.aliyun.core.annotation.NameInMap("destProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destProject;

    @com.aliyun.core.annotation.NameInMap("destRoleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destRoleArn;

    @com.aliyun.core.annotation.NameInMap("fromTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromTime;

    @com.aliyun.core.annotation.NameInMap("fromTimeExpr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromTimeExpr;

    @com.aliyun.core.annotation.NameInMap("maxRetries")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxRetries;

    @com.aliyun.core.annotation.NameInMap("maxRunTimeInSeconds")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxRunTimeInSeconds;

    @com.aliyun.core.annotation.NameInMap("parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("resourcePool")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourcePool;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("script")
    @com.aliyun.core.annotation.Validation(required = true)
    private String script;

    @com.aliyun.core.annotation.NameInMap("sourceLogstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLogstore;

    @com.aliyun.core.annotation.NameInMap("sqlType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlType;

    @com.aliyun.core.annotation.NameInMap("toTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toTime;

    @com.aliyun.core.annotation.NameInMap("toTimeExpr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toTimeExpr;

    private ScheduledSQLConfiguration(Builder builder) {
        this.dataFormat = builder.dataFormat;
        this.destEndpoint = builder.destEndpoint;
        this.destLogstore = builder.destLogstore;
        this.destProject = builder.destProject;
        this.destRoleArn = builder.destRoleArn;
        this.fromTime = builder.fromTime;
        this.fromTimeExpr = builder.fromTimeExpr;
        this.maxRetries = builder.maxRetries;
        this.maxRunTimeInSeconds = builder.maxRunTimeInSeconds;
        this.parameters = builder.parameters;
        this.resourcePool = builder.resourcePool;
        this.roleArn = builder.roleArn;
        this.script = builder.script;
        this.sourceLogstore = builder.sourceLogstore;
        this.sqlType = builder.sqlType;
        this.toTime = builder.toTime;
        this.toTimeExpr = builder.toTimeExpr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledSQLConfiguration create() {
        return builder().build();
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return destEndpoint
     */
    public String getDestEndpoint() {
        return this.destEndpoint;
    }

    /**
     * @return destLogstore
     */
    public String getDestLogstore() {
        return this.destLogstore;
    }

    /**
     * @return destProject
     */
    public String getDestProject() {
        return this.destProject;
    }

    /**
     * @return destRoleArn
     */
    public String getDestRoleArn() {
        return this.destRoleArn;
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return fromTimeExpr
     */
    public String getFromTimeExpr() {
        return this.fromTimeExpr;
    }

    /**
     * @return maxRetries
     */
    public Long getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * @return maxRunTimeInSeconds
     */
    public Long getMaxRunTimeInSeconds() {
        return this.maxRunTimeInSeconds;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return resourcePool
     */
    public String getResourcePool() {
        return this.resourcePool;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return sourceLogstore
     */
    public String getSourceLogstore() {
        return this.sourceLogstore;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    /**
     * @return toTimeExpr
     */
    public String getToTimeExpr() {
        return this.toTimeExpr;
    }

    public static final class Builder {
        private String dataFormat; 
        private String destEndpoint; 
        private String destLogstore; 
        private String destProject; 
        private String destRoleArn; 
        private Long fromTime; 
        private String fromTimeExpr; 
        private Long maxRetries; 
        private Long maxRunTimeInSeconds; 
        private java.util.Map<String, ?> parameters; 
        private String resourcePool; 
        private String roleArn; 
        private String script; 
        private String sourceLogstore; 
        private String sqlType; 
        private Long toTime; 
        private String toTimeExpr; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log2log</p>
         */
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
         */
        public Builder destEndpoint(String destEndpoint) {
            this.destEndpoint = destEndpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dest-logstore-demo</p>
         */
        public Builder destLogstore(String destLogstore) {
            this.destLogstore = destLogstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project-demo</p>
         */
        public Builder destProject(String destProject) {
            this.destProject = destProject;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/aliyunlogetlrole</p>
         */
        public Builder destRoleArn(String destRoleArn) {
            this.destRoleArn = destRoleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1712592000</p>
         */
        public Builder fromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>@m-1m</p>
         */
        public Builder fromTimeExpr(String fromTimeExpr) {
            this.fromTimeExpr = fromTimeExpr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxRetries(Long maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder maxRunTimeInSeconds(Long maxRunTimeInSeconds) {
            this.maxRunTimeInSeconds = maxRunTimeInSeconds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
        public Builder resourcePool(String resourcePool) {
            this.resourcePool = resourcePool;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/aliyunlogetlrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| select *</li>
         * </ul>
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>source-logstore-demo</p>
         */
        public Builder sourceLogstore(String sourceLogstore) {
            this.sourceLogstore = sourceLogstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>searchQuery</p>
         */
        public Builder sqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder toTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>@m</p>
         */
        public Builder toTimeExpr(String toTimeExpr) {
            this.toTimeExpr = toTimeExpr;
            return this;
        }

        public ScheduledSQLConfiguration build() {
            return new ScheduledSQLConfiguration(this);
        } 

    } 

}
