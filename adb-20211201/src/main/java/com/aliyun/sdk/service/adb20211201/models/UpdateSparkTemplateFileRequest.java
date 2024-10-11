// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSparkTemplateFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateSparkTemplateFileRequest</p>
 */
public class UpdateSparkTemplateFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private UpdateSparkTemplateFileRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.DBClusterId = builder.DBClusterId;
        this.id = builder.id;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSparkTemplateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateSparkTemplateFileRequest, Builder> {
        private String content; 
        private String DBClusterId; 
        private Long id; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSparkTemplateFileRequest request) {
            super(request);
            this.content = request.content;
            this.DBClusterId = request.DBClusterId;
            this.id = request.id;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The template data to be updated.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the application template is not updated. For information about how to configure a Spark application template, see <a href="https://help.aliyun.com/document_detail/452402.html">Configure a Spark application</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=2;set spark.executor.resourceSpec=medium;set spark.app.name=Spark SQL Test;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-pz5vp4585l466****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The application template ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/456205.html">GetSparkTemplateFullTree</a> operation to query the application template ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>718056</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the job resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public UpdateSparkTemplateFileRequest build() {
            return new UpdateSparkTemplateFileRequest(this);
        } 

    } 

}
