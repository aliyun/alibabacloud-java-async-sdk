// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassificationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClassificationTemplatesResponseBody</p>
 */
public class ListClassificationTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TemplateList")
    private java.util.List < TemplateList> templateList;

    private ListClassificationTemplatesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.templateList = builder.templateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassificationTemplatesResponseBody create() {
        return builder().build();
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

    /**
     * @return templateList
     */
    public java.util.List < TemplateList> getTemplateList() {
        return this.templateList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TemplateList> templateList; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The list of templates.
         */
        public Builder templateList(java.util.List < TemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }

        public ListClassificationTemplatesResponseBody build() {
            return new ListClassificationTemplatesResponseBody(this);
        } 

    } 

    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private TemplateList(Builder builder) {
            this.name = builder.name;
            this.remark = builder.remark;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
            private String name; 
            private String remark; 
            private Long templateId; 
            private String templateType; 

            /**
             * The name of the classification template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the classification template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The type of the classification template. Valid values:
             * <p>
             * 
             * *   **INNER**: built-in template
             * *   **USER_DEFINE**: custom template
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
