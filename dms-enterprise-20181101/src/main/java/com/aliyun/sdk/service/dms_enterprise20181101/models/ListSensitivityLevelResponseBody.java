// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitivityLevelResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitivityLevelResponseBody</p>
 */
public class ListSensitivityLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitivityLevelList")
    private java.util.List < SensitivityLevelList> sensitivityLevelList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSensitivityLevelResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitivityLevelList = builder.sensitivityLevelList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitivityLevelResponseBody create() {
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
     * @return sensitivityLevelList
     */
    public java.util.List < SensitivityLevelList> getSensitivityLevelList() {
        return this.sensitivityLevelList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < SensitivityLevelList> sensitivityLevelList; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The sensitivity levels.
         */
        public Builder sensitivityLevelList(java.util.List < SensitivityLevelList> sensitivityLevelList) {
            this.sensitivityLevelList = sensitivityLevelList;
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

        public ListSensitivityLevelResponseBody build() {
            return new ListSensitivityLevelResponseBody(this);
        } 

    } 

    public static class SensitivityLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsPlain")
        private Boolean isPlain;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private SensitivityLevelList(Builder builder) {
            this.isPlain = builder.isPlain;
            this.name = builder.name;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitivityLevelList create() {
            return builder().build();
        }

        /**
         * @return isPlain
         */
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Boolean isPlain; 
            private String name; 
            private String templateId; 
            private String templateType; 

            /**
             * Indicates whether the fields of the sensitive level are displayed in plaintext.
             */
            public Builder isPlain(Boolean isPlain) {
                this.isPlain = isPlain;
                return this;
            }

            /**
             * The name of the sensitive level.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the classification template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The type of the classification template. Valid values:
             * <p>
             * 
             * *   **INNER**: a built-in template.
             * *   **USER_DEFINE**: a custom template.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public SensitivityLevelList build() {
                return new SensitivityLevelList(this);
            } 

        } 

    }
}
