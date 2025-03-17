// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetClassificationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetClassificationTemplateResponseBody</p>
 */
public class GetClassificationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClassificationResourceTemplateMap")
    private ClassificationResourceTemplateMap classificationResourceTemplateMap;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetClassificationTemplateResponseBody(Builder builder) {
        this.classificationResourceTemplateMap = builder.classificationResourceTemplateMap;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClassificationTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classificationResourceTemplateMap
     */
    public ClassificationResourceTemplateMap getClassificationResourceTemplateMap() {
        return this.classificationResourceTemplateMap;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ClassificationResourceTemplateMap classificationResourceTemplateMap; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetClassificationTemplateResponseBody model) {
            this.classificationResourceTemplateMap = model.classificationResourceTemplateMap;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ClassificationResourceTemplateMap.
         */
        public Builder classificationResourceTemplateMap(ClassificationResourceTemplateMap classificationResourceTemplateMap) {
            this.classificationResourceTemplateMap = classificationResourceTemplateMap;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetClassificationTemplateResponseBody build() {
            return new GetClassificationTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClassificationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetClassificationTemplateResponseBody</p>
     */
    public static class ClassificationResourceTemplateMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private Long resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private ClassificationResourceTemplateMap(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassificationResourceTemplateMap create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Long resourceId; 
            private String resourceType; 
            private Long templateId; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(ClassificationResourceTemplateMap model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.templateId = model.templateId;
                this.templateType = model.templateType;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public ClassificationResourceTemplateMap build() {
                return new ClassificationResourceTemplateMap(this);
            } 

        } 

    }
}
