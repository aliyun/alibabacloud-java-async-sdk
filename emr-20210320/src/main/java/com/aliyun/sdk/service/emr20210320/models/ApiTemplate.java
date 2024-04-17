// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApiTemplate} extends {@link TeaModel}
 *
 * <p>ApiTemplate</p>
 */
public class ApiTemplate extends TeaModel {
    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("Content")
    private String content;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Status")
    private String status;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("TemplateName")
    private String templateName;

    private ApiTemplate(Builder builder) {
        this.apiName = builder.apiName;
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiTemplate create() {
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

    public static final class Builder {
        private String apiName; 
        private String content; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private String templateId; 
        private String templateName; 

        /**
         * 接口名。
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * 模版接口参数。
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * 资源组ID。
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 模板状态。
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 模板ID。
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * 模板ID。
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public ApiTemplate build() {
            return new ApiTemplate(this);
        } 

    } 

}
