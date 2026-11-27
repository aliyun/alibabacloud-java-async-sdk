// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ExecuteSparkWarehouseBatchSQLRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSparkWarehouseBatchSQLRequest</p>
 */
public class ExecuteSparkWarehouseBatchSQLRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Agency")
    private String agency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteResultLimit")
    private Long executeResultLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteTimeLimitInSeconds")
    private Long executeTimeLimitInSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
    private String runtimeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    private ExecuteSparkWarehouseBatchSQLRequest(Builder builder) {
        super(builder);
        this.agency = builder.agency;
        this.DBClusterId = builder.DBClusterId;
        this.executeResultLimit = builder.executeResultLimit;
        this.executeTimeLimitInSeconds = builder.executeTimeLimitInSeconds;
        this.query = builder.query;
        this.resourceGroupName = builder.resourceGroupName;
        this.runtimeConfig = builder.runtimeConfig;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSparkWarehouseBatchSQLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agency
     */
    public String getAgency() {
        return this.agency;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return executeResultLimit
     */
    public Long getExecuteResultLimit() {
        return this.executeResultLimit;
    }

    /**
     * @return executeTimeLimitInSeconds
     */
    public Long getExecuteTimeLimitInSeconds() {
        return this.executeTimeLimitInSeconds;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return runtimeConfig
     */
    public String getRuntimeConfig() {
        return this.runtimeConfig;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<ExecuteSparkWarehouseBatchSQLRequest, Builder> {
        private String agency; 
        private String DBClusterId; 
        private Long executeResultLimit; 
        private Long executeTimeLimitInSeconds; 
        private String query; 
        private String resourceGroupName; 
        private String runtimeConfig; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSparkWarehouseBatchSQLRequest request) {
            super(request);
            this.agency = request.agency;
            this.DBClusterId = request.DBClusterId;
            this.executeResultLimit = request.executeResultLimit;
            this.executeTimeLimitInSeconds = request.executeTimeLimitInSeconds;
            this.query = request.query;
            this.resourceGroupName = request.resourceGroupName;
            this.runtimeConfig = request.runtimeConfig;
            this.schema = request.schema;
        } 

        /**
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>DataWorks</p>
         */
        public Builder agency(String agency) {
            this.putBodyParameter("Agency", agency);
            this.agency = agency;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The maximum amount of execution result data that can be written to Object Storage Service (OSS). Unit: MB. Default value: 4096. The size of compressed objects is difficult to estimate. The data that is actually written to OSS is smaller than the specified value.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder executeResultLimit(Long executeResultLimit) {
            this.putBodyParameter("ExecuteResultLimit", executeResultLimit);
            this.executeResultLimit = executeResultLimit;
            return this;
        }

        /**
         * <p>The maximum execution duration. Unit: seconds. If a set of SQL statements fail to be executed for the specified period of time after submission, they are marked as a timeout error. The default value is 360000 seconds, which is equivalent to 100 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        public Builder executeTimeLimitInSeconds(Long executeTimeLimitInSeconds) {
            this.putBodyParameter("ExecuteTimeLimitInSeconds", executeTimeLimitInSeconds);
            this.executeTimeLimitInSeconds = executeTimeLimitInSeconds;
            return this;
        }

        /**
         * <p>The SQL statements that you want to execute in batches. Separate multiple SQL statements with semicolons (;). The execution engine executes the SQL statements in sequence in the same session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE user(id INT, name STRING);
         * INSERT INTO t VALUE(1, &quot;Bob&quot;);
         * SELECT * FROM t;</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The additional runtime parameter. Specify the parameter in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;OSSURL&quot;: &quot;oss://testBucketname/&quot;
         * }</p>
         */
        public Builder runtimeConfig(String runtimeConfig) {
            this.putBodyParameter("RuntimeConfig", runtimeConfig);
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public ExecuteSparkWarehouseBatchSQLRequest build() {
            return new ExecuteSparkWarehouseBatchSQLRequest(this);
        } 

    } 

}
