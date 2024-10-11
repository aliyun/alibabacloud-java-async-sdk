// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSparkTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSparkTemplateRequest</p>
 */
public class CreateSparkTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateSparkTemplateRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.DBClusterId = builder.DBClusterId;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSparkTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSparkTemplateRequest, Builder> {
        private String appType; 
        private String DBClusterId; 
        private String name; 
        private Long parentId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSparkTemplateRequest request) {
            super(request);
            this.appType = request.appType;
            this.DBClusterId = request.DBClusterId;
            this.name = request.name;
            this.parentId = request.parentId;
            this.type = request.type;
        } 

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li><strong>SQL</strong></li>
         * <li><strong>STREAMING</strong></li>
         * <li><strong>BATCH</strong></li>
         * </ul>
         * <blockquote>
         * <p> You do not need to specify this parameter when Type is set to folder.</p>
         * </blockquote>
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
         * <p>The name of the application template. The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>batchfile</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the directory to which the application template belongs.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/456218.html">GetSparkTemplateFolderTree</a> operation to query the directory ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The type of the application template. Valid values:</p>
         * <ul>
         * <li><strong>folder</strong>: directory.</li>
         * <li><strong>file</strong>: application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSparkTemplateRequest build() {
            return new CreateSparkTemplateRequest(this);
        } 

    } 

}
