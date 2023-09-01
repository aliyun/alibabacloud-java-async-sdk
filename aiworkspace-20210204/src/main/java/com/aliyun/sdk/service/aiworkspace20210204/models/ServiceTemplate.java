// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceTemplate} extends {@link TeaModel}
 *
 * <p>ServiceTemplate</p>
 */
public class ServiceTemplate extends TeaModel {
    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("InferenceSpec")
    private java.util.Map < String, ? > inferenceSpec;

    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @NameInMap("OrderNumber")
    private Long orderNumber;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("Provider")
    private String provider;

    @NameInMap("ServiceTemplateDescription")
    private String serviceTemplateDescription;

    @NameInMap("ServiceTemplateDoc")
    private String serviceTemplateDoc;

    @NameInMap("ServiceTemplateId")
    private String serviceTemplateId;

    @NameInMap("ServiceTemplateName")
    private String serviceTemplateName;

    @NameInMap("UserId")
    private String userId;

    private ServiceTemplate(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.orderNumber = builder.orderNumber;
        this.ownerId = builder.ownerId;
        this.provider = builder.provider;
        this.serviceTemplateDescription = builder.serviceTemplateDescription;
        this.serviceTemplateDoc = builder.serviceTemplateDoc;
        this.serviceTemplateId = builder.serviceTemplateId;
        this.serviceTemplateName = builder.serviceTemplateName;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceTemplate create() {
        return builder().build();
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return inferenceSpec
     */
    public java.util.Map < String, ? > getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return orderNumber
     */
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return serviceTemplateDescription
     */
    public String getServiceTemplateDescription() {
        return this.serviceTemplateDescription;
    }

    /**
     * @return serviceTemplateDoc
     */
    public String getServiceTemplateDoc() {
        return this.serviceTemplateDoc;
    }

    /**
     * @return serviceTemplateId
     */
    public String getServiceTemplateId() {
        return this.serviceTemplateId;
    }

    /**
     * @return serviceTemplateName
     */
    public String getServiceTemplateName() {
        return this.serviceTemplateName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.Map < String, ? > inferenceSpec; 
        private java.util.List < Label > labels; 
        private Long orderNumber; 
        private String ownerId; 
        private String provider; 
        private String serviceTemplateDescription; 
        private String serviceTemplateDoc; 
        private String serviceTemplateId; 
        private String serviceTemplateName; 
        private String userId; 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map < String, ? > inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * OrderNumber.
         */
        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * ServiceTemplateDescription.
         */
        public Builder serviceTemplateDescription(String serviceTemplateDescription) {
            this.serviceTemplateDescription = serviceTemplateDescription;
            return this;
        }

        /**
         * ServiceTemplateDoc.
         */
        public Builder serviceTemplateDoc(String serviceTemplateDoc) {
            this.serviceTemplateDoc = serviceTemplateDoc;
            return this;
        }

        /**
         * ServiceTemplateId.
         */
        public Builder serviceTemplateId(String serviceTemplateId) {
            this.serviceTemplateId = serviceTemplateId;
            return this;
        }

        /**
         * ServiceTemplateName.
         */
        public Builder serviceTemplateName(String serviceTemplateName) {
            this.serviceTemplateName = serviceTemplateName;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ServiceTemplate build() {
            return new ServiceTemplate(this);
        } 

    } 

}
