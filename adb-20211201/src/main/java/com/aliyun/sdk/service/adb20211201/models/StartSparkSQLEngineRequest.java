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
 * {@link StartSparkSQLEngineRequest} extends {@link RequestModel}
 *
 * <p>StartSparkSQLEngineRequest</p>
 */
public class StartSparkSQLEngineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jars")
    private String jars;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxExecutor")
    private Long maxExecutor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinExecutor")
    private Long minExecutor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlotNum")
    private Long slotNum;

    private StartSparkSQLEngineRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
        this.jars = builder.jars;
        this.maxExecutor = builder.maxExecutor;
        this.minExecutor = builder.minExecutor;
        this.resourceGroupName = builder.resourceGroupName;
        this.slotNum = builder.slotNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSparkSQLEngineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return jars
     */
    public String getJars() {
        return this.jars;
    }

    /**
     * @return maxExecutor
     */
    public Long getMaxExecutor() {
        return this.maxExecutor;
    }

    /**
     * @return minExecutor
     */
    public Long getMinExecutor() {
        return this.minExecutor;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return slotNum
     */
    public Long getSlotNum() {
        return this.slotNum;
    }

    public static final class Builder extends Request.Builder<StartSparkSQLEngineRequest, Builder> {
        private String config; 
        private String DBClusterId; 
        private String jars; 
        private Long maxExecutor; 
        private Long minExecutor; 
        private String resourceGroupName; 
        private Long slotNum; 

        private Builder() {
            super();
        } 

        private Builder(StartSparkSQLEngineRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
            this.jars = request.jars;
            this.maxExecutor = request.maxExecutor;
            this.minExecutor = request.minExecutor;
            this.resourceGroupName = request.resourceGroupName;
            this.slotNum = request.slotNum;
        } 

        /**
         * <p>The configuration that is required to start the Spark SQL engine. Specify this value in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/471203.html">Conf configuration parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;spark.shuffle.timeout&quot;: &quot;:0s&quot; }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-abcd****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) paths of third-party JAR packages that are required to start the Spark SQL engine. Separate multiple OSS paths with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBuckname/test.jar,oss://testBuckname/test2.jar</p>
         */
        public Builder jars(String jars) {
            this.putBodyParameter("Jars", jars);
            this.jars = jars;
            return this;
        }

        /**
         * <p>The maximum number of executors that are required to execute SQL statements. Valid values: 1 to 2000. If this value exceeds the total number of executes that are supported by the resource group, the Spark SQL engine fails to be started.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxExecutor(Long maxExecutor) {
            this.putBodyParameter("MaxExecutor", maxExecutor);
            this.maxExecutor = maxExecutor;
            return this;
        }

        /**
         * <p>The minimum number of executors that are required to execute SQL statements. Valid values: 0 to 2000. A value of 0 indicates that no executors are permanent if no SQL statements are executed. If this value exceeds the total number of executors that are supported by the resource group, the Spark SQL engine fails to be started. The value must be less than the value of MaxExecutor.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minExecutor(Long minExecutor) {
            this.putBodyParameter("MinExecutor", minExecutor);
            this.minExecutor = minExecutor;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-rg-name</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The maximum number of slots that are required to maintain Spark sessions for executing SQL statements. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder slotNum(Long slotNum) {
            this.putBodyParameter("SlotNum", slotNum);
            this.slotNum = slotNum;
            return this;
        }

        @Override
        public StartSparkSQLEngineRequest build() {
            return new StartSparkSQLEngineRequest(this);
        } 

    } 

}
