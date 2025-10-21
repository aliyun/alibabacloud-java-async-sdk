// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ListModelCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelCategoryResponseBody</p>
 */
public class ListModelCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModelCategoryInfoList")
    private java.util.List<ModelCategoryInfoList> modelCategoryInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListModelCategoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.modelCategoryInfoList = builder.modelCategoryInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return modelCategoryInfoList
     */
    public java.util.List<ModelCategoryInfoList> getModelCategoryInfoList() {
        return this.modelCategoryInfoList;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<ModelCategoryInfoList> modelCategoryInfoList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListModelCategoryResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.modelCategoryInfoList = model.modelCategoryInfoList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ModelCategoryInfoList.
         */
        public Builder modelCategoryInfoList(java.util.List<ModelCategoryInfoList> modelCategoryInfoList) {
            this.modelCategoryInfoList = modelCategoryInfoList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
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

        public ListModelCategoryResponseBody build() {
            return new ListModelCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelCategoryResponseBody</p>
     */
    public static class ModelCategoryInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentSafeImageSupported")
        private Integer contentSafeImageSupported;

        @com.aliyun.core.annotation.NameInMap("ContentSafeTextSupported")
        private Integer contentSafeTextSupported;

        @com.aliyun.core.annotation.NameInMap("ModelCategoryId")
        private Long modelCategoryId;

        @com.aliyun.core.annotation.NameInMap("ModelCategoryName")
        private String modelCategoryName;

        @com.aliyun.core.annotation.NameInMap("ModelSource")
        private Integer modelSource;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PromptAttackTextSupported")
        private Integer promptAttackTextSupported;

        @com.aliyun.core.annotation.NameInMap("SensitiveTopicTextSupported")
        private Integer sensitiveTopicTextSupported;

        private ModelCategoryInfoList(Builder builder) {
            this.contentSafeImageSupported = builder.contentSafeImageSupported;
            this.contentSafeTextSupported = builder.contentSafeTextSupported;
            this.modelCategoryId = builder.modelCategoryId;
            this.modelCategoryName = builder.modelCategoryName;
            this.modelSource = builder.modelSource;
            this.priority = builder.priority;
            this.promptAttackTextSupported = builder.promptAttackTextSupported;
            this.sensitiveTopicTextSupported = builder.sensitiveTopicTextSupported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelCategoryInfoList create() {
            return builder().build();
        }

        /**
         * @return contentSafeImageSupported
         */
        public Integer getContentSafeImageSupported() {
            return this.contentSafeImageSupported;
        }

        /**
         * @return contentSafeTextSupported
         */
        public Integer getContentSafeTextSupported() {
            return this.contentSafeTextSupported;
        }

        /**
         * @return modelCategoryId
         */
        public Long getModelCategoryId() {
            return this.modelCategoryId;
        }

        /**
         * @return modelCategoryName
         */
        public String getModelCategoryName() {
            return this.modelCategoryName;
        }

        /**
         * @return modelSource
         */
        public Integer getModelSource() {
            return this.modelSource;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return promptAttackTextSupported
         */
        public Integer getPromptAttackTextSupported() {
            return this.promptAttackTextSupported;
        }

        /**
         * @return sensitiveTopicTextSupported
         */
        public Integer getSensitiveTopicTextSupported() {
            return this.sensitiveTopicTextSupported;
        }

        public static final class Builder {
            private Integer contentSafeImageSupported; 
            private Integer contentSafeTextSupported; 
            private Long modelCategoryId; 
            private String modelCategoryName; 
            private Integer modelSource; 
            private Integer priority; 
            private Integer promptAttackTextSupported; 
            private Integer sensitiveTopicTextSupported; 

            private Builder() {
            } 

            private Builder(ModelCategoryInfoList model) {
                this.contentSafeImageSupported = model.contentSafeImageSupported;
                this.contentSafeTextSupported = model.contentSafeTextSupported;
                this.modelCategoryId = model.modelCategoryId;
                this.modelCategoryName = model.modelCategoryName;
                this.modelSource = model.modelSource;
                this.priority = model.priority;
                this.promptAttackTextSupported = model.promptAttackTextSupported;
                this.sensitiveTopicTextSupported = model.sensitiveTopicTextSupported;
            } 

            /**
             * ContentSafeImageSupported.
             */
            public Builder contentSafeImageSupported(Integer contentSafeImageSupported) {
                this.contentSafeImageSupported = contentSafeImageSupported;
                return this;
            }

            /**
             * ContentSafeTextSupported.
             */
            public Builder contentSafeTextSupported(Integer contentSafeTextSupported) {
                this.contentSafeTextSupported = contentSafeTextSupported;
                return this;
            }

            /**
             * ModelCategoryId.
             */
            public Builder modelCategoryId(Long modelCategoryId) {
                this.modelCategoryId = modelCategoryId;
                return this;
            }

            /**
             * ModelCategoryName.
             */
            public Builder modelCategoryName(String modelCategoryName) {
                this.modelCategoryName = modelCategoryName;
                return this;
            }

            /**
             * ModelSource.
             */
            public Builder modelSource(Integer modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * PromptAttackTextSupported.
             */
            public Builder promptAttackTextSupported(Integer promptAttackTextSupported) {
                this.promptAttackTextSupported = promptAttackTextSupported;
                return this;
            }

            /**
             * SensitiveTopicTextSupported.
             */
            public Builder sensitiveTopicTextSupported(Integer sensitiveTopicTextSupported) {
                this.sensitiveTopicTextSupported = sensitiveTopicTextSupported;
                return this;
            }

            public ModelCategoryInfoList build() {
                return new ModelCategoryInfoList(this);
            } 

        } 

    }
}
