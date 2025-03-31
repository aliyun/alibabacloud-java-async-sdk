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
 * {@link SubmitSparkAppRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkAppRequest</p>
 */
public class SubmitSparkAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentSource")
    private String agentSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String resourceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateFileId")
    private Long templateFileId;

    private SubmitSparkAppRequest(Builder builder) {
        super(builder);
        this.agentSource = builder.agentSource;
        this.agentVersion = builder.agentVersion;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.resourceGroupName = builder.resourceGroupName;
        this.templateFileId = builder.templateFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSource
     */
    public String getAgentSource() {
        return this.agentSource;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return templateFileId
     */
    public Long getTemplateFileId() {
        return this.templateFileId;
    }

    public static final class Builder extends Request.Builder<SubmitSparkAppRequest, Builder> {
        private String agentSource; 
        private String agentVersion; 
        private String appName; 
        private String appType; 
        private String DBClusterId; 
        private String data; 
        private String resourceGroupName; 
        private Long templateFileId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkAppRequest request) {
            super(request);
            this.agentSource = request.agentSource;
            this.agentVersion = request.agentVersion;
            this.appName = request.appName;
            this.appType = request.appType;
            this.DBClusterId = request.DBClusterId;
            this.data = request.data;
            this.resourceGroupName = request.resourceGroupName;
            this.templateFileId = request.templateFileId;
        } 

        /**
         * <p>The type of the client. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        public Builder agentSource(String agentSource) {
            this.putBodyParameter("AgentSource", agentSource);
            this.agentSource = agentSource;
            return this;
        }

        /**
         * <p>The version of the client. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1.091</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putBodyParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The name of the application. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestApp</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li><strong>SQL</strong></li>
         * <li><strong>STREAMING</strong></li>
         * <li><strong>BATCH</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
         * </blockquote>
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
         * <p>The data of the application template.</p>
         * <blockquote>
         * <p>For information about the application template configuration, see <a href="https://help.aliyun.com/document_detail/452402.html">Spark application configuration guide</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conf spark.driver.resourceSpec=small; conf spark.executor.instances=1; conf spark.executor.resourceSpec=small; conf spark.app.name=TestApp;</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The name of the job resource group.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612410.html">DescribeDBResourceGroup</a> operation to query the name of a resource group within a cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The ID of the application template.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/456205.html">GetSparkTemplateFullTree</a> operation to query the application template ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder templateFileId(Long templateFileId) {
            this.putBodyParameter("TemplateFileId", templateFileId);
            this.templateFileId = templateFileId;
            return this;
        }

        @Override
        public SubmitSparkAppRequest build() {
            return new SubmitSparkAppRequest(this);
        } 

    } 

}
