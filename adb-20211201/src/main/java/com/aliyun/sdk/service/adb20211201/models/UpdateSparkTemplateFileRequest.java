// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSparkTemplateFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateSparkTemplateFileRequest</p>
 */
public class UpdateSparkTemplateFileRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Body
    @NameInMap("ResourceGroupName")
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
         * The template data to be updated.
         * <p>
         * 
         * >  If you do not specify this parameter, the application template is not updated. For more information about how to configure an application template, see [Configure a Spark application](~~452402~~).
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the application template.
         * <p>
         * 
         * >  You can call the [GetSparkTemplateFullTree](~~456205~~) operation to query the template ID.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the job resource group.
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
