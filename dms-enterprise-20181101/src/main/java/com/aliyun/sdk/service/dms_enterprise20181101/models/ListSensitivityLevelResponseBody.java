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
    private java.util.List<SensitivityLevelList> sensitivityLevelList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SensitivityLevelList> getSensitivityLevelList() {
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
        private java.util.List<SensitivityLevelList> sensitivityLevelList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSensitivityLevelResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.sensitivityLevelList = model.sensitivityLevelList;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sensitivity levels.</p>
         */
        public Builder sensitivityLevelList(java.util.List<SensitivityLevelList> sensitivityLevelList) {
            this.sensitivityLevelList = sensitivityLevelList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSensitivityLevelResponseBody build() {
            return new ListSensitivityLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSensitivityLevelResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitivityLevelResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SensitivityLevelList model) {
                this.isPlain = model.isPlain;
                this.name = model.name;
                this.templateId = model.templateId;
                this.templateType = model.templateType;
            } 

            /**
             * <p>Indicates whether the fields of the sensitive level are displayed in plaintext.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPlain(Boolean isPlain) {
                this.isPlain = isPlain;
                return this;
            }

            /**
             * <p>The name of the sensitive level.</p>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the classification template.</p>
             * 
             * <strong>example:</strong>
             * <p>1070</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The type of the classification template. Valid values:</p>
             * <ul>
             * <li><strong>INNER</strong>: a built-in template.</li>
             * <li><strong>USER_DEFINE</strong>: a custom template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INNER</p>
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
