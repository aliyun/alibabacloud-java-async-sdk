// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateResponseBody</p>
 */
public class GetServiceTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map < String, ? > inferenceSpec;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceTemplateDescription")
    private String serviceTemplateDescription;

    @com.aliyun.core.annotation.NameInMap("ServiceTemplateDoc")
    private String serviceTemplateDoc;

    @com.aliyun.core.annotation.NameInMap("ServiceTemplateId")
    private String serviceTemplateId;

    @com.aliyun.core.annotation.NameInMap("ServiceTemplateName")
    private String serviceTemplateName;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetServiceTemplateResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.ownerId = builder.ownerId;
        this.provider = builder.provider;
        this.requestId = builder.requestId;
        this.serviceTemplateDescription = builder.serviceTemplateDescription;
        this.serviceTemplateDoc = builder.serviceTemplateDoc;
        this.serviceTemplateId = builder.serviceTemplateId;
        this.serviceTemplateName = builder.serviceTemplateName;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTemplateResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String ownerId; 
        private String provider; 
        private String requestId; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetServiceTemplateResponseBody build() {
            return new GetServiceTemplateResponseBody(this);
        } 

    } 

}
