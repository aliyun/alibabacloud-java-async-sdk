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
 * {@link StartSparkReplSessionRequest} extends {@link RequestModel}
 *
 * <p>StartSparkReplSessionRequest</p>
 */
public class StartSparkReplSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    private StartSparkReplSessionRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSparkReplSessionRequest create() {
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
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<StartSparkReplSessionRequest, Builder> {
        private String config; 
        private String DBClusterId; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(StartSparkReplSessionRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The configuration parameters that are used to start the Spark session, which are in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/471203.html">Spark application configuration parameters</a>.</p>
         * <p>This parameter is required.</p>
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
         * <p>amv-bp1mfe9qm****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the job resource group.</p>
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

        @Override
        public StartSparkReplSessionRequest build() {
            return new StartSparkReplSessionRequest(this);
        } 

    } 

}
