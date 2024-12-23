// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListApiTemplatesDTO} extends {@link TeaModel}
 *
 * <p>ListApiTemplatesDTO</p>
 */
public class ListApiTemplatesDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("OperatorId")
    private String operatorId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ListApiTemplatesDTO(Builder builder) {
        this.apiName = builder.apiName;
        this.content = builder.content;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.operatorId = builder.operatorId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiTemplatesDTO create() {
        return builder().build();
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String apiName; 
        private String content; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long id; 
        private String operatorId; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private String templateId; 
        private String templateName; 
        private String userId; 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * OperatorId.
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ListApiTemplatesDTO build() {
            return new ListApiTemplatesDTO(this);
        } 

    } 

}
